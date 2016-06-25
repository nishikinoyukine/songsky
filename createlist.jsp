<%-- 
    Document   : Editlist
    Created on : 7/06/2016, 09:35:00 PM
    Author     : Yukine Sugiura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

     <%@page import="java.sql.*" %> 
     <title>Lista de Reproducion</title>
     <link rel="stylesheet" href="CSS/registro.css">    
     <div>
    <form id="addsong" name="addsong" action="#" method="post">
     <%
                int  val = Integer.parseInt(session.getAttribute("ID").toString()); 
  
Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
CallableStatement cs = null;
String query = "call oblist(?)";
        cs = conexion.prepareCall(query);
        cs.setInt(1,val);

ResultSet rs = cs.executeQuery();
int i = 1;




%>      
                                    <h1>Agregar a Lista de Reproduccion</h1>
                                            <h2>Lista</h2>
                                <select name="Namalst" id="">
			        <%
                               while (rs.next()) {
                               out.println("<option value="+ rs.getString("idListarep") +" selected='selected'>"+rs.getString("nomlista")+"</option>)");
                               }
                                %>                  		            
			        </select><br><br>   
 <%
 rs.close();
cs.close();
conexion.close();
 %>                
 
      <%
                 
  
Class.forName("com.mysql.jdbc.Driver");
conexion = DriverManager.getConnection("jdbc:mysql://localhost/PAPW", "root", "");
cs = null;
 query = "call selectse(?)";
        cs = conexion.prepareCall(query);
        cs.setInt(1,val);

rs = cs.executeQuery();
i = 1;




%>
                                   <h2>Canciones</h2>
                                <select name="Namae" id="">
			        <%
                               while (rs.next()) {
                               out.println("<option value="+ rs.getString("ID_song") +" selected='selected'>"+rs.getString("NombreCancion")+"</option>)");
                               }
                                %>                  		            
			        </select><br><br>   
 <%
 rs.close();
cs.close();
conexion.close();
 %>

<input type="image" src="IMG/ready.png" onclick="submitForm('jsp/addtolist.jsp')" width="200" />
</from><br>
</div>
 
 
 <div>
<h1>Crear Lista de Reproduccion</h1>
<input type="text" id="nalis" name="nalis" placeholder="Nombre de Lista"><br>
<input type="image" src="IMG/ready.png" onclick="submitForm('jsp/newlist.jsp')" width="200" /><br>
<a href="UserProfileC.jsp"><img src="IMG/cancelarbtn.png"width="200" /></a>

</form>
</div>
 
 <script>
    function submitForm(action)
    {
        document.getElementById('addsong').action = action;
        document.getElementById('addsong').submit();
    }
</script>

<input type="cancel" alt="cancel">