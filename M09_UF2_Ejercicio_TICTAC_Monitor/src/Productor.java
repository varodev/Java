
public class Productor extends Thread {
      
       private Cola cola;
       private int n;
       private String cadena;
      
       public Productor(Cola c, int n, String cadena) {
             cola = c;
             this.n = n;
             this.cadena = cadena;
       }
      
       public void run() {
            
             while(true){
                    cola.put(cadena); 
                    try {
                           sleep(1000);
                    } catch (InterruptedException e) { }
             }
            
       }//Fin de run
      
}//Fin de Productor
