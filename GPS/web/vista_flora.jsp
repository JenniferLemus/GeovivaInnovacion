<%-- 
    Document   : vista_flora
    Created on : 02-dic-2018, 17:01:10
    Author     : sebastian
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DAO.DaoFlora"%>
<%@page import="BEAN.BeanFlora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>Vista Flora</title>
    </head>
    <body>

 
        <table class="table">
            <tr>
                <th>id_flora</th>
                <th>tipo</th>
                <th>numero Individuos</th>
                <th>tamaño</th>
                <th>fk_geositio</th>
                <th>fk_guardabosques</th>

            </tr>
            <%
              BeanFlora bFlora = new BeanFlora();
              DaoFlora dFlora = new DaoFlora();
              ArrayList<BeanFlora> listaFlora = dFlora.listar();
              for (int i = 0; i < listaFlora.size(); i++) {
                bFlora = listaFlora.get(i);
            %>
            <tr>
                <td><%= bFlora.getId_flora()%></td>
                <td><%= bFlora.getTipo()%></td>
                <td><%= bFlora.getNumeroIndividuos()%></td>
                <td><%= bFlora.getTamano()%></td>
                <td><%= bFlora.getFk_geositio()%></td>
                <td><%= bFlora.getFk_guardabosques()%></td>
            </tr>
            <% }%>
        </table>
        
        <form method="post" action="Flora">
            <input type="hidden" name="opcion" value="3">
            <input type="number" name="id_flora">
            <button type="submit">Buscar</button>
        </form>

        <%
                  if (request.getAttribute("error") != null) {%>
        ${error}
        <%}%>

    </body>
</html>
