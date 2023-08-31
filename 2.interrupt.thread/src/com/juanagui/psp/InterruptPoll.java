package com.juanagui.psp;

public class InterruptPoll {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());//forma de sacar el nombre del hilo secundario
                while (true) {//bucle infinito
                    int sum = 0;
                    for (int i = 0; i < Integer.MAX_VALUE; i++) {
                        sum += i;
                    }
                    System.out.println(sum);
                        if (Thread.interrupted()) {//Comprobar si me han interrumpido
                            System.out.println("Interrupted");
                            break;//salir del bucle infinito
                        }
                }
            }
        },"suma_enteros");//forma cambiar nombre hilo secundario
        Thread.currentThread().setName("principal");//forma cambiar nombre hilo ppal
        System.out.println(Thread.currentThread().getName());//forma de sacar el nombre del hilo ppal
        thread.start();
        Thread.sleep(4000);
        thread.interrupt();//Interrumpir un hilo
    }
}
