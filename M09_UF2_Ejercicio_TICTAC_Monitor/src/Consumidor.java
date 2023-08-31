
public class Consumidor extends Thread {
      
       private Cola cola;
       private int n;
       private String r;
      
       public Consumidor(Cola c, int n) {
            
             cola = c;
             this.n = n;
       }
      
      
       public void run() {
            
             while(true) {
                    r = cola.get(); //recoge el dato
                    System.out.println(r);
             }
            
       }//Fin de run
      
}//Fin de Consumidor