package com.juanagui.psp;

public class Counter {
    public static final int MAX_COUNT = 1000;
    private int c = 0;
    //igual que el ejemplo 4 pero con la palabra synchronized
    public synchronized void increment() {
        c++;
    }//añadir synchronized
    public synchronized void decrement() {c--;}//añadir synchronized
    public synchronized int value() {
        return c;
    }//añadir synchronized
//synchronized impide 2hilos accedan de forma intercalada a un método
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
                }//Hilo intenta acceder mientras que otro hilo ha accedio
            }//pasa BLOCKED hasta que el primer hilo termina
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
        System.out.println(counter.value());//por lo que siempre dará 0 en counter(synchronized)
    }
}
