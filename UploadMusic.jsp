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
					Subir Cancion
</div>

        
        
        <h3>Creador de Contenido</h3>
        
        <div class="resumen">
        <caption>01. Rellena todos los campos</caption>
            </div>
        
        
        
    
    
        
        
        
     <div class="contenido">
			
            
            <hr>
           
			<div class="formulario">
			    <form method="post" action="MusicU" ENCTYPE="multipart/form-data">
			        Archivo: 
			        <input type="file" name="archivo" /> <br><br>
			        Titulo:
			        <input type="text" name="titulo" /> <br><br>
			        Imagen Disco: 
			        <input type="file" name="Disco" /> <br><br>
			        Tipo:
			         <select name="genero" id="">
			            <option value=“1” selected="selected"> Público </option>
                        <option value=“2”> Premium </option>                     		            
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
                    <a href=""><span class="icon-basket"></span> Mi Carrito</a>
                    <a href="">Perfil</a>
                    <a href="">Salir</a>
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