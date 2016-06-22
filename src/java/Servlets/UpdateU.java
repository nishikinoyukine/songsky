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
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
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
 */
@MultipartConfig (maxFileSize = 16177215)
public class UpdateU extends HttpServlet {


   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
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
            Integer id= (Integer)request.getSession().getAttribute("ID");
            String Nus = request.getParameter("nick"); 
            String nom = request.getParameter("nombre");
            String ap = request.getParameter("apellidos");
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
            String query = "call papw.Upuser(?,?,?,?,?,?,?,?,?,?,?,?)";
        cs = con.prepareCall(query);
        cs.setInt(1,id);
        if (inputStream != null) {  
                // fetches input stream of the upload file for the blob column  
                cs.setBlob(2, inputStream);  
            }  
        if (inputStream1 != null) {  
                // fetches input stream of the upload file for the blob column  
                cs.setBlob(3, inputStream1);  
            }  
        cs.setString(4,Nus);
        cs.setString(5,nom);
        cs.setString(6,ap);
        cs.setString(7,cal);
        cs.setString(8,num);
        cs.setString(9,col);
        cs.setString(10,mun);
        cs.setString(11,edo);
        cs.setInt(12,cp1);
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


}
