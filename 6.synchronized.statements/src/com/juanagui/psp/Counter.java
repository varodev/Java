package com.juanagui.psp;

public class Counter {//sincronizar por partes, no el método entero
    public static final int MAX_COUNT = 1000;
    private int c = 0;

    public void increment() {
        synchronized (this){//cada objeto tiene un candado intrinseco
            c++;
        }
    }
    public  void decrement() {
        synchronized (this){//cada objeto tiene un candado intrinseco
            c--;
        }
    }
    public int value() {
        synchronized (this){//cada objeto tiene un candado intrinseco
            return c;
        }
    }
    public static void main(String[] args) throws InterruptedException {
         Counter counter = new Counter();
        Thread incrementer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < MAX_COUNT; i++) {
                    counter.increment();
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }//un hilo que quiera acceder de forma exclusiva y consistente a un campo
            }//de objeto debe adquirir el candado y liberarlo cuando termine
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
        System.out.println(counter.value());//dar cero
    }
}
