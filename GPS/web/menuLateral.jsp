<%-- 
    Document   : menuLateral
    Created on : 11/04/2020, 08:37:28 PM
    Author     : Tiiin
--%>
<link href="css/sweetalert2.min.css" rel="stylesheet" type="text/css"/>
<script src="js/sweetalert2.min.js" type="text/javascript"></script>
<style>
 
/*Menu*/
.menu{
    width: 100%;
    background-color: #3391A6;
    overflow: hidden;
    z-index: 2;
}


.menu a{
    border:none;
    float:left;
    color:white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    font-size: 17px;
    cursor: pointer;
    background-color: #3391A6 ;
    text-decoration: none;
}

.menu a:hover{
    background-color: #007cae;
    color: white;
    text-decoration: none;
}
</style>


<!--Esto esta bien salu2-->
<div id="menuLateral">
    <div id="menu" class="menu ">
  
        <a href="/GPS/Arqueologico.jsp">Arqueologico</a>
        <a href="/GPS/Geologico.jsp">Geologico</a>
        <a href="/GPS/Guardabosques.jsp">Guardabosques</a>
        <a href="/GPS/Paleontologico.jsp">Paleontologico</a>
        <a href="/GPS/crear_geoparque.jsp">Geoparque</a>
        <a href="/GPS/registrar_geositio.jsp"> Geositio</a>
        <a href="/GPS/registrar_actor.jsp"> Crear Actor</a>
        <a href="/GPS/registrar_fauna.jsp"> Fauna</a>
        <a href="/GPS/registrar_flora.jsp"> Flora</a>
        <a href="/GPS/registrar_geologo.jsp"> Geologo</a>
  <a href="/GPS/Login.jsp"> Salir</a>

    </div>
</div>


<script>
    function openNav() {
        document.getElementById("menu").style.width = "225px";
        document.getElementById("body").style.marginLeft = "250px";
        document.body.style.backgroundColor = "white";
    }

    function closeNav() {
        document.getElementById("menu").style.width = "0";
        document.getElementById("body").style.marginLeft = "0";
        document.body.style.backgroundColor = "white";
    }
</script>
</div>
