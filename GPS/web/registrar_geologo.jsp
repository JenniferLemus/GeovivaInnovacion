<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@page import="BEAN.BeanGeositio"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page session="true" %>
<!DOCTYPE HTML>
<html lang="zxx">

    <head>
        <title>Registrar Geologo</title>
        <!-- Meta-Tags -->
        <meta name="viewport" content="user-scalable=no, width=device-width, initial-scale=1">
        <meta charset="utf-8">
        <link href="css/stylelogin.css" rel="stylesheet" type="text/css"/>
        <meta name="keywords" content="Particles Login Form Form a Responsive Web Template, Bootstrap Web Templates, Flat Web Templates, Android Compatible Web Template, Smartphone Compatible Web Template, Free Webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design">
        <script>
            addEventListener("load", function () {
                setTimeout(hideURLbar, 0);
            }, false);

            function hideURLbar() {
                window.scrollTo(0, 1);
            }
        </script>
        <!-- //Meta-Tags -->
        <!-- Stylesheets -->

        <!-- online fonts-->
        <link href="https://fonts.googleapis.com/css?family=Amiri:400,400i,700,700i" rel="stylesheet">
        <link href='//fonts.googleapis.com/css?family=Raleway:400,100,200,300,500,600,700,800,900' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Poiret+One' rel='stylesheet' type='text/css'>
    </head>

    <body style="background-image: url(images/geologo.jpg)">
        <!--  particles  -->
        <div id="particles-js"></div>
        <!-- //particles -->
        <div> 
            <div class="w3ls-pos">
                <img src="images/Sin título-1.png" alt=""/>
            </div>
        </div>
        <div class="formulario" >
            <div class="form-w3ls">
                <ul class="tab-group cl-effect-4">
                    <li class="tab active"><a href="#signin-agile">Ingresar nuevo geologo</a></li>
                </ul>
                <div class="tab-content">
                    <div id="signin-agile">   
                        <form action="Geologo" method="post">

                            <p class="header">Nombre</p>
                            <input type="text" name="nombre" placeholder="Nombre" required="">

                            <p class="header">Apellido</p>
                            <input type="text" name="apellido" placeholder="Apellido" required="">	

                            <p class="header">Telefono</p>
                            <input type="text" name="telefono" placeholder="Telefono" required="">

                            <p class="header" type="text">Tipo de documento</p>
                            <select class="sign-in" name="tipoDocumento" >
                                <option name="">CI</option>
                                <option name="">CC</option>
                                <option name="">TI</option>
                                <option name="">TP</option>
                                <option name="">RC</option>
                                <option name="">CE</option>
                                <option name="">CI</option>
                                <option name="">DNI</option>    
                            </select>
                            
                            <p class="header">Numero de documento</p>
                            <input type="text" name="numeroDocumento" placeholder="Numero de documento" required="">

                            <p class="header">Correo</p>
                            <input type="text" name="correo" placeholder="Correo" required="">

                            <p class="header">Entidad</p>
                            <input type="text" name="entidad" placeholder=Entidad" required="" >

                            
                            <input type="submit"  name="btnIniciar" class="sign-in" value="Guardar">
                                    <input type="hidden" name="opcion" value="1">


                            <ul class="links">
                                <li class="pass-w3ls"><a href="#">Menú</a></li>
                            </ul>

                        </form>
                    </div>
                    <div id="signup-agile">   
                        <form action="#" method="post">
                        </form>
                    </div> 
                </div><!-- tab-content -->
            </div>
        </div>
        <!--//copyright-->
    </div>
    <!-- scripts required  for particle effect -->
    <script src='js/particles.min.js'></script>
    <script src="js/index.js"></script>
    <script src='js/jquery.min.js'></script>
    <script src="js/indeex.js"></script>
    <!-- //scripts required for particle effect -->

    <%
        if (request.getAttribute("error") != null) {  %>
    ${error}
    <%} else {%>
    ${exito}
    <%}%>
</body>

</html>


