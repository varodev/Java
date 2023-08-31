<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Buscador</title>
    <link rel="stylesheet" type="text/css" href="css/estilos.css">
    <script src="js/motor.js"></script>
</head>
<body>
    <div class="contenedor1">
    <div class="contenedor1-1">
    <h1>Buscador</h1>
    </div>
<div class="contenedor1-2">
    <input type="text" class="campoDeTexto1" id="c1" placeholder="¿qué quieres buscar?">
    <button type="button" class="boton1 mano1" id="b1" onclick="buscar1()">Buscar</button>
    </div>
    </div>
    <div id="resultado1" class="contenedor2">
        <!-- Modelo compositivo -->
        <!--
        <div class="columna1">
            <div class="datos1">Valor 1</div>
        </div>
        <div class="columna1">
            <div class="datos1">Valor 2</div>
        </div>
        -->
    </div>
</body>
</html>