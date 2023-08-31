package com.juanagui.psp;

public class InterruptSleep {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {//hilo creado con runnable
            @Override
            public void run() {
                while (true) {//bucle infinito
                    System.out.println("Running");//ejecuta 4veces running
                    try {
                        Thread.sleep(1000);//y espera 1segundo
                    } catch (InterruptedException e) {//Gestionar excepción
                        System.out.println("Interrupted");
                        break;//salir del bucle infinito
                    }
                }
            }
        });
        thread.start();//lanzo la hebra
        Thread.sleep(4000);//me espero en mi hilo principal espero 4segundos
        thread.interrupt();//si quiero interrup la otra hebra
    }
}
