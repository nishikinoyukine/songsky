<%-- 
    Document   : Registro
    Created on : 27/04/2016, 01:08:42 PM
    Author     : Yukine Sugiura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>

<!DOCTYPE html>
<html lang="en">
    <%
int val = Integer.parseInt(session.getAttribute("ID").toString());
Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
CallableStatement cs = null;
String query = "call obus(?)";
        cs = conexion.prepareCall(query);
        cs.setInt(1,val);
ResultSet rs = cs.executeQuery();
rs.first();

%>
    <head>
        <meta charset="UTF-8">
        <title>Datos de Usuario</title> 
        <link rel="stylesheet" href="CSS/registro.css">
        <script src="js/jquery.js"></script>
        <script src="js/sha1-min.js" type="text/javascript"></script>
    </head>
    
<body>
    
    
    
    
<section id="formulario"> 
    <p id="titulo"> Edicion de Datos de Usuario</p>
    <p id="titulo2"> Actualiza Tus Datos </p>

    <form METHOD=POST ENCTYPE="multipart/form-data" action="UpdateU">
        <input type="text" id="nick" name="nick" Value="<%out.println(rs.getString("NUser"));%>">

         <input type="text" id="nombre" name="nombre" Value="<%out.println(rs.getString("Nombre"));%>">

        <input type="text" id="apellidos" name="apellidos" Value="<%out.println(rs.getString("Apellidos"));%>">


    <p id="info"> Datos Personales </p>
    
        <input type="text" id="calle" name="calle" Value="<%out.println(rs.getString("Calle"));%>">
        <input type="text"  id="num" name="num" Value="<%out.println(rs.getString("Numero"));%>">
        <input type="text" id="col" name="col" Value="<%out.println(rs.getString("Colonia"));%>">
        <input type="text" id="municipio" name="municipio" Value="<%out.println(rs.getString("Municipio"));%>">
        <input type="text" id="edo" name="edo" Value="<%out.println(rs.getString("Estado"));%>">
        <input type="text" id="cp" name="cp" Value="<%out.println(rs.getString("CodigoP"));%>">
     
    
    
    
    
    
     <p id="info"> Personaliza tu Avatar </p>
     <div class="contenedor">
    <img id="mostrarimagen" src="DisplayImage?image=Profile" height="200" width="200" class="imagen" />     
    </div>
        
    
    <div class="subirimagen">
      
          <input id="profileimg" TYPE=FILE NAME="profileimg">
              
              
              </form
    </div>
              
               <p id="info"> Personaliza tu Portada </p>
              <div class="contenedor2">
                  <img id="mostrarim" src= "DisplayImage?image=Portada" height="100" width="400" class="imagen2" /> 
              </div>
    
    <div class="subirimagen">
      
          <input id="perfilim" TYPE=FILE NAME="Portadaimg">
              <%--<input TYPE=submit VALUE="Subir">
              <input TYPE=submit VALUE="Subir">
              --%>
             
    </div>
              
    
    
    
         <div class="registracion">
             
             <p id="notice">Actualizar Datos Aceptas que son Reales conforme a nuestros <a href="/mx/legal/end-user-agreement/" target="_blank">términos y condiciones</a> y la <a href="/mx/legal/privacy-policy/" target="_blank">política de privacidad de SongSky.</a></p>       
        </div>
    
    <div class="registrate">
    <input type="submit" value="Actualizar">
    </div>
       </form>

  <form
    id="js-register-with-facebook"
    method="post"
    role="form"
    action="/mx/xhr/json/sign-up-for-spotify-fb.php">

    
    <input id="creation_flow" name="creation_flow" type="hidden" value="">

    <div class="content">
      
      
     
    </div>
  </form>

   <%rs.close();
cs.close();
conexion.close();%> 
    
        
    </section>    
    <script type="text/javascript" > 
function mostrarImagen(input) {
 if (input.files && input.files[0]) {
  var reader = new FileReader();
  reader.onload = function (e) {
   $('#mostrarimagen').attr('src', e.target.result);
  }
  reader.readAsDataURL(input.files[0]);
 }
}
 
$("#profileimg").change(function(){
 mostrarImagen(this);
});

function mostrarImagen1(input) {
 if (input.files && input.files[0]) {
  var reader = new FileReader();
  reader.onload = function (e) {
   $('#mostrarim').attr('src', e.target.result);
  }
  reader.readAsDataURL(input.files[0]);
 }
}
 
$("#perfilim").change(function(){
 mostrarImagen1(this);
});
 </script>   
</body>        
</html>

