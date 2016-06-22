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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Yukine Sugiura
 */
public class User extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
     
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            Conexionpool pool = Conexionpool.getInstancia();
           Connection con = pool.getConexion();
           CallableStatement cs = null;
           String Us = request.getParameter("user");
           try{
            String query = "call papw.obid(?)";
        cs = con.prepareCall(query);
        cs.setString(1,Us);
        cs.execute();
        final ResultSet rs = cs.getResultSet();
         if (rs.next()) {
        int id = rs.getInt("ID");
        String username =rs.getString("NUser");
      
        //out.println("<a href='logout.jsp'>Log out</a>");
        request.getSession().setAttribute("IDv", id);
        request.getSession().setAttribute("namev", username);
        request.getSession().setAttribute("Visita","true");
         String nextJSP = "/UserProfileC.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);
         }else{
         response.sendRedirect("Index.jsp");
         }
        }
         catch(SQLException ex){
    ex.printStackTrace();
     
    } finally{
    
    pool.liberarConexion(con);
    BDUtil.cerrarStatement(cs);
    }
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }


}
