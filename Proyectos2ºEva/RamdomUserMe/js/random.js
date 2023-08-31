window.onload = function() {


    borrar.addEventListener('click', function() {



    });
    mostrar.addEventListener('click', function() {
        document.getElementById('userImage').src = "";
        document.getElementById('titulo').innerHTML = "Título: ";
        document.getElementById('nombre').innerHTML = "Nombre: ";
        document.getElementById('apellido').innerHTML = "Apellido:";
        document.getElementById('email').innerHTML = "Email: ";
        document.getElementById('telefono').innerHTML = "Teléfono: ";
        document.getElementById('genero').innerHTML = "Sexo: ";
        document.getElementById('ciudad').innerHTML = "Ciudad: ";
        cargarPerfil();
    });

}

function cargarPerfil() {

    var ajax1 = new XMLHttpRequest();
    /*Creamos un objeto llamado ajax1 que se genera de la clase XmlRequest*/


    ajax1.onreadystatechange = function() {


        if (this.readyState == 4 && this.status == 200) {
            //Muestra la información

            console.log(this.responseText);
            var obj = this.responseText;
            var obj1 = JSON.parse(obj);
            console.log(obj1); /*Con este objeto podemos ver la informacion de la api en modo json en inspeccionar */
            console.log("Imagen de la persona Random :" + obj1.results['0'].picture.large);
            console.log("Este es su titulo :" + obj1.results['0'].name.title);
            console.log("Este es su nombre :" + obj1.results['0'].name.first);
            console.log("Este es su apellido :" + obj1.results['0'].name.last);
            console.log("Este es su email : " + obj1.results['0'].email);
            console.log("Este es su teléfono : " + obj1.results['0'].phone);
            console.log("Genero : " + obj1.results['0'].gender);
            console.log("Esta es su ciudad : " + obj1.results['0'].location.city); /*Todo lo anterior sale por consola*/

            document.getElementById('userImage').src = obj1.results['0'].picture.large;
            document.getElementById('titulo').innerHTML += obj1.results['0'].name.title;
            document.getElementById('nombre').innerHTML += obj1.results['0'].name.first;
            document.getElementById('apellido').innerHTML += obj1.results['0'].name.last;
            document.getElementById('email').innerHTML += obj1.results['0'].email;
            document.getElementById('telefono').innerHTML += obj1.results['0'].phone;
            document.getElementById('genero').innerHTML += obj1.results['0'].gender;
            document.getElementById('ciudad').innerHTML += obj1.results['0'].location.city;

            /*Necesitamos que cada vez que le demos a mostrar que se cargue un nuevo perfil, lo que conseguimos llamando de manera asincrona a la funcion. */

        }

    };

    ajax1.open("GET", " https://randomuser.me/api/ ", true);
    ajax1.send();

} //cierre de la funcion cargarPerfil

/*El metodo get es leer la url externa y coger de ella lo que necesitemos.
Randomuserme es una api publica y por lo tanto no necesita clave como si pasa en la hecha
en clase del tiempo */