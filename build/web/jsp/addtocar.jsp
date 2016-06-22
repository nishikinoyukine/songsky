<%-- 
    Document   : addtocar
    Created on : 9/06/2016, 08:52:17 PM
    Author     : Yukine Sugiura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <%@page import="java.sql.*" %> 
 <script src="../js/jquery.js"></script>
     <%
         String nombre = session.getAttribute("login").toString();
         if(session.getAttribute("Visita").equals("true") && nombre.equals("off")||nombre == null )
                    {
                    %>
                      <script>
      alert("Registrate para Descargas Premium");//alert the message
      //you can also display the message using a mark up on the page and use setTimeOut()
      window.location = "javascript:window.history.back();";//then redirect
</script>
                     <%
                      
                    }
                      else
                    {
                 int val = Integer.parseInt(session.getAttribute("ID").toString()); 
                int son = Integer.parseInt(request.getParameter("ids"));
Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
CallableStatement cs = null;
String query = "call addcar(?,?)";
        cs = conexion.prepareCall(query);
        cs.setInt(1,son);
        cs.setInt(2,val);
       

cs.execute();
cs.close();
conexion.close();
%>
    <script>
      alert("Elemento Agregado Correctamente");//alert the message
      //you can also display the message using a mark up on the page and use setTimeOut()
      window.location = "javascript:window.history.back();";//then redirect
</script>
<%
                    }
 %>   
