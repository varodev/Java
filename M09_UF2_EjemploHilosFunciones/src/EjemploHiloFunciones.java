public class EjemploHiloFunciones extends Thread {
    public void run() {
        //Mostramos la información del hilo por pantalla
        System.out.println(
                " - Entramos en el Hilo: " + Thread.currentThread().getName() +
                        "\n\t - Prioridad: " + Thread.currentThread().getPriority() +
                        "\n\t - ID: " + Thread.currentThread().getId() +
                        "\n\t - Hilos activos: " + Thread.currentThread().activeCount()
        );
    }

    public static void main(String[] args) {
        //Nombramos al hilo del programa como Hilo Principal
        Thread.currentThread().setName("HILO PRINCIPAL");
        System.out.println("INICIO DEL PROGRAMA EN: " + Thread.currentThread().getName());
        System.out.println("  - DATOS DEL HILO: " + Thread.currentThread().toString());

        //Instanciamos un objeto de la clase con la que estamos trabajando
        EjemploHiloFunciones h = null;

        //Lanzamos 3 hilos más
        for(int i = 0; i<3; i++) {
            h = new EjemploHiloFunciones(); //Creamos el hilo
            h.setName("HILO" + i); //asignamos el nombre al hilo usando el valor de i para que sean diferentes
            h.setPriority(i+1); //asignamos una prioridad para el hilo
            System.out.println("* HILO CREADO - Entramos en " + h.getName());
            h.start(); //iniciamos el hilo

            System.out.println(" Información del hilo: " + h.getName() + ": " + h.toString());
        }

        System.out.println(" ---  HILOS CREADOS --- ");
        System.out.println("Hilos activos en este momento: " + Thread.activeCount());
    }
}
