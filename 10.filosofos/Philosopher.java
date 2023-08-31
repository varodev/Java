package com.juanagui.psp;

public class Philosopher extends Thread {

    private final DiningPhilosophers _diningPhilosophers;
    private final Fork _leftFork;
    private final Fork _rightFork;

    public Philosopher(int number, DiningPhilosophers diningPhilosophers,Fork leftFork,Fork rightFork) {
        super(String.format("Philosopher-%d", number));

        _diningPhilosophers = diningPhilosophers;
        _leftFork = leftFork;
        _rightFork = rightFork;
    }

    private void randomSleep() throws InterruptedException {
        Thread.sleep(1000 + (int) (Math.random() * 2000));
    }

    @Override
    public void run() {
        for (int dine = 0; dine < 3; dine++) {
            try {
                // Meditate
                System.out.printf("%s meditating%n", getName());
                randomSleep();
                // Grab forks
                System.out.printf("%s trying to grab forks%n", getName());
                 _diningPhilosophers.grabForks(_leftFork,_rightFork);
                // Dine
                System.out.printf("%s dining%n", getName());
                randomSleep();
                // Release forks
                System.out.printf("%s about to release forks%n", getName());
                _diningPhilosophers.releaseForks(_leftFork,_rightFork);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
