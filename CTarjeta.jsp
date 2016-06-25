<%-- 
    Document   : CTarjeta
    Created on : 27/04/2016, 01:00:33 PM
    Author     : Yukine Sugiura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>SONGSKY</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1, minimum-scale=1">
        <link rel="stylesheet" href="CSS/fontello.css">
        <link rel="stylesheet" href="CSS/userprofile.css"> 
        <link rel="stylesheet" href="CSS/menuser.css">   
        <link rel="stylesheet" href="CSS/portada.css"> 
        <link rel="stylesheet" href="CSS/tarjeta.css">
        <script src="js/jquery.js"></script>
    </head>

    
    
    
 <body>
        <main>  
         <hr color="dodgerblue" size=1>
  
          <section id="formulario"> 
              <p id="titulo"><span class="icon-credit-card"> Tarjeta Factura</span></p>
              <p id="titulo2"><u><small>Por favor llena todos los campos para proceder con la compra </small></u></p>
  
               <form action="">
                   <p  align="left">
                   <label class="textolabel"><small>Direccion:</small> </label>
                    <input type="text" id="direccion" name="direccion" required></p>
                   
                   <p  align="left">
                   <label class="textolabel"><small>Ciudad:</small> </label>
                    <input type="text" id="ciudad" name="ciudad" required></p>
                   
                   
                   <p  align="left">
                   <label class="textolabel"><small>Estado:</small> </label>
                   <input type="text" id="estado" name="estado" required></p>
                   
                     <p  align="left">
                    <label class="textolabel"><small>Codigo Postal:</small> </label>
                    <input type="text" id="cp" name="cp" required></p>
                   
                   
                   
                    <p  align="left">
                    <label class="textolabel"><small>Pais: </small></label>
                    <select>
  <option value="seleccionar">-Selecciona-</option>
  <option value="mexico">Mexico</option>
  <option value="eua">E.U.A.</option>
  <option value="canada">Canada</option>
                    </select></p>
                   
         
                   <input type="image" src="IMG/americanxpress.png" height="40" width="60" class="imagen2" /> >
                   <input type="image" src="IMG/visa.png" height="40" width="60" class="imagen2" /> >
                   <input type="image" src="IMG/mastercard.png" height="40" width="60" class="imagen2" /> >
                   <input type="image" src="IMG/paypal.jpg" height="40" width="60" class="imagen2" /> >
                
        <p  align="left">
                   <label class="textolabel"><small>Numero de Tarjeta:</small> </label>
        <input type="text" name = "checkout.cardNumber" id="ccnum" />
        
    
        
        <label class="textolabel"><small>Titular de la tarjeta:</small> </label>
        <input type="text" id="cp" name="cp" required>
    
                   </p>
        
                   
                   <p  align="left">
                   <label class="textolabel"><small>Vigencia:</small> </label>
          <select name="mes">  
            <option value="Ene">Enero</option>
            <option value="Feb">Febrero</option>
            <option value="Mar">Marzo</option>
            <option value="Abr">Abril</option>
            <option value="May">Mayo</option>
            <option value="Jun">Junio</option>
            <option value="Jul">Julio</option>
            <option value="Ago">Agosto</option>
            <option value="Sep">Septiembre</option>
            <option value="Oct">Octubre</option>
            <option value="Nov">Noviembre</option>
            <option value="Dic">Diciembre</option>        
            </select>
                       <input type="year" id="cp" name="cp" required>
                       
    
    <label class="textolabel"><small>Numero de seguridad</small> </label>
        <input type="text" id="cp" name="cp" required>
    
                   </p>

        
    </form>   
              
              <a href="download.jsp" class="button blue medium radius">
		<span class="icon-check"></span>Terminar Compra
	</a>
            
        <header>
            <div class="contenedor">
                <h1 class="icon-cloud-1">SONGSKY</h1>
                <input type="checkbox" id="menu-bar">
                <label class="icon-menu" for="menu-bar"></label>
                <nav class="menu">
                    <a href="Index.jsp"><i class="icon-home">Home</i></a>
                    <a href="Carrito.jsp">Regresar al Carrito</a>
                </nav>
            </div>    
        </header>
            
           
        
        </main> 
     
     
        <footer>
            <div class="containerfooter">
                <p class="copy">SONGSKY &copy; 2016</p>
                <div class="redessociales">
                    <a class="icon-facebook" href="#"></a>
                    <a class="icon-twitter" href="#"></a>
                    <a class="icon-youtube" href="#"></a>
                    <a class="icon-instagram" href="#"></a>
                    <a class="icon-vimeo" href="#"></a>
                </div>
            </div>    
        </footer>
        
      <script>
        $("#ccnum").keyup(function(e){
    var num = $(this).val().toString();
    var charCount = num.length;
 
    /* VALIDACION DE TIPO */
    if(charCount == 1) { 
        if(num == "4"){
            $("#type").html("VISA");
        }
    }
    if(charCount == 2){
        if(num == "34" || num == "37"){
            $("#type").html("AMEX");
        } else if( num == "51" || num == "55" || num == "53"){
            $("#type").html("MASTER CARD");
        } else if( num == "55" ){
            $("#type").html("DISCOVER");
        }
    }
    if(charCount == 3){
        if(num == "644"){
             $("#type").html("DISCOVER")
        }
    }
    if(charCount == 4){
        if(num == "6011"){
            $("#type").html("DISCOVER");
        }
    }
    /* !VALIDACION DE TIPO */
 
    /* ALGORITMO */
    if(charCount == 13 || charCount == 14 || charCount == 15 || charCount == 16){
        var valid = isValid(num, charCount);
        if(valid){
            $("#type").html("valida");
            $("input").attr("name", "checkout.cardNumber").attr("class", "valid-card");
        } else {
            $("#type").html("invalida");
            $("input").attr("name", "checkout.cardNumber").attr("class", "invalid-card");
        }
    }
    /* !ALGORITMO */    
});
 
function isValid(ccNum, charCount){
    var double = true;
    var numArr = [];
    var sumTotal = 0;
    for(i=0; i<charCount; i++){
        var digit = parseInt(ccNum.charAt(i));
 
        if(double){
            digit = digit * 2;
            digit = toSingle(digit);
            double = false;
        } else {
            double = true;
        }
        numArr.push(digit);
    }
 
    for(i=0; i<numArr.length; i++){
        sumTotal += numArr[i];
    }
    var diff = eval(sumTotal % 10);
    console.log(diff);
    console.log(diff == "0");
    return (diff == "0");
}
 
function toSingle(digit){
    if(digit > 9){
        var tmp = digit.toString();
        var d1 = parseInt(tmp.charAt(0));
        var d2 = parseInt(tmp.charAt(1));
        return (d1 + d2); 
    } else {
        return digit;
    }
}
        
        
        
    </script>  
        
        
    </body>
</html>