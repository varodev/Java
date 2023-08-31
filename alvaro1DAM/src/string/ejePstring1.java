package string;
public class ejePstring1 {
    public static void main(String[] args) {
		
//a) Crear un StringBuilder con la cadena "Hola Caracola" y mostrarla por consola.
        StringBuilder s=new StringBuilder("hola Caracola");
    	StringBuilder s1=new StringBuilder("hola Caracola");
    	System.out.println(s);
//b) Mostrar por consola su longitud.
    	System.out.println("La longiutd de la cadena es:"+s.length());
/*c) Partiendo de la cadena anterior y usando los métodos de StringBuilder 
     modificar la cadena para que pase a ser "Hay Caracolas" y mostrarla.*/
    	// int posiinicial =s.indexOf("hola");
    	// int posifinal=s.indexOf("Caracola");
    	// s.replace(posiinicial,posifinal, "hay ");
    	s.replace(s.indexOf("hola "), s.indexOf("Caracola"), "hay ");
    	s.append("s");
    	System.out.println(s);
    	//OTRA FORMA DE HACERLO
    	//System.out.println(s.replace(s.indexOf("hola "), s.indexOf("Caracola"), "hay ").append("s"));
    	System.out.println("Otra forma");
    	s1.delete(0,s1.indexOf("Caracola"));
    	s1.insert(s1.indexOf("Caracola"), "hay ");
    	s1.append("s");
    	System.out.println(s1);
/*d) Partiendo de la cadena anterior y usando los métodos de StringBuilder 
     modificar la cadena para que pase a ser "Hay 5000 Caracolas" y mostrarla.*/
    	s.insert(s.indexOf("Caracolas"), " 5000 ");
    	System.out.println(s);
/*e) Partiendo de la cadena nterior y usando los métodos de StringBuilder 
     modificar la cadena para que pase a ser "Hay 5000 Caracolas en el mar" y mostrarla*/
    	s.append(" en el mar");
    	System.out.println(s);
	}//main
}//ejePstring1
