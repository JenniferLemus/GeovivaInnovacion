<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->

<%@page import="BEAN.BeanPeriodo"%>
<%@page import="BEAN.BeanEra"%>
<%@page import="BEAN.BeanGeositio"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page session="true" %>
<!DOCTYPE HTML>
<html lang="zxx">

    <head>
        <title>Registrar Arqueologico</title>
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
  
    <body id="body" style="background-image: url(images/Arqueologico.jpg)">
       
                <jsp:include page="/menuLateral.jsp" flush="true"></jsp:include>
     
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
                    <li class="tab active"><a href="#signin-agile">Registrar arqueologico</a></li>
                </ul>
                <div class="tab-content">
                    <div id="signin-agile">   
                        <form action="Arqueologico" method="post">


                            <p class="header">Nombre</p>
                            <input type="text" name="nombre" placeholder="Nombre" required="">

                            <p class="header">Ubicación</p>
                            <input type="text" name="ubicacion" placeholder="Ubicación" required="">	

                            <p class="header">Cultura</p>
                            <input type="text" name="cultura" placeholder="Cultura" required="">

                            <p class="header">Formación</p>
                            <select class="sign-in" name="formacion" required="">
                                <option name="">Seleccione Formación</option>
                                <option name="">Habitad</option>
                                <option name="">Necropolis</option>
                            </select>


                            <p class="header">Cronologia</p>
                            <input type="text" name="formacion" placeholder="Formación" required="">

                            <p class="header">Funcional</p>
                            <input type="text" name="funcional" placeholder="Funcional" required="">

                            <p class="header">Tipologia</p>
                            <input type="text" name="tipologia" placeholder="Tipologia" required="">

                            <p class="header">Duración</p>
                            <select class="sign-in" name="duracion" required="">
                                <option name="">Duración Temporal</option>
                                <option name="">Estacional</option>
                                <option name="">Fijo</option>
                                <option name="">Ninguno</option>
                            </select>

                            <p class="header">Era</p>
                            <select class="sign-in" name="foranea_era" >
                                <option value="">Seleccione Era</option>
                                <% for (BeanEra bEra : DAO.DaoEra.ListarEra()) {%>
                                <option value="<%=bEra.getId_era()%>"><%=bEra.getTipo()%></option>
                                <%}%>              
                            </select>

                            <p class="header">Periodo</p>
                            <select class="sign-in" name="foranea_periodo" >
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


