/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Modelo.BDUtil;
import Modelo.Conexionpool;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.*;
import java.sql.Blob;
/**
 *
 * @author Yukine Sugiura
 */
public class DisplayImage extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {{
                String vari = request.getParameter("image");
                int variable = 0;
        if ( "Profile".equals(vari)){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PAPW",
            "root", "");
            PreparedStatement ps = con.prepareStatement("select PImage from papw.userdb where id = ?");
            if(request.getSession().getAttribute("Visita").equals("true")){
            variable = (Integer)request.getSession().getAttribute("IDv");
            }else{ 
             variable = (Integer)request.getSession().getAttribute("ID");}
            ps.setInt(1,variable);
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
            
         if ( vari.equals("Portada"))
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PAPW",
            "root", "");
            PreparedStatement ps = con.prepareStatement("select BImage from papw.userdb where id = ?");
             if(request.getSession().getAttribute("Visita").equals("true")){
            variable = (Integer)request.getSession().getAttribute("IDv");
            }else{ 
             variable = (Integer)request.getSession().getAttribute("ID");}
            ps.setInt(1,variable);
            ResultSet rs = ps.executeQuery();
            rs.next();
            Blob  b = rs.getBlob("BImage");
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
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


}
