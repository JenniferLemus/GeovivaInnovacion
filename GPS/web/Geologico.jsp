<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@page import="BEAN.BeanPeriodo"%>
<%@page import="BEAN.BeanEra"%>
<%@page import="java.util.ArrayList"%>
<%@page import="BEAN.BeanYacimientoGeologico"%>
<%@page import="DAO.DaoYacimientoGeologico"%>
<%@page import="BEAN.BeanGeositio"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page session="true" %>
<!DOCTYPE HTML>
<html lang="zxx">

    <head>
        <title>Registrar Geologico</title>
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

    <body style="background-image: url(images/Geologico.jpg)">
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
                    <li class="tab active"><a href="#signin-agile">Registrar geologico</a></li>
                </ul>
                <div class="tab-content">
                    <div id="signin-agile">   
                        <form action="AccidenteGeologico" method="post">

                            <p class="header">Nombre</p>
                            <input type="text" name="nombre" placeholder="Nombre" required="">

                            <p class="header">Ubicación</p>
                            <input type="text" name="ubicacion" placeholder="Ubicación" required="">	

                            <p class="header">Elevación</p>
                            <input type="text" name="elevacion" placeholder="Elevación" required="">

                            <p class="header">Pendiente</p>

                            <select class="sign-in" name="pendiente" placeholder="Pendiente" required>
                                <option name="">Seleccione Pendiente</option>
                                <option name="">Baja</option>
                                <option name="">Media</option>
                                <option name="">Moderada</option>
                                <option name="">Severa</option>
                            </select>


                            <p class="header">Orientación</p>
                            <select class="sign-in" name="orientacion" required="">
                                <option name="">Seleccione Orientación</option>
                                <option name="">Norte</option>
                                <option name="">Sur</option>
                                <option name="">Este</option>
                                <option name="">Oeste</option>
                            </select>

                            <p class="header">Estratificación</p>
                            <select class="sign-in" name="estratificacion" required="">
                                <option name="">Seleccione Estratificación</option>
                                <option name="">Grano Fino</option>
                                <option name="">Grano Grueso</option>
                            </select>

                            <p class="header">Formación rocosa</p>

                            <select class="sign-in" name="formacion_rocosa" required="">
                                <option name="">Seleccione una Formación</option>
                                <option name="">Sedimentarias</option>
                                <option name="">metamórficas</option>
                                <option name="">ígneas</option>
                            </select>

                            <p class="header">Tipo de suelo</p>
                            <select class="sign-in" name="tipo_suelo" required="">
                                <optgroup label="Azonales">
                                    <option name="">Litosuelos</option>
                                    <option name="">Regosoles</option>
                                </optgroup>
                                <optgroup label="Interzonales">
                                    <option name="">Ranker</option>
                                    <option name="">Rendsina</option>
                                    <option name="">Salinos</option>
                                    <option name="">Grey</option>
                            </select>

                            <p class="header">Era</p>
                            <select class="sign-in" name="fk_era" >
                                <option value="">Seleccione Era</option>
                                <% for (BeanEra bEra : DAO.DaoEra.ListarEra()) {%>
                                <option value="<%=bEra.getId_era()%>"><%=bEra.getTipo()%></option>
                                <%}%>              
                            </select>

                            <p class="header">Periodo</p>
                            <select class="sign-in" name="fk_periodo" >
                                <option value="">Seleccione Periodo</option>
                                <% for (BeanPeriodo bPeriodo : DAO.DaoPeriodo.Listaperiodo()) {%>
                                <option value="<%=bPeriodo.getId_periodo()%>"><%=bPeriodo.getNombre()%></option>
                                <%}%>
                            </select>

                            <input type="submit"  name="btnIniciar" class="sign-in" value="Guardar">
                            <input type="hidden" name="opcion" value="1">


                            

                            

                        </form>
                            
                            <button class="sign-in"><a href="menusitios.jsp">ATRAS</button></a>
                    </div>
                    <div id="signup-agile">   
                        <form action="menusitios.jsp" method="post">
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

</body>
</html>


