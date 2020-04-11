<%-- 
    Document   : actualizar_Geologico
    Created on : 4/12/2018, 12:34:37 PM
    Author     : UserData08
--%>

<%@page import="BEAN.BeanYacimientoGeologico"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>EDITAR GEOLOGICO</title>
    </head>
    <body>
        <h1 id="Tit">Actualizar Geologico</h1>
        <form id=" form"method="post" action="AccidenteGeologico">
            <% BeanYacimientoGeologico bGeologico = (BeanYacimientoGeologico) request.getAttribute("bGeologico");
                if (bGeologico != null) {%>
                <center>

            <div class="form-group">
                <label>ID</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="ID" name="id_Geologico" required="" value="<%=bGeologico.getId_Geologico()%>" >
            </div>

            <div class="form-group">
                <label>NOMBRE</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="NOMBRE" name="nombre" required="" value="<%=bGeologico.getNombre()%>" >
            </div>

            <div class="form-group">
                <label>UBICACION</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="UBICACION" name="ubicacion" required="" value="<%=bGeologico.getUbicacion()%>" >
            </div>

            <div class="form-group">
                <label>ELEVACION</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="ELEVACION" name="elevacion" required="" value="<%=bGeologico.getElevacion()%>" >
            </div>

            <div class="form-group">
                <label>PENDIENTE</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="PENDIENTE" name="pendiente" required="" value="<%=bGeologico.getPendiente()%>" >
            </div>

            <div class="form-group">
                <label>ORIENTACION</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="ORIENTACION" name="orientacion" required="" value="<%=bGeologico.getOrientacion()%>" >
            </div>

            <div class="form-group">
                <label>ESTRATIFICACION</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="ESTRATIFICACION" name="estratificacion" required="" value="<%=bGeologico.getEstratificacion()%>" >
            </div>

            <div class="form-group">
                <label>FORMACION ROCOSA</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="FORMACION ROCOSA" name="formacion_rocosa" required="" value="<%=bGeologico.getFormacion_rocosa()%>" >
            </div>

          <div class="form-group">
                <label>TIPO SUELO</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="TIPO SUELO" name="tipo_suelo" required="" value="<%=bGeologico.getTipo_suelo()%>" >
            </div>


            ERA<br>
            <input type="text"name="fk_era" required="" value="<%=bGeologico.getFk_era()%>"><br><br>

            PERIODO<br>
            <input type="text"name="fk_periodo" required="" value="<%=bGeologico.getFk_periodo()%>"><br><br>

           

                </center>

            <%} else {%>
            <table width="500" height="80" border="1">

                <th 

                    id="Tit">ID <br>
                    <input type="text"   name="geologico"<br><br>

                    NOMBRE <br>
                    <input type="text"   name="nombre"<br><br>

                    UBICACION<br>
                    <input type="text" name="ubicacion"<br><br>

                    ELEVACION<br>
                    <input type="text" name="elevacion"<br><br>

                    PENDIENTE<br>
                    <input type="text" name="pendiente"<br><br>

                    ORIENTACION<br>
                    <input type="text" name="orientacion"<br><br>


                    ESTRATIFICACION<br>
                    <input type="text" name="estratificacion"<br><br>


                    FORMACION_ROCOSA<br>
                    <input type="text" name="formacion_rocosa"<br><br>

                    TIPO_SUELO<br>
                    <input type="text"name="tipo_suelo"<br><br>

                    ERA<br>
                    <input type="text"name="foranea_era"<br><br>

                    PERIODO<br>
                    <input type="text"name="foranea_periodo"<br><br>
                </th>

            </table>

            <%}%>

            <button id="boton" >Actualizar</button><br><br>
            <input type="hidden" name="opcion" value="2"><br>
        </form>
        <a href="Vista_Geologico.jsp"><button id="boton" >Atras</button></a>


    </center>
    <%
        if (request.getAttribute("error") != null) {%>
    ${error}
    <%} else {%>
    ${exito}
    <%}%> 

</body>
</html>
