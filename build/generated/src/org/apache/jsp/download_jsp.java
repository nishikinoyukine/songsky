package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class download_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <title>SONGSKY</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1, minimum-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/fontello.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/userprofile.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/portada.css\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/menuser.css\">  \n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/publicidad.css\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/infomusica.css\"> \n");
      out.write("    \n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/carrito.css\"> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <main>\n");
      out.write("        \n");
      out.write("         <section id=\"busqueda\"> \n");
      out.write("             <hr color=\"dodgerblue\" size=3>\n");
      out.write("                        <form action=\"#\" method=\"get\">\t\n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("                           \n");
      out.write("                </form>           \n");
      out.write("                </section>  \n");
      out.write("        \n");
      out.write("        <div class=\"carritodecomprita\">\n");
      out.write("\t\t\t<a class=\"home\" href=\"#\" title=\"Volver a Inicio\"><i class=\"icon-home\"></i></a>\n");
      out.write("\t\t\t<span class=\"navigation-pipe\">&gt;</span>\n");
      out.write("\t\t\t\t\tTu carrito de compra\t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <h3>RESUMEN DE COMPRA</h3>\n");
      out.write("        \n");
      out.write("        <div class=\"resumen\">\n");
      out.write("        <caption>01. Resumen</caption>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <section id=\"tablacarrito\">\n");
      out.write("            \n");
      out.write("<table summary=\"Tabla\">\n");
      out.write("  \n");
      out.write("  \n");
      out.write(" \n");
      out.write("  <tr>\n");
      out.write("    <th scope=\"row\" abbr=\"producto\">Producto</th>\n");
      out.write("      <th scope=\"row\" abbr=\"descripcion\">Descripcion</th>\n");
      out.write("      <th scope=\"row\" abbr=\"disponibilidad\">Disponibilidad</th>\n");
      out.write("      <th scope=\"row\" abbr=\"total\">Total</th>\n");
      out.write("    </tr>\n");
      out.write(" \n");
      out.write("    ");
 // declarando y creando objetos globales 
                    // construyendo forma dinamica 
        Class.forName("com.mysql.jdbc.Driver");
        Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
      int val = Integer.parseInt(session.getAttribute("ID").toString());
      CallableStatement cs = null;
          
    
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
                out.println("<Th><a href=\"" +rs.getString("urlsong")+ "\" download=\""+rs.getString("NombreCancion")+"\" class=\"button blue medium radius\"><span class=\"icon-check\"></span>Descargar</a></Th>");
                out.println("</TR>"); 
                
             
            }; // fin while 
                
            } //fin try no  usar ; al final de dos o mas catchs 
            catch(SQLException e) {};
            try {
            conexion.close();
            } catch(SQLException e) {}; //}; 
         
cs.close();



            
      out.write("  \n");
      out.write("    \n");
      out.write(" \n");
      out.write("</table>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <a href=\"jsp/delcar.jsp?fin=ok\" class=\"button blue medium radius\">\n");
      out.write("\t\t<span class=\"icon-check\"></span>Terminar\n");
      out.write("\t</a>    \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <header>\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <h1 class=\"icon-cloud-1\">SONGSKY</h1>\n");
      out.write("                <input type=\"checkbox\" id=\"menu-bar\">\n");
      out.write("                <label class=\"icon-menu\" for=\"menu-bar\"></label>\n");
      out.write("                <nav class=\"menu\">\n");
      out.write("                    <a href=\"Carrito.jsp\"><span class=\"icon-basket\"></span> Mi Carrito</a>\n");
      out.write("                    <a href=\"UserProfileC.jsp\">Perfil</a>\n");
      out.write("                    <a href=\"Index.jsp\">home</a>\n");
      out.write("                    <a><span class=\"icon-cog-alt\"></a>\n");
      out.write("                </nav>\n");
      out.write("            </div>    \n");
      out.write("        </header>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("        \n");
      out.write("        </main> \n");
      out.write("        <footer>\n");
      out.write("            <div class=\"containerfooter\">\n");
      out.write("                <p class=\"copy\">SONGSKY &copy; 2016</p>\n");
      out.write("                <div class=\"redessociales\">\n");
      out.write("                    <a class=\"icon-facebook\" href=\"#\"></a>\n");
      out.write("                    <a class=\"icon-twitter\" href=\"#\"></a>\n");
      out.write("                    <a class=\"icon-youtube\" href=\"#\"></a>\n");
      out.write("                    <a class=\"icon-instagram\" href=\"#\"></a>\n");
      out.write("                    <a class=\"icon-vimeo\" href=\"#\"></a>\n");
      out.write("                </div>\n");
      out.write("            </div>    \n");
      out.write("        </footer>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    </main>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
