package vectores;
public class ejeArray38 {
	  
	char [] matrix = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u'};
	
	int i=0;
	
	public void imprimir() {
		System.out.println("La matriz queda asi");
		for(i=0;i<matrix.length;i++) {
			if (matrix[i]=='a') {
				matrix[i]='*';
			}
			if (matrix[i]=='e') {
				matrix[i]='*';
			}
			if (matrix[i]=='i') {
				matrix[i]='*';
			}
			if (matrix[i]=='o') {
				matrix[i]='*';
			}
			if (matrix[i]=='u') {
				matrix[i]='*';
			}
		}
		
		for(i=0;i<matrix.length;i++) {
		System.out.print(matrix[i] + " ");
		}
	}
		
  public static void main(String[] args) {
	ejeArray38 nomb = new ejeArray38();
       nomb.imprimir();
  }//main
}//ejeArray38
