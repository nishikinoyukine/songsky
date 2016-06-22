package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class EdiciondeDatos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    ");

int val = Integer.parseInt(session.getAttribute("ID").toString());
Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
CallableStatement cs = null;
String query = "call obus(?)";
        cs = conexion.prepareCall(query);
        cs.setInt(1,val);
ResultSet rs = cs.executeQuery();
rs.first();



      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Datos de Usuario</title> \n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/registro.css\">\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/sha1-min.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("<section id=\"formulario\"> \n");
      out.write("    <p id=\"titulo\"> Edicion de Datos de Usuario</p>\n");
      out.write("    <p id=\"titulo2\"> Actualiza Tus Datos </p>\n");
      out.write("\n");
      out.write("    <form METHOD=POST ENCTYPE=\"multipart/form-data\" action=\"UpdateU\">\n");
      out.write("        <input type=\"text\" id=\"nick\" name=\"nick\" Value=\"");
out.println(rs.getString("NUser"));
      out.write("\">\n");
      out.write("\n");
      out.write("         <input type=\"text\" id=\"nombre\" name=\"nombre\" Value=\"");
out.println(rs.getString("Nombre"));
      out.write("\">\n");
      out.write("\n");
      out.write("        <input type=\"text\" id=\"apellidos\" name=\"apellidos\" Value=\"");
out.println(rs.getString("Apellidos"));
      out.write("\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <p id=\"info\"> Datos Personales </p>\n");
      out.write("    \n");
      out.write("        <input type=\"text\" id=\"calle\" name=\"calle\" Value=\"");
out.println(rs.getString("Calle"));
      out.write("\">\n");
      out.write("        <input type=\"text\"  id=\"num\" name=\"num\" Value=\"");
out.println(rs.getString("Numero"));
      out.write("\">\n");
      out.write("        <input type=\"text\" id=\"col\" name=\"col\" Value=\"");
out.println(rs.getString("Colonia"));
      out.write("\">\n");
      out.write("        <input type=\"text\" id=\"municipio\" name=\"municipio\" Value=\"");
out.println(rs.getString("Municipio"));
      out.write("\">\n");
      out.write("        <input type=\"text\" id=\"edo\" name=\"edo\" Value=\"");
out.println(rs.getString("Estado"));
      out.write("\">\n");
      out.write("        <input type=\"text\" id=\"cp\" name=\"cp\" Value=\"");
out.println(rs.getString("CodigoP"));
      out.write("\">\n");
      out.write("     \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("     <p id=\"info\"> Personaliza tu Avatar </p>\n");
      out.write("     <div class=\"contenedor\">\n");
      out.write("    <img id=\"mostrarimagen\" src=\"DisplayImage?image=Profile\" height=\"200\" width=\"200\" class=\"imagen\" />     \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    <div class=\"subirimagen\">\n");
      out.write("      \n");
      out.write("          <input id=\"profileimg\" TYPE=FILE NAME=\"profileimg\">\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              </form\n");
      out.write("    </div>\n");
      out.write("              \n");
      out.write("               <p id=\"info\"> Personaliza tu Portada </p>\n");
      out.write("              <div class=\"contenedor2\">\n");
      out.write("                  <img id=\"mostrarim\" src= \"DisplayImage?image=Portada\" height=\"100\" width=\"400\" class=\"imagen2\" /> \n");
      out.write("              </div>\n");
      out.write("    \n");
      out.write("    <div class=\"subirimagen\">\n");
      out.write("      \n");
      out.write("          <input id=\"perfilim\" TYPE=FILE NAME=\"Portadaimg\">\n");
      out.write("              ");
      out.write("\n");
      out.write("             \n");
      out.write("    </div>\n");
      out.write("              \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("         <div class=\"registracion\">\n");
      out.write("             \n");
      out.write("             <p id=\"notice\">Actualizar Datos Aceptas que son Reales conforme a nuestros <a href=\"/mx/legal/end-user-agreement/\" target=\"_blank\">términos y condiciones</a> y la <a href=\"/mx/legal/privacy-policy/\" target=\"_blank\">política de privacidad de SongSky.</a></p>       \n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    <div class=\"registrate\">\n");
      out.write("    <input type=\"submit\" value=\"Actualizar\">\n");
      out.write("    </div>\n");
      out.write("       </form>\n");
      out.write("\n");
      out.write("  <form\n");
      out.write("    id=\"js-register-with-facebook\"\n");
      out.write("    method=\"post\"\n");
      out.write("    role=\"form\"\n");
      out.write("    action=\"/mx/xhr/json/sign-up-for-spotify-fb.php\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <input id=\"creation_flow\" name=\"creation_flow\" type=\"hidden\" value=\"\">\n");
      out.write("\n");
      out.write("    <div class=\"content\">\n");
      out.write("      \n");
      out.write("      \n");
      out.write("     \n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("\n");
      out.write("   ");
rs.close();
cs.close();
conexion.close();
      out.write(" \n");
      out.write("    \n");
      out.write("        \n");
      out.write("    </section>    \n");
      out.write("    <script type=\"text/javascript\" > \n");
      out.write("function mostrarImagen(input) {\n");
      out.write(" if (input.files && input.files[0]) {\n");
      out.write("  var reader = new FileReader();\n");
      out.write("  reader.onload = function (e) {\n");
      out.write("   $('#mostrarimagen').attr('src', e.target.result);\n");
      out.write("  }\n");
      out.write("  reader.readAsDataURL(input.files[0]);\n");
      out.write(" }\n");
      out.write("}\n");
      out.write(" \n");
      out.write("$(\"#profileimg\").change(function(){\n");
      out.write(" mostrarImagen(this);\n");
      out.write("});\n");
      out.write("\n");
      out.write("function mostrarImagen1(input) {\n");
      out.write(" if (input.files && input.files[0]) {\n");
      out.write("  var reader = new FileReader();\n");
      out.write("  reader.onload = function (e) {\n");
      out.write("   $('#mostrarim').attr('src', e.target.result);\n");
      out.write("  }\n");
      out.write("  reader.readAsDataURL(input.files[0]);\n");
      out.write(" }\n");
      out.write("}\n");
      out.write(" \n");
      out.write("$(\"#perfilim\").change(function(){\n");
      out.write(" mostrarImagen1(this);\n");
      out.write("});\n");
      out.write(" </script>   \n");
      out.write("</body>        \n");
      out.write("</html>\n");
      out.write("\n");
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
