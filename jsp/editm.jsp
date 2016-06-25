<%@ page import ="java.sql.*" %>


<%
  
    
                   String val = request.getParameter("Namae");
                   String tit = request.getParameter("titulo").toString();
                   String tip = request.getParameter("genero").toString();
                   String mon = request.getParameter("precio").toString();
    
 
 String com = request.getParameter("comentario");
Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
CallableStatement cs = null;
String query = "call updates(?,?,?,?)";
        cs = conexion.prepareCall(query);
        cs.setString(1,val);
        cs.setString(2,tit);
        cs.setString(3,tip);
        cs.setString(4,mon);
        
    cs.execute();
cs.close();
conexion.close();
%>
<script>
      alert("Cancion Editada Correctamente");//alert the message
      //you can also display the message using a mark up on the page and use setTimeOut()
      window.location = "../UserProfileC.jsp";//then redirect
</script>