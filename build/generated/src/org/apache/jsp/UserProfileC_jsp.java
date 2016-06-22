package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class UserProfileC_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    \n");
      out.write("     ");

 int val;
                   if(session.getAttribute("Visita").equals("true"))
                    { val = Integer.parseInt(session.getAttribute("IDv").toString());
                    }else
                    {
                     val = Integer.parseInt(session.getAttribute("ID").toString());
                    }
                   
Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
CallableStatement cs = null;
String query = "call com(?)";
        cs = conexion.prepareCall(query);
        cs.setInt(1,val);

ResultSet rs = cs.executeQuery();
int i = 1;
String[ ] com = new String[3];
while (rs.next()){
    if (i<=2){com [i] = rs.getString("comentario");}
    i+=1;
    
}
rs.close();
cs.close();
conexion.close();
//listas 
Class.forName("com.mysql.jdbc.Driver");
conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
cs = null;
 query = "call listuser(?)";
        cs = conexion.prepareCall(query);
        cs.setInt(1,val);

rs = cs.executeQuery();
i = 0;
int [] vallst = new int[9]; 
String[ ] namelst = new String[8];

for (int n=0;n<8;n++){
namelst [n] = "No se ha Creado Esta Lista";
vallst [n] = 2;
}

while (rs.next()){
    if (i<=8){namelst [i] = rs.getString("nomlista");
              vallst [i] = rs.getInt("idListarep");
    }
    i+=1;
    
}
rs.close();
cs.close();
conexion.close();

      out.write("\n");
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
      out.write("         <script language=\"javascript\">\n");
      out.write("\n");
      out.write("function NewWindow(mypage,myname,w,h,scroll){\n");
      out.write("LeftPosition = (screen.width) ? (screen.width-w)/2 : 0;\n");
      out.write("TopPosition = (screen.height) ? (screen.height-h)/2 : 0;\n");
      out.write("settings =\n");
      out.write("'height='+h+',width='+w+',top='+TopPosition+',left='+LeftPosition+',scrollbars='+scroll+',resizable'\n");
      out.write("win = window.open(mypage,myname,settings)\n");
      out.write("             \n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <main>\n");
      out.write("             <section id=\"busqueda\">             \n");
      out.write("                        <form action=\"Buscador.jsp\" method=\"get\">\t\n");
      out.write("                            \n");
      out.write("                        <input type=\"search\" name=\"BUSCAR\" placeholder=\"Audio o Artista\">\t<i class=\"icon-search\" ></i>\t\n");
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
                    {out.println("<h1>" + session.getAttribute("namev")+"<a href='Index.jsp'></h1></a>");
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
      out.write("                ");

                    if(session.getAttribute("Visita").equals("true"))
                    {                    }else
                    {
                        
      out.write("\n");
      out.write("                        <div class=\"menudes\">\n");
      out.write("                        <a href=\"EditorMusic.jsp\">Administrar Grabaciones</a>\n");
      out.write("                        <a href=\"UploadMusic.jsp\">Subir Contenido</a>\n");
      out.write("                        <a href=\"Reporte.jsp\">Reporte de Ventas</a>\n");
      out.write("                        <div class=\"marca\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    ");

                    }
                    
                
      out.write("\n");
      out.write("                 \n");
      out.write("                </section>\n");
      out.write("                <p id=\"idp\" hidden=\"true\" value=\"0\">idm</p>\n");
      out.write("                 <section id=\"generosmusic\">\n");
      out.write("                <h3>Playlist</h3>\n");
      out.write("                <div class=\"containergeneros\">\n");
      out.write("                    <div class=\"info-generos\">\n");
      out.write("                        <a href=\"jsp/repmusica.jsp?idp=");
out.println(vallst [0]);
      out.write("\" title=\"PlayList\" onclick=\"NewWindow(this.href,'name','240','500','yes');return false\"><img src=\"IMG/list2.jpg\"></a>\n");
      out.write("                        <h5>");
out.println(namelst[0]);
      out.write("</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-generos\">\n");
      out.write("                     <a href=\"jsp/repmusica.jsp?idp=");
out.println(vallst [1]);
      out.write("\" title=\"PlayList\" onclick=\"NewWindow(this.href,'name','240','500','yes');return false\"><img src=\"IMG/list3.jpg\"></a>\n");
      out.write("                         <h5>");
out.println(namelst[1]);
      out.write("</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-generos\">\n");
      out.write("                     <a href=\"jsp/repmusica.jsp?idp=");
out.println(vallst [2]);
      out.write("\" title=\"PlayList\" onclick=\"NewWindow(this.href,'name','240','500','yes');return false\"><img src=\"IMG/list4.jpg\"></a>\n");
      out.write("                         <h5>");
out.println(namelst[2]);
      out.write("</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-generos\">\n");
      out.write("                        <a href=\"jsp/repmusica.jsp?idp=");
out.println(vallst [3]);
      out.write("\" title=\"PlayList\" onclick=\"NewWindow(this.href,'name','240','500','yes');return false\"><img src=\"IMG/list5.jpg\"></a>\n");
      out.write("                         <h5>");
out.println(namelst[3]);
      out.write("</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-generos\">\n");
      out.write("                        <a href=\"jsp/repmusica.jsp?idp=");
out.println(vallst [4]);
      out.write("\" title=\"PlayList\" onclick=\"NewWindow(this.href,'name','240','500','yes');return false\"><img src=\"IMG/list6.jpg\"></a>\n");
      out.write("                         <h5>");
out.println(namelst[4]);
      out.write("</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-generos\">\n");
      out.write("                        <a href=\"jsp/repmusica.jsp?idp=");
out.println(vallst [5]);
      out.write("\" title=\"PlayList\" onclick=\"NewWindow(this.href,'name','240','500','yes');return false\"><img src=\"IMG/list7.jpg\"></a>\n");
      out.write("                         <h5>");
out.println(namelst[5]);
      out.write("</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-generos\">\n");
      out.write("                        <a href=\"jsp/repmusica.jsp?idp=");
out.println(vallst [6]);
      out.write("\" title=\"PlayList\" onclick=\"NewWindow(this.href,'name','240','500','yes');return false\"><img src=\"IMG/list8.jpg\"></a>\n");
      out.write("                         <h5>");
out.println(namelst[6]);
      out.write("</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                          \n");
      out.write("            ");

                    if(session.getAttribute("Visita").equals("true"))
                    {                    }else
                    {
                        
      out.write("\n");
      out.write("                        <div class=\"info-generos\">\n");
      out.write("                         <a href=\"createlist.jsp\"><img src=\"IMG/list1.jpg\" alt=\"\"></a>\n");
      out.write("                         <h5>Agregar Nueva Lista</h5> \n");
      out.write("                         </div>\n");
      out.write("                         </div>   \n");
      out.write("                    ");

                    }
                    
                
      out.write("\n");
      out.write("            ");


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
      out.write("                \n");
      out.write("            \n");
      out.write("              <hr color=\"dodgerblue\" size=1>\n");
      out.write("            \n");
      out.write("            </section>\n");
      out.write("            <section id=\"artistas\">\n");
      out.write("                <h4>Las Mas Nuevas</h4>\n");
      out.write("                <div class=\"containerartistas\">\n");
      out.write("                    <div class=\"info-artistas\">\n");
      out.write("                        <img src=\"");
out.println(urlimg[0]);
      out.write("\" alt=\"\">\n");
      out.write("                        <h5>");
out.println(nom[0]);
      out.write("</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img src=\"");
out.println(urlimg[1]);
      out.write("\" alt=\"\">\n");
      out.write("                        <h5>");
out.println(nom[1]);
      out.write("</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img src=\"");
out.println(urlimg[2]);
      out.write("\" alt=\"\">\n");
      out.write("                        <h5>");
out.println(nom[2]);
      out.write("</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img src=\"");
out.println(urlimg[3]);
      out.write("\" alt=\"\">\n");
      out.write("                        <h5>");
out.println(nom[3]);
      out.write("</h5> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img src=\"");
out.println(urlimg[4]);
      out.write("\" alt=\"\">\n");
      out.write("                        <h5>");
out.println(nom[4]);
      out.write("</h5>  \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img src=\"");
out.println(urlimg[5]);
      out.write("\" alt=\"\">\n");
      out.write("                        <h5>");
out.println(nom[5]);
      out.write("</h5>  \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img src=\"");
out.println(urlimg[6]);
      out.write("\" alt=\"\">\n");
      out.write("                        <h5>");
out.println(nom[6]);
      out.write("</h5>  \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"info-artistas\">\n");
      out.write("                        <img src=\"");
out.println(urlimg[7]);
      out.write("\" alt=\"\">\n");
      out.write("                        <h5>");
out.println(nom[7]);
      out.write("</h5> \n");
      out.write("                    </div>\n");
      out.write("                <hr color=\"dodgerblue\" size=1>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                 <hr color=\"dodgerblue\" size=1>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                      <hr color=\"dodgerblue\" size=1>\n");
      out.write("                    \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     <form  name='comenta' action=\"jsp/comenta.jsp\" method=\"post\" >\n");
      out.write("                     <section id=\"comentarios\" style=\"display:inline-block\">\n");
      out.write("                         \n");
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
      out.write("\t\t<span  class=\"icon-comment-empty\" onclick=\"comenta.submit()\">Enviar</span>\n");
      out.write("                \n");
      out.write("\t</a>\n");
      out.write("    </div>   \n");
      out.write("                \n");
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
      out.write("      <th><i class=\"icon-user\">Anony</i></th>\n");
      out.write("      <th></th>\n");
      out.write("      <th></th>\n");
      out.write("     \n");
      out.write("      \n");
      out.write("  </tr>\n");
      out.write("    </table> \n");
      out.write("                           \n");
      out.write("      <table id=\"publicacion\" width width=\"40%\" cellspacing=\"10\" cellpadding=\"2\">                                         \n");
      out.write("   <tr>\n");
      out.write("    <th>");
out.println(com [1]);
      out.write("</th>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("                           \n");
      out.write("                    \n");
      out.write("                           \n");
      out.write("                            <table id=\"usercomentario\" width=\"40%\" cellspacing=\"10\" cellpadding=\"2\">\n");
      out.write("                        \n");
      out.write("  <tr>\n");
      out.write("      <th><i class=\"icon-user\">Anony</i></th>\n");
      out.write("      <th></th>\n");
      out.write("      <th></th>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("  </tr>\n");
      out.write("    </table> \n");
      out.write("                           \n");
      out.write("      <table id=\"publicacion\" width width=\"40%\" cellspacing=\"10\" cellpadding=\"2\">                                         \n");
      out.write("   <tr>\n");
      out.write("    <th>");
out.println(com [2]);
      out.write("</th>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("                  \n");
      out.write("                        \n");
      out.write("    </div>              \n");
      out.write("           \n");
      out.write("            \n");
      out.write("                     </section>\n");
      out.write("         </form>     \n");
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
      out.write("                    \n");
      out.write("                    ");

                    if(session.getAttribute("Visita").equals("true"))
                    {
                    }else
                    {
                    out.println("<a href='Carrito.jsp'><span class='icon-basket'>Mi Carrito</a>");
                    } 
                
      out.write("\n");
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
