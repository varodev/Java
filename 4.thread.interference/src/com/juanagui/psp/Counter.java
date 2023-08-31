package com.juanagui.psp;
//2hilos accediendo a una instancia counter, increment y decrement--> race condition = indeterminado
public class Counter {
    public static final int MAX_COUNT = 1000;
    private int c = 0;
    public void increment() {
        c++;
    }
    public void decrement() {
        c--;
    }
    public int value() {
        return c;
    }
//dara resultado counter indeterminado dependiendo del planificador de la VM de Java
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();//creo contador, pueden compartir obj entre las hebras
        Thread incrementer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < MAX_COUNT; i++) {
                    counter.increment();
                    try {
                        Thread.sleep(1);//espera 1milisegundo
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread decrementer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < MAX_COUNT; i++) {
                    counter.decrement();
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        incrementer.start();
        decrementer.start();
        incrementer.join();
        decrementer.join();
        System.out.println(counter.value());//imprimo valor del contador y resultado indetermnado
    }
}
