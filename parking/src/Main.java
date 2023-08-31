public class Main {
    public static void main(String[] args) throws InterruptedException {
        Parking parking = new Parking(2);//numero de plazas
        Car mustang = new Car(parking,"mustang");
        Car fiat = new Car(parking, "fiat");
        Car renault = new Car(parking,"renault");

        mustang.start();
        fiat.start();
        renault.start();

        Thread.sleep((int)(Math.random()*10000));
        mustang.interrupt();
        fiat.interrupt();
        renault.interrupt();

        mustang.join();
        fiat.join();
        renault.join();

        System.out.println("Parking just closed");
    }
}
