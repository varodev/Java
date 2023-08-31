function buscar1(){

    oC1 = document.getElementById("c1");
    oR1 = document.getElementById("resultado1");

    var ajax1 = new XMLHttpRequest();
    ajax1.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            oR1.innerHTML = this.responseText;
            oC1.value="";
        }
    };

    ajax1.open("GET", "Buscar?valor1=" + oC1.value, true);
    ajax1.send();

}