<%-- 
    Document   : actualizar_Geositio
    Created on : 04-dic-2018, 21:39:34
    Author     : sebastian
--%>

<%@page import="BEAN.BeanGeositio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body>
        <h1 id="Tit">Actualizar geositio</h1>
        <form id=" form"method="post" action="Geositio">
            <% BeanGeositio bGeositio = (BeanGeositio) request.getAttribute("bGeositio");
              if (bGeositio != null) {%>


            <div class="form-group">
                <label>ID</label>
                <input type="text" class="form-control" id="exampleInputPassword1" required="" placeholder="ID" name="id" value="<%=bGeositio.getIdGeositio()%>" >
            </div>

            <div class="form-group">
                <label>LATITUD</label>
                <input type="text" class="form-control" id="exampleInputPassword1" required="" placeholder="LATITUD" name="latitud" value="<%=bGeositio.getLaitud()%>" >
            </div>

            <div class="form-group">
                <label>LONGITUD</label>
                <input type="text" class="form-control" id="exampleInputPassword1" required="" placeholder="LONGITUD" name="longitud" value="<%=bGeositio.getLongitud()%>" >
            </div>
            
            TIPO GEOSITIO<br>
            <input type="text" name="tipo_geositio" required="" value="<%=bGeositio.getFk_tipo_geositio()%>"><br><br>

            geoparque<br>
            <input type="text" name="fk_geoparque" required="" value="<%=bGeositio.getFk_geoparque()%>"><br><br>



            </th>

            </tr>
            </table>
            <%} else {%>
            <table width="500" height="80" border="1">

                <th 

            <th id="Tit">ID <br>
                <input type="text"   name="id"<br><br>

            <th id="Tit">LATITUT<br>
                <input type="text"   name="latitud"<br><br>

                LONGITUD<br>
                <input type="text" name="longitud"<br><br>

                TIPO GEOSITIO<br>
                <input type="text" name="tipo_geositio"<br><br>

                geoparque<br>
                <input type="text" name="fk_geoparque"<br><br>



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
