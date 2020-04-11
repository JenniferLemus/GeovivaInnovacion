<%-- 
    Document   : vista_Guardabosques
    Created on : 30/11/2018, 11:53:11 AM
    Author     : UserData05
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DAO.DaoGuardabosques"%>
<%@page import="BEAN.BeanGuardabosques"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>Vista Guardabosques</title>
    </head>
    <body>

        <table class="table">
            <tr>
                <th scope="col" >id_guarda</th>
                <th>nombre</th>
                <th>apellido</th>
                <th>telefono</th>
                <th>poblacion Aledaña</th>
                <th>Tipo Documento</th>
                <th>Numero Documento</th>

            </tr>
            <%
                BeanGuardabosques bGuarda = new BeanGuardabosques();
                DaoGuardabosques dGuarda = new DaoGuardabosques();
                ArrayList<BeanGuardabosques> listaGeologos = dGuarda.listar();
                for (int i = 0; i < listaGeologos.size(); i++) {
                    bGuarda = listaGeologos.get(i);
            %>
            <tr>
                <td><%= bGuarda.getId_guarda()%></td>
                <td><%= bGuarda.getNombre()%></td>
                <td><%= bGuarda.getApellido()%></td>
                <td><%= bGuarda.getTelefono()%></td>
                <td><%= bGuarda.getPoblacionAledaña()%></td>
                <td><%= bGuarda.getTipoDocumento()%></td>
                <td><%= bGuarda.getNumeroDocumento()%></td>
            </tr>

            <% }%>
                    </table>
            <form method="post" action="Guardabosques">
                <input type="hidden" name="opcion" value="3">
                <input type="number" name="id_guarda">
                <button type="submit">Buscar</button>
            </form>
        </table>

        <%
                    if (request.getAttribute("error") != null) {%>
        ${error}
        <%}%>

    </body>
</html>
