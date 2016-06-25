<%-- 
    Document   : UserProfile
    Created on : 27/04/2016, 12:50:39 PM
    Author     : Yukine Sugiura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>
    <title> User profile </title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1, minimum-scale=1">
    <link rel="stylesheet" href="CSS/mainuser.css"> 
</head>
    
    
    
<body>
    <header>
        <input type="checkbox" id="btn-menu">
        <label for="btn-menu"> <img src="IMG/menusito.png"  alt="">   
        </label>
        
        <nav class="menu">
        <ul>
            <li> <a href=""> Mis listas </a></li>
            <li> <a href=""> Actualizar mis listas </a></li>
            <li> <a href=""> Administrar grabaciones </a></li>
            <li> <a href=""> Ventas y Premium </a></li>
            <li> <a href=""> Reporte de Ventas </a></li>        
        </ul>
        </nav>   
    </header>
    
    
    <fieldset>
        
        
        <div>
        <h1  id="cabezerauser" align="center"> <%=session.getAttribute("name")%> </h1>  
            </div>
            
            
			<div id="ingresar">
				<form  action="Usuarios.html" method="POST" name="formulario" id="forma1">
			<div id="datos">
			<table width="100%" cellspacing="5">
                
                
				
		 <div class="contenedor">
	<img src="IMG/batmanman.jpg" height="300" width="300" class="imagen" />
	</div>
                    
                    <textarea  name="comentario" rows="15" cols="40">Cuentanos un poco sobre ti...</textarea>
                    
                    
				</tr>
                </table>
                
               
                    
               
             
                    
                    
                </form>
                
                <FORM METHOD=POST ENCTYPE="multipart/form-data" ACTION="../cgi-bin/mycgi.pl"> <INPUT TYPE=FILE NAME="upfile"><BR> <INPUT TYPE=SUBMIT VALUE="Submit"> </FORM>

                
   </fieldset>

    

    

    
    
    
	
</body>
</html>
