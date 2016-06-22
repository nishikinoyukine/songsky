package org.apache.jsp.js;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <title> SongSky </title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1, minimum-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/main.css\">     \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("    <video  src=\"VIDEO/movie.mp4\" autoplay loop >\n");
      out.write("      </video> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <main> \n");
      out.write("        \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"content h1\">         \n");
      out.write("\t\t\t\n");
      out.write("\t\t <h1 align=\"center\" >Bienvenido a SongSky</h1>\n");
      out.write("      <form method=\"post\" action=\"#\">\n");
      out.write("        <p align=\"center\"><input type=\"text\" name=\"login\" value=\"\" placeholder=\"Username or Email\"></p>\n");
      out.write("        <p align=\"center\"><input type=\"password\" name=\"password\" value=\"\" placeholder=\"Password\"></p>\n");
      out.write("        <p align=\"center\" class=\"remember_me\">\n");
      out.write("          <label>\n");
      out.write("            <input type=\"checkbox\" name=\"remember_me\" id=\"remember_me\">\n");
      out.write("            Recordarme\n");
      out.write("          </label>\n");
      out.write("        \n");
      out.write("        </p>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("      <p align=\"center\" style=\"font-size:15px ; font-family :  tahoma ; color: cyan \">Olvidaste tu contraseña?\n");
      out.write("          <a href=\"#\">Click aqui para recuperar</a>.</p>\n");
      out.write("    \n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <p align=\"center\" class=\"submit\"><input type=\"submit\" name=\"commit\" value=\" Enter \"></p>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("    \n");
      out.write("         \n");
      out.write("         <br>\n");
      out.write("         <p align=\"center\" style=\"font-size:10px ; font-family :  tahoma\">\n");
      out.write("      &copy; 2016&ndash;2016 <a href=\"http://google.com\" target=\"_blank\"> Proyecto PAPW</a> -\n");
      out.write("      <a href=\"http://www.google.com\" target=\"_blank\">1er Acance</a><br>\n");
      out.write("      Original PSD by <a href=\"http://www.facebook.com\" target=\"_blank\">Devanhi Garcia & Ruben</a>\n");
      out.write("         </p></br>\n");
      out.write("             \n");
      out.write("         \n");
      out.write("         \n");
      out.write("    \n");
      out.write("      </form>       \n");
      out.write("                 \n");
      out.write("    </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </main>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
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
