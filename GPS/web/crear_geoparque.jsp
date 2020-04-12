<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->

<%@page import="BEAN.BeanGeologo"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page session="true" %>
<!DOCTYPE HTML>
<html lang="zxx">

    <head>
        <title>Registrar Nuevo Geoparque</title>
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

    <body id="body"  style="background-image: url(images/registrar_geoparque.jpg)">
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
                    <li class="tab active"><a href="#signin-agile">Registrar nuevo geoparque</a></li>
                </ul>
                <div class="tab-content">
                    <div id="signin-agile">   
                        <form action="Geoparque" method="post">

                            <p class="header">Nombre</p>
                            <input type="text" name="nombre" placeholder="Nombre" max="30 required">

                            <p class="header">Latitud</p>
                            <input type="text" name="latitud" placeholder="Latitud" required="">	

                            <p class="header">Longitud</p>
                            <input type="text" name="longitud" placeholder="Longitud" required="">

                            <p class="header">Pais</p>
                            <select class="sign-in" name="Pais" >
                               <option name="AF">Afganistán</option>
                                <option name="">Albania</option>
                                <option name="">Alemania</option>
                                <option name="">Andorra</option>
                                <option name="">Angola</option>
                                <option name="">Anguilla</option>
                                <option name="">Antártida</option>
                                <option name="">Antigua y Barbuda</option>
                                <option name="">Antillas Holandesas</option>
                                <option name="">Arabia Saudí</option>
                                <option name="">Argelia</option>
                                <option name="">Argentina</option>
                                <option name="">Armenia</option>
                                <option name="">Aruba</option>
                                <option name="">Australia</option>
                                <option name="">Austria</option>
                                <option name="">Azerbaiyán</option>
                                <option name="">Bahamas</option>
                                <option name="">Bahrein</option>
                                <option name="">Bangladesh</option>
                                <option name="">Barbados</option>
                                <option name="">Bélgica</option>
                                <option name="">Belice</option>
                                <option name="">Benin</option>
                                <option name="">Bermudas</option>
                                <option name="">Bielorrusia</option>
                                <option name="">Birmania</option>
                                <option name="">Bolivia</option>
                                <option name="">Bosnia y Herzegovina</option>
                                <option name="">Botswana</option>
                                <option name="">Brasil</option>
                                <option name="">Brunei</option>
                                <option name="">Bulgaria</option>
                                <option name="">Burkina Faso</option>
                                <option name="">Burundi</option>
                                <option name="">Bután</option>
                                <option name="">Cabo Verde</option>
                                <option name="">Camboya</option>
                                <option name="">Camerún</option>
                                <option name="">Canadá</option>
                                <option name="">Chad</option>
                                <option name="">Chile</option>
                                <option name="">China</option>
                                <option name="">Chipre</option>
                                <option name="">Ciudad del Vaticano (Santa Sede)</option>
                                <option name="">Colombia</option>
                                <option name="">Comores</option>
                                <option name="">Congo</option>
                                <option name="">Congo, República Democrática del</option>
                                <option name="">Corea</option>
                                <option name="">Corea del Norte</option>
                                <option name="">Costa de Marfíl</option>
                                <option name="">Costa Rica</option>
                                <option name="">Croacia (Hrvatska)</option>
                                <option name="">Cuba</option>
                                <option name="">Dinamarca</option>
                                <option name="">Djibouti</option>
                                <option name="">Dominica</option>
                                <option name="">Ecuador</option>
                                <option name="">Egipto</option>
                                <option name="">El Salvador</option>
                                <option name="">Emiratos Árabes Unidos</option>
                                <option name="">Eritrea</option>
                                <option name="">Eslovenia</option>
                                <option name="" selected>España</option>
                                <option name="">Estados Unidos</option>
                                <option name="">Estonia</option>
                                <option name="">Etiopía</option>
                                <option name="">Fiji</option>
                                <option name="">Filipinas</option>
                                <option name="">Finlandia</option>
                                <option name="">Francia</option>
                                <option name="">Gabón</option>
                                <option name="">Gambia</option>
                                <option name="">Georgia</option>
                                <option name="">Ghana</option>
                                <option name="">Gibraltar</option>
                                <option name="">Granada</option>
                                <option name="">Grecia</option>
                                <option name="">Groenlandia</option>
                                <option name="">Guadalupe</option>
                                <option name="">Guam</option>
                                <option name="">Guatemala</option>
                                <option name="">Guayana</option>
                                <option name="">Guayana Francesa</option>
                                <option name="">Guinea</option>
                                <option name="">Guinea Ecuatorial</option>
                                <option name="">Guinea-Bissau</option>
                                <option name="">Haití</option>
                                <option name="">Honduras</option>
                                <option name="">Hungría</option>
                                <option name="">India</option>
                                <option name="">Indonesia</option>
                                <option name="">Irak</option>
                                <option name="">Irán</option>
                                <option name="">Irlanda</option>
                                <option name="">Isla Bouvet</option>
                                <option name="">Isla de Christmas</option>
                                <option name="">Islandia</option>
                                <option name="">Islas Caimán</option>
                                <option name="">Islas Cook</option>
                                <option name="">Islas de Cocos o Keeling</option>
                                <option name="">Islas Faroe</option>
                                <option name="">Islas Heard y McDonald</option>
                                <option name="">Islas Malvinas</option>
                                <option name="">Islas Marianas del Norte</option>
                                <option name="">Islas Marshall</option>
                                <option name="">Islas menores de Estados Unidos</option>
                                <option name="">Islas Palau</option>
                                <option name="">Islas Salomón</option>
                                <option name="">Islas Svalbard y Jan Mayen</option>
                                <option name="">Islas Tokelau</option>
                                <option name="">Islas Turks y Caicos</option>
                                <option name="">Islas Vírgenes (EEUU)</option>
                                <option name="">Islas Vírgenes (Reino Unido)</option>
                                <option name="">Islas Wallis y Futuna</option>
                                <option name="">Israel</option>
                                <option name="">Italia</option>
                                <option name="">Jamaica</option>
                                <option name="">Japón</option>
                                <option name="">Jordania</option>
                                <option name="">Kazajistán</option>
                                <option name="">Kenia</option>
                                <option name="">Kirguizistán</option>
                                <option name="">Kiribati</option>
                                <option name="">Kuwait</option>
                                <option name="">Laos</option>
                                <option name="">Lesotho</option>
                                <option name="">Letonia</option>
                                <option name="">Líbano</option>
                                <option name="">Liberia</option>
                                <option name="">Libia</option>
                                <option name="">Liechtenstein</option>
                                <option name="">Lituania</option>
                                <option name="">Luxemburgo</option>
                                <option name="">Macedonia, Ex-República Yugoslava de</option>
                                <option name="">Madagascar</option>
                                <option name="">Malasia</option>
                                <option name="">Malawi</option>
                                <option name="">Maldivas</option>
                                <option name="">Malí</option>
                                <option name="">Malta</option>
                                <option name="">Marruecos</option>
                                <option name="">Martinica</option>
                                <option name="">Mauricio</option>
                                <option name="">Mauritania</option>
                                <option name="">Mayotte</option>
                                <option name="">México</option>
                                <option name="">Micronesia</option>
                                <option name="">Moldavia</option>
                                <option name="">Mónaco</option>
                                <option name="">Mongolia</option>
                                <option name="">Montserrat</option>
                                <option name="">Mozambique</option>
                                <option name="">Namibia</option>
                                <option name="">Nauru</option>
                                <option name="">Nepal</option>
                                <option name="">Nicaragua</option>
                                <option name="">Níger</option>
                                <option name="">Nigeria</option>
                                <option name="">Niue</option>
                                <option name="">Norfolk</option>
                                <option name="">Noruega</option>
                                <option name="">Nueva Caledonia</option>
                                <option name="">Nueva Zelanda</option>
                                <option name="">Omán</option>
                                <option name="">Países Bajos</option>
                                <option name="">Panamá</option>
                                <option name="">Papúa Nueva Guinea</option>
                                <option name="">Paquistán</option>
                                <option name="">Paraguay</option>
                                <option name="">Perú</option>
                                <option name="">Pitcairn</option>
                                <option name="">Polinesia Francesa</option>
                                <option name="">Polonia</option>
                                <option name="">Portugal</option>
                                <option name="">Puerto Rico</option>
                                <option name="">Qatar</option>
                                <option name="">Reino Unido</option>
                                <option name="">República Centroafricana</option>
                                <option name="">República Checa</option>
                                <option name="">República de Sudáfrica</option>
                                <option name="">República Dominicana</option>
                                <option name="">República Eslovaca</option>
                                <option name="">Reunión</option>
                                <option name="">Ruanda</option>
                                <option name="">Rumania</option>
                                <option name="">Rusia</option>
                                <option name="">Sahara Occidental</option>
                                <option name="">Saint Kitts y Nevis</option>
                                <option name="">Samoa</option>
                                <option name="">Samoa Americana</option>
                                <option name="">San Marino</option>
                                <option name="">San Vicente y Granadinas</option>
                                <option name="">Santa Helena</option>
                                <option name="">Santa Lucía</option>
                                <option name="">Santo Tomé y Príncipe</option>
                                <option name="">Senegal</option>
                                <option name="">Seychelles</option>
                                <option name="">Sierra Leona</option>
                                <option name="">Singapur</option>
                                <option name="">Siria</option>
                                <option name="">Somalia</option>
                                <option name="">Sri Lanka</option>
                                <option name="">St Pierre y Miquelon</option>
                                <option name="">Suazilandia</option>
                                <option name="">Sudán</option>
                                <option name="">Suecia</option>
                                <option name="">Suiza</option>
                                <option name="">Surinam</option>
                                <option name="">Tailandia</option>
                                <option name="">Taiwán</option>
                                <option name="">Tanzania</option>
                                <option name="">Tayikistán</option>
                                <option name="">Territorios franceses del Sur</option>
                                <option name="">Timor Oriental</option>
                                <option name="">Togo</option>
                                <option name="">Tonga</option>
                                <option name="">Trinidad y Tobago</option>
                                <option name="">Túnez</option>
                                <option name="">Turkmenistán</option>
                                <option name="">Turquía</option>
                                <option name="">Tuvalu</option>
                                <option name="">Ucrania</option>
                                <option name="">Uganda</option>
                                <option name="">Uruguay</option>
                                <option name="">Uzbekistán</option>
                                <option name="">Vanuatu</option>
                                <option name="">Venezuela</option>
                                <option name="">Vietnam</option>
                                <option name="">Yemen</option>
                                <option name="">Yugoslavia</option>
                                <option name="">Zambia</option>
                                <option name="">Zimbabue</option>

                            </select>

                            <p class="header">Temperatura</p>
                            <input type="text" name="temperatura" placeholder="Temperatura" required="" >

                            <p class="header">Piso Termico</p>
                            <select class="sign-in" name="piso_termico" required="">
                                <option name="">Glacial</option>
                                <option name="">Paramo</option>
                                <option name="">Frio</option>
                                <option name="">Medio</option>
                                <option name="">Calidad</option>
                            </select>

                             <p class="header">Fecha Registro</p>
                           <input type="datetime-local" name="fecha_registro" placeholder="Fecha Registro"  required="">

                            <p class="header">Geologo</p>
                            <select class="sign-in" name="geologo" >
                                <option value="">Seleccione Geologo</option>
                                <% for (BeanGeologo bGeo : DAO.DaoGeologo.ListarGeologo()) {%>
                                <option value="<%=bGeo.getId_geologo()%>"><%=bGeo.getNombre()%></option>
                                <%}%>
                            </select>
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


