<%-- 
    Document   : vista_geositio
    Created on : 02-dic-2018, 16:16:00
    Author     : sebastian
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DAO.DaoGeositio"%>
<%@page import="BEAN.BeanGeositio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>Vista Geositio</title>
    </head>
    <body>

        
        <table class="table">
            <tr>
                
                <th>id_Geositio</th>
                <th>latitud</th>
                <th>longitud</th>
                <th>tipo_geositio</th>
                <th>fk_geoparque</th>


            </tr>
            <%
              BeanGeositio bGeositio = new BeanGeositio();
              DaoGeositio dGeositio = new DaoGeositio();
              ArrayList<BeanGeositio> listaGeositio = dGeositio.listar();
              for (int i = 0; i < listaGeositio.size(); i++) {
                bGeositio = listaGeositio.get(i);
            %>
            <tr>
                <td><%= bGeositio.getIdGeositio()%></td>
                <td><%= bGeositio.getLaitud()%></td>
                <td><%= bGeositio.getLongitud()%></td>
                <td><%= bGeositio.getFk_tipo_geositio()%></td>
                <td><%= bGeositio.getFk_geoparque()%></td>
            </tr>
            <% }%>
        </table>
        <form method="post" action="Geositio">
            <input type="hidden" name="opcion" value="3">
            <input type="number" name="id">
            <button type="submit">Buscar</button>
        </form>

        <%
                  if (request.getAttribute("error") != null) {%>
        ${error}
        <%}%>
    </body>
</html>
