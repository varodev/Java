package com.juanagui.psp;

public class HelloAnonymous {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {//clase anonima que implementa el interfaz runnable
            @Override
            public void run() {//Sobrecargar método run
                for (int i = 0; i < 10; i++) {
                    System.out.printf("Hello %d%n", i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.printf("Hello %d%n", i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();//y llamar a método start()
    }
}