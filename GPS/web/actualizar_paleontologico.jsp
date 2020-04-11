<%-- 
    Document   : actualizar_paleontologico
    Created on : 4/12/2018, 02:25:02 PM
    Author     : Aprendiz
--%>

<%@page import="BEAN.BeanPaleontologico"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>Actualizar Paleontologico</title>
    </head>
    <body>
        <h1 id="Tit">Actualizar Paleontologico</h1>
        <form id=" form"method="post" action="Paleontologico">
            <% BeanPaleontologico bPaleontologico = (BeanPaleontologico) request.getAttribute("bPaleontologico");
              if (bPaleontologico != null) {%>

            <div class="form-group">
                <label>ID</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="ID" required="" name="id_paleontologico" value="<%=bPaleontologico.getId_paleontologico()%>" >
            </div>

            <div class="form-group">
                <label>NOMBRE</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="NOMBRE" required="" name="nombre" value="<%=bPaleontologico.getNombre()%>" >
            </div>

            <div class="form-group">
                <label>LOCALIDAD</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="LOCALIDAD" required="" name="localidad" value="<%=bPaleontologico.getLocalidad()%>" >
            </div>

            <div class="form-group">
                <label>CAPAS</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="CAPAS" required="" name="capas" value="<%=bPaleontologico.getCapas()%>" >
            </div>

            <div class="form-group">
                <label>FOSILES</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="FOSILES" required="" name="fosiles" value="<%=bPaleontologico.getFosiles()%>" >
            </div>

            <div class="form-group">
                <label>TIPO ROCA</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="TIPO ROCA" required="" name="tipo_roca" value="<%=bPaleontologico.getTipo_roca()%>" >
            </div>

            <div class="form-group">
                <label>TIPO</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="TIPO" required="" name="tipo" value="<%=bPaleontologico.getTipo()%>" >
            </div>



            ERA<br>
            <input type="text" name="fk_era" required="" value="<%=bPaleontologico.getFk_era()%>"><br><br>

            PERIODO<br>
            <input type="text"name="fk_periodo" required="" value="<%=bPaleontologico.getFk_periodo()%>"><br><br>

            </th>

            </tr>
            </table>
            <%} else {%>
            <table width="500" height="80" border="1">

                <th 

            <th    id="Tit">ID <br>
                <input type="text"   name="id_paleontologico" ><br><br>

                NOMBRE<br>
                <input type="text"   name="nombre" ><br><br>

                LOCALIDAD<br>
                <input type="text" name="localidad"><br><br>

                CAPAS<br>
                <input type="text" name="capas" ><br><br>

                FOSILES<br>
                <input type="text" name="fosiles" ><br><br>

                TIPO ROCA<br>
                <input type="text" name="tipo_roca"><br><br>


                TIPO<br>
                <input type="text" name="tipo" ><br><br>


                ERA<br>
                <input type="text" name="fk_era"><br><br>

                PERIODO<br>
                <input type="text"name="fk_periodo"><br><br>
            </th>

        </table>

        <%}%>

        <button id="boton" >Actualizar</button><br><br>
        <input type="hidden" name="opcion" value="2"><br>
    </form>
    <a href="Vista_paleontologico.jsp"><button id="boton" >Atras</button></a>


</center>
<%
  if (request.getAttribute("error") != null) {%>
${error}
<%} else {%>
${exito}
<%}%> 
</body>
</html>
