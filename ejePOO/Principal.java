package poo;
import java.util.*;
	public class Principal {
		   ArrayList<Estudiantes> arraylistAlumno=new ArrayList<Estudiantes>();
		
		   public void arraylist(Estudiantes alumno) {
				arraylistAlumno.add(alumno);
		}
		
		public void visualizarArraylist() {
			for(Estudiantes i: arraylistAlumno){
				System.out.println(i.getNombre()+" "+i.getApellido()+" "+i.getCorreo()+i.getEdad());
			}
		}
		
		public void arraylistFOR() {
			System.out.println("vamos a visualizar el array de otra forma");
				for(int i=0;i<arraylistAlumno.size();i++){
				System.out.println(arraylistAlumno.get(i).getNombre()+"\t"+arraylistAlumno.get(i).getApellido()+"\t"+arraylistAlumno.get(i).getCorreo()+arraylistAlumno.get(i).getEdad());
				}
		}
		
  public static void main(String[] args) {
	Principal obj=new Principal();
	    try (Scanner sc = new Scanner(System.in)) {
	  Estudiantes alumno1=new Estudiantes();
	  		System.out.println("dame el nombre:");
			String nombre=sc.next();
			System.out.println("dame el apellido");
			String apellido=sc.next();
			System.out.println("dame el correo");
			String email=sc.next();
			
		alumno1.setNombre(nombre);
		alumno1.setApellido(apellido);
		alumno1.setCorreo(email);
	  
	  Estudiantes alumno2=new Estudiantes();
	  		System.out.println("dame el nombre:");
			nombre=sc.next();
			System.out.println("dame el apellido");
			apellido=sc.next();
			System.out.println("dame el correo");
			email=sc.next();
			
		alumno2.setNombre(nombre);
		alumno2.setApellido(apellido);
		alumno2.setCorreo(email);
		
			System.out.println("vamos a visualizar el alumno1");
			System.out.println(alumno1.getNombre());
			System.out.println(alumno1.getApellido());
			System.out.println(alumno1.getCorreo());
			/*System.out.println("vamos a visualizar el alumno 2");
			System.out.println(alumno2.getNombre());
			System.out.println(alumno2.getApellido());
			System.out.println(alumno2.getCorreo());*/
			System.out.println("dame el nombre:");
			nombre=sc.next();
			System.out.println("dame el apellido");
			apellido=sc.next();
			System.out.println("dame el correo");
			email=sc.next();
			System.out.println("dame la edad");
			int edad=sc.nextInt();
			
	System.out.println("CONSTRUCTORES");
		Estudiantes alumno3=new Estudiantes(nombre,apellido,email);
		Estudiantes alumno4=new Estudiantes("pir","sancz",edad);
		Estudiantes alumno5=new Estudiantes("nerea");
			/*System.out.println(alumno3.getNombre());
			System.out.println(alumno3.getApellido());
			System.out.println(alumno3.getCorreo());
			System.out.println(alumno4.getNombre());
			System.out.println(alumno4.getApellido());
			System.out.println(alumno4.getCorreo());*/
			
		System.out.println("vamos a insertarlo en un arralist");
			obj.arraylist(alumno1);
			obj.arraylist(alumno2);
			obj.arraylist(alumno3);
			obj.arraylist(alumno4);
			obj.arraylist(alumno5);
		}//cerrando scanner
		System.out.println("Visualizar el arraylist");
		obj.visualizarArraylist();
		System.out.println("-------------------");
		obj.arraylistFOR();
  }//main	
	
		}//Principal
	

