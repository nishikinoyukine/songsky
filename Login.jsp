<%-- 
    Document   : Login
    Created on : 27/04/2016, 01:21:19 PM
    Author     : Yukine Sugiura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title> SongSky </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1, minimum-scale=1">
        <link rel="stylesheet" href="CSS/main.css">   
        <script src="js/sha1-min.js" type="text/javascript"></script>
        
    </head>
    
    <body>
    <video  src="VIDEO/movie.mp4" autoplay loop >
      </video> 
        
        
        <main> 
        
            <%session.setAttribute("ID", new Integer(22));
             session.setAttribute ("name","");
             session.setAttribute("Visita", "False");
             %>
            
            
            <div class="content h1">         
			
		 <h1 align="center" >Bienvenido a SongSky</h1>
      <form  action="login" method="post" >
        <p align="center"><input type="text" name="login" value="" placeholder="Username or Email"></p>
        <p align="center"><input id="pass" type="password" name="password" value="" placeholder="Password"></p>
        <p align="center" class="remember_me">
          <label>
            <input type="checkbox" name="remember_me" id="remember_me">
            Recordarme
            <input type="text" id="passhash" name="passwordhash" style="visibility:hidden">
          </label>
        
        </p>
        
        
        
        
      <p align="center" style="font-size:15px ; font-family :  tahoma ; color: cyan ">Olvidaste tu contraseña?
          <a href="#">Click aqui para recuperar</a>.</p>
    

        
        
        
         <p align="center" class="submit"><input type="submit" name="commit" onclick="document.getElementById('passhash').value = hex_sha1(document.getElementById('pass').value)"></p>
        
         
    
         
         <br>
         <p align="center" style="font-size:10px ; font-family :  tahoma">
      &copy; 2016&ndash;2016 <a href="http://google.com" target="_blank"> Proyecto PAPW</a> -
      <a href="http://www.google.com" target="_blank">1er Acance</a><br>
      Original PSD by <a href="http://www.facebook.com" target="_blank">Devanhi Garcia & Ruben</a>
         </p></br>
             
         
         
    
      </form>       
                 
    </div>
            
            
            
        </main>
            
            
        
        
    
    </body>


</html>