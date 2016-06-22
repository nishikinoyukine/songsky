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

/**
 *
 * @author Yukine Sugiura
 */
public class login extends HttpServlet {

    String userid;    
    String pwd; 
         
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getSession() !=null)
            request.getSession().invalidate();
            request.getSession().setAttribute("ID", null);
             request.getSession().setAttribute ("name","");
             request.getSession().setAttribute("login","off");
            response.sendRedirect("Index.jsp");
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*processRequest(request, response);*/
        
        userid = request.getParameter("login");    
        pwd = request.getParameter("passwordhash");
        int id;
        String username;
        
       
       Conexionpool pool = Conexionpool.getInstancia();
    Connection con = pool.getConexion();
    CallableStatement cs = null;
    try{
        String query = "call papw.LOGIN(?,?)";
        cs = con.prepareCall(query);
        cs.setString(1,userid);
        cs.setString(2,pwd);
        cs.execute();
        
        final ResultSet rs = cs.getResultSet();
         if (rs.next()) {
        //out.println(userid);
        id = rs.getInt("ID");
        username=rs.getString("NUser");
      
        //out.println("<a href='logout.jsp'>Log out</a>");
        request.getSession().setAttribute("ID", id);
        request.getSession().setAttribute("name", username);
        request.getSession().setAttribute("login", "on");
    
        String nextJSP = "/UserProfileC.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);
        
        //response.sendRedirect("UserProfileV.jsp");
         BDUtil.cerrarStatement(cs);
         pool.liberarConexion(con);
    } else {
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            response.sendRedirect("error.html");
             BDUtil.cerrarStatement(cs);
             pool.liberarConexion(con);
        }
    }
    }catch(SQLException ex){
    ex.printStackTrace();
    } finally{
    BDUtil.cerrarStatement(cs);
    pool.liberarConexion(con);
    }
    }


}
