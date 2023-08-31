package com.juanagui.psp;

public class HelloRunnable implements Runnable {//Implementar interfaz Runnable
    @Override
    public void run() {//Implementar método run
        for (int i = 0; i < 10; i++) {
            System.out.printf("Hello %d%n", i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //Crear una instancia de la clase Thread(pasando implementacion de interfaz runnable) y llamar a método start()
    public static void main(String[] args) throws InterruptedException {
        Thread helloThread1 = new Thread(new HelloRunnable());
        helloThread1.start();//
        Thread helloThread2 = new Thread(new HelloRunnable());
        helloThread2.start();
    }
}
