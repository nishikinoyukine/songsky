package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class listarepcarga_jsp extends org.apache.jasper.runtime.HttpJspBase
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

Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");

Statement Estamento = conexion.createStatement();
ResultSet rs = Estamento.executeQuery("select * from papw.canciones");


out.println();
FileWriter fichero = null; 

try 
{ 
// Creas la instancia del fichero 
fichero = new FileWriter("C:\\Users\\Yukine Sugiura\\Documents\\NetBeansProjects\\SONGSKY\\web\\upload\\Playlist.asx"); 
// El carácter \r\n es el que hace que salte una linia en el fichero después de escribir 
fichero.write(" <ASX VERSION = '3.0'> "+"\r\n"+" <TITLE>Playlist</TITLE>"); 

while (rs.next()) {

fichero.write("<ENTRY>"+"\r\n"+"<TITLE>"+rs.getString("NombreCancion")+"</TITLE>"+"\r\n"+"<REF HREF ='" +rs.getString("urlsong")+ "' />"+"\r\n"+"</ENTRY>"); 
}
fichero.write("</ASX>");
fichero.close(); 
} 
catch(IOException ioe) 
{ 
// Aqui pones lo que quieres que haga cuando se da una excepción de escritura 
} 
// Cierras el fichero 



rs.close();
Estamento.close();
conexion.close();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lista de Reproducion</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<embed src=\"../upload/playlist.asx\" loop=\"30\" autostart=\"true\" volume=\"4\" width=\"250\" height=\"60\" controls=\"smallconsole\">\n");
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
