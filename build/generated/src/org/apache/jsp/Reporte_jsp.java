package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Reporte_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"CSS/reporte.css\"> \n");
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
      out.write("\t\t\t\t\tTus reportes de ventas\t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <h3>REPORTE DE VENTAS</h3>\n");
      out.write("        \n");
      out.write("        <div class=\"resumen\">\n");
      out.write("        <caption>01. Reporte</caption>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <section id=\"tablareporte\">     \n");
      out.write("            \n");
      out.write("            <table id=\"filtro\"  width=\"40%\"  >\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td> Desde: </td>\n");
      out.write("\t\t\t\t<td> Hasta: </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td> <input type = \"DATE\" name= \"FechaInicio\" required> </td>\n");
      out.write("\t\t\t\t<td>  <input type = \"DATE\" name= \"FechaFin\" required> </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <table id=\"reportetabla\">\n");
      out.write("  <tr>\n");
      out.write("    <th scope=\"col\">Nombre del Usuario</th>\n");
      out.write("    <th scope=\"col\">Categoria</th>\n");
      out.write("    <th scope=\"col\">Titulo</th>\n");
      out.write("    <th scope=\"col\">Fecha de la Compra</th>\n");
      out.write("    <th scope=\"col\">Precio</th>\n");
      out.write("    <th scope=\"col\">Correo del comprador</th>\n");
      out.write("  </tr>\n");
      out.write(" \n");
      out.write("  <tr>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("\n");
      out.write("  </tr>\n");
      out.write(" \n");
      out.write("\n");
      out.write("</table>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        <a href=\"#\" class=\"button blue medium radius\">\n");
      out.write("\t\t<span class=\"icon-check\"></span>Continuar\n");
      out.write("\t</a>\n");
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
