package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Administrador_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>SONGSKY</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1, minimum-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/fontello.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/userprofile.css\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/menuser.css\">   \n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/portada.css\"> \n");
      out.write("         <link rel=\"stylesheet\" href=\"CSS/administrador.css\">\n");
      out.write("         <script src=\"js/jquery.js\"></script>\n");
      out.write("         \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write(" <body>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("        <main>\n");
      out.write("            \n");
      out.write("         <hr color=\"dodgerblue\" size=1>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("\n");
      out.write("            \n");
      out.write("          <section id=\"formulario\"> \n");
      out.write("    <p id=\"titulo\"><b><span class=\"icon-user\"> BIENVENIDO A SONGSKY ");
      out.print(session.getAttribute("name"));
      out.write("</span></b></p>\n");
      out.write("    <p id=\"titulo2\"><u><small>\"Dejando siempre volar la imaginacion\" </small></u></p>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("        <form METHOD=POST ENCTYPE=\"multipart/form-data\" action=\"");
      out.print( request.getContextPath());
      out.write("/VideoS\">\n");
      out.write("    <p id=\"info\"> SUBIR VIDEO</p>\n");
      out.write("\n");
      out.write("        <input type=\"file\" id=\"VideoSemana\" name=\"Videosx\" >\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <video id=\"videoprincipal\" src=\"#\" height=\"800\" width=\"600\" autoplay controls ></video> \n");
      out.write("\n");
      out.write("                </div>   \n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            \n");
      out.write("            \n");
      out.write("\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t<p id=\"info\">ADMINISTRAR HORARIOS</p>\n");
      out.write("         <div id=\"registro\" class=\"registro\"> \n");
      out.write("             \n");
      out.write("              <input type=\"date\" id=\"time\" name=\"timeI\" >\n");
      out.write("              <input type=\"date\" id=\"time\" name=\"timeF\" >\n");
      out.write("             \n");
      out.write("             \n");
      out.write("    \n");
      out.write("   </div>\n");
      out.write("         \n");
      out.write("        \n");
      out.write("\t\t\n");
      out.write("            \n");
      out.write("    \n");
      out.write("    <p id=\"info\"> ADMINISTRAR CONTENIDO</p>\n");
      out.write("            \n");
      out.write("              \n");
      out.write("              \n");
      out.write("     \n");
      out.write("         <p>Seleccionar contenido</p>\n");
      out.write("        <select name=\"idpub\">\n");
      out.write("  <option  value=\"1\">Pub.1</option>\n");
      out.write("  <option value=\"2\">Pub.2</option>\n");
      out.write("  <option value=\"3\">Pub.3</option>\n");
      out.write("  <option value=\"4\">Pub.4</option>\n");
      out.write("   <option value=\"5\">Pub.5</option>\n");
      out.write("    <option value=\"6\">Pub.6</option>\n");
      out.write("</select>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("     \n");
      out.write("              \n");
      out.write("               <p id=\"info\"> PORTADA PRINCIPAL </p>\n");
      out.write("              <div class=\"contenedor2\">\n");
      out.write("               <img id=\"imgport\" src=\"IMG/cloudb.png\" height=\"100\" width=\"400\" class=\"imagen2\" /> \n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"subirimagen\">\n");
      out.write("      \n");
      out.write("          <input id=\"bannerp\" TYPE=FILE NAME=\"Bannerp\">\n");
      out.write("              <input TYPE=submit VALUE=\"Subir\">\n");
      out.write("    </div>\n");
      out.write("                     </form>\n");
      out.write("            \n");
      out.write("         \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <h1 class=\"icon-cloud-1\">SONGSKY</h1>\n");
      out.write("                <input type=\"checkbox\" id=\"menu-bar\">\n");
      out.write("                <label class=\"icon-menu\" for=\"menu-bar\"></label>\n");
      out.write("                <nav class=\"menu\">\n");
      out.write("                    <a href=\"Index.jsp\"><i class=\"icon-home\">Home</i></a>\n");
      out.write("                    <a href=\"login\" method=\"get\">Salir</a>\n");
      out.write("                </nav>\n");
      out.write("            </div>    \n");
      out.write("        </header>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("        \n");
      out.write("        </main> \n");
      out.write("     \n");
      out.write("     \n");
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
      out.write("         <script type=\"text/javascript\" > \n");
      out.write("function mostrarVideo(input) {\n");
      out.write(" if (input.files && input.files[0]) {\n");
      out.write("  var reader = new FileReader();\n");
      out.write("  reader.onload = function (e) {\n");
      out.write("   $('#videoprincipal').attr('src', e.target.result);\n");
      out.write("  }\n");
      out.write("  reader.readAsDataURL(input.files[0]); //Llevame al error\n");
      out.write(" }\n");
      out.write("}\n");
      out.write(" \n");
      out.write("$(\"#VideoSemana\").change(function(){\n");
      out.write(" mostrarVideo(this);\n");
      out.write("});\n");
      out.write("\n");
      out.write("function mostrarImagen(input) {\n");
      out.write(" if (input.files && input.files[0]) {\n");
      out.write("  var reader = new FileReader();\n");
      out.write("  reader.onload = function (e) {\n");
      out.write("   $('#imgport').attr('src', e.target.result);\n");
      out.write("  }\n");
      out.write("  reader.readAsDataURL(input.files[0]); //Llevame al error\n");
      out.write(" }\n");
      out.write("}\n");
      out.write(" \n");
      out.write("$(\"#bannerp\").change(function(){\n");
      out.write(" mostrarImagen(this);\n");
      out.write("});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
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
