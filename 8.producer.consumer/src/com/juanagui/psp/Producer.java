package com.juanagui.psp;

public class Producer extends Thread {//hebra que mete cosas

    private final Container _container;
    //referencia al contenedor
    public Producer(Container container) {
        _container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            _container.put(i);//meter dentro del contenedor numeros
            try {//meto numero y imprimo por pantalla que meti numero contenedor y espera random
                Thread.sleep((int) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
