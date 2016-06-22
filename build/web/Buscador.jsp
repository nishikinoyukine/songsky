<%-- 
    Document   : Buscador
    Created on : 14/05/2016, 07:36:30 AM
    Author     : Yukine Sugiura
--%>
<%@page import="java.sql.*" %>     
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>SONGSKY</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1, minimum-scale=1">
        <link rel="stylesheet" href="css2/fontello.css">
        <link rel="stylesheet" href="css2/userprofile.css">
        <link rel="stylesheet" href="css2/reporte.css">
         <link rel="stylesheet" href="css2/buscador.css"> 
    </head>
    <body>
    <main>
        
         <section id="busqueda"> 
                        <form action="#" method="get">	
                            
                        
                           
                </form>           
                </section>  
        
        <div class="carritodecomprita">
			<a class="home" href="Index.jsp" title="Volver a Inicio"><i class="icon-home"></i></a>
			<span class="navigation-pipe">&gt;</span>
					
</div>

        
        
        
        
        
        
        
    
    <div class="songsky"> 
        <h3>SONGSKY</h3>
        </div>
                    
                        
        <div class="resumen">
        <caption>Musica a tu estilo</caption>
            </div>
        
        
   
         <table id="busqueda">
         
          

                        <form action="Buscador.jsp" method="post">	
                            
                        <input Name="BUSCAR" type="search" placeholder="Audio o Artista">		    	
                        <i class="icon-search" ></i>
                           
                </form>  
             </table>

       
          <% // declarando y creando objetos globales 
                    // construyendo forma dinamica 
        Class.forName("com.mysql.jdbc.Driver");
        Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
        String buscar = request.getParameter("BUSCAR");
        // mandando el sql a la base de datos 
        try {
            Statement Estamento = conexion.createStatement();
            ResultSet rs = Estamento.executeQuery("select * from canciones where NombreCancion like '%' \""+buscar+"\" '%'");
 
         //   tabla = instruccion.executeQuery(q); 
        // mandando resultset a tabla html 
            out.println("<TABLE ID='tablareporte' Border=10 CellPadding=5><TR>");
            out.println("<th bgcolor=Green>Nombre</th><th bgcolor=White>Precio</th></TR>");
            while(rs.next()) {
                out.println("<TR>");
                out.println("<TD>"+rs.getString("NombreCancion")+"</TD>");
                out.println("<TD>$"+rs.getInt("Precio")+"</TD>");
                out.println("</TR>"); }; // fin while 
            out.println("</TABLE></CENTER></DIV></HTML>");
            } //fin try no usar ; al final de dos o mas catchs 
            catch(SQLException e) {};
            try {
            conexion.close();
            } catch(SQLException e) {}; //}; 
            %>  
            
            
      <a href="Index.jsp"><img src="IMG/cancelarbtn.png"width="200" /></a>            
            
       
        
        
        
        
         <header>
            <div class="contenedor">
                <h1 class="icon-cloud-1">SONGSKY</h1>
                <input type="checkbox" id="menu-bar">
                <label class="icon-menu" for="menu-bar"></label>
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