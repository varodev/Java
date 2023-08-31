
public class Programa {
	
	public static void main(String[] args) {
		
		int[] arrayOrigen = {10, 20, 30, 40};
		int[] arrayDestino = new int[4];
		
		arrayDestino[0] = arrayOrigen[0];
		arrayDestino[1] = arrayOrigen[1];
		arrayDestino[2] = arrayOrigen[2];
		arrayDestino[3] = arrayOrigen[3];
		
		arrayOrigen[2] = 1000;
		
		System.out.println(arrayDestino[2]);
		
	}

}
