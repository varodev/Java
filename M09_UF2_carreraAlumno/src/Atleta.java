public class Atleta {
    private String nombre;
    private int dorsal;
    private int recorridoAtleta = 0;


    public Atleta(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.recorridoAtleta = 0;
    }

    @Override
    public String toString() {
        return
                nombre + " Dorsal " + dorsal+ " Lleva Recorrido: " + recorridoAtleta + " mt. " ;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getRecorridoAtleta() {
        return recorridoAtleta;
    }

    public void setRecorridoAtleta(int recorridoAtleta) {
        this.recorridoAtleta = recorridoAtleta;
    }
}
