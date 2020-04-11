<%-- 
    Document   : actualizar_geoparque
    Created on : 04-dic-2018, 22:27:59
    Author     : sebastian
--%>

<%@page import="BEAN.BeanGeoparque"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    </head>
    <body>
        <h1 id="Tit">Actualizar GuardaBosques</h1>
        <form id=" form"method="post" action="Geoparque">
            <% BeanGeoparque bGuarda = (BeanGeoparque) request.getAttribute("bGeoparque");
              if (bGuarda != null) {%>

            <div class="form-group">
                <label>ID</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="ID" name="id_geoparque" required="" value="<%=bGuarda.getId_geoparque()%>" >
            </div>

            <div class="form-group">
                <label>NOMBRE</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="NOMBRE" name="nombre" required="" value="<%=bGuarda.getNombre()%>" >
            </div>


            <div class="form-group">
                <label>LATITUD</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="LATITUD" name="latitud" required="" value="<%=bGuarda.getLatitud()%>" >
            </div>

            <div class="form-group">
                <label>LONGITUD</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="LONGITUD" name="longitud" required="" value="<%=bGuarda.getLongitud()%>" >
            </div>


            <div class="form-group">
                <label>PAIS</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="PAIS" name="Pais" required="" value="<%=bGuarda.getPais()%>" >
            </div>

            <div class="form-group">
                <label>TEMPERATURA</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="TEMPERATURA" name="temperatura" required="" value="<%=bGuarda.getTemperatura()%>" >
            </div>


<div class="form-group">
                <label>PISO TERMICO</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="PISO TERMICO" name="piso_termico" required="" value="<%=bGuarda.getPiso_termico()%>" >
            </div>

<div class="form-group">
                <label>FECHA REGISTRO</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="FECHA REGISTRO" name="fecha_registro" required="" value="<%=bGuarda.getFecha_registro()%>" >
            </div>



            GEOLOGO<br>
            <input type="text" name="geologo" value="<%=bGuarda.getFk_geologo()%>"><br><br>
            </th>

            </tr>
            </table>
            <%} else {%>
            <table width="500" height="80" border="1">

                <th 
            <th id="Tit">ID <br>
                <input type="text"   name="id_geoparque"<br><br>

            <th id="Tit">NOMBRE<br>
                <input type="text"   name="nombre"<br><br>

                LATITUD<br>
                <input type="text" name="latitud" <br><br>

                LONGITUD<br>
                <input type="text" name="longitud"<br><br>

                Pais<br>
                <input type="text" name="Pais" <br><br>

                TEMPERATURA<br>
                <input type="text" name="temperatura"<br><br>

                PISO TERMICO<br>
                <input type="text" name="piso_termico"<br><br>

                FECHA REGISTRO<br>
                <input type="text" name="fecha_registro" <br><br>

                GEOLOGO<br>
                <input type="text" name="geologo"<br><br>
            </th>

        </table>

        <%}%>

        <button id="boton" >Actualizar</button><br><br>
        <input type="hidden" name="opcion" value="2"><br>
    </form>
    <a href="Vista_Geologo.jsp"><button id="boton" >Atras</button></a>


</center>
<%
  if (request.getAttribute("error") != null) {%>
${error}
<%} else {%>
${exito}
<%}%> 
</body>
</html>
