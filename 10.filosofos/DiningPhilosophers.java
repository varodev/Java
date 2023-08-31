package com.juanagui.psp;

public class DiningPhilosophers {

    public synchronized void grabForks(Fork leftFork, Fork rightFork) throws InterruptedException {
        while( !leftFork.available  ||  !rightFork.available)
        {
            wait();
        }
        leftFork.available=false;
        rightFork.available=false;
        notifyAll();
    }

    public synchronized void releaseForks(Fork leftFork, Fork rightFork) {
        leftFork.available = true;
        rightFork.available = true;
        notifyAll();
    }
}
