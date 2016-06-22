package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class createlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      \n");
      out.write("     <title>Lista de Reproducion</title>\n");
      out.write("     <link rel=\"stylesheet\" href=\"CSS/registro.css\">    \n");
      out.write("     <div>\n");
      out.write("    <form id=\"addsong\" name=\"addsong\" action=\"#\" method=\"post\">\n");
      out.write("     ");

                int  val = Integer.parseInt(session.getAttribute("ID").toString()); 
  
Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
CallableStatement cs = null;
String query = "call oblist(?)";
        cs = conexion.prepareCall(query);
        cs.setInt(1,val);

ResultSet rs = cs.executeQuery();
int i = 1;





      out.write("      \n");
      out.write("                                    <h1>Agregar a Lista de Reproduccion</h1>\n");
      out.write("                                            <h2>Lista</h2>\n");
      out.write("                                <select name=\"Namalst\" id=\"\">\n");
      out.write("\t\t\t        ");

                               while (rs.next()) {
                               out.println("<option value="+ rs.getString("idListarep") +" selected='selected'>"+rs.getString("nomlista")+"</option>)");
                               }
                                
      out.write("                  \t\t            \n");
      out.write("\t\t\t        </select><br><br>   \n");
      out.write(" ");

 rs.close();
cs.close();
conexion.close();
 
      out.write("                \n");
      out.write(" \n");
      out.write("      ");

                 
  
Class.forName("com.mysql.jdbc.Driver");
conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
cs = null;
 query = "call selectse(?)";
        cs = conexion.prepareCall(query);
        cs.setInt(1,val);

rs = cs.executeQuery();
i = 1;





      out.write("\n");
      out.write("                                   <h2>Canciones</h2>\n");
      out.write("                                <select name=\"Namae\" id=\"\">\n");
      out.write("\t\t\t        ");

                               while (rs.next()) {
                               out.println("<option value="+ rs.getString("ID_song") +" selected='selected'>"+rs.getString("NombreCancion")+"</option>)");
                               }
                                
      out.write("                  \t\t            \n");
      out.write("\t\t\t        </select><br><br>   \n");
      out.write(" ");

 rs.close();
cs.close();
conexion.close();
 
      out.write("\n");
      out.write("\n");
      out.write("<input type=\"image\" src=\"IMG/ready.png\" onclick=\"submitForm('jsp/addtolist.jsp')\" width=\"200\" />\n");
      out.write("</from><br>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" <div>\n");
      out.write("<h1>Crear Lista de Reproduccion</h1>\n");
      out.write("<input type=\"text\" id=\"nalis\" name=\"nalis\" placeholder=\"Nombre de Lista\"><br>\n");
      out.write("<input type=\"image\" src=\"IMG/ready.png\" onclick=\"submitForm('jsp/newlist.jsp')\" width=\"200\" /><br>\n");
      out.write("<a href=\"UserProfileC.jsp\"><img src=\"IMG/cancelarbtn.png\"width=\"200\" /></a>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write(" <script>\n");
      out.write("    function submitForm(action)\n");
      out.write("    {\n");
      out.write("        document.getElementById('addsong').action = action;\n");
      out.write("        document.getElementById('addsong').submit();\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<input type=\"cancel\" alt=\"cancel\">");
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
