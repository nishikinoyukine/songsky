<%@ page import ="java.sql.*" %>


<%
    int val;
    
                   if(session.getAttribute("Visita").equals("true"))
                    { val = Integer.parseInt(session.getAttribute("IDv").toString());
                    }else
                    {
                     val = Integer.parseInt(session.getAttribute("ID").toString());
                    }
    
 
 String com = request.getParameter("comentario");
Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
CallableStatement cs = null;
String query = "call incom(?,?)";
        cs = conexion.prepareCall(query);
        cs.setInt(1,val);
        cs.setString(2,com);
        
    cs.execute();
cs.close();
conexion.close();
response.sendRedirect("../UserProfileC.jsp");
%>
