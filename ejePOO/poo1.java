package poo;
public class poo1 {
	String dni;
	String nombre;
	int edad;
	int codigo;
	
	public poo1() {//alumno1
		
	}
	
	public poo1(String dni, String nombre, int edad, int codigo) {//alumno2
		 this.dni = dni;
		 this.nombre = nombre;
		 this.edad = edad;
		 this.codigo = codigo;
    }
	
	public poo1(String dni, String nombre, int codigo) {//alumno3
		 this.dni = dni;
		 this.nombre = nombre;
		 this.codigo = codigo;
		 this.edad=18;
    }
	
	public poo1(String nombre, int edad, int codigo) {//alumno4
		 this.nombre = nombre;
		 this.codigo = codigo;
		 this.edad=edad;
   }
	
	public void mostrar() {//muestra los anteriores métodos
		 System.out.println(dni+ " "+nombre+" "+edad+ " "+codigo);
	}
	
public static void main(String[] args) {
		poo1 alumno1=new poo1();
		poo1 alumno2=new poo1("12323455a","Pilar",20,111);
		poo1 alumno3=new poo1("1111111q","florencia",222);
		poo1 alumno4=new poo1("pepe",30,222);
		alumno1.mostrar();
		alumno2.mostrar();
		alumno3.mostrar();
		alumno4.mostrar();

	}//main

}//poo1
