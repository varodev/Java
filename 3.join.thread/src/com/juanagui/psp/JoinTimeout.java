package com.juanagui.psp;

public class JoinTimeout {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {//bucle infinito
                    int sum = 0;
                    for (int i = 0; i < Integer.MAX_VALUE; i++)
                        sum += i;
                    System.out.println(sum);
                    if (Thread.interrupted()) {//si le interrupt, se sale; bloque encarga de gestionar la interupcion
                        System.out.println("Interrupted");//si se omite el bloque, un hilo ppal para esperando linea27 infinito
                        break;//salir bucle infinito
                    }
                }
            }
        });
        thread.start();
        int remainingWaits = 3;
        while (thread.isAlive()) {//espero y mientras la hebra este viva, espero 2s a que muera
            thread.join(2000);//esperar hasta que el hilo ppal muera con contador
            System.out.println("Still waiting for thread");
            if (--remainingWaits < 0) {//cuando pasen 6s se desencadena
                thread.interrupt();
                thread.join();//una vez interrumpido, se va a esperar a que hilo ppal muera
            }
        }
    }
}
