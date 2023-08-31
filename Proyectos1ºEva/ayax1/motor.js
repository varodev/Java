function cargarFichero() {
    alert("hola");
    var ajax1 = new XMLHttpRequest(); //objeto ayax
    ajax1.onreadystatechange = funtion(); { //detecte cualquier cambio y en funcion del evento que se produzca genera algun cambio
        if (this.readyState == 4 && this.status == 200) {//Son los dos parametros que se necesitan para conectar con el servidor
            document.getElementById("d1").innerHTML = this.responseText;
        }
    }

    ajax1.open("GET", "fichero.html", true); //necesitamos el open - get para coger el fichero donde figura "hola"/true dev lo que
    ajax1.send();//contiene el if, y get es para enviar el fichero y que interactue.

}