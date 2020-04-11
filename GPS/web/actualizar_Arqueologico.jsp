<%-- 
    Document   : actualizar_Arqueologico
    Created on : 3/12/2018, 09:23:27 AM
    Author     : UserData07
--%>

<%@page import="BEAN.BeanPeriodo"%>
<%@page import="BEAN.BeanEra"%>
<%@page import="BEAN.BeanArqueologico"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Actualizar Arqueologico</title>
    </head>
    <body>
    <Center>

        <h1 id="Tit">Actualizar Arqueologico</h1>
        <form id=" form"method="post" action="Arqueologico">
            <% BeanArqueologico bArqueologico = (BeanArqueologico) request.getAttribute("bArqueologico");
                if (bArqueologico != null) {%>




            <div class="form-group">
                <label>ID</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="ID" name="id_arqueologico" required="" value="<%=bArqueologico.getId_arqueologico()%>" >
            </div>

            <div class="form-group">
                <label>NOMBRE</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="NOMBRE" name="nombre" required="" value="<%=bArqueologico.getNombre()%>" >
            </div>

            <div class="form-group">
                <label>UBICACION</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="UBICACION" name="ubicacion" required="" value="<%=bArqueologico.getUbicacion()%>" >
            </div>

            <div class="form-group">
                <label>CULTURA</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="CULTURA" name="ubicacion" required="" value="<%=bArqueologico.getCultura()%>" >
            </div>

            <div class="form-group">
                <label>FORMACION</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="FORMACION" name="formacion" value="<%=bArqueologico.getFormacion()%>" >
            </div>

            <div class="form-group">
                <label>CRONOLOGICO</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="CRONOLOGICO" name="cronologico" required="" value="<%=bArqueologico.getCronologico()%>" >
            </div>

            <div class="form-group">
                <label>FUNCIONAL</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="FUNCIONAL" name="funcional" required="" value="<%=bArqueologico.getFuncional()%>" >
            </div>

            <div class="form-group">
                <label>TIPOLOGIA</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="TIPOLOGIA" name="tipologia" required="" value="<%=bArqueologico.getTipologia()%>" >
            </div>

            <div class="form-group">
                <label>DURACION</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="DURACION" name="duracion" required="" value="<%=bArqueologico.getDuracion()%>" >
            </div>
  

            ERA<br>
            <input type="text"name="foranea_era" required="" value="<%=bArqueologico.getFk_era()%>"><br><br>


            PERIODO<br>
            <input type="text"name="foranea_periodo" required="" value="<%=bArqueologico.getFk_periodo()%>"><br><br>

            
       <button id="boton" >Actualizar</button><br><br>
            <input type="hidden" name="opcion" value="2"><br>
        </form>


            <%} else {%>

            <%}%>




    </center>
    <%
        if (request.getAttribute("error") != null) {%>
    ${error}
    <%} else {%>
    ${exito}
    <%}%> 

</body>
</html>

</html>
