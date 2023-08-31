public class Philosopher extends Thread {//hilos

    private final Table _table;//hilos--lo necesito para el grabfork y realesefork
    private final Fork _leftFork;
    private final Fork _rightFork;

    public Philosopher (int number, Table table, Fork leftFork, Fork rightFork){
        super(String.format("Philosopher/%d", number));
        _table = table;
        _leftFork = leftFork;
        _rightFork = rightFork;
    }

    private void randomSleep() throws InterruptedException {
       Thread.sleep(1000 + (int) (Math.random()*2000)); //ese segundo es de tiempo minimo
    }
    @Override
    public void run() {
              for (int dine=0; dine<3; dine++){//que se ejecute almenos 3veces
                  try {//del randomSleep();
                      //Meditte
                      System.out.printf("%s meditating%n", getName());
                      randomSleep();//Medita un tiempo de espera aleatorio

                      //Grab forks
                      System.out.printf("%s trying to grab forks%n", getName());
                      _table.grabForks(_leftFork,_rightFork);

                      //Dinner
                      System.out.printf("%s dining%n", getName());
                      randomSleep();//Come un tiempo de espera aleatorio

                      //Release fork
                      System.out.printf("%s about to release forks%n", getName());
                      _table.releaseForks(_leftFork,_rightFork);
                  } catch (InterruptedException e) {
                    break;//cuando venga una excepcion de interrumpido salgo
                  }//salir con dignidad
              }
    }
}
