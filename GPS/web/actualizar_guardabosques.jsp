<%-- 
    Document   : actualizar_guardabosques
    Created on : 4/12/2018, 01:41:45 PM
    Author     : Aprendiz
--%>

<%@page import="BEAN.BeanGuardabosques"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>Actualizar Guardabosques</title>
    </head>
    <body>
        <h1 id="Tit">Actualizar GuardaBosques</h1>
        <form id=" form"method="post" action="Guardabosques">
            <% BeanGuardabosques bGuarda = (BeanGuardabosques) request.getAttribute("bGuardabosques");
                if (bGuarda != null) {%>

            <div class="form-group">
                <label>ID</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="ID" name="id_guarda" required="" value="<%=bGuarda.getId_guarda()%>" >
            </div>

            <div class="form-group">
                <label>NOMBRE</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="NOMBRE" name="nombre" required="" value="<%=bGuarda.getNombre()%>" >
            </div>

            <div class="form-group">
                <label>APELLIDO</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="APELLIDO" name="apellido" required="" value="<%=bGuarda.getApellido()%>" >
            </div>

            <div class="form-group">
                <label>TELEFONO</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="TELEFONO" name="telefono" required="" value="<%=bGuarda.getTelefono()%>" >
            </div>

            <div class="form-group">
                <label>POBLACION ALEDAÑA</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="POBLACION ALEDAÑA" name="poblacionAledaña" required="" value="<%=bGuarda.getPoblacionAledaña()%>" >
            </div>

            <div class="form-group">
                <label>TIPO DOCUMENTO</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="TIPO DOCUMENTO" name="TipoDocumento" required="" value="<%=bGuarda.getTipoDocumento()%>" >
            </div>

            <div class="form-group">
                <label>NUMERO DOCUMENTO</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="NUMERO DOCUMENTO" name="numeroDocumento" required="" value="<%=bGuarda.getNumeroDocumento()%>" >
            </div>






            <%} else {%>
            <table width="500" height="80" border="1">

                <th 

            <th id="Tit">ID <br>
                <input type="text"   name="id_guarda"><br><br>

            <th id="Tit">NOMBRE <br>
                <input type="text"   name="nombre"><br><br>

                APELLIDO<br>
                <input type="text" name="apellido"<br><br>

                TELEFONO<br>
                <input type="text" name="telefono"><br><br>

                POBLACION ALEDAÑA<br>
                <input type="text" name="poblacionAledaña"><br><br>

                TIPO DOCUMENTO<br>
                <input type="text" name="TipoDocumento"><br><br>


                NUMERO DOCUMENTO<br>
                <input type="text" name="numeroDocumento"><br><br>

            </th>

        </table>

        <%}%>

        <button id="boton" >Actualizar</button><br><br>
        <input type="hidden" name="opcion" value="2"><br>
    </form>
    <a href="Vista_Guardabosques.jsp"><button id="boton" >Atras</button></a>


</center>
<%
    if (request.getAttribute("error") != null) {%>
${error}
<%} else {%>
${exito}
<%}%> 
</body>
</html>
