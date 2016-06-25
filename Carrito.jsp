<%-- 
    Document   : Carrito
    Created on : 27/04/2016, 01:24:03 PM
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
        <link rel="stylesheet" href="CSS/fontello.css">
        <link rel="stylesheet" href="CSS/userprofile.css">
        <link rel="stylesheet" href="CSS/portada.css"> 
        <link rel="stylesheet" href="CSS/menuser.css">  
        <link rel="stylesheet" href="CSS/publicidad.css"> 
        <link rel="stylesheet" href="CSS/infomusica.css"> 
    
        <link rel="stylesheet" href="CSS/carrito.css"> 
    </head>
    <body>
    <main>
        
         <section id="busqueda"> 
             <hr color="dodgerblue" size=3>
                        <form action="#" method="get">	
                            
                        
                           
                </form>           
                </section>  
        
        <div class="carritodecomprita">
			<a class="home" href="#" title="Volver a Inicio"><i class="icon-home"></i></a>
			<span class="navigation-pipe">&gt;</span>
					Tu carrito de compra	
</div>

        
        
        <h3>RESUMEN DE COMPRA</h3>
        
        <div class="resumen">
        <caption>01. Resumen</caption>
            </div>
        
        
        <section id="tablacarrito">
            
<table summary="Tabla">
  
  
 
  <tr>
    <th scope="row" abbr="producto">Producto</th>
      <th scope="row" abbr="descripcion">Descripcion</th>
      <th scope="row" abbr="disponibilidad">Disponibilidad</th>
      <th scope="row" abbr="total">Total</th>
    </tr>
 
    <% // declarando y creando objetos globales 
                    // construyendo forma dinamica 
        Class.forName("com.mysql.jdbc.Driver");
        Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
      int val = Integer.parseInt(session.getAttribute("ID").toString());
      CallableStatement cs = null;
      int i = 0;
          
           int subto = 0;
           double iva = 0;
           double total=0;
            int[ ] com = new int[10];
        // mandando el sql a la base de datos 
        try {
            String query = "call obcar(?)";
            cs = conexion.prepareCall(query);
             cs.setInt(1,val);
        ResultSet rs = cs.executeQuery(); 
          
           
         //   tabla = instruccion.executeQuery(q); 
        // mandando resultset a tabla html 
           
            while(rs.next()) {
                out.println("<TR>");
                 out.println("<TD><img src=\""+rs.getString("Image")+"\" height='200' width='300'></TD>");
                out.println("<TD>"+rs.getString("NombreCancion")+"</TD>");
                out.println("<TD>Descarga Premium</TD>");
                out.println("<TD>$"+rs.getInt("Precio")+"</TD>");
                out.println("</TR>"); 
                com[i]= rs.getInt("precio");
                i=i+1;
             
            }; // fin while 
                
            } //fin try no  usar ; al final de dos o mas catchs 
            catch(SQLException e) {};
            try {
            conexion.close();
            } catch(SQLException e) {}; //}; 
         
cs.close();

for(int n=0;n<i;n++){
    subto=subto+com[n];
}
 iva= subto*0.16;
 total=subto+iva;


            %>  
    
 
 
  <tr>
    <th colspan="2" ></th>
    <td>Subtotal</td>
    <td>$<%out.println(subto);%></td>
  </tr>
 
   <tr>
    <th colspan="2" ></th>
    <td>IVA</td>
    <td>$<%out.println(iva);%></td>
  </tr>
 
    <tr>
    <th colspan="2" ></th>
    <td>TOTAL</td>
    <td>$<%out.println(total);%></td>
  </tr>
 
</table>
            
            
        </section>
        
        <a href="jsp/delcar.jsp" class="button blue medium radius">
		<span class="icon-check"></span>Borrar Carrito
	</a>    
            
        <a href="CTarjeta.jsp" class="button blue medium radius">
		<span class="icon-check"></span>Pasar a Pagar
	</a>
        
        
        
        
         <header>
            <div class="contenedor">
                <h1 class="icon-cloud-1">SONGSKY</h1>
                <input type="checkbox" id="menu-bar">
                <label class="icon-menu" for="menu-bar"></label>
                <nav class="menu">
                    <a href="Carrito.jsp"><span class="icon-basket"></span> Mi Carrito</a>
                    <a href="UserProfileC.jsp">Perfil</a>
                    <a href="Index.jsp">home</a>
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
