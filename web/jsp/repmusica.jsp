<%-- 
    Document   : repmusica
    Created on : 7/06/2016, 09:26:30 AM
    Author     : Yukine Sugiura
--%>
<%@ page import ="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="es">
<head>
    <title>Playlist</title>
     <meta charset="UTF-8">
     <script src="../js/jquery.js"></script>
</head>
<body bgcolor="#000000" onResize="window.resizeTo(250,500)">
    <img id="disco" src="../IMG/play1.png" height="200" width="300"><br>
    <audio id="player1" preload="auto" controls loop>
				<source src="">
			</audio>
<%
Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
 int val = Integer.parseInt(request.getParameter("idp"));
CallableStatement cs = null;
String query = "call loadlist(?)";
        cs = conexion.prepareCall(query);
        cs.setInt(1,val);
ResultSet rs = cs.executeQuery();      

out.println("<table border=1>");

out.println("<tr><th><font color='#FFFFFF'>Nombre</font></th><th><font color='#FFFFFF'>Reproducir</font></th><th><font color='#FFFFFF'>Agregar Carrito</font></th></tr>");

String[ ] com = new String[100];
String[ ] com1 = new String[100];
int i = 0;

while (rs.next()) {

out.println("<tr>");
        
out.println("<td>");    
        
out.println("<font color='#FFFFFF'>"+rs.getString("NombreCancion")+"</font>");

out.println("</td><td>");

%>
<img id="<%out.println("song"+i+"\"");%> src="../IMG/Play.png">

<%
out.println("</td><td>");
%>
<a href="addtocar.jsp?ids=<%out.println(rs.getString("ID_song")+"\">");%><img id="<%out.println("car"+i+"\"");%> value="<%out.println(rs.getString("ID_song")+"\"");%> src="../IMG/carrito.jpg"></a>

<%
 out.println("</td>");
com[i]=rs.getString("urlsong");
com1[i]=rs.getString("Image");
out.println("</tr>");
i=i+1;
}

out.println("</table>");



rs.close();
cs.close();
conexion.close();
%>



 <script>
      function CargarSong(input) {
  if (document.getElementById('player1').paused) {
          $('#player1').attr('src', input);
          document.getElementById('player1').play();        
      } else {
        document.getElementById('player1').pause();
        document.getElementById('player1').currentTime = 0;
      }
}  

function caratula(input) {
          $('#disco').attr('src', input);
}  

<%for ( int factor = 0; factor <= i; factor ++ ) { %>
     $('<%out.println("#song"+factor+"'");%>).click(function() {
             $(this).toggleClass("down");
             CargarSong("<%out.println("../"+com[factor]+"\"");%>);
             caratula("<%out.println("../"+com1[factor]+"\"");%>);

      
  });<%}%>
  
 </script>
 </body>
 </html>