package vectores;
public class ejeArray1 {
	public static void main(String[] args) {
		//String [] cars = {"Seat","BMW","Mazda"};
		String cars[] = new String[3];
		
		cars[0] = "Seat";
		cars[1] = "BMW";
		cars[2] = "Mazda";
		
		/*for (int i=0; i<cars.length; i++) {*/
		for (String e: cars) {	
			System.out.println(e);
		}//for
	}//main
}//ejeArray1
