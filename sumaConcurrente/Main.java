package sumaConcurrente;

import java.io.File;
import java.io.IOException;

public class Main {//Crear varios procesos concurrentes para repartir trabajo entre los procesadores.
//Lanzar varios procesos en paralelo para utilizar toda la potencia de los núcleos del procesador
    public static void main(String[] args) throws IOException, InterruptedException {
        StringBuilder cp = new StringBuilder();
        cp.append(System.getProperty("user.dir"));//ruta hasta la raiz del proyecto
        cp.append(File.separator);
        cp.append("out");
        cp.append(File.separator);
        cp.append("production");
        cp.append(File.separator);
        cp.append("sumaConcurrente");
        cp.append(File.separator);
//Vamos a lanzar varios procesos con el comando JAVA(al que le pasamos el fichero ya compilado Adder.class) y que realiza una suma de una serie de números
        ProcessBuilder processBuilder1 = new ProcessBuilder("java", "-cp", cp.toString(), Adder.class.getName(), "1", "5", "A").inheritIO();
        Process process1 = processBuilder1.start();
        ProcessBuilder processBuilder2 = new ProcessBuilder("java", "-cp", cp.toString(), Adder.class.getName(), "6", "10", "B").inheritIO();
        Process process2 = processBuilder2.start();

        process1.waitFor();
        process2.waitFor();
        System.out.println("Finish parent process");
    }
}
