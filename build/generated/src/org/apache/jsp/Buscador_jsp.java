package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Buscador_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <title>SONGSKY</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1, minimum-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css2/fontello.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css2/userprofile.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css2/reporte.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"css2/buscador.css\"> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <main>\n");
      out.write("        \n");
      out.write("         <section id=\"busqueda\"> \n");
      out.write("                        <form action=\"#\" method=\"get\">\t\n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("                           \n");
      out.write("                </form>           \n");
      out.write("                </section>  \n");
      out.write("        \n");
      out.write("        <div class=\"carritodecomprita\">\n");
      out.write("\t\t\t<a class=\"home\" href=\"Index.jsp\" title=\"Volver a Inicio\"><i class=\"icon-home\"></i></a>\n");
      out.write("\t\t\t<span class=\"navigation-pipe\">&gt;</span>\n");
      out.write("\t\t\t\t\t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("    <div class=\"songsky\"> \n");
      out.write("        <h3>SONGSKY</h3>\n");
      out.write("        </div>\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("        <div class=\"resumen\">\n");
      out.write("        <caption>Musica a tu estilo</caption>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("   \n");
      out.write("         <table id=\"busqueda\">\n");
      out.write("         \n");
      out.write("          \n");
      out.write("\n");
      out.write("                        <form action=\"Buscador.jsp\" method=\"post\">\t\n");
      out.write("                            \n");
      out.write("                        <input Name=\"BUSCAR\" type=\"search\" placeholder=\"Audio o Artista\">\t\t    \t\n");
      out.write("                        <i class=\"icon-search\" ></i>\n");
      out.write("                           \n");
      out.write("                </form>  \n");
      out.write("             </table>\n");
      out.write("\n");
      out.write("       \n");
      out.write("          ");
 // declarando y creando objetos globales 
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
            
      out.write("  \n");
      out.write("            \n");
      out.write("            \n");
      out.write("      <a href=\"Index.jsp\"><img src=\"IMG/cancelarbtn.png\"width=\"200\" /></a>            \n");
      out.write("            \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <header>\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <h1 class=\"icon-cloud-1\">SONGSKY</h1>\n");
      out.write("                <input type=\"checkbox\" id=\"menu-bar\">\n");
      out.write("                <label class=\"icon-menu\" for=\"menu-bar\"></label>\n");
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
      out.write("</html>");
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
