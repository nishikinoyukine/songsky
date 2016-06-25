<%-- 
    Document   : Prueba Tabla
    Created on : 13/05/2016, 01:06:22 AM
    Author     : Yukine Sugiura
--%>
<%@page import="java.sql.*" %>
<%

Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");

Statement Estamento = conexion.createStatement();
ResultSet rs = Estamento.executeQuery("select * from papw.userdb");

out.println("<table border=1>");

out.println("<tr><th>Id</th><th>Nombre</th><th>Precio</th></tr>");

while (rs.next()) {

out.println("<tr>");
        
out.println("<td>");    
        
out.println(rs.getString("Correo"));

out.println("</td><td>");

out.println(rs.getString("NUser"));

out.println("</td><td>");

out.println(rs.getInt("ID"));

out.println("</td>");

out.println("</tr>");

}

out.println("</table>");

rs.close();
Estamento.close();
conexion.close();

%>
