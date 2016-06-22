<%-- 
    Document   : UserProfileC
    Created on : 27/04/2016, 01:13:41 PM
    Author     : Yukine Sugiura
--%>
<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    
     <%
 int val;
                   if(session.getAttribute("Visita").equals("true"))
                    { val = Integer.parseInt(session.getAttribute("IDv").toString());
                      
                    }else
                    {
                     val = Integer.parseInt(session.getAttribute("ID").toString());
                    }
                   
Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
CallableStatement cs = null;
String query = "call com(?)";
        cs = conexion.prepareCall(query);
        cs.setInt(1,val);

ResultSet rs = cs.executeQuery();
int i = 1;
String[ ] com = new String[3];
while (rs.next()){
    if (i<=2){com [i] = rs.getString("comentario");}
    i+=1;
    
}
rs.close();
cs.close();
conexion.close();
//listas 
Class.forName("com.mysql.jdbc.Driver");
conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
cs = null;
 query = "call listuser(?)";
        cs = conexion.prepareCall(query);
        cs.setInt(1,val);

rs = cs.executeQuery();
i = 0;
int [] vallst = new int[9]; 
String[ ] namelst = new String[8];

for (int n=0;n<8;n++){
namelst [n] = "No se ha Creado Esta Lista";
vallst [n] = 2;
}

while (rs.next()){
    if (i<=8){namelst [i] = rs.getString("nomlista");
              vallst [i] = rs.getInt("idListarep");
    }
    i+=1;
    
}
rs.close();
cs.close();
conexion.close();
%>
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
         <script language="javascript">

function NewWindow(mypage,myname,w,h,scroll){
LeftPosition = (screen.width) ? (screen.width-w)/2 : 0;
TopPosition = (screen.height) ? (screen.height-h)/2 : 0;
settings =
'height='+h+',width='+w+',top='+TopPosition+',left='+LeftPosition+',scrollbars='+scroll+',resizable'
win = window.open(mypage,myname,settings)
             
}

</script>

    </head>

    <body>
        <main>
             <section id="busqueda">             
                        <form action="Buscador.jsp" method="get">	
                            
                        <input type="search" name="BUSCAR" placeholder="Audio o Artista">	<i class="icon-search" ></i>	
                    
                            
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
                    {out.println("<h1>" + session.getAttribute("namev")+"<a href='Index.jsp'></h1></a>");
                    }else
                    {
                    out.println("<h1>¡Hola de nuevo "+ session.getAttribute("name")+ " </h1>");
                    }
                    
                %>
                    
              
                </div>  
            <p id="recuerda">¡Recuerda que puedes empezar tu nueva experiencia Premium en tan solo unos pasos!</p>
            
            
            
            
            
            
            <section id="publicidad">
                
                
                
                <hr color="dodgerblue" size=1>
                
                <%
                    if(session.getAttribute("Visita").equals("true"))
                    {                    }else
                    {
                        %>
                        <div class="menudes">
                        <a href="EditorMusic.jsp">Administrar Grabaciones</a>
                        <a href="UploadMusic.jsp">Subir Contenido</a>
                        <a href="Reporte.jsp">Reporte de Ventas</a>
                        <div class="marca"></div>
                        </div>
                    <%
                    }
                    
                %>
                 
                </section>
                <p id="idp" hidden="true" value="0">idm</p>
                 <section id="generosmusic">
                <h3>Playlist</h3>
                <div class="containergeneros">
                    <div class="info-generos">
                        <a href="jsp/repmusica.jsp?idp=<%out.println(vallst [0]);%>" title="PlayList" onclick="NewWindow(this.href,'name','240','500','yes');return false"><img src="IMG/list2.jpg"></a>
                        <h5><%out.println(namelst[0]);%></h5> 
                    </div>
                    
                     <div class="info-generos">
                     <a href="jsp/repmusica.jsp?idp=<%out.println(vallst [1]);%>" title="PlayList" onclick="NewWindow(this.href,'name','240','500','yes');return false"><img src="IMG/list3.jpg"></a>
                         <h5><%out.println(namelst[1]);%></h5> 
                    </div>
                    
                     <div class="info-generos">
                     <a href="jsp/repmusica.jsp?idp=<%out.println(vallst [2]);%>" title="PlayList" onclick="NewWindow(this.href,'name','240','500','yes');return false"><img src="IMG/list4.jpg"></a>
                         <h5><%out.println(namelst[2]);%></h5> 
                    </div>
                    
                     <div class="info-generos">
                        <a href="jsp/repmusica.jsp?idp=<%out.println(vallst [3]);%>" title="PlayList" onclick="NewWindow(this.href,'name','240','500','yes');return false"><img src="IMG/list5.jpg"></a>
                         <h5><%out.println(namelst[3]);%></h5> 
                    </div>
                    
                     <div class="info-generos">
                        <a href="jsp/repmusica.jsp?idp=<%out.println(vallst [4]);%>" title="PlayList" onclick="NewWindow(this.href,'name','240','500','yes');return false"><img src="IMG/list6.jpg"></a>
                         <h5><%out.println(namelst[4]);%></h5> 
                    </div>
                    
                     <div class="info-generos">
                        <a href="jsp/repmusica.jsp?idp=<%out.println(vallst [5]);%>" title="PlayList" onclick="NewWindow(this.href,'name','240','500','yes');return false"><img src="IMG/list7.jpg"></a>
                         <h5><%out.println(namelst[5]);%></h5> 
                    </div>
                    
                     <div class="info-generos">
                        <a href="jsp/repmusica.jsp?idp=<%out.println(vallst [6]);%>" title="PlayList" onclick="NewWindow(this.href,'name','240','500','yes');return false"><img src="IMG/list8.jpg"></a>
                         <h5><%out.println(namelst[6]);%></h5> 
                    </div>
                    
                          
            <%
                    if(session.getAttribute("Visita").equals("true"))
                    {                    }else
                    {
                        %>
                        <div class="info-generos">
                         <a href="createlist.jsp"><img src="IMG/list1.jpg" alt=""></a>
                         <h5>Agregar Nueva Lista</h5> 
                         </div>
                         </div>   
                    <%
                    }
                    
                %>
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
                
            
              <hr color="dodgerblue" size=1>
            
            </section>
            <section id="artistas">
                <h4>Las Mas Nuevas</h4>
                <div class="containerartistas">
                    <div class="info-artistas">
                        <img src="<%out.println(urlimg[0]);%>" alt="">
                        <h5><%out.println(nom[0]);%></h5> 
                    </div>
                    
                     <div class="info-artistas">
                        <img src="<%out.println(urlimg[1]);%>" alt="">
                        <h5><%out.println(nom[1]);%></h5> 
                    </div>
                    
                     <div class="info-artistas">
                        <img src="<%out.println(urlimg[2]);%>" alt="">
                        <h5><%out.println(nom[2]);%></h5> 
                    </div>
                    
                     <div class="info-artistas">
                        <img src="<%out.println(urlimg[3]);%>" alt="">
                        <h5><%out.println(nom[3]);%></h5> 
                    </div>
                    
                     <div class="info-artistas">
                        <img src="<%out.println(urlimg[4]);%>" alt="">
                        <h5><%out.println(nom[4]);%></h5>  
                    </div>
                    
                     <div class="info-artistas">
                        <img src="<%out.println(urlimg[5]);%>" alt="">
                        <h5><%out.println(nom[5]);%></h5>  
                    </div>
                    
                     <div class="info-artistas">
                        <img src="<%out.println(urlimg[6]);%>" alt="">
                        <h5><%out.println(nom[6]);%></h5>  
                    </div>
                    
                     <div class="info-artistas">
                        <img src="<%out.println(urlimg[7]);%>" alt="">
                        <h5><%out.println(nom[7]);%></h5> 
                    </div>
                <hr color="dodgerblue" size=1>
                </div>
                
                 <hr color="dodgerblue" size=1>
            </section>


                                      <hr color="dodgerblue" size=1>
                    
                     
                     
                     
                     
                     <form  name='comenta' action="jsp/comenta.jsp" method="post" >
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
		<span  class="icon-comment-empty" onclick="comenta.submit()">Enviar</span>
                
	</a>
    </div>   
                
                       <div class="listacomentarios"  style="display:inline-block">
                        
                         
                        
                            <table id="usercomentario" width="40%" cellspacing="10" cellpadding="2">
                                
                                

                                
                                
  <tr>
      <th><i class="icon-user">Anony</i></th>
      <th></th>
      <th></th>
     
      
  </tr>
    </table> 
                           
      <table id="publicacion" width width="40%" cellspacing="10" cellpadding="2">                                         
   <tr>
    <th><%out.println(com [1]);%></th>
  </tr>
</table>
                           
                    
                           
                            <table id="usercomentario" width="40%" cellspacing="10" cellpadding="2">
                        
  <tr>
      <th><i class="icon-user">Anony</i></th>
      <th></th>
      <th></th>
      
      
  </tr>
    </table> 
                           
      <table id="publicacion" width width="40%" cellspacing="10" cellpadding="2">                                         
   <tr>
    <th><%out.println(com [2]);%></th>
  </tr>
</table>
                  
                        
    </div>              
           
            
                     </section>
         </form>     
         
        
        
        
        
        <header>
            <div class="contenedor">
                <h1 class="icon-cloud-1">SONGSKY</h1>
                <input type="checkbox" id="menu-bar">
                <label class="icon-menu" for="menu-bar"></label>
                <nav class="menu">
                    
                    <%
                    if(session.getAttribute("Visita").equals("true"))
                    {
                    }else
                    {
                    out.println("<a href='Carrito.jsp'><span class='icon-basket'>Mi Carrito</a>");
                    } 
                %>
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
