
public class SaberIndiceEntero {
	
	
	public static String indice(int numero, int indice) {
	
		String[] nume=Integer.toString(numero).split("");
		
		for (int j = 0; j < nume.length;j++) {
			System.out.println(nume[j]+";");
		}
		
		String num=nume[indice];
		return num;
		
	}
	

	public static void main(String[] args) {
		int[] numero= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; 
		//System.out.println(numero[9]);
		
		
		int numero2=324231;
		
		System.out.println(indice(numero2,2));
	}

}
