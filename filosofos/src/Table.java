public class Table {//gestiona el acceso a los tenedores

    public synchronized void grabForks(Fork leftFork, Fork rightFork) throws InterruptedException {
        while(!leftFork.availabe || !rightFork.availabe){//mientas NO este disponible tenedor izq Y derecho...
            wait();//espero
        }//cuando salga del bucle es true
        leftFork.availabe=false;//no estar como disponible para nadie más
        rightFork.availabe=false;//no estar como disponible para nadie más
        notifyAll();
    }

    public synchronized void releaseForks(Fork leftFork, Fork rightFork) {
        leftFork.availabe=true;
        rightFork.availabe=true;
        notifyAll();
    }
}
