<%-- 
    Document   : Vista_Geologico
    Created on : 30/11/2018, 11:44:05 AM
    Author     : UserData05
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DAO.DaoYacimientoGeologico"%>
<%@page import="BEAN.BeanYacimientoGeologico"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>Vista Yacimiento Geologico</title>
    </head>
    <body>
        
        
            
        <table class="table">
                <tr>
                    <th scope="col" >id_geologico</th>
                    <th>nombre</th>
                    <th>ubicacion</th>
                    <th>elevacion</th>
                    <th>pendiente</th>
                    <th>orientacion</th>
                    <th>estratificacion</th>
                    <th>formacion_rocosa</th>
                    <th>tipo_suelo</th>
                    <th>fk_era</th>
                    <th>fk_periodo</th>
                </tr>
                <%
                    BeanYacimientoGeologico bGeol = new BeanYacimientoGeologico();
                    DaoYacimientoGeologico dGeol = new DaoYacimientoGeologico();
                    ArrayList<BeanYacimientoGeologico> listaGeologos = dGeol.listar();
                    for (int i = 0; i < listaGeologos.size(); i++) {
                        bGeol = listaGeologos.get(i);
                %>
                <tr>
                    <td><%= bGeol.getId_Geologico()%></td>
                    <td><%= bGeol.getNombre()%></td>
                    <td><%= bGeol.getUbicacion()%></td>
                    <td><%= bGeol.getElevacion()%></td>
                    <td><%= bGeol.getPendiente()%></td>
                    <td><%= bGeol.getOrientacion()%></td>
                    <td><%= bGeol.getEstratificacion()%></td>
                    <td><%= bGeol.getFormacion_rocosa()%></td>
                    <td><%= bGeol.getTipo_suelo()%></td>
                    <td><%= bGeol.getFk_era()%></td>
                    <td><%= bGeol.getFk_periodo()%></td>
                </tr>
                <% }%>
            </table>
            <form method="post" action="AccidenteGeologico">
           <input type="hidden" name="opcion" value="3">
            <input type="number" name="id_Geologico">
            <button type="submit">Buscar</button>
        </form>
  
                <%
            if (request.getAttribute("error") != null) {%>
        ${error}
        <%}%>
       
    </body>
</html>
