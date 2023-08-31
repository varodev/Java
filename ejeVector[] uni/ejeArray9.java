package vectores;
public class ejeArray9 {
	public static void main(String[] args) {
	
	int numeros[]= {11,11,11,11,11,11,11,11,11,11};
	boolean existe;
	int contador=0;
	
	while(contador<10) { 
		existe=false;
		int num = (int)(Math.random()*10);
		
		for(int i=0; i < numeros.length; i++) {
			if (num == numeros[i]) {
				existe=true;
				}
		}//1er for
		
		if(!existe) {
			numeros[contador]=num;
			contador++;
		}
	}//while
	
	for (int i=0; i < numeros.length; i++) {
		System.out.print(numeros[i] + " ");
	}//2do for
	System.out.println("\nel contador es " + contador);
 }//main
}//ejeArray9
