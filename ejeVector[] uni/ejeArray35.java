package vectores;
public class ejeArray35 {
   		
	public void rellenar() {
String texto = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy "
		+ "text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived "
		+ "not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s"
		+ " with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software "
		+ "like Aldus PageMaker including versions of Lorem Ipsum.";		
		
		int contador=0;
		String texto3="";
		for(int x = 0;x <texto.length();x++) {
			if(texto.charAt(x)!=' ') {
				texto3+=texto.charAt(x);
			}
		}
		
		System.out.println("Hay "+contador);
		//System.out.println(texto);
		texto3 = texto.replace(" ", "");
		System.out.println(texto3);
	}//rellenar
					
 public static void main(String[] args) {
	ejeArray35 nomb = new ejeArray35();
		nomb.rellenar();
 }//main
}//ejeArray35
