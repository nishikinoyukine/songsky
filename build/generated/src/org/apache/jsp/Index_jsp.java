package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"CSS/banner.css\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/menuser.css\">  \n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/publicidad.css\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/demo.css\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/infomusica.css\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/styleartistas.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/audioplayer.css\">\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("         \n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("         \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("            ");

              
             int rand = ThreadLocalRandom.current().nextInt(1,6);
                
                session.setAttribute ("Visita","False");
             
             session.setAttribute("pub",rand);
          
             
      out.write("\n");
      out.write("             \n");
      out.write("             ");

                    int val = Integer.parseInt(session.getAttribute("pub").toString());
  
Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
CallableStatement cs = null;
String query = "call selectp(?)";
        cs = conexion.prepareCall(query);
        cs.setInt(1,val);

ResultSet rs = cs.executeQuery();
int i = 1;
String[ ] com = new String[3];
if (rs.next()){
   com [0]= rs.getString("url_Publicidad_Banner");
   com [1]= rs.getString("url_Publicidad_Video");
             }else{
     com [0]= "IMG/wab.jpg";
   com [1]= "VIDEO/AGOT.mp4";
   }

      out.write("\n");
      out.write("    <body>\n");
      out.write("        <main>\n");
      out.write("            <section id=\"banner\">\n");
      out.write("            <img src=\"");
 out.println(com [0]); 
      out.write("\"> \n");
      out.write("        <div class=\"container\">\n");
      out.write("                <h2>Musica a tu manera</h2>\n");
      out.write("                <p>Escucha tus canciones favoritas como nunca antes</p>\n");
      out.write("                <a href=\"#\">Premium</a>\n");
      out.write("              </div>               \n");
      out.write("            </section> \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <section id=\"bienvenidos\">\n");
      out.write("                <hr color=\"dodgerblue\" size=1>\n");
      out.write("                ");

                    if(session.getAttribute("name") == null)
                    out.println("<p id='invitado' > BIENVENIDO: <a href='Index.jsp'> Invitado.</a> </p>");
                    session.setAttribute("loginIndex", "False");
                    if(session.getAttribute("name") == "")
                    out.println("<p id='invitado' > BIENVENIDO: <a href='Index.jsp'> Invitado.</a> </p>");
                    
                
      out.write("\n");
      out.write("                \n");
      out.write("                ");
 
                    if(session.getAttribute("name") != "" && session.getAttribute("name") != null)
                    out.println("<p id='invitado' > BIENVENIDO: "+ session.getAttribute("name") + "</p>");
                    session.setAttribute("loginIndex", "true");
                
      out.write("\n");
      out.write("  \n");
      out.write("                <h2>Encuentra y crea tus playlist favoritos en un solo click</h2>     \n");
      out.write("            </section>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("             <section id=\"busqueda\">             \n");
      out.write("                        <form action=\"Buscador.jsp\" method=\"get\">\t\n");
      out.write("                            \n");
      out.write("                        <input name=\"BUSCAR\" type=\"search\" placeholder=\"Audio o Artista\">\t\t    \t\n");
      out.write("                        <i class=\"icon-search\" ></i>\n");
      out.write("                           \n");
      out.write("                </form>           \n");
      out.write("                </section>    \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div id=\"containergeneral\">\n");
      out.write("                <hr color=\"dodgerblue\" size=1>\n");
      out.write("                <div id=\"video\">\n");
      out.write("           \n");
      out.write("                    <div id=\"textovideo\">\n");
      out.write("                 <h4 id=\"videosemana\">Video de La Semana.</h4>\n");
      out.write("                    </div>\n");
      out.write("                  <video  src=\"");
 out.println(com [1]); 
      out.write("\" autoplay muted loop id=\"videoprincipal\"></video> \n");
      out.write("                  \n");
      out.write("                \n");
      out.write("                </div>    \n");
      out.write("                \n");
      out.write("            ");
rs.close();
              cs.close();
              conexion.close();
      out.write("\n");
      out.write("              ");


Class.forName("com.mysql.jdbc.Driver");
conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
cs = null;
 query = "call loadnews()";
        cs = conexion.prepareCall(query);

rs = cs.executeQuery();
i = 0;

String[ ] urlsong = new String[9];
String[ ] urlimg = new String[9];
String[ ] nom = new String[9];
for (int n=0;n<9;n++){
nom [n] = "";
urlsong [n] = "";
urlimg [n] = "";

}

while (rs.next()){
    if (i<=8){nom [i] = rs.getString("NombreCancion");
              urlsong [i] = rs.getString("urlsong");
              urlimg [i] = rs.getString("Image");
    }
    i+=1;
    
}
rs.close();
cs.close();
conexion.close();



      out.write("\n");
      out.write("            <section id=\"artistas\">\n");
      out.write("                <audio id=\"player\" src=\"#\" hidden=\"true\"> </audio>\n");
      out.write("                <h4>Nuevas Canciones</h4>\n");
      out.write("                <div class=\"containerartistas\">\n");
      out.write("                    <div class=\"info-artistas\">\n");
      out.write("                        <img id=\"song1\" src=\"");
out.println(urlimg[0]);
      out.write("\"  alt=\"\">\n");
      out.write("                        <h5>");
out.println(nom[0]);
      out.write("</h5> \n");
      out.write("                    </div>\n");
      out.write("                 \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img id=\"song2\" src=\"");
out.println(urlimg[1]);
      out.write("\" alt=\"\">\n");
      out.write("                         <h5>");
out.println(nom[1]);
      out.write("</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img id=\"song3\" src=\"");
out.println(urlimg[2]);
      out.write("\" alt=\"\">\n");
      out.write("                         <h5>");
out.println(nom[2]);
      out.write("</h5>  \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img id=\"song4\" src=\"");
out.println(urlimg[3]);
      out.write("\" alt=\"\">\n");
      out.write("                         <h5>");
out.println(nom[3]);
      out.write("</h5>                         \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img id=\"song5\" src=\"");
out.println(urlimg[4]);
      out.write("\" alt=\"\">\n");
      out.write("                         <h5>");
out.println(nom[4]);
      out.write("</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img id=\"song6\" src=\"");
out.println(urlimg[5]);
      out.write("\" alt=\"\">\n");
      out.write("                         <h5>");
out.println(nom[5]);
      out.write("</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img id=\"song7\" src=\"");
out.println(urlimg[6]);
      out.write("\" alt=\"\">\n");
      out.write("                         <h5>");
out.println(nom[6]);
      out.write("</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img id=\"song8\" src=\"");
out.println(urlimg[7]);
      out.write("\" alt=\"\">\n");
      out.write("                         <h5>");
out.println(nom[7]);
      out.write("</h5> \n");
      out.write("                    </div>\n");
      out.write("                <hr color=\"dodgerblue\" size=1>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                 <hr color=\"dodgerblue\" size=1>\n");
      out.write("            </section>\n");
      out.write("            \n");
      out.write("                <script>\n");
      out.write("  \n");
      out.write(" function CargarSong(input) {\n");
      out.write("  if (document.getElementById('player').paused) {\n");
      out.write("          $('#player').attr('src', input);\n");
      out.write("          document.getElementById('player').play();        \n");
      out.write("      } else {\n");
      out.write("        document.getElementById('player').pause();\n");
      out.write("        document.getElementById('player').currentTime = 0\n");
      out.write("      }\n");
      out.write("}\n");
      out.write(" \n");
      out.write("             $('#song1').click(function() {\n");
      out.write("             $(this).toggleClass(\"down\");\n");
      out.write("             CargarSong(\"");
out.println(""+urlsong[0]+"\"");
      out.write(");        \n");
      out.write("  });\n");
      out.write("  \n");
      out.write("              $('#song2').click(function() {\n");
      out.write("             $(this).toggleClass(\"down\");\n");
      out.write("             CargarSong(\"");
out.println(""+urlsong[1]+"\"");
      out.write(");        \n");
      out.write("  });\n");
      out.write("  \n");
      out.write("  $('#song3').click(function() {\n");
      out.write("             $(this).toggleClass(\"down\");\n");
      out.write("             CargarSong(\"");
out.println(""+urlsong[2]+"\"");
      out.write(");        \n");
      out.write("  });\n");
      out.write("  \n");
      out.write("   $('#song4').click(function() {\n");
      out.write("             $(this).toggleClass(\"down\");\n");
      out.write("             CargarSong(\"");
out.println(""+urlsong[3]+"\"");
      out.write(");        \n");
      out.write("  });\n");
      out.write("  \n");
      out.write("   $('#song5').click(function() {\n");
      out.write("             $(this).toggleClass(\"down\");\n");
      out.write("             CargarSong(\"");
out.println(""+urlsong[4]+"\"");
      out.write(");        \n");
      out.write("  });\n");
      out.write("  \n");
      out.write("   $('#song6').click(function() {\n");
      out.write("             $(this).toggleClass(\"down\");\n");
      out.write("             CargarSong(\"");
out.println(""+urlsong[5]+"\"");
      out.write(");        \n");
      out.write("  });\n");
      out.write("  \n");
      out.write("   $('#song7').click(function() {\n");
      out.write("             $(this).toggleClass(\"down\");\n");
      out.write("             CargarSong(\"");
out.println(""+urlsong[6]+"\"");
      out.write(");        \n");
      out.write("  });\n");
      out.write("  \n");
      out.write("   $('#song8').click(function() {\n");
      out.write("             $(this).toggleClass(\"down\");\n");
      out.write("             CargarSong(\"");
out.println(""+urlsong[7]+"\"");
      out.write(");        \n");
      out.write("  });\n");
      out.write("               \n");
      out.write("                </script>\n");
      out.write("            \n");
      out.write("            \n");
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
      out.write("                    <a href=\"Index.jsp\">Home</a>\n");
      out.write("                    ");
 
                        if(session.getAttribute("name")!= ""){
                            if (session.getAttribute("name")== null)
                            {out.println("<a href='Registro.jsp'>Registrarse</a>");
                             out.println("<a href='Login.jsp'>Iniciar Sesion</a>");}
                             else
                             {out.println("<a href='UserProfileC.jsp'> Mi Perfil</a>");
                            out.println("<a href='login' method='get'>Logout</a>" );}  
                            }
                        else{
                        out.println("<a href='Registro.jsp'>Registrarse</a>");
                        out.println("<a href='Login.jsp'>Iniciar Sesion</a>");
                        }
                    
      out.write("\n");
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
