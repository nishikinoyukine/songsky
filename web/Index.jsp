<%-- 
    Document   : Index
    Created on : 27/04/2016, 12:33:25 PM
    Author     : Yukine Sugiura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>SONGSKY</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1, minimum-scale=1">
        <link rel="stylesheet" href="CSS/fontello.css">
        <link rel="stylesheet" href="CSS/userprofile.css">
        <link rel="stylesheet" href="CSS/banner.css"> 
        <link rel="stylesheet" href="CSS/menuser.css">  
        <link rel="stylesheet" href="CSS/publicidad.css"> 
        <link rel="stylesheet" href="CSS/demo.css"> 
        <link rel="stylesheet" href="CSS/infomusica.css"> 
        <link rel="stylesheet" href="CSS/styleartistas.css">
        <link rel="stylesheet" href="CSS/audioplayer.css">
        <script src="js/jquery.js"></script>
         <%@page import="java.sql.*" %>
<%@page import="java.io.*" %>
<%@page import="java.util.Random" %>
<%@page import="java.util.concurrent.ThreadLocalRandom" %>   
         

    </head>
            <%
              
             int rand = ThreadLocalRandom.current().nextInt(1,6);
                
                session.setAttribute ("Visita","False");
             
             session.setAttribute("pub",rand);
          
             %>
             
             <%
                    int val = Integer.parseInt(session.getAttribute("pub").toString());
  
Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
CallableStatement cs = null;
String query = "call selectp(?)";
        cs = conexion.prepareCall(query);
        cs.setInt(1,val);

ResultSet rs = cs.executeQuery();
int i = 1;
String[ ] com = new String[3];
if (rs.next()){
   com [0]= rs.getString("url_Publicidad_Banner");
   com [1]= rs.getString("url_Publicidad_Video");
             }else{
     com [0]= "IMG/wab.jpg";
   com [1]= "VIDEO/AGOT.mp4";
   }
%>
    <body>
        <main>
            <section id="banner">
            <img src="<% out.println(com [0]); %>"> 
        <div class="container">
                <h2>Musica a tu manera</h2>
                <p>Escucha tus canciones favoritas como nunca antes</p>
                <a href="#">Premium</a>
              </div>               
            </section> 
            
            
            
            <section id="bienvenidos">
                <hr color="dodgerblue" size=1>
                <%
                    if(session.getAttribute("name") == null)
                    out.println("<p id='invitado' > BIENVENIDO: <a href='Index.jsp'> Invitado.</a> </p>");
                    session.setAttribute("loginIndex", "False");
                    if(session.getAttribute("name") == "")
                    out.println("<p id='invitado' > BIENVENIDO: <a href='Index.jsp'> Invitado.</a> </p>");
                    
                %>
                
                <% 
                    if(session.getAttribute("name") != "" && session.getAttribute("name") != null)
                    out.println("<p id='invitado' > BIENVENIDO: "+ session.getAttribute("name") + "</p>");
                    session.setAttribute("loginIndex", "true");
                %>
  
                <h2>Encuentra y crea tus playlist favoritos en un solo click</h2>     
            </section>
            
            
             <section id="busqueda">             
                        <form action="Buscador.jsp" method="get">	
                            
                        <input name="BUSCAR" type="search" placeholder="Audio o Artista">		    	
                        <i class="icon-search" ></i>
                           
                </form>           
                </section>    
            
            
            
           
            
            
            
            <div id="containergeneral">
                <hr color="dodgerblue" size=1>
                <div id="video">
           
                    <div id="textovideo">
                 <h4 id="videosemana">Video de La Semana.</h4>
                    </div>
                  <video  src="<% out.println(com [1]); %>" autoplay muted loop id="videoprincipal"></video> 
                  
                
                </div>    
                
            <%rs.close();
              cs.close();
              conexion.close();%>
              <%

Class.forName("com.mysql.jdbc.Driver");
conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
cs = null;
 query = "call loadnews()";
        cs = conexion.prepareCall(query);

rs = cs.executeQuery();
i = 0;

String[ ] urlsong = new String[9];
String[ ] urlimg = new String[9];
String[ ] nom = new String[9];
for (int n=0;n<9;n++){
nom [n] = "";
urlsong [n] = "";
urlimg [n] = "";

}

while (rs.next()){
    if (i<=8){nom [i] = rs.getString("NombreCancion");
              urlsong [i] = rs.getString("urlsong");
              urlimg [i] = rs.getString("Image");
    }
    i+=1;
    
}
rs.close();
cs.close();
conexion.close();


%>
            <section id="artistas">
                <audio id="player" src="#" hidden="true"> </audio>
                <h4>Nuevas Canciones</h4>
                <div class="containerartistas">
                    <div class="info-artistas">
                        <img id="song1" src="<%out.println(urlimg[0]);%>"  alt="">
                        <h5><%out.println(nom[0]);%></h5> 
                    </div>
                 
                     <div class="info-artistas">
                        <img id="song2" src="<%out.println(urlimg[1]);%>" alt="">
                         <h5><%out.println(nom[1]);%></h5> 
                    </div>
                    
                     <div class="info-artistas">
                        <img id="song3" src="<%out.println(urlimg[2]);%>" alt="">
                         <h5><%out.println(nom[2]);%></h5>  
                    </div>
                    
                     <div class="info-artistas">
                        <img id="song4" src="<%out.println(urlimg[3]);%>" alt="">
                         <h5><%out.println(nom[3]);%></h5>                         
                    </div>
                    
                     <div class="info-artistas">
                        <img id="song5" src="<%out.println(urlimg[4]);%>" alt="">
                         <h5><%out.println(nom[4]);%></h5> 
                    </div>
                    
                     <div class="info-artistas">
                        <img id="song6" src="<%out.println(urlimg[5]);%>" alt="">
                         <h5><%out.println(nom[5]);%></h5> 
                    </div>
                    
                     <div class="info-artistas">
                        <img id="song7" src="<%out.println(urlimg[6]);%>" alt="">
                         <h5><%out.println(nom[6]);%></h5> 
                    </div>
                    
                     <div class="info-artistas">
                        <img id="song8" src="<%out.println(urlimg[7]);%>" alt="">
                         <h5><%out.println(nom[7]);%></h5> 
                    </div>
                <hr color="dodgerblue" size=1>
                </div>
                
                 <hr color="dodgerblue" size=1>
            </section>
            
                <script>
  
 function CargarSong(input) {
  if (document.getElementById('player').paused) {
          $('#player').attr('src', input);
          document.getElementById('player').play();        
      } else {
        document.getElementById('player').pause();
        document.getElementById('player').currentTime = 0
      }
}
 
             $('#song1').click(function() {
             $(this).toggleClass("down");
             CargarSong("<%out.println(""+urlsong[0]+"\"");%>);        
  });
  
              $('#song2').click(function() {
             $(this).toggleClass("down");
             CargarSong("<%out.println(""+urlsong[1]+"\"");%>);        
  });
  
  $('#song3').click(function() {
             $(this).toggleClass("down");
             CargarSong("<%out.println(""+urlsong[2]+"\"");%>);        
  });
  
   $('#song4').click(function() {
             $(this).toggleClass("down");
             CargarSong("<%out.println(""+urlsong[3]+"\"");%>);        
  });
  
   $('#song5').click(function() {
             $(this).toggleClass("down");
             CargarSong("<%out.println(""+urlsong[4]+"\"");%>);        
  });
  
   $('#song6').click(function() {
             $(this).toggleClass("down");
             CargarSong("<%out.println(""+urlsong[5]+"\"");%>);        
  });
  
   $('#song7').click(function() {
             $(this).toggleClass("down");
             CargarSong("<%out.println(""+urlsong[6]+"\"");%>);        
  });
  
   $('#song8').click(function() {
             $(this).toggleClass("down");
             CargarSong("<%out.println(""+urlsong[7]+"\"");%>);        
  });
               
                </script>
            
            
            
         
        
        
        
        
        <header>
            <div class="contenedor">
                <h1 class="icon-cloud-1">SONGSKY</h1>
                <input type="checkbox" id="menu-bar">
                <label class="icon-menu" for="menu-bar"></label>
                <nav class="menu">
                    <a href="Index.jsp">Home</a>
                    <% 
                        if(session.getAttribute("name")!= ""){
                            if (session.getAttribute("name")== null)
                            {out.println("<a href='Registro.jsp'>Registrarse</a>");
                             out.println("<a href='Login.jsp'>Iniciar Sesion</a>");}
                             else
                             {out.println("<a href='UserProfileC.jsp'> Mi Perfil</a>");
                            out.println("<a href='login' method='get'>Logout</a>" );}  
                            }
                        else{
                        out.println("<a href='Registro.jsp'>Registrarse</a>");
                        out.println("<a href='Login.jsp'>Iniciar Sesion</a>");
                        }
                    %>
                </nav>
            </div>    
        </header>
            
           
        
        </main> 
        <footer>
            <div class="containerfooter">
                <p class="copy">SONGSKY &copy; 2016</p>
                <div class="redessociales">
                    <a class="icon-facebook" href="#"></a>
                    <a class="icon-twitter" href="#"></a>
                    <a class="icon-youtube" href="#"></a>
                    <a class="icon-instagram" href="#"></a>
                    <a class="icon-vimeo" href="#"></a>
                </div>
            </div>    
        </footer>
        
        
        
        
    </body>
</html>
