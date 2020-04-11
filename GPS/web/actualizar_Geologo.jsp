<%-- 
    Document   : actualizar_Geologo
    Created on : 04-dic-2018, 21:16:00
    Author     : sebastian
--%>

<%@page import="BEAN.BeanGeologo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1 id="Tit">Actualizar Geologo</h1>
        <form id=" form"method="post" action="Geologo">
            <% BeanGeologo bGeologo = (BeanGeologo) request.getAttribute("bGeologo");
                if (bGeologo != null) {%>


            <div class="form-group">
                <label>ID</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="ID" name="geologo" required="" value="<%=bGeologo.getId_geologo()%>" >
            </div>
            
                        <div class="form-group">
                <label>NOMBRE</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="NOMBRE" name="nombre" required="" value="<%=bGeologo.getNombre()%>" >
            </div>

            <div class="form-group">
                <label>APELIIDO</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="APELLIDO" name="apellido" required="" value="<%=bGeologo.getApellido()%>" >
            </div>

            <div class="form-group">
                <label>TELEFONO</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="TELEFONO" name="telefono" required="" value="<%=bGeologo.getTelefono()%>" >
            </div>

            <div class="form-group">
                <label>TIPO DOCUMENTO</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="TIPO DOCUMENTO" name="tipoDocumento" required="" value="<%=bGeologo.getTipoDocumento()%>" >
            </div>

            <div class="form-group">
                <label>NUMERO DOCUMENTO</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="NUMERO DOCUMENTO" name="numeroDocumento" required="" value="<%=bGeologo.getNumeroDocumento()%>" >
            </div>

            <div class="form-group">
                <label>CORREO</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="CORREO" name="correo" required="" value="<%=bGeologo.getCorreo()%>" >
            </div>

            <div class="form-group">
                <label>ENTIDAD</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="ENTIDAD" name="entidad" required="" value="<%=bGeologo.getEntidad()%>" >
            </div>



            </table>

    </center>
            
            <%} else {%>
            <table width="500" height="80" border="1">

                <th 

            <th id="Tit">ID <br>
                <input type="text"   name="geologo" <br><br>

            <th id="Tit">NOMBRE <br>
                <input type="text"   name="nombre" <br><br>

                APELLIDO<br>
                <input type="text" name="apellido" <br><br>

                TELEFONO<br>
                <input type="text" name="telefono" <br><br>

                TIPO DOCUMENTO<br>
                <input type="text" name="tipoDocumento"<br><br>

                NUMERO DOCUMENTO<br>
                <input type="text" name="numeroDocumento"<br><br>


                CORREO<br>
                <input type="text" name="correo"<br><br>

                ENTIDAD<br>
                <input type="text" name="entidad"<br><br>

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
