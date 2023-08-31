public class Main implements Runnable {
    private Cliente cliente;
    private Cajera cajera;
    private long initialTime; //Guadarmos el instante en que se inicia el proceso

    public Main (Cliente cliente, Cajera cajera, long initialTime){
        this.cajera = cajera;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    public static void main(String[] args) {

        //Creamos dos clientes que llegan a la caja a pagar
        Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
        Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });

        //Creamos dos hilos de cajeras para que se puedan intercalar
        Cajera cajera1 = new Cajera("Cajera 1");
        Cajera cajera2 = new Cajera("Cajera 2");

        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis(); //Capturamos el instante en que se inicia el proceso

        //Arrancamso el proceso de cobro / pago
        Runnable proceso1 = new Main(cliente1, cajera1, initialTime); //mandamos al cliente 1 a la cajera 1 en el instante que marca
        Runnable proceso2 = new Main(cliente2, cajera2, initialTime); //mandamos al cliente 2 a la cajera 2 en el instante que marca

        //Iniciamos los hilos que ejecutarán los procesos Runnables
        new Thread(proceso1).start();
        new Thread(proceso2).start();

    }

    @Override
    public void run() {
        this.cajera.procesarCompra(this.cliente, this.initialTime); //Se inicia la compra
    }
}
