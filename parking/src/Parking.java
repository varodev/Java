public class Parking {
    private final int _maxSpots;
    private int _availableSpots;//plazas disponibles
    private static final int NONE =0;

    public Parking(int maxSpots) {
        _maxSpots = maxSpots;
        _availableSpots = _maxSpots;
    }
    public synchronized void park(Car car) throws InterruptedException {
        while(_availableSpots==NONE){//mientras que las plazas sea 0, esperar
                System.out.printf("Car %s awaiting empty spot%n", car.getName());
                wait();
        }
        _availableSpots--;
        System.out.printf("Car %s just parked, there are %d available spots%n", car.getName(),_availableSpots);//resta una plaza
        notifyAll();//avisa al resto
    }
    public synchronized void leave(Car car){
        _availableSpots++;//cuando te vas, dejas una plaza(sumas una plaza a disponible)
        System.out.printf("Car %s just left, there are %d available spots%n", car.getName(),_availableSpots);
        notifyAll();//avisas al resto
    }
}

