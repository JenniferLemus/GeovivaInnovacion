<%-- 
    Document   : Vista_Geologo
    Created on : 27/11/2018, 09:19:59 AM
    Author     : UserData06
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DAO.DaoGeologo"%>
<%@page import="BEAN.BeanGeologo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>Vista Geologo</title>
    </head>
    <body>

        
        <table class="table">
            <tr>
                <th scope="col" >id_geologo</th>
                <th>nombre</th>
                <th>apellido</th>
                <th>telefono</th>
                <th>tipoDocumento</th>
                <th>numeroDocumento</th>
                <th>correo</th>
                <th>entidad</th>
            </tr>
            <%
                BeanGeologo bGeo = new BeanGeologo();
                DaoGeologo dGeo = new DaoGeologo();
                ArrayList<BeanGeologo> listaGeologos = dGeo.listar();
                for (int i = 0; i < listaGeologos.size(); i++) {
                    bGeo = listaGeologos.get(i);
            %>
            <tr>
                <td><%= bGeo.getId_geologo()%></td>
                <td><%= bGeo.getNombre()%></td>
                <td><%= bGeo.getApellido()%></td>
                <td><%= bGeo.getTelefono()%></td>
                <td><%= bGeo.getTipoDocumento()%></td>
                <td><%= bGeo.getNumeroDocumento()%></td>
                <td><%= bGeo.getCorreo()%></td>
                <td><%= bGeo.getEntidad()%></td>
            </tr>
            <% }%>
        </table>
        
        <form method="post" action="Geologo">
            <input type="hidden" name="opcion" value="3">
            <input type="number" name="geologo">
            <button type="submit">Buscar</button>
        </form>

        <%
                    if (request.getAttribute("error") != null) {%>
        ${error}
        <%}%>
    </body>
</html>
