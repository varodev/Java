public class MiHilo extends Thread{

    @Override
    public void run() {
        for (int i=0; i<50; i++){
            System.out.println("Nuevo hilo " + (i+1)+ " en Java");
        }
    }
}

