<%-- 
    Document   : Administrador
    Created on : 27/04/2016, 01:26:27 PM
    Author     : Yukine Sugiura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>SONGSKY</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1, minimum-scale=1">
        <link rel="stylesheet" href="CSS/fontello.css">
        <link rel="stylesheet" href="CSS/userprofile.css"> 
        <link rel="stylesheet" href="CSS/menuser.css">   
        <link rel="stylesheet" href="CSS/portada.css"> 
         <link rel="stylesheet" href="CSS/administrador.css">
         <script src="js/jquery.js"></script>
         

    </head>

 <body>
     
     
     
     
     
        <main>
            
         <hr color="dodgerblue" size=1>
               
                
                
                

            
          <section id="formulario"> 
    <p id="titulo"><b><span class="icon-user"> BIENVENIDO A SONGSKY <%=session.getAttribute("name")%></span></b></p>
    <p id="titulo2"><u><small>"Dejando siempre volar la imaginacion" </small></u></p>
    

    
        <form METHOD=POST ENCTYPE="multipart/form-data" action="<%= request.getContextPath()%>/VideoS">
    <p id="info"> SUBIR VIDEO</p>

        <input type="file" id="VideoSemana" name="Videosx" >

        </div>
        <video id="videoprincipal" src="#" height="800" width="600" autoplay controls ></video> 

                </div>   

        
        
        
            
            
		
			
		<p id="info">ADMINISTRAR HORARIOS</p>
         <div id="registro" class="registro"> 
             
              <input type="date" id="time" name="timeI" >
              <input type="date" id="time" name="timeF" >
             
             
    
   </div>
         
        
		
            
    
    <p id="info"> ADMINISTRAR CONTENIDO</p>
            
              
              
     
         <p>Seleccionar contenido</p>
        <select name="idpub">
  <option  value="1">Pub.1</option>
  <option value="2">Pub.2</option>
  <option value="3">Pub.3</option>
  <option value="4">Pub.4</option>
   <option value="5">Pub.5</option>
    <option value="6">Pub.6</option>
</select>

    
    
    
    
    
     
              
               <p id="info"> PORTADA PRINCIPAL </p>
              <div class="contenedor2">
               <img id="imgport" src="IMG/cloudb.png" height="100" width="400" class="imagen2" /> 
              </div>

    
    <div class="subirimagen">
      
          <input id="bannerp" TYPE=FILE NAME="Bannerp">
              <input TYPE=submit VALUE="Subir">
    </div>
                     </form>
            
         
        
        
        
        
        <header>
            <div class="contenedor">
                <h1 class="icon-cloud-1">SONGSKY</h1>
                <input type="checkbox" id="menu-bar">
                <label class="icon-menu" for="menu-bar"></label>
                <nav class="menu">
                    <a href="Index.jsp"><i class="icon-home">Home</i></a>
                    <a href="login" method="get">Salir</a>
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
        
         <script type="text/javascript" > 
function mostrarVideo(input) {
 if (input.files && input.files[0]) {
  var reader = new FileReader();
  reader.onload = function (e) {
   $('#videoprincipal').attr('src', e.target.result);
  }
  reader.readAsDataURL(input.files[0]); //Llevame al error
 }
}
 
$("#VideoSemana").change(function(){
 mostrarVideo(this);
});

function mostrarImagen(input) {
 if (input.files && input.files[0]) {
  var reader = new FileReader();
  reader.onload = function (e) {
   $('#imgport').attr('src', e.target.result);
  }
  reader.readAsDataURL(input.files[0]); //Llevame al error
 }
}
 
$("#bannerp").change(function(){
 mostrarImagen(this);
});

</script>
        
        
    </body>
</html>
