
import java.util.Stack;

public class Cola {
      
       private int numero;
       private boolean turnoConsumidor = false; //inicialmente cola vacía
       private Stack<String> contenido = new Stack<String>();
       private String resultado;
      
       public synchronized String get() {       
             while(turnoConsumidor == false){ 
                    try{
                           wait();
                    }catch (InterruptedException e){}
             }
             resultado = contenido.pop();
             turnoConsumidor=false;
             notifyAll();
             return resultado; //se devuelve el elemento de la cola
      
       }
       
       public synchronized void put(String cadena) { 
    	   //Al sincronizar la ejecución de los hilos no se produce bloqueo
           
           while (turnoConsumidor == true){
                  try {
                         wait();
                  }catch (InterruptedException e){}
           }
           contenido.push(cadena);
           turnoConsumidor=true; //disponible para consumir
           notifyAll();
    
     }
    
}