<%-- 
    Document   : Registro
    Created on : 27/04/2016, 01:08:42 PM
    Author     : Yukine Sugiura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Registro de Usuario</title> 
        <link rel="stylesheet" href="CSS/registro.css">
        <script src="js/jquery.js"></script>
        <script src="js/sha1-min.js" type="text/javascript"></script>
    </head>
    
<body>
    
    
    
    
<section id="formulario"> 
    <p id="titulo"> BIENVENIDO A SONGSKY</p>
    <p id="titulo2"> Registrate con tu correo electronico </p>

    <form METHOD=POST ENCTYPE="multipart/form-data" action="RegistroU">
        <input type="text" id="nick" name="nick" placeholder="Nombre de usuario">
         <input type="mail" id="mail" name="mail" placeholder="Correo electr&oacute;nico">
        
         <input type="text" id="nombre" name="nombre" placeholder="Nombre">
        
        
        <input type="mail" id="mail" name="mail" placeholder="Confirmar correo electr&oacute;nico">
    
        <input type="text" id="apellidos" name="apellidos" placeholder="Apellidos">
  
         <input type="password" id="pass" name="pass" placeholder="Contrase&ntilde;a">
         <input type="text" id="passhash" name="passwordhash" style="visibility:hidden">
        
       
        
			
		<p id="info"> Fecha de nacimiento</p>
         <div id="registro" class="registro">     
    <div class="day">
  <input type="number" id="register-dob-day"  class="dob" name="dob_day" placeholder="Día"
  pattern="[0-9]*"
  maxlength="2"
  min="1"
  max="31"
  required>

         
           
        <select name="mes" name="dob_mot">  
            <option value="Ene">Enero</option>
            <option value="Feb">Febrero</option>
            <option value="Mar">Marzo</option>
            <option value="Abr">Abril</option>
            <option value="May">Mayo</option>
            <option value="Jun">Junio</option>
            <option value="Jul">Julio</option>
            <option value="Ago">Agosto</option>
            <option value="Sep">Septiembre</option>
            <option value="Oct">Octubre</option>
            <option value="Nov">Noviembre</option>
            <option value="Dic">Diciembre</option>        
            </select>
       
    

  <input
  type="number"
  id="register-dob-year"
  class="dob"
  name="dob_year"
  placeholder="Año"
  pattern="[0-9]*"
  maxlength="4"
  min="1900"
  max="2003"
  required
  data-msg-required="¿Cuándo naciste?"
  data-msg-number="Por favor introduce un año válido."
  data-msg-min="Por favor introduce un año válido."
  data-msg-max="Lo sentimos, pero no cumples con la edad que SongSky requiere.">                
          </div> 
   </div>
         
        
		<form action="" class="formulario">    
			<div class="radio">
				
				<input type="radio" name="sexo" id="hombre">
				<label for="hombre">Hombre</label>
		
				<input type="radio" name="sexo" id="mujer">
				<label for="mujer">Mujer</label>	
			</div>           
    
            
    
    <p id="info"> Datos Personales </p>
    
        <input type="text" id="calle" name="calle" placeholder="Calle">
        <input type="text"  id="num" name="num" placeholder="Numero">
        <input type="text" id="col" name="col" placeholder="Colonia">
        <input type="text" id="municipio" name="municipio" placeholder="Municipio">
        <input type="text" id="edo" name="edo" placeholder="Estado">
        <input type="text" id="cp" name="cp" placeholder="Codigo Postal">
     
    
    
    
    
    
     <p id="info"> Personaliza tu Avatar </p>
     <div class="contenedor">
    <img id="mostrarimagen" src="IMG/avatar.png" height="200" width="200" class="imagen" />     
    </div>
        
    
    <div class="subirimagen">
      
          <input id="profileimg" TYPE=FILE NAME="profileimg">
              
              
              </form
    </div>
              
               <p id="info"> Personaliza tu Portada </p>
              <div class="contenedor2">
                  <img id="mostrarim" src="IMG/cloudb.png" height="100" width="400" class="imagen2" /> 
              </div>
    
    <div class="subirimagen">
      
          <input id="perfilim" TYPE=FILE NAME="Portadaimg">
              <%--<input TYPE=submit VALUE="Subir">
              <input TYPE=submit VALUE="Subir">
              --%>
             
    </div>
              
    
    
    
         <div class="registracion">
             
             <p id="notice">Al hacer click en Registrarse, aceptas los <a href="/mx/legal/end-user-agreement/" target="_blank">términos y condiciones</a> y la <a href="/mx/legal/privacy-policy/" target="_blank">política de privacidad de SongSky.</a></p>       
        </div>
    
    <div class="registrate">
    <input type="submit" value="Registrate" onclick="document.getElementById('passhash').value = hex_sha1(document.getElementById('pass').value)" >
    </div>
       </form>

  <form
    id="js-register-with-facebook"
    method="post"
    role="form"
    action="/mx/xhr/json/sign-up-for-spotify-fb.php">

    
    <input id="creation_flow" name="creation_flow" type="hidden" value="">

    <div class="content">
      
      
     
      <p id="primary">
        ¿Ya tienes una cuenta?        <a id="select-link-login" data-section="login" href="https://www.spotify.com/mx/login/?continue=https%3A//www.spotify.com/mx/download/">Iniciar sesión</a>
      </p>
    </div>
  </form>

    
    
        
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

