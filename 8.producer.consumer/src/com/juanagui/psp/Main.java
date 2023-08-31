package com.juanagui.psp;
//Ejemplo clásico de sincronización entre hilos
public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        Producer producer = new Producer(container);
        Consumer consumer = new Consumer(container);
        producer.start();
        consumer.start();
    }
}
