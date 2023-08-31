package com.juanagui.psp;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Parking parking = new Parking(2);
        Car fiat = new Car(parking,"Ford");
        Car porsche = new Car(parking, "Fiat");
        Car ford = new Car(parking,"Porsche");

        ford.start();
        fiat.start();
        porsche.start();

        Thread.sleep((int) (Math.random()*10000));
        fiat.interrupt();
        ford.interrupt();
        porsche.interrupt();

        fiat.join();
        ford.join();
        porsche.join();

        System.out.println("Parking just closed");
    }
}
