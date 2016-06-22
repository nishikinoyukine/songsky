/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Modelo.BDUtil;
import Modelo.Conexionpool;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Yukine Sugiura
 */
public class MusicU extends HttpServlet {
 private boolean isMultipart;
   private String filePath;
  private int maxFileSize = 52428800;
   private int maxMemSize = 52428800;
   private File file ;

    public void init( ){
  // Get the file location where it would be stored.
  filePath = 
         getServletContext().getInitParameter("file-upload"); 
    }
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // Check that we have a file upload request
        String[ ] ins = new String[3];
        String[ ] otg = new String[5];
        int ifile=1;
        int isp=1;
     isMultipart = ServletFileUpload.isMultipartContent(request);
     response.setContentType("text/html");
     java.io.PrintWriter out = response.getWriter( );
      if( !isMultipart ){
     out.println("<html>");
     out.println("<head>");
     out.println("<title>Servlet upload</title>");  
     out.println("</head>");
     out.println("<body>");
     out.println("<p>No file uploaded</p>"); 
     out.println("</body>");
     out.println("</html>");
     return;
     }
     DiskFileItemFactory factory = new DiskFileItemFactory();
  // maximum size that will be stored in memory
     factory.setSizeThreshold(maxMemSize);
  // Location to save data that is larger than maxMemSize.
     factory.setRepository(new File(" C:\\Users\\Yukine Sugiura\\Documents\\NetBeansProjects\\SONGSKY\\web\\upload\\"));  
     
       // Create a new file upload handler
      ServletFileUpload upload = new ServletFileUpload(factory);
  // maximum file size to be uploaded.
     upload.setSizeMax( maxFileSize );

     try{ 
         
  // Parse the request to get file items.
     List fileItems = upload.parseRequest(request);
    
  // Process the uploaded file items
      Iterator i = fileItems.iterator();

     while ( i.hasNext () ) 
     {
       FileItem fi = (FileItem)i.next();
     if ( !fi.isFormField () )  
     {
        // Get the uploaded file parameters
        String fieldName = fi.getFieldName();
        String fileName = fi.getName();
        String contentType = fi.getContentType();
        boolean isInMemory = fi.isInMemory();
        long sizeInBytes = fi.getSize();
        // Write the file
        if( fileName.lastIndexOf("\\") >= 0 ){
           file = new File( filePath + 
           fileName.substring( fileName.lastIndexOf("\\"))) ;
        }else{
           file = new File( filePath + 
           fileName.substring( fileName.lastIndexOf("\\")+1)) ;
        }
        fi.write( file ) ;
        ins [ifile] = "upload/"+fileName.substring( fileName.lastIndexOf("\\")+1) ;
        ifile+=1;
     }else{
     if (fi.isFormField()) {
    otg [isp] = fi.getString();
    isp+=1;
}
     }
      }
    //response.sendRedirect("Index.jsp"); 
     }catch(Exception ex) {
     System.out.println(ex);
     }
        Conexionpool pool = Conexionpool.getInstancia();
           Connection con = pool.getConexion();
           CallableStatement cs = null;
           
           try{
          
          int variable = (Integer)request.getSession().getAttribute("ID");
           
            
            
         try{
             
            String query = "call papw.insertS(?,?,?,?,?,?)";
        cs = con.prepareCall(query);
        cs.setInt(1,variable);
        cs.setString(2,ins[1]);
        cs.setString(3,ins[2]);
        cs.setString(4,otg[1]);
        cs.setString(5,otg[2]);
        cs.setString(6,otg[3]);
        cs.execute();
        
        }
         catch(SQLException ex){
    ex.printStackTrace();
    } finally{
    
    pool.liberarConexion(con);
    BDUtil.cerrarStatement(cs);
    response.sendRedirect("Index.jsp");
    }
    }catch(Exception ex) {
           System.out.println(ex);
              }}


    }


