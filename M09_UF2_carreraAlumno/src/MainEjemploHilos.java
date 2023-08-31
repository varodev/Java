import java.util.ArrayList;

public class MainEjemploHilos {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Atleta> atletas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            Atleta a = new Atleta("Atleta "+(i+1), (i+1));
            atletas.add(a);


        }

        for (Atleta a : atletas) {
            Carrera carrera = new Carrera(a);
            carrera.start();
            carrera.join();
        }

        System.out.println("El ganador es " + Ganador.getAtleta());


        System.out.println("*****************************************");
        System.out.println("Fin del programa");
        for (Atleta a : atletas ) {
            System.out.println(a);

        }

    }
}
