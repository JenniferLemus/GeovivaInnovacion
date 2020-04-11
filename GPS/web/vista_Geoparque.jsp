<%-- 
    Document   : vista_Geoparque
    Created on : 04-dic-2018, 21:54:34
    Author     : sebastian
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DAO.DaoGeoparque"%>
<%@page import="BEAN.BeanGeoparque"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>Vista Geoparque</title>
    </head>
    <body>
   
        <table class="table">
            <tr>
                <th>id_geoparque</th>
                <th>nombre</th>
                <th>latitut</th>
                <th>longitud</th>
                <th>Pais</th>
                <th>temperatura</th>
                <th>piso_termico</th>
                <th>fecha_registro</th>
                <th>fk_geologo</th>

            </tr>
            <%
              BeanGeoparque bGeoparque = new BeanGeoparque();
              DaoGeoparque dGeoparque = new DaoGeoparque();
              ArrayList<BeanGeoparque> listaGeoparque = dGeoparque.listar();
              for (int i = 0; i < listaGeoparque.size(); i++) {
                bGeoparque = listaGeoparque.get(i);
            %>
            <tr>
                <td><%= bGeoparque.getId_geoparque()%></td>
                <td><%= bGeoparque.getNombre()%></td>
                <td><%= bGeoparque.getLatitud()%></td>
                <td><%= bGeoparque.getLongitud()%></td>
                <td><%= bGeoparque.getPais()%></td>
                <td><%= bGeoparque.getTemperatura()%></td>
                <td><%= bGeoparque.getPiso_termico()%></td>
                <td><%= bGeoparque.getFecha_registro()%></td>
                <td><%= bGeoparque.getFk_geologo()%></td>
            </tr>
            <% }%>
        </table>
        <form method="post"  action="Geoparque">
            <input type="hidden" name="opcion" value="3">
            <input type="number" required="" name="id_geoparque">
            <button type="submit">Buscar</button>
        </form> 

        <%
                  if (request.getAttribute("error") != null) {%>
        ${error}
        <%}%>
    </body>
</html>
