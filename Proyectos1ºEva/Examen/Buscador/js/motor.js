window.onload = function() {
    const body1 = document.body; //1

    if (body1.id == "index1") { //2
        const contenedorDeImagenes = document.getElementById("contenedorDeImagenes");
        cargarJSON1(contenedorDeImagenes);
    } else if (body1.id == "detalle1") { //3
        //alert("Estas en Detalle");
    }
}

/*1)Creamos una función anónima que va a cargar los "body" que tengamos en nuestra página.
1.1)Tenemos los paginas index1 con el body id "index1" y la página detalle con el body id "detalle1".
  2)Con un condicional if le decimos :Si estamos en el la pagina "index1" nos cargara la pagina principal con todos las fotos de las prendas,
  3)Saldremos del if y nos meterá en el else si nos vamos a la pagina "detalle1", se abrirá una pagina con los detalles de la foto en concreto que hayamos pulsado*/

function cargarJSON1(contenedorDeImagenes) {

    var ajax1 = new XMLHttpRequest();
    ajax1.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            var obj0 = this.responseText;
            var obj1 = JSON.parse(obj0);
            var obj2 = obj1["datos"];

            var resultado = "";
            //resultado se queda en vacio para poder cargar:
            for (var i = 0; i < obj2.length; i++) {
                resultado += "<div class='elementos'><a class='a_letra' href='detalle.php?ide=" + obj2[i].ide + "'><div class='col-3'><img class='image' src='" + obj2[i].ruta + "'></div><div class='col-3'>" + obj2[i].articulo + "</div><div class='col-3'>" + obj2[i].pvp + "</div></a></div>";
            }
            document.getElementById(contenedorDeImagenes.id).innerHTML = resultado;
        }
    };
    ajax1.open("GET", "json/db1.json");
    ajax1.send();

}


/*Usamos la función cargarBuscador para que salga los articulos concretos que queremos que salgan una vez filtramos por nombre*/

function cargarBuscador(contenedorDeImagenes) {
    /*Creamos la siguiente variable para que seleccione la id de la foto*/
    var campo1 = (document.getElementById("campo1").value).toLowerCase();
    var ajaxBuscador = new XMLHttpRequest();
    ajaxBuscador.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            var objetoc = this.responseText;
            var objetob = JSON.parse(objetoc);
            var objetoa = objetob["datos"];

            var mostrar = "";
            for (var i = 0; i < objetoa.length; i++) {
                if (campo1 == objetoa[i].articulo.substring(0, campo1.length)) { /*Queremos que el valor del campo1 sea igual al nombre del articulo que hay en la bd*/

                    mostrar += "<div class='elementos1'><a class='a_letra' href='detalle.php?ide=" + objetoa[i].ide + "'><div class='result_img'><img class='image' src='" + objetoa[i].ruta + "'></div><div class='col-3'>" + objetoa[i].articulo + "</div><div>" + objetoa[i].pvp + "</div><div>" + objetoa[i].descripcion + "</div></a></div>";
                }
            }

            if (mostrar == "") {
                mostrar += "<p class='aviso'>NO SE HAN ENCONTRADO COINCIDENCIAS DE BÚSQUEDA</p>";
            }

            document.getElementById(contenedorDeImagenes.id).innerHTML = mostrar;
        }
    };
    ajaxBuscador.open("GET", "json/db1.json");
    ajaxBuscador.send();

}


function buscarJSON1(contenedorDeImagenes) {
    //alert("Ahora se iniciaría el motor de búsqueda de la página");
}

window.addEventListener("load", function() {
    //const boton1 = this.document.getElementById("boton1");
    //const campo1 = this.document.getElementById("campo1");
    const contenedorDeImagenes = this.document.getElementById("contenedorDeImagenes");
    if (campo1) {
        campo1.addEventListener("keyup", function(event) {; //1
            event.preventDefault();
            cargarBuscador(contenedorDeImagenes);

        });
    }
});

//1 El evento keyup sirve para que mientras estemos encima del input vaya filtrando segun lo que vamos escribiendo.
//ESTO ES PARA EN EL CASO DE QUE ADEMAS QUISIERAMOS TENER UN BOTTON
/*window.addEventListener("load", function() {
    const boton1 = this.document.getElementById("boton1");
    // const campo1 = this.document.getElementById("campo1");
    const contenedorDeImagenes = this.document.getElementById("contenedorDeImagenes");

    if (boton1) {
        boton1.addEventListener("click", function(event) {
            event.preventDefault();
            buscarJSON1(contenedorDeImagenes);

        });
    }
});*/