public class Carrera extends Thread {
    public Atleta a;

    public Carrera(Atleta a) {
        this.a = a;
    }

    @Override
    public void run() {

        while ((a.getRecorridoAtleta() < 100) ) {

            int r = a.getRecorridoAtleta() + (int) (Math.random() * 50);

            if (r > 100 && !Ganador.getGanador()) {
                a.setRecorridoAtleta(100);
                System.out.println(a);
                Ganador.setGanador(true);
                Ganador.setAtleta(a);

            }
            if(r<100){
                a.setRecorridoAtleta(r);
                System.out.println(a);
            }
            if(r>100) break;
            System.out.println(a);
        }

    }
}
