<%-- 
    Document   : vista_paleontologico
    Created on : 02-dic-2018, 16:51:03
    Author     : sebastian
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DAO.DaoPaleontologico"%>
<%@page import="BEAN.BeanPaleontologico"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body>
       
        <table class="table">
                <tr>
                    <th>id_paleontologico</th>
                    <th>nombre</th>
                    <th>localidad</th>
                    <th>capas</th>
                    <th>fosiles</th>
                    <th>tipo_roca</th>
                    <th>tipo</td>
                    <th>fk_era</th>
                    <th>fk_periodo</th>
                </tr>
                <%
                    BeanPaleontologico bPale = new BeanPaleontologico();
                    DaoPaleontologico dPale = new DaoPaleontologico();
                    ArrayList<BeanPaleontologico> listaPale = dPale.listar();
                    for (int i = 0; i < listaPale.size(); i++) {
                        bPale = listaPale.get(i);
                %>
                <tr>
                    <td><%= bPale.getId_paleontologico()%></td>
                    <td><%= bPale.getNombre()%></td>
                    <td><%= bPale.getLocalidad()%></td>
                    <td><%= bPale.getCapas()%></td>
                    <td><%= bPale.getFosiles()%></td>
                    <td><%= bPale.getTipo_roca()%></td>
                    <td><%= bPale.getTipo()%></td>
                    <td><%= bPale.getFk_era()%></td>
                    <td><%= bPale.getFk_periodo()%></td>
                </tr>
                <% }%>
            </table>
            
             <form method="post" action="Paleontologico">
           <input type="hidden" name="opcion" value="3">
            <input type="number" name="id_paleontologico">
            <button type="submit">Buscar</button>
        </form>
  
                <%
            if (request.getAttribute("error") != null) {%>
        ${error}
        <%}%>
       
    </body>
</html>
