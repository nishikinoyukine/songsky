package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class repmusica_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <title>Playlist</title>\n");
      out.write("     <meta charset=\"UTF-8\">\n");
      out.write("     <script src=\"../js/jquery.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#000000\" onResize=\"window.resizeTo(250,500)\">\n");
      out.write("    <img id=\"disco\" src=\"../IMG/play1.png\" height=\"200\" width=\"300\"><br>\n");
      out.write("    <audio id=\"player1\" preload=\"auto\" controls loop>\n");
      out.write("\t\t\t\t<source src=\"\">\n");
      out.write("\t\t\t</audio>\n");

Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
 int val = Integer.parseInt(request.getParameter("idp"));
CallableStatement cs = null;
String query = "call loadlist(?)";
        cs = conexion.prepareCall(query);
        cs.setInt(1,val);
ResultSet rs = cs.executeQuery();      

out.println("<table border=1>");

out.println("<tr><th><font color='#FFFFFF'>Nombre</font></th><th><font color='#FFFFFF'>Reproducir</font></th><th><font color='#FFFFFF'>Agregar Carrito</font></th></tr>");

String[ ] com = new String[100];
String[ ] com1 = new String[100];
int i = 0;

while (rs.next()) {

out.println("<tr>");
        
out.println("<td>");    
        
out.println("<font color='#FFFFFF'>"+rs.getString("NombreCancion")+"</font>");

out.println("</td><td>");


      out.write("\n");
      out.write("<img id=\"");
out.println("song"+i+"\"");
      out.write(" src=\"../IMG/Play.png\">\n");
      out.write("\n");

out.println("</td><td>");

      out.write("\n");
      out.write("<img id=\"");
out.println("car"+i+"\"");
      out.write(" value=\"");
out.println(rs.getString("ID_song")+"\"");
      out.write(" src=\"../IMG/carrito.jpg\">\n");
      out.write("\n");

 out.println("</td>");
com[i]=rs.getString("urlsong");
com1[i]=rs.getString("Image");
out.println("</tr>");
i=i+1;
}

out.println("</table>");



rs.close();
cs.close();
conexion.close();

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <script>\n");
      out.write("      function CargarSong(input) {\n");
      out.write("  if (document.getElementById('player1').paused) {\n");
      out.write("          $('#player1').attr('src', input);\n");
      out.write("          document.getElementById('player1').play();        \n");
      out.write("      } else {\n");
      out.write("        document.getElementById('player1').pause();\n");
      out.write("        document.getElementById('player1').currentTime = 0;\n");
      out.write("      }\n");
      out.write("}  \n");
      out.write("\n");
      out.write("function caratula(input) {\n");
      out.write("          $('#disco').attr('src', input);\n");
      out.write("}  \n");
      out.write("\n");
for ( int factor = 0; factor <= i; factor ++ ) { 
      out.write("\n");
      out.write("     $('");
out.println("#song"+factor+"'");
      out.write(").click(function() {\n");
      out.write("             $(this).toggleClass(\"down\");\n");
      out.write("             CargarSong(\"");
out.println("../"+com[factor]+"\"");
      out.write(");\n");
      out.write("             caratula(\"");
out.println("../"+com1[factor]+"\"");
      out.write(");\n");
      out.write("\n");
      out.write("      \n");
      out.write("  });");
}
      out.write("\n");
      out.write("  \n");
      out.write(" </script>\n");
      out.write(" </body>\n");
      out.write(" </html>");
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
