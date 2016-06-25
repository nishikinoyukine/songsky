<%-- 
    Document   : Reporte
    Created on : 27/04/2016, 01:05:47 PM
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
    
        <link rel="stylesheet" href="CSS/reporte.css"> 
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
					Tus reportes de ventas	
</div>

        
        
        <h3>REPORTE DE VENTAS</h3>
        
        <div class="resumen">
        <caption>01. Reporte</caption>
            </div>
        
        
        
        
        
        
        <section id="tablareporte">     
            
            <table id="filtro"  width="40%"  >
			<tr>
				<td> Desde: </td>
				<td> Hasta: </td>
			</tr>
			<tr>
				<td> <input type = "DATE" name= "FechaInicio" required> </td>
				<td>  <input type = "DATE" name= "FechaFin" required> </td>
			</tr>
		</table>
            
            
            
            
            
            <table id="reportetabla">
  <tr>
    <th scope="col">Nombre del Usuario</th>
    <th scope="col">Categoria</th>
    <th scope="col">Titulo</th>
    <th scope="col">Fecha de la Compra</th>
    <th scope="col">Precio</th>
    <th scope="col">Correo del comprador</th>
  </tr>
 
  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>

  </tr>
 

</table>
            
            
        </section>
        
            
            
            
            
            
            
            
            
        <a href="#" class="button blue medium radius">
		<span class="icon-check"></span>Continuar
	</a>
        
        
        
        
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
