package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserProfileCplot_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"CSS/styleartistas.css\"> \n");
      out.write("         <link rel=\"stylesheet\" href=\"CSS/audioplayer.css\"> \n");
      out.write("         <link rel=\"stylesheet\" href=\"CSS/demo.css\"> \n");
      out.write("    \n");
      out.write("         \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <main>\n");
      out.write("             <section id=\"busqueda\">             \n");
      out.write("                        <form action=\"#\" method=\"get\">\t\n");
      out.write("                            \n");
      out.write("                        <input type=\"search\" placeholder=\"Audio o Artista\">\t<i class=\"icon-search\" ></i>\t\n");
      out.write("                    \n");
      out.write("                            \n");
      out.write("                </form>           \n");
      out.write("                </section>    \n");
      out.write("            \n");
      out.write("            <section id=\"portada\">\n");
      out.write("            <img src=\"DisplayImage?image=Portada\">       \n");
      out.write("            </section> \n");
      out.write("            \n");
      out.write("            <section id=\"batman\">\n");
      out.write("            <div class=\"foto\">\n");
      out.write("                   ");
      out.write("\n");
      out.write("                   <img src=\"DisplayImage?image=Profile\"  height=\"200\" width=\"200\" class=\"imagen\" />\n");
      out.write("                   \n");
      out.write("                   </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </section>\n");
      out.write("           \n");
      out.write("            <div class=\"usertext\">\n");
      out.write("                ");

                    if(session.getAttribute("Visita").equals("true"))
                    {out.println("<h1>" + session.getAttribute("namev")+"<a href='Index.jsp'></h1>");
                    }else
                    {
                    out.println("<h1>¡Hola de nuevo "+ session.getAttribute("name")+ " </h1>");
                    }
                    
                
      out.write("\n");
      out.write("                    \n");
      out.write("              \n");
      out.write("                </div>  \n");
      out.write("            <p id=\"recuerda\">¡Recuerda que puedes empezar tu nueva experiencia Premium en tan solo unos pasos!</p>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <section id=\"publicidad\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <hr color=\"dodgerblue\" size=1>\n");
      out.write("                \n");
      out.write("                 <div class=\"menudes\">\n");
      out.write("<a href=\"\">Administrar Grabaciones</a>\n");
      out.write("<a href=\"\">Contenido Premium</a>\n");
      out.write("<a href=\"\">Reporte de Ventas</a>\n");
      out.write("<div class=\"marca\"></div>\n");
      out.write("</div>\n");
      out.write("                </section>\n");
      out.write("                \n");
      out.write("                 <section id=\"generosmusic\">\n");
      out.write("                <h3>Generos Musicales</h3>\n");
      out.write("                <div class=\"containergeneros\">\n");
      out.write("                    <div class=\"info-generos\">\n");
      out.write("                        <img src=\"IMG/list2.jpg\" alt=\"\">\n");
      out.write("                        <h5>Rock</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-generos\">\n");
      out.write("                        <img src=\"IMG/list3.jpg\" alt=\"\">\n");
      out.write("                         <h5>Relajante</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-generos\">\n");
      out.write("                        <img src=\"IMG/list4.jpg\" alt=\"\">\n");
      out.write("                         <h5>Opera</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-generos\">\n");
      out.write("                        <img src=\"IMG/list5.jpg\" alt=\"\">\n");
      out.write("                         <h5>Clasica</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-generos\">\n");
      out.write("                        <img src=\"IMG/list6.jpg\" alt=\"\">\n");
      out.write("                         <h5>Romantica</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-generos\">\n");
      out.write("                        <img src=\"IMG/list7.jpg\" alt=\"\">\n");
      out.write("                         <h5>Jazz</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-generos\">\n");
      out.write("                        <img src=\"IMG/list8.jpg\" alt=\"\">\n");
      out.write("                         <h5>Electronica</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-generos\">\n");
      out.write("                        <img src=\"IMG/list1.jpg\" alt=\"\">\n");
      out.write("                         <h5>Agregar Nueva Lista</h5> \n");
      out.write("                    </div>\n");
      out.write("                </div>         \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("                     \n");
      out.write("                     <hr color=\"dodgerblue\" size=1>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <section id=\"artistas\">\n");
      out.write("                <h4>Mis Listas</h4>\n");
      out.write("                <div class=\"containerartistas\">\n");
      out.write("                    <div class=\"info-artistas\">\n");
      out.write("                        <img src=\"IMG/disco1.jpg\" alt=\"\">\n");
      out.write("                        <h5>Coldplay</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img src=\"IMG/discorihanna2.jpg\" alt=\"\">\n");
      out.write("                         <h5>Rihanna</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img src=\"IMG/discofifth3.jpg\" alt=\"\">\n");
      out.write("                         <h5>Fifth Harmony</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img src=\"IMG/discozayn4.png\" alt=\"\">\n");
      out.write("                         <h5>ZAYN</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img src=\"IMG/discosia5.jpg\" alt=\"\">\n");
      out.write("                         <h5>Sia</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img src=\"IMG/discotwuenty6.jpg\" alt=\"\">\n");
      out.write("                         <h5>Twenty One Pilots</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img src=\"IMG/discojustin7.jpg\" alt=\"\">\n");
      out.write("                         <h5>Justin Bieber</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img src=\"IMG/discoalan8.jpg\" alt=\"\">\n");
      out.write("                         <h5>Alan Walker</h5> \n");
      out.write("                    </div>\n");
      out.write("                <hr color=\"dodgerblue\" size=1>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                 <hr color=\"dodgerblue\" size=1>\n");
      out.write("            </section>\n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     <section id=\"reproductor\">\n");
      out.write("                         \n");
      out.write("                         <div class=\"idmusico\">\n");
      out.write("                        <img src=\"IMG/disco9.jpg\" alt=\"\">\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                         \n");
      out.write("                     \n");
      out.write("                         <div class=\"idcancion\">\n");
      out.write("                         <MARQUEE WIDTH=100% HEIGHT=30 ALIGN=BOTTOM>");
      out.print(session.getAttribute("name"));
      out.write(" </MARQUEE> \n");
      out.write("                        </div> \n");
      out.write("                     \n");
      out.write("                     <div id=\"wrapper\">\n");
      out.write("\t\t\t<audio preload=\"auto\" controls loop>\n");
      out.write("\t\t\t\t<source src=\"MusicO?\">\n");
      out.write("\t\t\t\t<source src=\"audio/BlueDucks_FourFlossFiveSix.ogg\">\n");
      out.write("\t\t\t\t<source src=\"audio/BlueDucks_FourFlossFiveSix.wav\">\n");
      out.write("\t\t\t</audio>\n");
      out.write("\t\t\t<script src=\"js/jquery.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/audioplayer.js\"></script>\n");
      out.write("\t\t\t<script>$( function() { $( 'audio' ).audioPlayer(); } );</script>\n");
      out.write("\t\t\t</div>\n");
      out.write("                         </section>\n");
      out.write("                         \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                                      <hr color=\"dodgerblue\" size=1>\n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     <section id=\"comentarios\" style=\"display:inline-block\">\n");
      out.write("                         <div class=\"comments\" style=\"display:inline-block\">\n");
      out.write("                         <h6>Caja De Comentarios</h6>\n");
      out.write("                           ");

                    if(session.getAttribute("Visita").equals("true"))
                    {out.println("<textarea name='comentario' rows='15' cols='40'>Deja un comentario a "+ session.getAttribute("namev")+" ... </textarea>");
                    }else
                    {
                    out.println("<textarea name='comentario' rows='15' cols='40'>Comenta Algo a Tus Fans "+ session.getAttribute("name")+" ... </textarea>");
                    }
                    
                
      out.write("\n");
      out.write("                         \n");
      out.write("                         <a href=\"#\" class=\"button blue medium radius\">\n");
      out.write("\t\t<span class=\"icon-comment-empty\"></span>Enviar\n");
      out.write("\t</a>\n");
      out.write("    </div>                \n");
      out.write("                       <div class=\"listacomentarios\"  style=\"display:inline-block\">\n");
      out.write("                        \n");
      out.write("                         \n");
      out.write("                        \n");
      out.write("                            <table id=\"usercomentario\" width=\"40%\" cellspacing=\"10\" cellpadding=\"2\">\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("  <tr>\n");
      out.write("      <th><i class=\"icon-user\">USER456</i></th>\n");
      out.write("      <th></th>\n");
      out.write("      <th></th>\n");
      out.write("      <th>dia/hora</th>\n");
      out.write("      \n");
      out.write("  </tr>\n");
      out.write("    </table> \n");
      out.write("                           \n");
      out.write("      <table id=\"publicacion\" width width=\"40%\" cellspacing=\"10\" cellpadding=\"2\">                                         \n");
      out.write("   <tr>\n");
      out.write("    <th>blebleblebleble :)</th>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("                           \n");
      out.write("                    \n");
      out.write("                           \n");
      out.write("                            <table id=\"usercomentario\" width=\"40%\" cellspacing=\"10\" cellpadding=\"2\">\n");
      out.write("                        \n");
      out.write("  <tr>\n");
      out.write("      <th><i class=\"icon-user\">USER456</i></th>\n");
      out.write("      <th></th>\n");
      out.write("      <th></th>\n");
      out.write("      <th>dia/hora</th>\n");
      out.write("      \n");
      out.write("  </tr>\n");
      out.write("    </table> \n");
      out.write("                           \n");
      out.write("      <table id=\"publicacion\" width width=\"40%\" cellspacing=\"10\" cellpadding=\"2\">                                         \n");
      out.write("   <tr>\n");
      out.write("    <th>blablablablabla</th>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("                  \n");
      out.write("                        \n");
      out.write("    </div>              \n");
      out.write("           \n");
      out.write("            \n");
      out.write("                     </section>\n");
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
      out.write("                    <a href=\"Carrito.jsp\"><span class=\"icon-basket\"></span> Mi Carrito</a>\n");
      out.write("                    <a href=\"Index.jsp\">Home</a>\n");
      out.write("                     ");

                    if(session.getAttribute("Visita").equals("true"))
                    {out.println("<a href='Registro.jsp'><span class='icon-cog-alt'> Registro</a>");
                    }else
                    {
                    out.println("<a href='EdiciondeDatos.jsp'><span class='icon-cog-alt'> Edicion</a>");
                    }
                    
                
      out.write("\n");
      out.write("               \n");
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
