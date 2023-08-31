
public class Main {
	public static void main (String[] args){
		
            
            Cola cola = new Cola();
            Productor p1 = new Productor(cola, 1, "TIC");
            Productor p2 = new Productor(cola, 1, "TAC");
            Consumidor c = new Consumidor(cola, 1);
           
            p1.start();
            c.start();
            p2.start();
      }
}
