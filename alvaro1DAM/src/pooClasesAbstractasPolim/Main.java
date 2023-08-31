package pooClasesAbstractasPolim;
import java.util.*;
public class Main {
	Scanner scanner = new Scanner (System.in);
	public static void main(String[] args) {
		
		Main obj = new Main();
		/*Empleados emp = new Empleados("Nerea", "Null", "111M", "viuda", 1999, 69);
		Estudiantes estu = new Estudiantes("Nacho", "DJ", "222M", "viudo", "DAM");
		Profesores profe = new Profesores("Pilar", "Sanchez", "333M", "casada", "Informatica" );
		PersonalServicio ps = new PersonalServicio("Alvaro", "Moreno", "444M", "soltero", "Migraciones");*/
		obj.menu();
		
	}//Main
	
	public void menu() {
		Empleados emp = new Empleados("Nerea", "Null", "111M", "viuda", 1999, 69);
		Empleados emp2 = new Empleados("Nereo", "Nully", "112M", "soltera", 1987, 70);
		Estudiantes estu = new Estudiantes("Nacho", "DJ", "222M", "viudo", "DAM");
		Profesores profe = new Profesores("Pilar", "Sanchez", "333M", "casada",1987, 70, "Informatica" );
		Profesores profe2 = new Profesores("Pilaro", "Sanz", "334M", "casado",1987, 70, "Informatica" );
		PersonalServicio ps = new PersonalServicio("Alvaro", "Moreno", "444M", "soltero",1987, 70, "Migraciones");
		PersonalServicio ps2 = new PersonalServicio("Alba", "Moro", "445M", "soltero",1987, 70, "IT");
		
		ArrayList<Personas> arrayPersonas = new ArrayList<>();
		arrayPersonas.add(emp);
		arrayPersonas.add(emp2);
		arrayPersonas.add(estu);
		arrayPersonas.add(profe);
		arrayPersonas.add(profe2);
		arrayPersonas.add(ps);
		arrayPersonas.add(ps2);
			ArrayList<Empleados> arrayEmpleados = new ArrayList<>();
				arrayEmpleados.add(emp);
				arrayEmpleados.add(emp2);
			ArrayList<Estudiantes> arrayEstudiantes = new ArrayList<>();
				arrayEstudiantes.add(estu);
			ArrayList<Profesores> arrayProfesores = new ArrayList<>();
				arrayProfesores.add(profe);
				arrayProfesores.add(profe2);
			ArrayList<PersonalServicio> arrayPersonalServicio = new ArrayList<>();
				arrayPersonalServicio.add(ps);
				arrayPersonalServicio.add(ps2);
		
		System.out.println("Bienvenido a la Universidad GMQ, elija una opcion");
		System.out.println("1.Cambio del estado civil");
		System.out.println("2.Reasignación de despacho a un empleado");
		System.out.println("3.Matriculación de un estudiante en un nuevo curso");
		System.out.println("4.Cambio de departamento de un profesor");
		System.out.println("5.Traslado de sección de un empleado del personal de servicio");
		System.out.println("6.Imprimir toda la información de cada tipo de individuo.");
		System.out.println("7.Baja de una persona, dado su DNI.");
		System.out.println("8.Alta de una persona.");
		System.out.println("9.Calcular el salario de profesor y personal de servicio");
		int opcion = scanner.nextInt();
		
		switch (opcion) {
		
		case 1:
			cambioEstadoCivil(profe); menu();
			break;
		case 2:
			reasignacionDespacho(emp); menu();
			break;
		case 3:
			matriculacionNuevoEstudiante(estu);	menu();
			break;
		case 4:
			cambioDepartProfe(profe); menu();
			break;
		case 5:
			trasladoSeccionPS(ps); menu();
			break;
		case 6:
			imprimirInfoTipos(emp, estu, profe, ps); menu();
			break;
		case 7:
			bajaEstudiante(estu, arrayEstudiantes); menu();
			break;
		case 8:
			altaEstudiante(estu, arrayEstudiantes); menu();
			break;
		case 9:
			calculoSalario(profe, ps, arrayProfesores, arrayPersonalServicio); menu();
			break;
		default:
			menu();
		}//switch
	}//menu
	
	public String cambioEstadoCivil(Profesores profe) {
		System.out.println("Dame un nuevo estado civil para un profesor ");
		profe.setEstadoCivil(scanner.next());
		return profe.getEstadoCivil();
	}
	
	public int reasignacionDespacho(Empleados emp) {
		System.out.println("Dame un nuevo despacho para el empleado");
		emp.setNumDespacho(scanner.nextInt());
		return emp.getNumDespacho();
	}
	
	public String matriculacionNuevoEstudiante(Estudiantes estu) {
		System.out.println("Dame un nuevo cursos");
		estu.setCurso(scanner.next());
		return estu.getCurso();
	}
	
	public String cambioDepartProfe(Profesores profe) {
		System.out.println("Dame un nuevo departamento");
		profe.setDepart(scanner.next());
		return profe.getDepart();
	}
	
	public String trasladoSeccionPS(PersonalServicio ps) {
		System.out.println("Dame nueva seccion del personal de servicio");
		ps.setSeccion(scanner.next());
		return ps.getSeccion();
	}
	
	public void imprimirInfoTipos(Empleados emp, Estudiantes estu, Profesores profe, PersonalServicio ps) {
		System.out.println("Vamos a imprimir todos los datos");
		System.out.println("Empleados " + emp.getNombre() + " " + emp.getApellido() + " " + emp.getDni() + " " + emp.getEstadoCivil() + " " + emp.getAnoIncorpo() + " " + emp.getNumDespacho());
		System.out.println("EStudiantes " + estu.getNombre() + " " + estu.getApellido() + " " + estu.getDni() + " " + estu.getEstadoCivil() + " " + estu.getCurso());
		System.out.println("Profesores " + profe.getNombre() + " " + profe.getApellido() + " " + profe.getDni() + " " + profe.getEstadoCivil() + " " + profe.getDepart());
		System.out.println("Personal Servicio " + ps.getNombre() + " " + ps.getApellido() + " " + ps.getDni() + " " + ps.getEstadoCivil() + " " + ps.getSeccion());
	}
	
	public void bajaEstudiante(Estudiantes estu, ArrayList<Estudiantes> arrayEstudiantes) {
		
		System.out.println("Dame un dni");
			String num = scanner.next();
			for (int i=0; i<arrayEstudiantes.size();i++) {
				if(arrayEstudiantes.get(i).getDni().contains(num)) {
					int posicion = arrayEstudiantes.get(i).getDni().indexOf(num);
					System.out.println(arrayEstudiantes.remove(posicion) + " se borro en la posicion " + posicion );
				}	
				
			}		
			for(int i=0; i<arrayEstudiantes.size();i++) {
				System.out.println(arrayEstudiantes.get(i).getNombre() + " " + arrayEstudiantes.get(i).getApellido() + " " + arrayEstudiantes.get(i).getDni() + " " + arrayEstudiantes.get(i).getEstadoCivil() + " " + arrayEstudiantes.get(i).getCurso());
			}
	}
	
	public void altaEstudiante(Estudiantes estu, ArrayList<Estudiantes> arrayEstudiantes) {
		Estudiantes estu2 = new Estudiantes();
		System.out.println("Alta de un estudiante");
		System.out.println("Dame nombre del nuevo estudiante");
		estu2.setNombre(scanner.next());
		System.out.println("Dame apellido del nuevo estudiante");
		estu2.setApellido(scanner.next());
		System.out.println("Dame dni del nuevo estudiante");
		estu2.setDni(scanner.next());
		System.out.println("Dame estado civil del nuevo estudiante");
		estu2.setEstadoCivil(scanner.next());
		System.out.println("Dame curso del nuevo estudiante");
		estu2.setCurso(scanner.next());
		arrayEstudiantes.add(estu2);
		for(int i=0; i<arrayEstudiantes.size();i++) {
			System.out.println(arrayEstudiantes.get(i).getNombre() + " " + arrayEstudiantes.get(i).getApellido() + " " + arrayEstudiantes.get(i).getDni() + " " + arrayEstudiantes.get(i).getEstadoCivil() + " " + arrayEstudiantes.get(i).getCurso());
		}
	}
	
	public void calculoSalario(Profesores profe, PersonalServicio ps, ArrayList<Profesores> arrayProfesores, ArrayList<PersonalServicio> arrayPersonalServicio ) {
		double salEmp = 1750;
		double salPS =1500;
		double aumento1 = 0;
		double aumento2= 0;
		System.out.println("introduce la opcion a calcular salario");
		System.out.println("Elije entre profesor y personal servicio");
			String opcion = scanner.next();
				if(opcion.equalsIgnoreCase("profesor")) {
					for (int i=0; i<arrayProfesores.size();i++) {
						if(arrayProfesores.get(i).getAnoIncorpo() < 2000) {
							System.out.println("Si los profesores se incoporaron antes del 2000, su salario es: ");
							aumento1 = salEmp * 0.08;
						}
					}
					
				}
				else {
					System.out.println("its wrong");
				}
				System.out.println("El salario de los empleados son: " + (salEmp + aumento1));
				////////////////////////////////////////////////////
				if(opcion.equalsIgnoreCase("personalservicio")) {
					for (int i=0; i<arrayPersonalServicio.size();i++) {
						System.out.println("Dame estado civil a buscar");
						String op = scanner.next();
						if(op.equalsIgnoreCase("casado")) {
						if (arrayPersonalServicio.get(i).getEstadoCivil().equals(op)) {
							System.out.println("Si el personal de servicio esta casado, su salario es: ");
							aumento2= salPS*0.05;
						}
						}
					}
					
					
				}else {
					System.out.println("its wrong");
				}
				System.out.println("los salario del Personal Servicio son: " + (salPS + aumento2));
				
	}
	
	
}
