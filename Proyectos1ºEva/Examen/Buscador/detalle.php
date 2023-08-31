<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Detalle de prenda</title>
    <script src="js/motor.js"></script>
    <link rel="stylesheet" href="css/style.css">
</head>

<header>
        <div class="col-4 espacio"><img src="pics/logo.jpeg" alt=""></div>

        <nav class="col-4">
            <a href="home.html">VOLVER A INCIO</a>
            <a href="#">MODA MUJER</a>
            <a href="#">MODA HOMBRE</a>
            <a href="#">MODA NIÑOS</a>
        </nav>


        <div class="col-4">
            <div><a href="https://www.zara.com/es/es/logon">Inicio Sesión</a>
                <img src="pics/log-out (1).png" alt="">
            </div>
            <div>
                <a href="https://www.zara.com/es/es/help">Ayuda</a>
                <img src="pics/question.png" alt="">
            </div>
            <div>
                <a href="https://www.zara.com/es/es/help/cesta-de-la-compra-h5.html">Carrito</a>
                <img src="pics/shopping-cart.png" alt="">
            </div>
        </div>
    </header>

<body id="detalle1">
    <h1 class="textDet">Artículo seleccionado :</h1>
    <div id="contenedor1">
        
        <?php

            // Lectura del fichero JSON
            $json = file_get_contents('json/db1.json');
            // Descodificación del fichero JSON y volcado en una matriz
            $json_data = json_decode($json,true);
            // Recorrido de los datos de JSON
            foreach($json_data['datos'] as $item){
                if($item['ide']==$_GET['ide']){
                    echo "<div class='textDet'>" . $item['articulo'] . "</div>";
                    echo "<div class='textDet'>" . $item['pvp'] . "</div>";
                    echo "<div class='centradoPhp'><img src='" . $item['ruta'] . "'></div>";
                    echo "<div class='textDet'>".$item['descripcion']."</div>";
                
                }
            }

        ?>
    </div>

    
    <footer class="flex">
        <div class="centrar col-4 ">
            <img src="pics/logo.jpeg" alt=" ">
            <div class=" espacio">
                <p>Únete a nuestro Newsletter.</p>
                <div class="espacio"><input type="text"></div>
            </div>
        </div>
        <div class="col-4 col-4footer ">
            <ul>
                <li>
                    <a href="">tiktok</a>
                    <a href="">instagram</a>
                    <a href="">facebook</a>
                    <a href="">twiter</a>
                    <a href="">pinterest</a>
                    <a href="">youtube</a>
                </li>
            </ul>
        </div>

        <div class="col-4 col-4footer">
            <ul>
                <li>Configuración de cookies</li>
                <li>Politica de privacidad y cookies</li>
                <li>Condiciones de compra</li>
            </ul>
        </div>

    </footer>

</body>
</html>