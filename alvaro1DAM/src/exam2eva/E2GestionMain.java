package exam2eva;
import java.util.*;
public class E2GestionMain {

	public static void main(String[] args) {
try (Scanner sc = new Scanner (System.in)) {
	E2Empleado empleado1=new E2Empleado("111a","Pepi",2000,5,15);
	
	//en este caso el objeto es empleado1 y le hemos dado los datos del primer constructor.El constructor siempre se llama igual que la clase.
	E2Empleado empleado2 = new E2Empleado("222b","Pepe",20);//2º empleado con el segundo constructor:
	
	// en este caso sueldo base e importe de horas extras lo hemos metido por teclado desde el constructor en la clase empleado.
	E2Empleado empleado3 = new E2Empleado("3333c","Pepa",2500,25);
		
	// este es el empleado que hemos creado en la clase Main que es un constructor por defecto , que esta vacio () y podemos usar todos los 
	// atributos que queramos.
	// EL EMPLEADO 4 Y EL 5 SE HAN CREADO USANDO SET. EL 4 LO HEMOS CREADO DIRECTAMENTE, Y EL 5 LO PEDIMOS POR TECLADO.
	E2Empleado empleado4 = new E2Empleado();
	 empleado4.setDni("4444d");
	 empleado4.setNombre("Pipa");
	 empleado4.setSueldoBase(1500);
	 empleado4.setHorasExtras(20);
	 empleado4.setImporteHorasExtras(10);
	
	//También podemos hacer que todo se pida por teclado. EJEMPLO
	E2Empleado empleado5=new E2Empleado();
	 System.out.println("Introduce el dni");
	 empleado5.setDni(sc.next());
	 System.out.println("Introduce un nombre");
	 empleado5.setNombre(sc.next());
	 System.out.println("Introduce el sueldo base");
	 empleado5.setSueldoBase(sc.nextDouble());
	 System.out.println("Introduce las horas extras");
	 empleado5.setHorasExtras(sc.nextDouble());
	 System.out.println("Introduce el importe de las horas extras");
	 empleado5.setImporteHorasExtras(sc.nextDouble());
		
	//ULTIMA PARTE
	/*A continuación el programa mostrará:
	1.	Los datos de los empleados con el total de su salario (salario+horas extras *importe) 
	2.	El empleado que más cobra y el que menos */
	//En este caso vamos a hacer un VECTOR para que podamos visualizar todos los empleados.

	E2Empleado[] empleado= {empleado1,empleado2,empleado3,empleado4,empleado5};// este vector es del mismo tipo que el objeto Empleado.
	mostrar(empleado); //aquí llamamos al metdodo void "MOSTRAR"
	mayorSalario(empleado);
	menorSalario(empleado);
	}
	//1ºCrea tres empleados con constructores uno con cada constructor creado.
	//cUANDO LLAMEMOS A LOS EMPLEADOS DESDE LOS CONSTRUCTORES TENEMOS QUE METERLOS EN EL MIMSO ORDEN EN EL QUE ESTEN LOS CAMPOS.
	}//main
	
	//1º VAMOS A CREAR UN METODO QUE SEA MOSTRAR EMPLEADOS:
	public static void mostrar(E2Empleado[]empleado) { //lo tenemos que hacer void porque esta dentro del Main y el main es static y el vector tambien lo tenemos dentro del main
		   for (int i=0;i < empleado.length;i++) { //recorremos el vector, cogiendo el empleado 1 y sucesivamente el resto. Con un solo for vemos todos los empleados.
				System.out.println(empleado[i].getDni()+" " + empleado[i].getNombre()+" "+empleado[i].getHorasExtras()+" "+ empleado[i].getImporteHorasExtras()+ "  "+ empleado[i].getSueldoBase()+ " "+empleado[i].totalACobrar());
		   }// con una sola linea en el syso lo vemos todo, al haberlos metido en un vector.
	}//CIERRE MOSTRAR
	
	//EMPLEADO QUE MAS COBRA:
	public static void mayorSalario(E2Empleado[]empleado) {
		   double salarioMayor=Integer.MIN_VALUE; //CURIOSO.
		   //Vamos a tener un variable que almacene la posicion donde esta el empleado con mayor salario para compararlo.
			int posicionMayor=0;
				for(int i=0;i<empleado.length;i++) {
				    if(empleado[i].totalACobrar()>salarioMayor) {
					    		salarioMayor=empleado[i].totalACobrar();
								posicionMayor=i;
					}
				}
			    System.out.println("El salario mayor es "+ salarioMayor+"El empleado es" + empleado[posicionMayor].getNombre());
	}//CIERRE SALARIO MAYOR
	
	//EMPLEADO QUE MENOS COBRA:		
	public static void menorSalario(E2Empleado[]empleado) {
		   double salarioMenor=Integer.MAX_VALUE;//también lo podiamos inicializar a 0 o usar estar constante de Integer.
		   int posicionMenor=0;
			   for(int i=0;i<empleado.length;i++) {
				   if(empleado[i].totalACobrar()<salarioMenor) {
						       salarioMenor=empleado[i].totalACobrar();
						       posicionMenor=i;
				    }
				}
				System.out.println("El salario menor es "+ salarioMenor+"El empleado es" + empleado[posicionMenor].getNombre());
	}//CIERRE SALARIO MENOR
}
