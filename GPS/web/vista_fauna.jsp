<%-- 
    Document   : vista_fauna
    Created on : 02-dic-2018, 17:46:00
    Author     : sebastian
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DAO.DaoFauna"%>
<%@page import="BEAN.BeanFauna"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>Vista Fauna</title>
    </head>
    <body>
           
        
        <table class="table">
            <thead>
                <tr>
                    
                    
                    <th scope="col">id_fauna</th>
                    <th>especie</th>
                    <th>ecosistema</th>
                    <th>habitat</th>
                    <th>tipo</th>
                    <th>geositio</th>
                    <th>guardabosques</th>

                </tr>
            </thead>
                <%
                    BeanFauna bFa = new BeanFauna();
                    DaoFauna dFa = new DaoFauna();
                    ArrayList<BeanFauna> listaFauna = dFa.listar();
                    for (int i = 0; i < listaFauna.size(); i++) {
                        bFa = listaFauna.get(i);
                %>
                <tbody>
                <tr>
                    <td><%= bFa.getId_fauna()%></td>
                    <td><%= bFa.getEspecie()%></td>
                    <td><%= bFa.getEcosistema()%></td>
                    <td><%= bFa.getHabitat()%></td>
                    <td><%= bFa.getTipo()%></td>
                    <td><%= bFa.getFk_geositio()%></td>
                    <td><%= bFa.getFk_guardabosques()%></td>
                </tr>
                </tbody>
                
                <% }%>
                </table>
                <form method="post" action="Fauna">
           <input type="hidden" name="opcion" value="3">
            <input type="number" name="id_fauna">
            <button type="submit">Buscar</button>
        </form>
            
    </body>
</html>
