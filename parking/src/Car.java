public class Car extends Thread{

    private final Parking _parking;

    public Car(Parking parking, String name) {
        super(name);
        _parking = parking;
    }

    private void Sleep() throws InterruptedException {
        Thread.sleep((int) (Math.random()*2000));
    }

    @Override
    public void run() {
        while (true){
            try {
                Sleep();
                _parking.park(this);
                Sleep();
                _parking.leave(this);
            } catch (InterruptedException e) {
                System.out.printf("Car %s just died%n",getName());
                break;
            }
        }
    }
}
