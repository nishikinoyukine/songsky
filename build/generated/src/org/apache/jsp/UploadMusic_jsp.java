package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UploadMusic_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<head>\n");
      out.write("        <title>SONGSKY</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1, minimum-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/fontello.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/userprofile.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css2/portada.css\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/menuser.css\">  \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/publicidad.css\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/infomusica.css\"> \n");
      out.write("    \n");
      out.write("        <link rel=\"stylesheet\" href=\"css2/reporte.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"css2/editormusica.css\"> \n");
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
      out.write("\t\t\t<a class=\"home\" href=\"https://google.com/\" title=\"Volver a Inicio\"><i class=\"icon-home\"></i></a>\n");
      out.write("\t\t\t<span class=\"navigation-pipe\">&gt;</span>\n");
      out.write("\t\t\t\t\tSubir Cancion\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <h3>Creador de Contenido</h3>\n");
      out.write("        \n");
      out.write("        <div class=\"resumen\">\n");
      out.write("        <caption>01. Rellena todos los campos</caption>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("     <div class=\"contenido\">\n");
      out.write("\t\t\t\n");
      out.write("            \n");
      out.write("            <hr>\n");
      out.write("           \n");
      out.write("\t\t\t<div class=\"formulario\">\n");
      out.write("\t\t\t    <form method=\"post\" action=\"MusicU\" ENCTYPE=\"multipart/form-data\">\n");
      out.write("\t\t\t        Archivo: \n");
      out.write("\t\t\t        <input type=\"file\" name=\"archivo\" /> <br><br>\n");
      out.write("\t\t\t        Titulo:\n");
      out.write("\t\t\t        <input type=\"text\" name=\"titulo\" /> <br><br>\n");
      out.write("\t\t\t        Imagen Disco: \n");
      out.write("\t\t\t        <input type=\"file\" name=\"Disco\" /> <br><br>\n");
      out.write("\t\t\t        Tipo:\n");
      out.write("\t\t\t         <select name=\"genero\" id=\"\">\n");
      out.write("\t\t\t            <option value=“1” selected=\"selected\"> Público </option>\n");
      out.write("                        <option value=“2”> Premium </option>                     \t\t            \n");
      out.write("\t\t\t        </select><br><br>\n");
      out.write("\t\t\t           Precio:\n");
      out.write("\t\t\t            <input type=\"text\" name=\"precio\"><br><br>\n");
      out.write("\t\t\t            <a href=\"UserProfileC.jsp\"><img src=\"IMG/cancelarbtn.png\" alt=\"\" width=\"200\"></a>\n");
      out.write("                                    <input type=\"image\" src=\"IMG/ready.png\" alt=\"Submit Form\" width=\"200\" />\n");
      out.write("\t\t\t          \n");
      out.write("\t\t\t        \n");
      out.write("\t\t\t    </form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
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
      out.write("                <nav class=\"menu\">\n");
      out.write("                    <a href=\"\"><span class=\"icon-basket\"></span> Mi Carrito</a>\n");
      out.write("                    <a href=\"\">Perfil</a>\n");
      out.write("                    <a href=\"\">Salir</a>\n");
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
