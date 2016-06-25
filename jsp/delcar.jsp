<%-- 
    Document   : delcar
    Created on : 9/06/2016, 04:16:21 PM
    Author     : Yukine Sugiura
--%>
<%@ page import ="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int val;
                     val = Integer.parseInt(session.getAttribute("ID").toString());


Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
CallableStatement cs = null;
String query = "call delcar(?)";
        cs = conexion.prepareCall(query);
        cs.setInt(1,val);  
    cs.execute();
cs.close();
conexion.close();
String car = request.getParameter("finc");
%>


 <%
      
         if(car.equals("ok"))
                    { 
                    %>
                      <script>
      alert("Compra Finalizada");//alert the message
      //you can also display the message using a mark up on the page and use setTimeOut()
      window.location = "../Index.jsp";//the redirect
</script>
                     <%
                      
                    }
                      else
                    {%>
                <script>
      alert("Carrito de Compras Borrado");//alert the message
      //you can also display the message using a mark up on the page and use setTimeOut()
      window.location = "../Carrito.jsp";//then redirect
</script>
<%
}%>