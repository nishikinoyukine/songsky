/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Modelo.BDUtil;
import Modelo.Conexionpool;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.servlet.annotation.MultipartConfig;

/**
 *
 * @author Yukine Sugiura
 */@MultipartConfig (maxFileSize = 16177215)
public class BannerS extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String vari = request.getParameter("image");
        if ( vari.equals("Portada"))
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PAPW",
            "root", "");
            PreparedStatement ps = con.prepareStatement("select PImage from papw.publicdb where id = ?");
            ps.setInt(1,1);
            ResultSet rs = ps.executeQuery();
            rs.next();
            Blob  b = rs.getBlob("PImage");
            response.setContentType("image/jpeg");
            response.setContentLength( (int) b.length());
            InputStream is = b.getBinaryStream();
            OutputStream os = response.getOutputStream();
            byte buf[] = new byte[(int) b.length()];
            is.read(buf);
            os.write(buf);
            os.close();
        }
        catch(Exception ex) {
             System.out.println(ex.getMessage());
        }}   
    

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        InputStream inputStream = null;  
        Part filePart = request.getPart("Bannerp");  
        if (filePart != null) {  
            // debug messages  
            System.out.println(filePart.getName());  
            System.out.println(filePart.getSize());  
            System.out.println(filePart.getContentType());  
  
            // obtains input stream of the upload file  
            inputStream = filePart.getInputStream();  
        }  
         Conexionpool pool = Conexionpool.getInstancia();
           Connection con = pool.getConexion();
           CallableStatement cs = null;
           try{
            String query = "UPDATE papw.publicdb SET PImage=? WHERE ID=1;";
            cs = con.prepareCall(query);
            if (inputStream != null) {  
                // fetches input stream of the upload file for the blob column  
                cs.setBlob(1, inputStream);  
            }  
            cs.execute();
        
        }
         catch(SQLException ex){
    ex.printStackTrace();
    } finally{
    
    pool.liberarConexion(con);
    BDUtil.cerrarStatement(cs);
    response.sendRedirect("Index.jsp");
    }
    }

}
