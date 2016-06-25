<%-- 
    Document   : UserProfileC
    Created on : 27/04/2016, 01:13:41 PM
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
        <link rel="stylesheet" href="CSS/portada.css"> 
        <link rel="stylesheet" href="CSS/menuser.css">  
        <link rel="stylesheet" href="CSS/publicidad.css"> 
        <link rel="stylesheet" href="CSS/infomusica.css"> 
        <link rel="stylesheet" href="CSS/styleartistas.css"> 
         <link rel="stylesheet" href="CSS/audioplayer.css"> 
         <link rel="stylesheet" href="CSS/demo.css"> 
    
         

    </head>

    <body>
        <main>
             <section id="busqueda">             
                        <form action="#" method="get">	
                            
                        <input type="search" placeholder="Audio o Artista">	<i class="icon-search" ></i>	
                    
                            
                </form>           
                </section>    
            
            <section id="portada">
            <img src="DisplayImage?image=Portada">       
            </section> 
            
            <section id="batman">
            <div class="foto">
                   <%--<img src="IMG/batmanman.jpg" height="200" width="200" class="imagen" />  --%>
                   <img src="DisplayImage?image=Profile"  height="200" width="200" class="imagen" />
                   
                   </div>
                
                
            </section>
           
            <div class="usertext">
                <%
                    if(session.getAttribute("Visita").equals("true"))
                    {out.println("<h1>" + session.getAttribute("namev")+"<a href='Index.jsp'></h1>");
                    }else
                    {
                    out.println("<h1>¡Hola de nuevo "+ session.getAttribute("name")+ " </h1>");
                    }
                    
                %>
                    
              
                </div>  
            <p id="recuerda">¡Recuerda que puedes empezar tu nueva experiencia Premium en tan solo unos pasos!</p>
            
            
            
            
            
            
            <section id="publicidad">
                
                
                
                <hr color="dodgerblue" size=1>
                
                 <div class="menudes">
<a href="">Administrar Grabaciones</a>
<a href="">Contenido Premium</a>
<a href="">Reporte de Ventas</a>
<div class="marca"></div>
</div>
                </section>
                
                 <section id="generosmusic">
                <h3>Generos Musicales</h3>
                <div class="containergeneros">
                    <div class="info-generos">
                        <img src="IMG/list2.jpg" alt="">
                        <h5>Rock</h5> 
                    </div>
                    
                     <div class="info-generos">
                        <img src="IMG/list3.jpg" alt="">
                         <h5>Relajante</h5> 
                    </div>
                    
                     <div class="info-generos">
                        <img src="IMG/list4.jpg" alt="">
                         <h5>Opera</h5> 
                    </div>
                    
                     <div class="info-generos">
                        <img src="IMG/list5.jpg" alt="">
                         <h5>Clasica</h5> 
                    </div>
                    
                     <div class="info-generos">
                        <img src="IMG/list6.jpg" alt="">
                         <h5>Romantica</h5> 
                    </div>
                    
                     <div class="info-generos">
                        <img src="IMG/list7.jpg" alt="">
                         <h5>Jazz</h5> 
                    </div>
                    
                     <div class="info-generos">
                        <img src="IMG/list8.jpg" alt="">
                         <h5>Electronica</h5> 
                    </div>
                    
                     <div class="info-generos">
                        <img src="IMG/list1.jpg" alt="">
                         <h5>Agregar Nueva Lista</h5> 
                    </div>
                </div>         
            
            
            
            
            
                     
                     <hr color="dodgerblue" size=1>
            
            
            <section id="artistas">
                <h4>Mis Listas</h4>
                <div class="containerartistas">
                    <div class="info-artistas">
                        <img src="IMG/disco1.jpg" alt="">
                        <h5>Coldplay</h5> 
                    </div>
                    
                     <div class="info-artistas">
                        <img src="IMG/discorihanna2.jpg" alt="">
                         <h5>Rihanna</h5> 
                    </div>
                    
                     <div class="info-artistas">
                        <img src="IMG/discofifth3.jpg" alt="">
                         <h5>Fifth Harmony</h5> 
                    </div>
                    
                     <div class="info-artistas">
                        <img src="IMG/discozayn4.png" alt="">
                         <h5>ZAYN</h5> 
                    </div>
                    
                     <div class="info-artistas">
                        <img src="IMG/discosia5.jpg" alt="">
                         <h5>Sia</h5> 
                    </div>
                    
                     <div class="info-artistas">
                        <img src="IMG/discotwuenty6.jpg" alt="">
                         <h5>Twenty One Pilots</h5> 
                    </div>
                    
                     <div class="info-artistas">
                        <img src="IMG/discojustin7.jpg" alt="">
                         <h5>Justin Bieber</h5> 
                    </div>
                    
                     <div class="info-artistas">
                        <img src="IMG/discoalan8.jpg" alt="">
                         <h5>Alan Walker</h5> 
                    </div>
                <hr color="dodgerblue" size=1>
                </div>
                
                 <hr color="dodgerblue" size=1>
            </section>
                     
                     
                     
                     
                     
                     <section id="reproductor">
                         
                         <div class="idmusico">
                        <img src="IMG/disco9.jpg" alt="">
                        
                    </div>
                         
                     
                         <div class="idcancion">
                         <MARQUEE WIDTH=100% HEIGHT=30 ALIGN=BOTTOM><%=session.getAttribute("name")%> </MARQUEE> 
                        </div> 
                     
                     <div id="wrapper">
			<audio preload="auto" controls loop>
				<source src="MusicO?">
				<source src="audio/BlueDucks_FourFlossFiveSix.ogg">
				<source src="audio/BlueDucks_FourFlossFiveSix.wav">
			</audio>
			<script src="js/jquery.js"></script>
			<script src="js/audioplayer.js"></script>
			<script>$( function() { $( 'audio' ).audioPlayer(); } );</script>
			</div>
                         </section>
                         
                     
                     
                                      <hr color="dodgerblue" size=1>
                     
                     
                     
                     
                     
                     <section id="comentarios" style="display:inline-block">
                         <div class="comments" style="display:inline-block">
                         <h6>Caja De Comentarios</h6>
                           <%
                    if(session.getAttribute("Visita").equals("true"))
                    {out.println("<textarea name='comentario' rows='15' cols='40'>Deja un comentario a "+ session.getAttribute("namev")+" ... </textarea>");
                    }else
                    {
                    out.println("<textarea name='comentario' rows='15' cols='40'>Comenta Algo a Tus Fans "+ session.getAttribute("name")+" ... </textarea>");
                    }
                    
                %>
                         
                         <a href="#" class="button blue medium radius">
		<span class="icon-comment-empty"></span>Enviar
	</a>
    </div>                
                       <div class="listacomentarios"  style="display:inline-block">
                        
                         
                        
                            <table id="usercomentario" width="40%" cellspacing="10" cellpadding="2">
                                
                                

                                
                                
  <tr>
      <th><i class="icon-user">USER456</i></th>
      <th></th>
      <th></th>
      <th>dia/hora</th>
      
  </tr>
    </table> 
                           
      <table id="publicacion" width width="40%" cellspacing="10" cellpadding="2">                                         
   <tr>
    <th>blebleblebleble :)</th>
  </tr>
</table>
                           
                    
                           
                            <table id="usercomentario" width="40%" cellspacing="10" cellpadding="2">
                        
  <tr>
      <th><i class="icon-user">USER456</i></th>
      <th></th>
      <th></th>
      <th>dia/hora</th>
      
  </tr>
    </table> 
                           
      <table id="publicacion" width width="40%" cellspacing="10" cellpadding="2">                                         
   <tr>
    <th>blablablablabla</th>
  </tr>
</table>
                  
                        
    </div>              
           
            
                     </section>
            
         
        
        
        
        
        <header>
            <div class="contenedor">
                <h1 class="icon-cloud-1">SONGSKY</h1>
                <input type="checkbox" id="menu-bar">
                <label class="icon-menu" for="menu-bar"></label>
                <nav class="menu">
                    <a href="Carrito.jsp"><span class="icon-basket"></span> Mi Carrito</a>
                    <a href="Index.jsp">Home</a>
                     <%
                    if(session.getAttribute("Visita").equals("true"))
                    {out.println("<a href='Registro.jsp'><span class='icon-cog-alt'> Registro</a>");
                    }else
                    {
                    out.println("<a href='EdiciondeDatos.jsp'><span class='icon-cog-alt'> Edicion</a>");
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
