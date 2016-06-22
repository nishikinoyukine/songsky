package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class find_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write(" \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Buscador</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 // declarando y creando objetos globales 
                    // construyendo forma dinamica 
            out.println("<FORM ACTION=find.jsp METHOD=post>");
            out.println("BUSCAR:"+ "<INPUT TYPE=TEXT NAME=BUSCAR><BR><BR>");
            out.println("<INPUT TYPE=SUBMIT NAME=OK VALUE=BUSCAR><BR>");
            out.println("</FORM>");
        Class.forName("com.mysql.jdbc.Driver");
        Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
        String buscar = request.getParameter("BUSCAR");
        // mandando el sql a la base de datos 
        try {
            Statement Estamento = conexion.createStatement();
            ResultSet rs = Estamento.executeQuery("select * from canciones where NombreCancion like '%' \""+buscar+"\" '%'");
 
         //   tabla = instruccion.executeQuery(q); 
        // mandando resultset a tabla html 
            out.println("<TABLE Border=10 CellPadding=5><TR>");
            out.println("<th bgcolor=Green>Nombre</th><th bgcolor=White>Precio</th></TR>");
            while(rs.next()) {
                out.println("<TR>");
                out.println("<TD>"+rs.getString("NombreCancion")+"</TD>");
                out.println("<TD>$"+rs.getInt("Precio")+"</TD>");
                out.println("</TR>"); }; // fin while 
            out.println("</TABLE></CENTER></DIV></HTML>");
            } //fin try no usar ; al final de dos o mas catchs 
            catch(SQLException e) {};
            try {
            conexion.close();
            } catch(SQLException e) {}; //}; 
            
      out.write("\n");
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
