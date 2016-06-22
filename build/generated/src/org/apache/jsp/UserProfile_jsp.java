package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title> User profile </title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1, minimum-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/mainuser.css\"> \n");
      out.write("</head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <input type=\"checkbox\" id=\"btn-menu\">\n");
      out.write("        <label for=\"btn-menu\"> <img src=\"IMG/menusito.png\"  alt=\"\">   \n");
      out.write("        </label>\n");
      out.write("        \n");
      out.write("        <nav class=\"menu\">\n");
      out.write("        <ul>\n");
      out.write("            <li> <a href=\"\"> Mis listas </a></li>\n");
      out.write("            <li> <a href=\"\"> Actualizar mis listas </a></li>\n");
      out.write("            <li> <a href=\"\"> Administrar grabaciones </a></li>\n");
      out.write("            <li> <a href=\"\"> Ventas y Premium </a></li>\n");
      out.write("            <li> <a href=\"\"> Reporte de Ventas </a></li>        \n");
      out.write("        </ul>\n");
      out.write("        </nav>   \n");
      out.write("    </header>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <fieldset>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("        <h1  id=\"cabezerauser\" align=\"center\"> NOMBRE DE USUARIO </h1>  \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\t\t\t<div id=\"ingresar\">\n");
      out.write("\t\t\t\t<form  action=\"Usuarios.html\" method=\"POST\" name=\"formulario\" id=\"forma1\">\n");
      out.write("\t\t\t<div id=\"datos\">\n");
      out.write("\t\t\t<table width=\"100%\" cellspacing=\"5\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t <div class=\"contenedor\">\n");
      out.write("\t<img src=\"IMG/batmanman.jpg\" height=\"300\" width=\"300\" class=\"imagen\" />\n");
      out.write("\t</div>\n");
      out.write("                    \n");
      out.write("                    <textarea  name=\"comentario\" rows=\"15\" cols=\"40\">Cuentanos un poco sobre ti...</textarea>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("\t\t\t\t</tr>\n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                    \n");
      out.write("               \n");
      out.write("             \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("                <FORM METHOD=POST ENCTYPE=\"multipart/form-data\" ACTION=\"../cgi-bin/mycgi.pl\"> <INPUT TYPE=FILE NAME=\"upfile\"><BR> <INPUT TYPE=SUBMIT VALUE=\"Submit\"> </FORM>\n");
      out.write("\n");
      out.write("                \n");
      out.write("   </fieldset>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("\t\n");
      out.write("</body>\n");
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
