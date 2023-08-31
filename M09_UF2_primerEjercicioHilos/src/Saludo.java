public class Saludo extends Thread {
    int numHilo = 0;

    public Saludo (int numHilo) {
        this.numHilo = numHilo;
    }

    @Override
    public void run() {
        System.out.println("---- ARRANCA EL HILO Nº " + numHilo + "  ----");

        for(int i = 0; i<10; i++)
            System.out.println("Hilo Nº" + numHilo + " dice Hola por " + (i+1) + " vez.");

        System.out.println("---- FIN DEL HILO Nº " + numHilo + "  ----");

    }
}
