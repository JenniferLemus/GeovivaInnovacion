<%-- 
    Document   : VistaGeologico
    Created on : 26-sep-2018, 21:41:11
    Author     : cotrof
--%>

<%@page import="DAO.DaoArqueologico"%>
<%@page import="BEAN.BeanArqueologico"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Vista Arqueologico</title>
    </head>
    <body>
      
           
        <table class="table">
            <thead>
                <tr>
                    
                    
                    <th scope="col">id_arqueologico</th>
                    <th>nombre</th>
                    <th>ubicacion</th>
                    <th>cultura</th>
                    <th>formacion</th>
                    <th>cronologico</th>
                    <th>funcional</th>
                    <th>tipologia</th>
                    <th>duracion</th>
                    <th>fk_era</th>
                    <th>fk_periodo</th>
                </tr>
            </thead>
                <%
                    BeanArqueologico bAr = new BeanArqueologico();
                    DaoArqueologico dAr = new DaoArqueologico();
                    ArrayList<BeanArqueologico> listaArqueologico = dAr.listar();
                    for (int i = 0; i < listaArqueologico.size(); i++) {
                        bAr = listaArqueologico.get(i);
                %>
                <tbody>
                <tr>
                    <td><%= bAr.getId_arqueologico()%></td>
                    <td><%= bAr.getNombre()%></td>
                    <td><%= bAr.getUbicacion()%></td>
                    <td><%= bAr.getCultura()%></td>
                    <td><%= bAr.getFormacion()%></td>
                    <td><%= bAr.getCronologico()%></td>
                    <td><%= bAr.getFuncional()%></td>
                    <td><%= bAr.getTipologia()%></td>
                    <td><%= bAr.getDuracion()%></td>
                    <td><%= bAr.getFk_era()%></td>
                    <td><%= bAr.getFk_periodo()%></td>
                </tr>
                </tbody>
                <% }%>
            </table>
        <form method="post" action="Arqueologico">
           <input type="hidden" name="opcion" value="3">
            <input type="number" name="id_arqueologico">
            <button type="submit">Buscar</button>
        </form>

    </body>
</html>
