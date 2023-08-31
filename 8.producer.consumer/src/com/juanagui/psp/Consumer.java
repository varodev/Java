package com.juanagui.psp;
//Un hilo consumidor debe esperar a que el hilo productor genere información para poder procesarla
public class Consumer extends Thread {//

    private final Container _container;

    public Consumer(Container container) {
        _container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            _container.get();//lee del contenedor, el orden se encarga la clase Container
            /*try {//meto numero y imprimo por pantalla que meti numero contenedor y espera random
                Thread.sleep((int) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
