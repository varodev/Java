package sumaConcurrente;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {//Crear varios procesos concurrentes para repartir trabajo entre los procesadores y recuperar su salida.

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

        ProcessBuilder processBuilder1 = new ProcessBuilder("java", "-cp", cp.toString(), Adder.class.getName(), "1", "5", "A");
        Process process1 = processBuilder1.start();

        ProcessBuilder processBuilder2 = new ProcessBuilder("java", "-cp", cp.toString(), Adder.class.getName(), "6", "10", "B");
        Process process2 = processBuilder2.start();

        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(process1.getInputStream()));
        String result1 = bufferedReader1.readLine();
        System.out.println(String.format("process 1 result is: %s", result1));

        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(process2.getInputStream()));
        String result2 = bufferedReader2.readLine();
        System.out.println(String.format("process 2 result is: %s", result2));

        System.out.println("Finish parent process");
    }
}
