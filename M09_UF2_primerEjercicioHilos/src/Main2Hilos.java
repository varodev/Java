public class Main2Hilos {
    public static void main(String[] args) throws InterruptedException {
        //Creamos 5 hilos
        for(int i=0; i<5; i++) {
            Saludo s = new Saludo(i+1);
            s.start();
            s.join();
        }
        System.out.println("--- FIN DEL PROGRAMA ---");
    }
}
