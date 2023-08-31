package exam2eva;
import java.util.*;
public class E1Menu {
Scanner sc = new Scanner (System.in);
	
	private ArrayList<String>empleados = new ArrayList<String>(); 
	private int [] salarioEmpleados = new int[6];
	
	public int menu() {
		@SuppressWarnings("unused")
		int opcion; //mejor usar las variables locales con metodos que retornan valores.
		           // aqui queremos que nos retorne opcion con las opciones que vamos a elegir.
		          // fijaser que el menu es INT, por lo que devuelve un entero.
		System.out.println("1. ALTA");
		System.out.println("2. BAJA");
		System.out.println("3. MODIFICAR");
		System.out.println("4. CONSULTA");
		System.out.println("5. LISTADO");
		System.out.println("6. SALIR");
		System.out.println("Elige una opcion");
		return opcion=sc.nextInt();
	}//CIERRE MENU
	
	public void menuOpciones() {
		int opcion = menu(); // como opcion es local la puedo volver a usar.
		switch (opcion) {
			  case 1 : alta(); //ahora puede dar errores porque no hemos creado los metodos, luego desaparece.
			  menuOpciones(); // este es para que vuelva al menu de nuevo a elegir.
		      break;
		      case 2: baja();
		      menuOpciones();
		      break;
		      case 3 : modificar();
		      menuOpciones();
		      break;
		      case 4 : consulta();
		      menuOpciones();
		      break;
		      case 5 : listado();
		      menuOpciones();
		      break;
		      case 6: System.out.println("Has elegido SALIR");
		      System.exit(0);
		      break;
		      default: 
		      System.out.println("Opciones incorrecta");
			  menuOpciones();
		 }//CIERRE SWITCH
	}//CIERRE MENU OPCIONES
	
	public void alta() {
		System.out.println("Introduce el nombre del empleado");
		String nombre = sc.next();
		empleados.add(nombre);
		int posicion=empleados.indexOf(nombre); //devuelve la posicion donde este el empleado que acabo de introducir
		//para ir al vector e insertar el salario del empleado con el nombre del empleado, queremos que correspondan.
		System.out.println("Introduce el salario del empleado");
		int salario = sc.nextInt();
		salarioEmpleados[posicion]=salario;// se asigna un salario
	}// CIERRE ALTA
		
	public void baja() {
		//debemos comprobar que la lista esta vacio o no. Para ver si podemos dar de baja
		if(empleados.isEmpty()) {
			System.out.println("La lista no contiene nombres");
		}else {
			//visualizaremos los nombres de la lista que tenemos con un arraylist
			System.out.println(empleados); // aqui nos muestra el contenido del arraylist (visualiza los nombres)
			System.out.println("Introduce el nombre del empleado a borrar");
			String empleadoEliminar = sc.next();
				if(empleados.contains(empleadoEliminar)) {//comprobar que existe dicho empleado
					int posicion=empleados.indexOf(empleadoEliminar);//sacamos en que posicion esta para ir al vector y despues ya eliminamos para machacar ese dato
					empleados.remove(posicion);
					int tam=empleados.size();
				
						for (int i=posicion; i<tam;i++) {//con el for vamos a ir desde el nombre a eliminar hasta el tamaño del array list
							salarioEmpleados[i]=salarioEmpleados[i+1];//desplazamos una posicion
						}//CIERRE FOR
						
				  salarioEmpleados[tam]=0; // la ultima posicion que teniamos del vector se pone a 0.
				 System.out.println("Empleado dado de baja correctamente");
				}else {
				System.out.println("Empleado introducido no existe");
				}// Cierre else
		}//CIERRE ELSE
	}//CIERRE BAJA
		
	public void modificar() {
		// tendremos que mirar que queremos modificar, si el nombre o el salario.
		System.out.println("Elige la opcion a modificar");
		System.out.println("1. NOMBRE");
		System.out.println("2. SALARIO");
		
		int opcion= sc.nextInt();
			switch(opcion) {
				case 1:
				System.out.println(empleados);
				System.out.println("Introduce el nombre a modificar");
				String nombreModificar=sc.next();
				System.out.println("Introduce el nuevo nombre");
				String nuevoNombre = sc.next();
						if(empleados.contains(nombreModificar)) {
							int posicionNombre=empleados.indexOf(nombreModificar);
							empleados.set(posicionNombre, nuevoNombre);
			     			System.out.println("Nombre modificado");
			     		}else{
			      			System.out.println("Nombre no encontrado, no se puede modificar");
			     	    }
		        break;
		        case 2:
				System.out.println("empleados");
			    System.out.println("Dame el nombre del empleado a modificar");
			    String nombre=sc.next();
			    		if(empleados.contains(nombre)) {
			    			int posicionNombre=empleados.indexOf(nombre);
			    			System.out.println("Dame el salario a modificar");
			    			int salario=sc.nextInt();
							salarioEmpleados[posicionNombre]=salario;
							System.out.println("Salario modificado correctamente");
						}else {
							System.out.println("El nombre no se encuentra");
					    }
			    break;
				default :
				System.out.println("opcion incorrecta");
				break;
		   }//CIERRE SWITCH
	}// CIERRE MODIFICAR
		
	public void consulta() {
		if(empleados.isEmpty()) {
			System.out.println("Lista vacia");
		}else {
			System.out.println(empleados);
			System.out.println("Nombre a consultar");
			String empleado = sc.next();
				if(empleados.contains(empleado)) {
					int posicion = empleados.indexOf(empleado);
					System.out.println("Salario:" + salarioEmpleados[posicion]);
				}else {
				   System.out.println("Empleado no existe");
				}
		}
	}//CIERRE CONSULTA
		
	public void listado() {
		if(empleados.isEmpty()) {
			System.out.println("Lista vacia");
		}else {
			for(int i=0;i <empleados.size();i++) {
				System.out.println(empleados.get(i));
				System.out.println("Salario:" + salarioEmpleados[i]);
			}
		}
	}
}
