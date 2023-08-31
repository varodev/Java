package com.juanagui.psp;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DiningPhilosophers diningPhilosophers = new DiningPhilosophers();
        List<Fork> forks = new ArrayList<Fork>();
        for (int i = 0; i < 5; i++) {
            forks.add(new Fork());
        }
        List<Philosopher> philosophers = new ArrayList<Philosopher>();
        for (int i = 0; i < 5; i++) {
            philosophers.add(new Philosopher(i,
                    diningPhilosophers,
                    forks.get(i),
                    forks.get((i+1)%5)));
        }
        for (Philosopher philosopher:philosophers) {
            philosopher.start();
        }
    }
}
