
public class Tic extends Thread{
	
	//Propiedades
	private int hilo;
	
	//Constructor
	public Tic(int hilo) {
		this.hilo = hilo;
	}
	
	//M�todos
	public void run() {
		while(true) {
			try {
				
				System.out.println("Hilo " + hilo + " dice: TIC");
				sleep(1000);

			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
