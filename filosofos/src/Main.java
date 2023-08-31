import java.util.*;

public class Main {
    public static void main(String[] args) {
        Table table = new Table();//crear mesa

        List<Fork> forks = new ArrayList<>();
        for(int i=0; i<5;i++){//crear tenedores primero para meterlos en filosofos
            forks.add(new Fork());
        }

        List<Philosopher> philosophers = new ArrayList<>();//crear filosofos
        for(int i=0; i<5;i++){//se le pasa los parametros del contructor Philosopher para cada filosofo
            philosophers.add(new Philosopher(i,table, forks.get(i), forks.get((i+1)%5)));
        }    //public Philosopher (int number, Table table,  Fork leftFork, Fork rightFork)

        for (Philosopher p:philosophers) {//arrancar filosofos
            p.start();
        }
   }
}
