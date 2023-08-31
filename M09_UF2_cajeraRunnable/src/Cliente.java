public class Cliente {
    //Atributos
    private String nombre;
    private int[] carroCompra;

    //Constructor
    public Cliente(String nombre, int[] carroCompra) {
        super();
        this.nombre = nombre;
        this.carroCompra = carroCompra;
    }
    // Constructor, getter y setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int[] getCarroCompra() {
        return carroCompra;
    }
    public void setCarroCompra(int[] carroCompra) {
        this.carroCompra = carroCompra;
    }
}
