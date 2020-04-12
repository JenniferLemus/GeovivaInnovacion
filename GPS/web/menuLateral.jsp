<%-- 
    Document   : menuLateral
    Created on : 11/04/2020, 08:37:28 PM
    Author     : Tiiin
--%>

<style>
    #menuLateral{
        position: absolute;
    }
    #mains{position: fixed;}

    .menu {
        height: 100%;
        width: 0;
        position: fixed;
        z-index: 1;
        top: 0;
        left: 0;
        background-color: #309B8C;
        overflow-x: hidden;
        transition: 0.5s;
        padding-top: 60px;
    }
    .t{
        opacity: 0.6;
    }

    .menu a {
        text-align: initial;
        padding: 8px 8px 8px 32px;
        text-decoration: none;
        font-size: 25px;
        color: white;
        display: block;
        transition: 0.3s;
    }

    .menu a:hover {
        color: #f1f1f1;
    }

    .menu .closebtn {
        position: absolute;
        top: 0;
        right: 25px;
        font-size: 36px;
        margin-left: 50px;
    }

    #mains {
        transition: margin-left .5s;
        padding: 16px;
        color: white;
    }

    @media screen and (max-height: 450px) {
        .menu {padding-top: 15px;}
        .menu a {font-size: 18px;}
    }
</style>

<div id="menuLateral">
    <div id="menu" class="menu t">
        <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
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

    </div>
</div>

<div id="mains">
    <span style="font-size:30px;cursor:pointer" onclick="openNav()" >&#9776; Menu </span>
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
