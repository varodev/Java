
public class Tac extends Thread {
	//Propiedades
		private int hilo;
		
		//Constructor
		public Tac(int hilo) {
			this.hilo = hilo;
		}
		
		//Métodos
		public void run() {
			try {
				sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			while(true) {
				try {
					
					System.out.println("Hilo " + hilo + " dice: TAC");
					sleep(1000);
					
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
}
