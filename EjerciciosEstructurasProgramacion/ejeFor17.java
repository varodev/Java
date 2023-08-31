package BucleFor;
public class ejeFor17 {
	public static void main(String[] args) {
	
		int i;
		int j;
		int k;
		int counter=0; 
		int counterPar=0;
		int counterImpar =0;
		
		   for (i=200; i<301;i+=1) {
			   counter++; 
			   System.out.println(i);
		   }
		   System.out.println("hay numero " + counter + "\n");
				
		    for (j=200; j<301;j+=2) {
		    	counterPar++;
		    	System.out.println(j);
			}
			System.out.println("hay numero de pares " + counterPar + "\n");
		
			for (k=201; k<301;k+=2) {
				counterImpar++;
				System.out.println(k);
			}
			System.out.println("hay numero de impares" + counterImpar + "\n");
	}//main
}//ejeFor17
