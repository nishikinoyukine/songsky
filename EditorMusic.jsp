<%-- 
    Document   : EditorMusic
    Created on : 14/05/2016, 07:38:53 AM
    Author     : Yukine Sugiura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
        <title>SONGSKY</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1, minimum-scale=1">
        <link rel="stylesheet" href="css/fontello.css">
        <link rel="stylesheet" href="css/userprofile.css">
        <link rel="stylesheet" href="css2/portada.css"> 
        <link rel="stylesheet" href="css/menuser.css">  
        <link rel="stylesheet" href="css/publicidad.css"> 
        <link rel="stylesheet" href="css/infomusica.css"> 
    
        <link rel="stylesheet" href="css2/reporte.css">
         <link rel="stylesheet" href="css2/editormusica.css"> 
    </head>
    <body>
    <main>
        
         <section id="busqueda"> 
             <hr color="dodgerblue" size=3>
                        <form action="#" method="get">	
                            
                        
                           
                </form>           
                </section>  
        
        <div class="carritodecomprita">
			<a class="home" href="https://google.com/" title="Volver a Inicio"><i class="icon-home"></i></a>
			<span class="navigation-pipe">&gt;</span>
					Editar Cancion
</div>

        
        
        <h3>EDITOR DE CONTENIDO</h3>
        
        <div class="resumen">
        <caption>01. Rellena todos los campos</caption>
            </div>
        
     <%@page import="java.sql.*" %> 
        
    
     <%
                int  val = Integer.parseInt(session.getAttribute("ID").toString()); 
  
Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
CallableStatement cs = null;
String query = "call selectse(?)";
        cs = conexion.prepareCall(query);
        cs.setInt(1,val);

ResultSet rs = cs.executeQuery();
int i = 1;




%>
        
        
        
     <div class="contenido">
			
            
            <hr>
           
			<div class="formulario">
			    <form action="jsp/editm.jsp" method="post">
			    <select name="Namae" id="">
			        <%
                               while (rs.next()) {
                               out.println("<option value="+ rs.getString("ID_song") +" selected='selected'>"+rs.getString("NombreCancion")+"</option>)");
                               }
                                %>                  		            
			        </select><br><br>
			        Titulo:
			        <input type="text" name="titulo" /> <br><br>
			        Tipo:
			         <select name="genero" id="">
			            <option value=“Publico” selected="selected"> Público </option>
                        <option value=“Premium”> Premium </option>                     		            
			        </select><br><br>
			        Precio:
			            <input type="text" name="precio"><br><br>
			            <a href="UserProfileC.jsp"><img src="IMG/cancelarbtn.png" alt="" width="200"></a>
			           <input type="image" src="IMG/ready.png" alt="Submit Form" width="200" />
			        
			    </form>
			</div>
			
		</div>
        
            
            
            
            
            
            
            
            
       
        
        
        
        
         <header>
            <div class="contenedor">
                <h1 class="icon-cloud-1">SONGSKY</h1>
                <input type="checkbox" id="menu-bar">
                <label class="icon-menu" for="menu-bar"></label>
                <nav class="menu">
                    <a href="Carrito.jsp"><span class="icon-basket"></span> Mi Carrito</a>
                    <a href="UserProfileC.jsp">Perfil</a>
                    <a href="login">Salir</a>
                    <a><span class="icon-cog-alt"></a>
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
    </main>
</html>