package agenda3Eva;
import java.io.*;
import java.util.*;
public class menu {
	ArrayList<persona> myper = new ArrayList<persona>();
	ArrayList<familiares> myfami = new ArrayList<>();
	ArrayList<amigos> myami = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	void menuAgenda() throws Exception {
		System.out.println("***************************************************************************************************************");
		System.out.println("Bienvenido al menú principal de la aplicacion Agenda, elija la opcion deseada(tecleando el número de la opción)");
		System.out.println("1. Insertar contacto.");
		System.out.println("2. Eliminar contacto.");
		System.out.println("3. Modificar contacto");
		System.out.println("4. Mostrar contacto.");
		System.out.println("5. Mostrar todos los contactos.");
		System.out.println("6. Mostrar todos los contactos de un tipo.");
		System.out.println("7. Guardar agenda");
		System.out.println("8. Cargar agenda.");
		System.out.println("0. Salir.");
		System.out.println("****************************************************************************************************************");
		int opcion = scanner.nextInt();
		
		do {
			switch (opcion) {
			case 1:
				insertarContacto();menuAgenda();
				break;
			
			case 2:
				eliminarContacto(myper);menuAgenda();
				break;
			
			case 3:
				modificarContacto();menuAgenda();
				break;
				
			case 4:
				mostrarContacto(myper);menuAgenda();
				break;
				
			case 5:
				mostrarAllContactos(myper);menuAgenda();
				break;
				
			case 6:	
			    mostrarTipoContacto();menuAgenda();	
			    break;
			    
			case 7:
				guardarAgenda(myper);menuAgenda();
				break;
				
			case 8:
				cargarAgenda(myper);menuAgenda();
				break;
				
			case 0:
				System.out.println("Adios");
				System.exit(0);
				
			default:
				menuAgenda();
			}
			
		}while(opcion !=0);
	}//menuAgenda
	
	public void insertarContacto() throws Exception {//opcion 1 Insertar contacto++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		System.out.println("Elija la opcion deseada al insertar contacto");
		System.out.println("1. Familiar [máximo tres entradas].");
		System.out.println("2. Amigo [máximo tres entradas].");
		System.out.println("0. Volver al menú principal.");
		int opcion = scanner.nextInt();
		
		do {
			switch (opcion) {
			case 1:
				insertarFamiliar(myfami, myper);insertarContacto();
				break;
			
			case 2:
				insertarAmigo(myami, myper);insertarContacto();
				break;
			
			case 0:
				menuAgenda();
				break;

			default: insertarContacto();	
		
			}
		}while(opcion !=0);
	}
	
	public void insertarFamiliar(ArrayList<familiares> myfami, ArrayList<persona> myper) {//metodo de insertarContacto() de familiar
		int contadorArroba = 0, contadorArroba2=0, contadorArroba3 =0;
		int contadorPunto =0, contadorPunto2=0, contadorPunto3 =0;
		int counterF=0;
		while(counterF<3) {//limitar la agenda a 3
	 familiares fami1= new familiares();
		System.out.println("Introduce nombre de1 primer familiar");
		fami1.setNombre(scanner.next());
		System.out.println("Introduce apellidos de1 primer familiar");
		fami1.setApellidos(scanner.next());
		System.out.println("Introduce correo electrónico de1 primer familiar");//se limitará a que el correo tenga solo una arroba y un punto
		String mail1 = scanner.next();
		for(int i=0; i<mail1.length();i++) {
			if(mail1.charAt(i)=='@') {
				contadorArroba++;
			}
		}for(int i=0; i<mail1.length();i++) {
			if(mail1.charAt(i)=='.') {
				contadorPunto++;
			}
		}
		
		while(contadorArroba !=1 && contadorPunto !=1 ) {
			System.out.println("error, intentelo de nuevo");
			System.out.println("Introduce correo electrónico de1 primer familiar, debe contener un punto y una @");
			mail1 = scanner.next();
				for(int i=0; i<mail1.length();i++) {
					if(mail1.charAt(i)=='@') {
						contadorArroba++;
					}
				}for(int i=0; i<mail1.length();i++) {
					if(mail1.charAt(i)=='.') {
						contadorPunto++;
					}
				}
		}
		if (contadorArroba ==1 && contadorPunto ==1) {
			fami1.setMail(mail1);
		}
		System.out.println("Introduce telefono de1 primer familiar");
		fami1.setTelefono(scanner.next());
		System.out.println("Introduce dirección del primer familiar");
		fami1.setDireccionV(scanner.next());
		System.out.println("Introduce parentesco del primer familiar (cercano o lejano)");
		String paren1 = scanner.next();
	 while(!paren1.equalsIgnoreCase("cercano") && !paren1.equalsIgnoreCase("lejano")) {//limitación a cercano y lejano
		 System.out.println("opcion erronea");
		 System.out.println("Introduce parentesco del primer familiar (cercano o lejano)");
			paren1 = scanner.next();
	 }
		fami1.setParentesco(paren1);
		System.out.println("\n");
		
		myfami.add(fami1);
		myper.add(fami1);
		counterF++;
						
	 familiares fami2= new familiares();
		System.out.println("Introduce nombre de1 segundo familiar");
		fami2.setNombre(scanner.next());
		System.out.println("Introduce apellidos de1 segundo familiar");
		fami2.setApellidos(scanner.next());
		System.out.println("Introduce correo electrónico de1 segundo familiar");
		String mail2 = scanner.next();
		for(int i=0; i<mail2.length();i++) {
			if(mail2.charAt(i)=='@') {
				contadorArroba2++;
			}
		}for(int i=0; i<mail2.length();i++) {
			if(mail2.charAt(i)=='.') {
				contadorPunto2++;
			}
		}
		
		while(contadorArroba2 !=1 && contadorPunto2 !=1 ) {
			System.out.println("error, intentelo de nuevo");
			System.out.println("Introduce correo electrónico de1 segundo familiar, debe contener un punto y una @");
			mail2 = scanner.next();
				for(int i=0; i<mail2.length();i++) {
					if(mail2.charAt(i)=='@') {
						contadorArroba2++;
					}
				}for(int i=0; i<mail2.length();i++) {
					if(mail2.charAt(i)=='.') {
						contadorPunto2++;
					}
				}
		}
		if (contadorArroba2 ==1 && contadorPunto2 ==1) {
			fami2.setMail(mail2);
		}
		System.out.println("Introduce telefono de1 segundo familiar");
		String telef1 = scanner.next();
	for (persona e: myper) {
	  while(e.getTelefono().equals(telef1)) {//limitación que el telefono no este repetido	
		  System.out.println("Este telefono ya esta en la agenda");
		  System.out.println("Introduce telefono de1 segundo familiar");
			telef1 = scanner.next();
	  }//while	
	  if(!e.getTelefono().equals(telef1)) {
		  fami2.setTelefono(telef1);
		}
	}
		System.out.println("Introduce dirección del segundo familiar");
		fami2.setDireccionV(scanner.next());
		System.out.println("Introduce parentesco del segundo familiar (cercano o lejano)");
		String paren2 = scanner.next();
	while(!paren2.equalsIgnoreCase("cercano") && !paren2.equalsIgnoreCase("lejano")) {
			 System.out.println("opcion erronea");
			 System.out.println("Introduce parentesco del segundo familiar (cercano o lejano)");
				paren2 = scanner.next();
		 }
		fami2.setParentesco(paren2);
		System.out.println("\n");
		
		myfami.add(fami2);
		myper.add(fami2);
		counterF++;
		
	 familiares fami3= new familiares();
		System.out.println("Introduce nombre de1 tercer familiar");
		fami3.setNombre(scanner.next());
		System.out.println("Introduce apellidos de1 tercer familiar");
		fami3.setApellidos(scanner.next());
		System.out.println("Introduce correo electrónico de1 tercer familiar");
		String mail3 = scanner.next();
		for(int i=0; i<mail3.length();i++) {
			if(mail3.charAt(i)=='@') {
				contadorArroba3++;
			}
		}for(int i=0; i<mail3.length();i++) {
			if(mail3.charAt(i)=='.') {
				contadorPunto3++;
			}
		}
		
		while(contadorArroba3 !=1 && contadorPunto3 !=1 ) {
			System.out.println("error, intentelo de nuevo");
			System.out.println("Introduce correo electrónico de1 tercer familiar, debe contener un punto y una @");
			mail3 = scanner.next();
				for(int i=0; i<mail3.length();i++) {
					if(mail3.charAt(i)=='@') {
						contadorArroba3++;
					}
				}for(int i=0; i<mail3.length();i++) {
					if(mail3.charAt(i)=='.') {
						contadorPunto3++;
					}
				}
		}
		if (contadorArroba3 ==1 && contadorPunto3 ==1) {
			fami3.setMail(mail3);
		}
		System.out.println("Introduce telefono de1 tercer familiar");
		String telef2 = scanner.next();
	for (persona e: myper) {
			  while(e.getTelefono().equals(telef2)) {	
				  System.out.println("Este telefono ya esta en la agenda");
				  System.out.println("Introduce telefono de1 tercer familiar");
					telef2 = scanner.next();
			  }//while	
			  if(!e.getTelefono().equals(telef2)) {
				  fami3.setTelefono(telef2);
				}
	}
		System.out.println("Introduce dirección del tercer familiar");
		fami3.setDireccionV(scanner.next());
		System.out.println("Introduce parentesco del tercer familiar (cercano o lejano)");
		String paren3 = scanner.next();
	while(!paren3.equalsIgnoreCase("cercano") && !paren3.equalsIgnoreCase("lejano")) {
				 System.out.println("opcion erronea");
				 System.out.println("Introduce parentesco del tercer familiar (cercano o lejano)");
					paren3 = scanner.next();
			 }
			fami3 .setParentesco(paren2);
			System.out.println("\n");
		
		myfami.add(fami3);
		myper.add(fami3);
		counterF++;
		}
		if (counterF ==3) {
			System.out.println("+++Agenda de familiares llena+++");
			System.out.println("\n");
		}
	}
	
	public void insertarAmigo(ArrayList<amigos> myami, ArrayList<persona> myper) {//metodo de insertarContacto() de amigo
		int contadorArroba = 0, contadorArroba2=0, contadorArroba3 =0;
		int contadorPunto =0, contadorPunto2=0, contadorPunto3 =0;
		int counterA=0;
		while(counterA<3) {//limitación a solo  3 amigos en la agenda
	 amigos ami1 = new amigos();
	    System.out.println("Introduce nombre de1 primer amigo");
		ami1.setNombre(scanner.next());
		System.out.println("Introduce apellidos de1 primer amigo");
		ami1.setApellidos(scanner.next());
		System.out.println("Introduce correo electrónico de1 primer amigo");
		String mail4 = scanner.next();
		for(int i=0; i<mail4.length();i++) {
			if(mail4.charAt(i)=='@') {
				contadorArroba++;
			}
		}for(int i=0; i<mail4.length();i++) {
			if(mail4.charAt(i)=='.') {
				contadorPunto++;
			}
		}
		
		while(contadorArroba !=1 && contadorPunto !=1 ) {
			System.out.println("error, intentelo de nuevo");
			System.out.println("Introduce correo electrónico de1 primer amigo, debe contener un punto y una @");
			mail4 = scanner.next();
				for(int i=0; i<mail4.length();i++) {
					if(mail4.charAt(i)=='@') {
						contadorArroba++;
					}
				}for(int i=0; i<mail4.length();i++) {
					if(mail4.charAt(i)=='.') {
						contadorPunto++;
					}
				}
		}
		if (contadorArroba ==1 && contadorPunto ==1) {
			ami1.setMail(mail4);
		}
		System.out.println("Introduce telefono de1 primer amigo");
		String telef3 = scanner.next();
	for (persona e: myper) {
			  while(e.getTelefono().equals(telef3)) {	
				  System.out.println("Este telefono ya esta en la agenda");
				  System.out.println("Introduce telefono de1 primer amigo");
					telef3 = scanner.next();
			  }//while	
			  if(!e.getTelefono().equals(telef3)) {
				  ami1.setTelefono(telef3);
				}
	}
		System.out.println("Introduce afinidad del primer amigo (un entero entre 1 y 5, siendo 1 el grado de menor afinidad y 5 el de mayor afinidad)");
		int afinidad1 = scanner.nextInt();
			while (afinidad1 !=1 && afinidad1 !=2 && afinidad1 !=3 && afinidad1 !=4 && afinidad1 !=5)  {//salir cuando afinidad sea mayor q 0 y menor que 5, limitación de afinidad
			  System.out.println("error, introduce de nuevo");
			  System.out.println("Introduce afinidad del primer amigo (un entero entre 1 y 5, siendo 1 el grado de menor afinidad y 5 el de mayor afinidad)");
				afinidad1 = scanner.nextInt();
				scanner.nextInt();
			}	
		  ami1.setAfinidad(afinidad1);
		  System.out.println("\n");
		
		myami.add(ami1);
		myper.add(ami1);
		counterA++;
	
	 amigos ami2 = new amigos();
	    System.out.println("Introduce nombre de1 segundo amigo");
		ami2.setNombre(scanner.next());
		System.out.println("Introduce apellidos de1 segundo amigo");
		ami2.setApellidos(scanner.next());
		System.out.println("Introduce correo electrónico de1 segundo amigo");
		String mail5 = scanner.next();
		for(int i=0; i<mail5.length();i++) {
			if(mail5.charAt(i)=='@') {
				contadorArroba2++;
			}
		}for(int i=0; i<mail5.length();i++) {
			if(mail5.charAt(i)=='.') {
				contadorPunto2++;
			}
		}
		
		while(contadorArroba2 !=1 && contadorPunto2 !=1 ) {
			System.out.println("error, intentelo de nuevo");
			System.out.println("Introduce correo electrónico de1 segundo amigo, debe contener un punto y una @");
			mail5 = scanner.next();
				for(int i=0; i<mail5.length();i++) {
					if(mail5.charAt(i)=='@') {
						contadorArroba2++;
					}
				}for(int i=0; i<mail5.length();i++) {
					if(mail5.charAt(i)=='.') {
						contadorPunto2++;
					}
				}
		}
		if (contadorArroba2 ==1 && contadorPunto2 ==1) {
			ami2.setMail(mail5);
		}
		System.out.println("Introduce telefono de1 segundo amigo");
		String telef4 = scanner.next();
	for (persona e: myper) {
			  while(e.getTelefono().equals(telef4)) {	
				  System.out.println("Este telefono ya esta en la agenda");
				  System.out.println("Introduce telefono de1 segundo amigo");
					telef4 = scanner.next();
			  }//while	
			  if(!e.getTelefono().equals(telef4)) {
				  ami2.setTelefono(telef4);
				}
	}
		System.out.println("Introduce afinidad del segundo amigo (un entero entre 1 y 5, siendo 1 el grado de menor afinidad y 5 el de mayor afinidad)");
		int afinidad2 = scanner.nextInt();
			while (afinidad2 !=1 && afinidad2 !=2 && afinidad2 !=3 && afinidad2 !=4 && afinidad2 !=5)  {//salir cuando afinidad sea mayor q 0 y menor que 5
			  System.out.println("error, introduce de nuevo");
			  System.out.println("Introduce afinidad del segundo amigo (un entero entre 1 y 5, siendo 1 el grado de menor afinidad y 5 el de mayor afinidad)");
				afinidad2 = scanner.nextInt();
			}
		ami2.setAfinidad(afinidad2);
		System.out.println("\n");
		
		myami.add(ami2);
		myper.add(ami2);
		counterA++;
	 
	 amigos ami3 = new amigos();
	 	System.out.println("Introduce nombre de1 tercer amigo");
		ami3.setNombre(scanner.next());
		System.out.println("Introduce apellidos de1 terceramigo");
		ami3.setApellidos(scanner.next());
		System.out.println("Introduce correo electrónico de1 tercer amigo");
		String mail6 = scanner.next();
		for(int i=0; i<mail6.length();i++) {
			if(mail6.charAt(i)=='@') {
				contadorArroba3++;
			}
		}for(int i=0; i<mail6.length();i++) {
			if(mail6.charAt(i)=='.') {
				contadorPunto3++;
			}
		}
		
		while(contadorArroba3 !=1 && contadorPunto3 !=1 ) {
			System.out.println("error, intentelo de nuevo");
			System.out.println("Introduce correo electrónico de1 tercer amigo, debe contener un punto y una @");
			mail6 = scanner.next();
				for(int i=0; i<mail6.length();i++) {
					if(mail6.charAt(i)=='@') {
						contadorArroba3++;
					}
				}for(int i=0; i<mail6.length();i++) {
					if(mail6.charAt(i)=='.') {
						contadorPunto3++;
					}
				}
		}
		if (contadorArroba3 ==1 && contadorPunto3 ==1) {
			ami3.setMail(mail6);
		}
		System.out.println("Introduce telefono de1 tercer amigo");
		String telef5 = scanner.next();
	for (persona e: myper) {
			  while(e.getTelefono().equals(telef5)) {	
				  System.out.println("Este telefono ya esta en la agenda");
				  System.out.println("Introduce telefono de1 tercer amigo");
					telef5 = scanner.next();
			  }//while	
			  if(!e.getTelefono().equals(telef5)) {
				  ami3.setTelefono(telef5);
				}
	}
		System.out.println("Introduce afinidad del tercer amigo (un entero entre 1 y 5, siendo 1 el grado de menor afinidad y 5 el de mayor afinidad)");
		int afinidad3 = scanner.nextInt();
		while (afinidad3 !=1 && afinidad3 !=2 && afinidad3 !=3 && afinidad3 !=4 && afinidad3 !=5)  {//salir cuando afinidad sea mayor q 0 y menor que 5
			  System.out.println("error, introduce de nuevo");
			  System.out.println("Introduce afinidad del segundo amigo (un entero entre 1 y 5, siendo 1 el grado de menor afinidad y 5 el de mayor afinidad)");
				afinidad3 = scanner.nextInt();
			}
		ami3.setAfinidad(afinidad3);
		System.out.println("\n");
		
		myami.add(ami3);
		myper.add(ami3);
		counterA++;
		}
		if(counterA ==3) {
			System.out.println("+++Agenda de amigos llena+++");
			System.out.println("\n");
		}
	}
	
	public void eliminarContacto(ArrayList<persona> myper) {//opcion 2 Eliminar contacto+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		if(myper.isEmpty()) {
			System.out.println("Vacio, Por favor, ingrese un contacto primero, utilizando la opción 1");
		}else {
		boolean bo = false;
		System.out.println("los telefonos en la agenda son: " );//muestra de todos los telefonos
		for (int i=0; i<myper.size();i++) {
			System.out.println(myper.get(i).getTelefono());
		}
		System.out.println("Introduce el número de teléfono a eliminar almacenado en la agenda");//se elimina en función del telefono
		String numtelf = scanner.next();
		for (int i=0; i<myper.size();i++) {
			if(myper.get(i).getTelefono().equalsIgnoreCase(numtelf)){
				myper.remove(i);
				System.out.println("Teléfono eliminado de la agenda");
				bo=true;//cuando se elimina, pasa a true
			}
		}	
		if(bo==false) {
			System.out.println("Telefóno no existe");
		}
		}	
	}
	
	public void modificarContacto() throws Exception {//opcion 3 Modificar contacto+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 if(myper.isEmpty()) {
			System.out.println("Vacio, Por favor, ingrese un contacto primero, utilizando la opción 1");
		}else {
		System.out.println("Elija la opcion deseada al modificar contacto");
		System.out.println("1.- Modificar Teléfono");
		System.out.println("2.- Modificar Correo electrónico.");
		System.out.println("3.- Modificar Dirección");
		System.out.println("0. Volver al menú principal.");
		int opcion = scanner.nextInt();
		
		do {
			switch (opcion) {
			case 1:
				modTelef(myper); modificarContacto();
				break;
			
			case 2:
				modMail(myper); modificarContacto();
				break;
				
			case 3:
				modDire(myfami);modificarContacto();
				break;
						
			case 0:
				menuAgenda();
				break;

			default: insertarContacto();	
		
			}
		}while(opcion !=0);
	 }
	}
	
	public void modTelef(ArrayList<persona> myper) {// metodo de modificarContacto()
		System.out.println("Se ha elegido modificar el número de teléfono");
		System.out.println("los telefonos de la agenda son: " );
		for (int i=0; i<myper.size();i++) {
			System.out.println(myper.get(i).getTelefono());
		}
			System.out.println("Introduce número de teléfono a modificar");
			String cambiatelef = scanner.next();
			for (persona e: myper) {
				if (e.getTelefono().equalsIgnoreCase(cambiatelef)) {
					System.out.println("Introduce nuevo número de telefono para ser modificado");
					String metetelf = scanner.next();
					e.setTelefono(metetelf);
					System.out.println("Teléfono modificado");//modificacion de telefonos de persona
				}
			}
	}
	
	public void modMail(ArrayList<persona> myper) {// metodo de modificarContacto()
		int contadorArroba =0, contadorPunto=0;
		System.out.println("Se ha elegido modificar el correo electronico ");
		System.out.println("los correos electrónicos de la agenda son: " );//muestra los correos electronicos de la agenda
		for (int i=0; i<myper.size();i++) {
			System.out.println(myper.get(i).getMail());
		}
			System.out.println("Introduce correo electronico a modificar");
			String cambiamail = scanner.next();
			for (persona e: myper) {
				if (e.getMail().equalsIgnoreCase(cambiamail)) {
					System.out.println("Introduce correo electronico para ser modificado, debe contener un punto y una @"); //modificacion de mail teniendo en cuenta la restricción de @ y .
					String metemail = scanner.next();
					for(int i=0; i<metemail.length();i++) {
						if(metemail.charAt(i)=='@') {
							contadorArroba++;
						}
					}for(int i=0; i<metemail.length();i++) {
						if(metemail.charAt(i)=='.') {
							contadorPunto++;
						}
					}
					
					while(contadorArroba !=1 && contadorPunto !=1 ) {
						System.out.println("error, intentelo de nuevo");
						System.out.println("Introduce correo electronico para ser modificado, debe contener un punto y una @");
						metemail = scanner.next();
							for(int i=0; i<metemail.length();i++) {
								if(metemail.charAt(i)=='@') {
									contadorArroba++;
								}
							}for(int i=0; i<metemail.length();i++) {
								if(metemail.charAt(i)=='.') {
									contadorPunto++;
								}
							}
					}
					if (contadorArroba ==1 && contadorPunto ==1) {
						e.setMail(metemail);//si se cumple las condiciones se modifica
					}
					System.out.println("Correo electrónico modificado");
				}
			}
	}
	
	public void modDire(ArrayList<familiares> myfami) {// metodo de modificarContacto()
		System.out.println("Se ha elegido modificar la dirección");
		System.out.println("las direcciones de la agenda son: " );
		for(int i=0; i<myfami.size();i++) {
			System.out.println(myfami.get(i).getDireccionV());
		}
			System.out.println("Introduce dirección a modificar");
			String cambiadire = scanner.next();
			for(familiares e: myfami) {
				if(e.getDireccionV().equalsIgnoreCase(cambiadire)) {
					System.out.println("Introduce dirección para ser modificado");
					String metedire = scanner.next();
					e.setDireccionV(metedire);
					System.out.println("Dirección modificada");
				}
			}
	}
	
	public void mostrarContacto(ArrayList<persona> myper) {//opcion 4 Mostrar contacto+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		if(myper.isEmpty()) {
			System.out.println("Vacio, Por favor, ingrese un contacto primero, utilizando la opción 1");
		}else {
		System.out.println("Se ha elegido, introduciendo un número de teléfono, mostrar los datos de ese contacto");//mostrar contactos en funcion del telefono
		System.out.println("los telefonos de la agenda son: " );
		for (int i=0; i<myper.size();i++) {
			System.out.println(myper.get(i).getTelefono());
		}
		System.out.println("Introduce un número de teléfono");
		String phone = scanner.next();
		for(persona e: myper) {
			if(e.getTelefono().equalsIgnoreCase(phone)) {
				System.out.println(e.toString());
			}
		}
		}
	}
	
	public void mostrarAllContactos(ArrayList<persona> myper) {//opcion 5 Mostrar todos los contactos+++++++++++++++++++++++++++++++++++++++++++++++++
		persona aux;//se guarda el valor en una variable auxiliar
		if(myper.isEmpty()) {
			System.out.println("Vacio, Por favor, ingrese un contacto primero, utilizando la opción 1");
		}else {
		System.out.println("Se ha elegido mostrar todos los contactos de la agenda ordenados en orden creciente por número de teléfono");
		
		for (int i=0; i<myper.size();i++) {
			for(int j=i+1; j<myper.size();j++) {
				if((myper.get(i).getTelefono().compareTo(myper.get(j).getTelefono()))>0) {//se muestra todos los contactos en orden creciente
					aux = myper.get(i);
					myper.set(i,myper.get(j));
					myper.set(j,aux);
				}
			}
		}	
		
		for(int i=0; i<myper.size();i++) {
			System.out.println(myper.get(i).toString());
		}
		System.out.println("el numero total de elementos almacenados en la agenda es de " + myper.size());
		}
	}
	
	public void mostrarTipoContacto() throws Exception {//opcion 6 Mostrar todos los contactos de un tipo++++++++++++++++++++++++++++++++++++++++++++++++
		if(myper.isEmpty()) {
			System.out.println("Vacio, Por favor, ingrese un contacto primero, utilizando la opción 1");
		}else {
		System.out.println("Elija la opcion deseada al mostrar todos los contactos de un tipo");
		System.out.println("1. Familiar.");
		System.out.println("2. Amigo.");
		System.out.println("0. Volver al menú principal.");
		int opcion = scanner.nextInt();
		
		do {
			switch (opcion) {
			case 1:
				mosFamiliar(myfami);mostrarTipoContacto();
				break;
			
			case 2:
				mosAmigo(myami);mostrarTipoContacto();
				break;
			
			case 0:
				menuAgenda();
				break;

			default: insertarContacto();	
		
			}
		}while(opcion !=0);
		}
	}
	
	public void mosFamiliar(ArrayList<familiares> myfami) {//metodo de mostrarTipoContacto()
		System.out.println("Se ha elegido mostrar todos los contactos de familiares");
		for(familiares e: myfami) {
			System.out.println(e.toString());
		}
		System.out.println("el numero total de elementos almacenados de familiares en la agenda son: " + myfami.size());
	}
	
	public void mosAmigo(ArrayList<amigos> myami) {//metodo de mostrarTipoContacto()
		amigos aux;//se guarda el valor en una variable auxiliar
		System.out.println("Se ha elegido mostrar todos los contactos de amigos, se mostrará de forma creciente por grado de afinidad");
		
		for (int i=0; i<myami.size();i++) {
			for(int j=i+1; j<myami.size();j++) {
				if(myami.get(i).getAfinidad()>myami.get(j).getAfinidad()) {//se muestra todos los amigos con un orden creciente de afinidad
					aux = myami.get(i);
					myami.set(i,myami.get(j));
					myami.set(j,aux);
				}
			}
		}	
		
		for(int i=0; i<myami.size();i++) {
			System.out.println(myami.get(i).toString());
		}
		System.out.println("el numero total de elementos almacenados de amigos en la agenda son: " + myami.size());
	}
				
	public void guardarAgenda(ArrayList<persona> myper) throws IOException {//opcion7 Guardar agenda+++++++++++++++++++++++++++++++++++++++++++++++++++++
		if(myper.isEmpty()) {
			System.out.println("Vacio, Por favor, ingrese un contacto primero, utilizando la opción 1");
		}else {
		System.out.println("Se ha elegido la opción de guardar la agenda en un fichero");
		File f = new File("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\Proyecto Agenda\\agenda.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
	if(f.exists()) {	
		System.out.println("Fichero existente");
			for(persona e: myper) {
				bw.write(e.toString());//se pasa los datos del arraylist al fichero
				bw.newLine();
			}
		bw.flush();
		bw.close();
	}else {
		System.out.println("El fichero no existe. Se creará automáticamente");
		f.createNewFile();
	}
		}
		}	
	
	public void cargarAgenda(ArrayList<persona> myper) throws Exception {//opcion8 Cargar agenda++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		if(myper.isEmpty()) {
			System.out.println("Vacio, Por favor, almacene primero un contacto, utilizando la opción 7");
		}else {
		System.out.println("Se ha elegido la opción de introducir el nombre del fichero y de mostrar la agenda almacenada");
		System.out.println("Los ficheros almacenados son:");
		String directorio = "C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\Proyecto Agenda";
		File f = new File (directorio);
		
		if(f.exists()) {
			File[] ficheros = f.listFiles();//se muestra todos los ficheros del directorio, se guarda en un array y se recorre
				for(int i=0; i<ficheros.length;i++) {
				System.out.println(ficheros[i].getName());	
				}
				
		}else {
			System.out.println("No existe directorio");
		}
		
		String directorio2 = "C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\Proyecto Agenda";
		System.out.println("Introduce el nombre del fichero a mostrar por consola");
		String nombref = scanner.next();//se introduce el nombre del fichero por teclado
		String cadena;
		File f2 = new File(directorio2, nombref);
		FileReader fr2=new FileReader(f2);
        BufferedReader br = new BufferedReader(fr2);
				
		if(f2.exists()) {
			while((cadena = br.readLine())!=null) {//se lee linea a linea
		          System.out.println(cadena);
			}
			System.out.println("Agenda mostrada...");
		}else {
			System.out.println("No existe fichero");
		}
		br.close();
	}
	}
}
