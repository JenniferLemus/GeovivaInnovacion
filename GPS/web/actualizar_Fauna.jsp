<%-- 
    Document   : actualizar_Fauna
    Created on : 4/12/2018, 02:55:29 PM
    Author     : Aprendiz
--%>

<%@page import="BEAN.BeanFauna"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Actualizar Fauna</title>
    </head>
    <body>
        <h1 id="Tit">Actualizar Fauna</h1>
        <form id=" form"method="post" action="Fauna">
            <% BeanFauna bFauna = (BeanFauna) request.getAttribute("bFauna");
                if (bFauna != null) {%>


            <div class="form-group">
                <label>ID</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="ID" name="id_fauna" required="" value="<%=bFauna.getId_fauna()%>" >
            </div>

            <div class="form-group">
                <label>ESPECIE</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="ESPECIE" name="especie" required="" value="<%=bFauna.getEspecie()%>" >
            </div>

            <div class="form-group">
                <label>ECOSISTEMA</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="ECOSISTEMA" name="Ecosistema" required="" value="<%=bFauna.getEcosistema()%>" >
            </div>

            <div class="form-group">
                <label>HABITAT</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="HABITAT" name="habitat" required="" value="<%=bFauna.getHabitat()%>" >
            </div>

            <div class="form-group">
                <label>TIPO</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="TIPO" name="tipo" required="" value="<%=bFauna.getTipo()%>" >
            </div>


            <div class="form-group">
                <label>Geositio</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="GEOSITIO" name="fk_geositio" required="" value="<%=bFauna.getFk_geositio()%>" >
            </div>


            <div class="form-group">
                <label>GUARDA BOSQUES</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="GUARDA BOSQUES" name="fk_guardabosques" required="" value="<%=bFauna.getFk_guardabosques()%>" >
            </div>
            
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
