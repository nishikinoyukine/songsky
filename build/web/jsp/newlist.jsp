<%-- 
    Document   : newlist
    Created on : 8/06/2016, 03:01:20 PM
    Author     : Yukine Sugiura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@page import="java.sql.*" %> 
<form action="jsp/addtolist.jsp" method="post">
     <%
                int  val = Integer.parseInt(session.getAttribute("ID").toString()); 
                 String com = request.getParameter("nalis").toString();
                 
Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
CallableStatement cs = null;
String query = "call newlist(?,?)";
        cs = conexion.prepareCall(query);
        cs.setString(1,com);
        cs.setInt(2,val);
       

cs.execute();
cs.close();
conexion.close();



 %>                
<script>
      alert("Lista Creada Correctamente");//alert the message
      //you can also display the message using a mark up on the page and use setTimeOut()
      window.location = "javascript:window.history.back();";//then redirect
</script>