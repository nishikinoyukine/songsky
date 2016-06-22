package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Registro de Usuario</title> \n");
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
      out.write("    <p id=\"titulo\"> BIENVENIDO A SONGSKY</p>\n");
      out.write("    <p id=\"titulo2\"> Registrate con tu correo electronico </p>\n");
      out.write("\n");
      out.write("    <form METHOD=POST ENCTYPE=\"multipart/form-data\" action=\"RegistroU\">\n");
      out.write("        <input type=\"text\" id=\"nick\" name=\"nick\" placeholder=\"Nombre de usuario\">\n");
      out.write("         <input type=\"mail\" id=\"mail\" name=\"mail\" placeholder=\"Correo electr&oacute;nico\">\n");
      out.write("        \n");
      out.write("         <input type=\"text\" id=\"nombre\" name=\"nombre\" placeholder=\"Nombre\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <input type=\"mail\" id=\"mail\" name=\"mail\" placeholder=\"Confirmar correo electr&oacute;nico\">\n");
      out.write("    \n");
      out.write("        <input type=\"text\" id=\"apellidos\" name=\"apellidos\" placeholder=\"Apellidos\">\n");
      out.write("  \n");
      out.write("         <input type=\"password\" id=\"pass\" name=\"pass\" placeholder=\"Contrase&ntilde;a\">\n");
      out.write("         <input type=\"text\" id=\"passhash\" name=\"passwordhash\" style=\"visibility:hidden\">\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("\t\t\t\n");
      out.write("\t\t<p id=\"info\"> Fecha de nacimiento</p>\n");
      out.write("         <div id=\"registro\" class=\"registro\">     \n");
      out.write("    <div class=\"day\">\n");
      out.write("  <input type=\"number\" id=\"register-dob-day\"  class=\"dob\" name=\"dob_day\" placeholder=\"Día\"\n");
      out.write("  pattern=\"[0-9]*\"\n");
      out.write("  maxlength=\"2\"\n");
      out.write("  min=\"1\"\n");
      out.write("  max=\"31\"\n");
      out.write("  required>\n");
      out.write("\n");
      out.write("         \n");
      out.write("           \n");
      out.write("        <select name=\"mes\" name=\"dob_mot\">  \n");
      out.write("            <option value=\"Ene\">Enero</option>\n");
      out.write("            <option value=\"Feb\">Febrero</option>\n");
      out.write("            <option value=\"Mar\">Marzo</option>\n");
      out.write("            <option value=\"Abr\">Abril</option>\n");
      out.write("            <option value=\"May\">Mayo</option>\n");
      out.write("            <option value=\"Jun\">Junio</option>\n");
      out.write("            <option value=\"Jul\">Julio</option>\n");
      out.write("            <option value=\"Ago\">Agosto</option>\n");
      out.write("            <option value=\"Sep\">Septiembre</option>\n");
      out.write("            <option value=\"Oct\">Octubre</option>\n");
      out.write("            <option value=\"Nov\">Noviembre</option>\n");
      out.write("            <option value=\"Dic\">Diciembre</option>        \n");
      out.write("            </select>\n");
      out.write("       \n");
      out.write("    \n");
      out.write("\n");
      out.write("  <input\n");
      out.write("  type=\"number\"\n");
      out.write("  id=\"register-dob-year\"\n");
      out.write("  class=\"dob\"\n");
      out.write("  name=\"dob_year\"\n");
      out.write("  placeholder=\"Año\"\n");
      out.write("  pattern=\"[0-9]*\"\n");
      out.write("  maxlength=\"4\"\n");
      out.write("  min=\"1900\"\n");
      out.write("  max=\"2003\"\n");
      out.write("  required\n");
      out.write("  data-msg-required=\"¿Cuándo naciste?\"\n");
      out.write("  data-msg-number=\"Por favor introduce un año válido.\"\n");
      out.write("  data-msg-min=\"Por favor introduce un año válido.\"\n");
      out.write("  data-msg-max=\"Lo sentimos, pero no cumples con la edad que SongSky requiere.\">                \n");
      out.write("          </div> \n");
      out.write("   </div>\n");
      out.write("         \n");
      out.write("        \n");
      out.write("\t\t<form action=\"\" class=\"formulario\">    \n");
      out.write("\t\t\t<div class=\"radio\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"sexo\" id=\"hombre\">\n");
      out.write("\t\t\t\t<label for=\"hombre\">Hombre</label>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"sexo\" id=\"mujer\">\n");
      out.write("\t\t\t\t<label for=\"mujer\">Mujer</label>\t\n");
      out.write("\t\t\t</div>           \n");
      out.write("    \n");
      out.write("            \n");
      out.write("    \n");
      out.write("    <p id=\"info\"> Datos Personales </p>\n");
      out.write("    \n");
      out.write("        <input type=\"text\" id=\"calle\" name=\"calle\" placeholder=\"Calle\">\n");
      out.write("        <input type=\"text\"  id=\"num\" name=\"num\" placeholder=\"Numero\">\n");
      out.write("        <input type=\"text\" id=\"col\" name=\"col\" placeholder=\"Colonia\">\n");
      out.write("        <input type=\"text\" id=\"municipio\" name=\"municipio\" placeholder=\"Municipio\">\n");
      out.write("        <input type=\"text\" id=\"edo\" name=\"edo\" placeholder=\"Estado\">\n");
      out.write("        <input type=\"text\" id=\"cp\" name=\"cp\" placeholder=\"Codigo Postal\">\n");
      out.write("     \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("     <p id=\"info\"> Personaliza tu Avatar </p>\n");
      out.write("     <div class=\"contenedor\">\n");
      out.write("    <img id=\"mostrarimagen\" src=\"IMG/avatar.png\" height=\"200\" width=\"200\" class=\"imagen\" />     \n");
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
      out.write("                  <img id=\"mostrarim\" src=\"IMG/cloudb.png\" height=\"100\" width=\"400\" class=\"imagen2\" /> \n");
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
      out.write("             <p id=\"notice\">Al hacer click en Registrarse, aceptas los <a href=\"/mx/legal/end-user-agreement/\" target=\"_blank\">términos y condiciones</a> y la <a href=\"/mx/legal/privacy-policy/\" target=\"_blank\">política de privacidad de SongSky.</a></p>       \n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    <div class=\"registrate\">\n");
      out.write("    <input type=\"submit\" value=\"Registrate\" onclick=\"document.getElementById('passhash').value = hex_sha1(document.getElementById('pass').value)\" >\n");
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
      out.write("      <p id=\"primary\">\n");
      out.write("        ¿Ya tienes una cuenta?        <a id=\"select-link-login\" data-section=\"login\" href=\"https://www.spotify.com/mx/login/?continue=https%3A//www.spotify.com/mx/download/\">Iniciar sesión</a>\n");
      out.write("      </p>\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("\n");
      out.write("    \n");
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
