<%-- 
    Document   : actualizar_flora
    Created on : 4/12/2018, 04:35:04 PM
    Author     : Aprendiz
--%>

<%@page import="BEAN.BeanFlora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>Actualizar Flora</title>
    </head>
    <body>
        <h1 id="Tit">Actualizar Flora</h1>
        <form id=" form"method="post" action="Flora">
            <% BeanFlora bFlora = (BeanFlora) request.getAttribute("bFlora");
              if (bFlora != null) {%>


            <div class="form-group">
                <label>ID</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="ID" name="id_flora" required="" value="<%=bFlora.getId_flora()%>" >
            </div>

            <div class="form-group">
                <label>TIPO</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="TIPO" name="tipo" required="" value="<%=bFlora.getTipo()%>" >
            </div>

            <div class="form-group">
                <label>NUMERO INDIVIDUOS</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="NUMERO INDIVIDUOS" required="" name="numeroIndividuos" value="<%=bFlora.getNumeroIndividuos()%>" >
            </div>



            <div class="form-group">
                <label>TAMAÑO</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="TAMAÑO" name="tamano" required="" value="<%=bFlora.getTamano()%>" >
            </div>

            
           
            GEOSITIO<br>
            <input type="text" name="fk_geositio" required="" value="<%=bFlora.getFk_geositio()%>"><br><br>

            GUARDABOSQUES<br>
            <input type="text" name="fk_guardabosques" required="" value="<%=bFlora.getFk_guardabosques()%>"><br><br>



            </th>

            </tr>
            </table>
            <%} else {%>
            <table width="500" height="80" border="1">

                <th 

            <th ID <br>
                <input type="text"   name="id_flora"><br><br>

                TIPO<br>
                <input type="text"   name="tipo"><br><br>

                NUMERO INDIVIDUOS<br>
                <input type="text" name="numeroIndividuos"><br><br>

                TAMAÑO<br>
                <input type="text" name="tamano"><br><br>

                GEOSITIO<br>
                <input type="text" name="fk_geositio"><br><br>

                GUARDABOSQUES<br>
                <input type="text" name="fk_guardabosques"><br><br>

            </th>

        </table>

        <%}%>

        <button id="boton" >Actualizar</button><br><br>
        <input type="hidden" name="opcion" value="2"><br>
    </form>
    <a href="Vista_flora.jsp"><button id="boton" >Atras</button></a>


</center>
<%
  if (request.getAttribute("error") != null) {%>
${error}
<%} else {%>
${exito}
<%}%> 
</body>
</html>
