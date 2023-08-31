package vectores;
public class ejeArray7 {
	public static void main(String[] args) {
    
		int enteros[]= {0,0,0,0,0,0,0,0,0,0};//array
		for (int i=0;i<10;i++) {
			enteros[i]=i;
		}//for
		for (int e: enteros) {
			System.out.print(e + " ");
		}//for each
	 }//main
}//ejeArray7
