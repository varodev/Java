<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Detalle de prenda</title>
    <script src="js/motor.js"></script>
</head>
<body id="detalle1">
    <div id="contenedor1">
        <?php
            // Lectura del fichero JSON
            $json = file_get_contents('json/db1.json');
            // Descodificación del fichero JSON y volcado en una matriz
            $json_data = json_decode($json,true);
            // Recorrido de los datos de JSON
            foreach($json_data['datos'] as $item){
                if($item['ide']==$_GET['ide']){
                    echo "<div>" . $item['articulo'] . "</div>";
                    echo "<div>" . $item['pvp'] . "</div>";
                    echo "<div><img src='" . $item['ruta'] . "'></div>";
                }
            }

        ?>
    </div>
    
</body>
</html>