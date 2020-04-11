<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page session="true" %>
<!DOCTYPE HTML>
<html lang="zxx">

    <head>
        <title>Inicio de Sesión Geoviva</title>
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

    <body>
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
                    <li class="tab active"><a href="#signin-agile">Ingresar</a></li>
                    <li class="tab"><a href="#signup-agile">Registrarse</a></li>        
                </ul>
                <div class="tab-content">
                    <div id="signin-agile">   
                        <form action="SERVLOGIN" method="post">

                            <p class="header">Nombre de Usuario</p>
                            <input type="text" name="txtusuario" value="Nombre de Usuario" required="Complete este campo por favor" onfocus="this.value = '';" onblur="if (this.value == '') {
                                        this.value = 'Nombre de Usuario';
                                    }">

                            <p class="header">Contrase&ntilde;a</p>
                            <input type="password" name="txtcontra" value="Contraseña" required="Complete este campo por favor" onfocus="this.value = '';" onblur="if (this.value == '') {
                                        this.value = 'Contraseña';
                                    }">	


                            <input type="submit"  name="btnIniciar" class="sign-in" value="Iniciar Sesión">

                            <ul class="links">
                                <li class="pass-w3ls"><a href="#">Olvide Mi Contrase&ntilde;a</a></li>
                            </ul>
                        </form>


                    </div>
                    <%
                        HttpSession sesion = request.getSession();
                        int nivel = 0;
                        if (request.getAttribute("nivel") != null) {

                            nivel = (Integer) request.getAttribute("nivel");
                            if (nivel == 1) {
                                sesion.setAttribute("nombre", request.getAttribute("nombre"));
                                sesion.setAttribute("nivel", nivel);
                                response.sendRedirect("registrar_geologo.jsp");
                            }

                            if (nivel == 2) {

                                sesion.setAttribute("nombre", request.getAttribute("nombre"));
                                sesion.setAttribute("nivel", nivel);
                                response.sendRedirect("menu.jsp");

                            }

                        }

                    %>

                    <div id="signup-agile">   
                        <form action="Registro" method="post">

                            <p class="header">Nombre De Usuario</p>
                            <input type="text" name="username" value="Nombre de Usuario"  required="Complete este campo por favor" onfocus="this.value = '';" onblur="if (this.value == '') {
                                        this.value = 'Nombre de Usuario';
                                    }">
                            -
                            <p class="header">Contraseña</p>
                            <input type="password" name="pass" value="Password"  required="4" onfocus="this.value = '';" onblur="if (this.value == '') {
                                        this.value = 'Password';
                                    }">

                            <div>
                                <p class="header">Tipo de Usuario</p>
                                <select class="select" name="nivel"  required="Complete este campo por favor">
                                    <option value="1">Geólogo</option>
                                    <option value="2">Guardabosques</option>

                                </select>
                            </div>
                            

                            <button class="register">Registrar</button>
                                <input type="hidden" class="register" name="opcion" value="1">
                            
                        </form>
                        <%                               if (request.getAttribute("error") != null) {  %>
                        ${error}
                        <%} else {%>
                        ${exito}
                        <%}%>       

                    </div><!-- tab-content -->
                </div>
            </div>









            <!-- //form ends here -->
            <!--copyright-->

            <!--//copyright-->
        </div>
        <!-- scripts required  for particle effect -->
        <script src='js/particles.min.js'></script>
        <script src="js/index.js"></script>
        <script src='js/jquery.min.js'></script>
        <script src="js/indeex.js"></script>
        <!-- //scripts required for particle effect -->
    </body>

</html>