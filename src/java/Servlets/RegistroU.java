/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Modelo.BDUtil;
import Modelo.Conexionpool;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.InputStream;
import java.sql.CallableStatement;
import javax.servlet.annotation.MultipartConfig;
/**
 *
 * @author Yukine Sugiura
 */
@MultipartConfig (maxFileSize = 16177215)
public class RegistroU extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    private final String UPLOAD_DIRECTORY = "/upload";
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        InputStream inputStream = null;  
        InputStream inputStream1 = null; 
        
       
         Part filePart = request.getPart("profileimg");  
        if (filePart != null) {  
            // debug messages  
            System.out.println(filePart.getName());  
            System.out.println(filePart.getSize());  
            System.out.println(filePart.getContentType());  
  
            // obtains input stream of the upload file  
            inputStream = filePart.getInputStream();  
        }  
           Part filePart1 = request.getPart("Portadaimg");  
        if (filePart1 != null) {  
            // debug messages  
            System.out.println(filePart1.getName());  
            System.out.println(filePart1.getSize());  
            System.out.println(filePart1.getContentType());  
  
            // obtains input stream of the upload file  
            inputStream1 = filePart1.getInputStream();  
        }  
            String Cor = request.getParameter("mail");
            String pass = request.getParameter("passwordhash");
            String Nus = request.getParameter("nick"); 
            String nom = request.getParameter("nombre");
            String ap = request.getParameter("apellidos");
            String fecn = request.getParameter("dob_day"+"/"+"dob_mot"+"/"+"dob_year");
            String sexo = request.getParameter("sexo");
            String cal = request.getParameter("calle");
            String num = request.getParameter("num");
            String col = request.getParameter("col");
            String mun = request.getParameter("municipio");
            String edo = request.getParameter("edo");
            int cp1 = Integer.parseInt(request.getParameter("cp"));
            
          Conexionpool pool = Conexionpool.getInstancia();
           Connection con = pool.getConexion();
           CallableStatement cs = null;
           
         try{
            String query = "call papw.insertuser(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        cs = con.prepareCall(query);
        cs.setString(1,Cor);
        cs.setString(2,pass);
        if (inputStream != null) {  
                // fetches input stream of the upload file for the blob column  
                cs.setBlob(3, inputStream);  
            }  
        if (inputStream1 != null) {  
                // fetches input stream of the upload file for the blob column  
                cs.setBlob(4, inputStream1);  
            }  
        cs.setString(5,Nus);
        cs.setString(6,nom);
        cs.setString(7,ap);
        cs.setString(8,fecn);
        cs.setString(9,sexo);
        cs.setString(10,cal);
        cs.setString(11,num);
        cs.setString(12,col);
        cs.setString(13,mun);
        cs.setString(14,edo);
        cs.setInt(15,cp1);
        cs.execute();
        
        }
         catch(SQLException ex){
    ex.printStackTrace();
    } finally{
    
    pool.liberarConexion(con);
    BDUtil.cerrarStatement(cs);
    response.sendRedirect("Login.jsp");
    }
    }
    
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
