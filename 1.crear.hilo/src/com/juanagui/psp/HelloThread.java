package com.juanagui.psp;

public class HelloThread extends Thread {//extender la clase Thread
    @Override//sobrecargar método run(nuevo hilo que se ejecuta en paralelo con hilo ppal)
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Hello %d%n", i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
//Llamar al método start del Thread(instancia de clase y llamar método start())
    public static void main(String[] args) throws InterruptedException {//ejecutan a la vez
        HelloThread helloThread1 = new HelloThread();
        helloThread1.start();
        HelloThread helloThread2 = new HelloThread();
        helloThread2.start();
    }
}
