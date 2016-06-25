<%-- 
    Document   : addtolist
    Created on : 7/06/2016, 09:59:19 PM
    Author     : Yukine Sugiura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <%@page import="java.sql.*" %> 
<form action="jsp/addtolist.jsp" method="post">
     <%
                int  val = Integer.parseInt(session.getAttribute("ID").toString()); 
                 int com = Integer.parseInt (request.getParameter("Namalst").toString());
                 int com1 = Integer.parseInt (request.getParameter("Namae").toString());
Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
CallableStatement cs = null;
String query = "call addtolist(?,?,?)";
        cs = conexion.prepareCall(query);
        cs.setInt(1,com1);
        cs.setInt(2,val);
        cs.setInt(3,com);

cs.execute();
cs.close();
conexion.close();



 %>                
<script>
      alert("Cancion Agregada Correctamente a la Lista");//alert the message
      //you can also display the message using a mark up on the page and use setTimeOut()
      window.location = "javascript:window.history.back();";//then redirect
</script>