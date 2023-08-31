package pooConstructores;
import java.util.*;
public class Sucursal {
	private ArrayList<CuentaCorriente> cuentas = new ArrayList<CuentaCorriente>();
    Scanner teclado;
    private String nombre;
    private int numCuenta;

    Sucursal() {

//CuentaCorriente cliente1=new CuentaCorriente(“Sara”);
//CuentaCorriente cliente2=new CuentaCorriente("Andrea", 100);
//CuentaCorriente cliente3=new CuentaCorriente(“Carlos”);
//cuentas.add(cliente1);
//cuentas.add(cliente2);
//cuentas.add(cliente3);
        
//Se trabaja con el arrayList

        cuentas.add( new CuentaCorriente("Sara"));
        cuentas.add( new CuentaCorriente("Andrea", 100));
        cuentas.add( new CuentaCorriente("Carlos"));
        teclado = new Scanner(System.in);
        numCuenta = -1;
        System.out.println("**********BIENVENIDO AL BANCO**********\n");

    }
    void operar() {
    	System.out.println("Quieres consultar un nuevo clientes");
        String opc=teclado.next();
        if (opc.equalsIgnoreCase("si")){
        	
        	System.out.println("\n**********BIENVENIDO AL BANCO**********\n");
            teclado.nextLine();//vaciado buffer
            obtenerCliente();
        
                  
        }
        else{
        	System.out.println("Adios, ten un buen día");
        	System.exit(0);
    	
        }
    }

    private void obtenerCliente() {
        System.out.print("\nNOMBRE CLIENTE: ");
        nombre = teclado.nextLine();
        for (int i = 0; i < cuentas.size(); i++) {
if (nombre.equals(cuentas.get(i).retornarCliente())) {//metodo clase anterior
                numCuenta = i;//igualas a la posicion
                menu();
                break;
            }
        }
        if (numCuenta == -1) { //la posicion es -1 por no existe
            System.out.print("\nEl cliente no existe.\n");
            operar();
          
        }
    
    }

    private void menu() {
    	
 
        System.out.println("\n*********MENÚ*********");
        System.out.println("1> ingresar");
        System.out.println("2> extraer");
        System.out.println("3> mostrar saldo");
        System.out.println("4> salir");
        System.out.print("Introduzca opción: ");
        int opcion=teclado.nextInt();
        teclado.nextLine();
        switch (opcion) {
            case 1:
                ingresarCantidad();
                break;
            case 2:
                extraerCantidad();
                break;
            case 3:
                mostrarSaldo();
                break;
            case 4:
                System.out.println("\n*****GRACIAS POR SU VISITA " + 
				    nombre + "******\n");
        }
                numCuenta = -1;
        
                operar();
      
               
    }

    private void ingresarCantidad() {
        System.out.print("CANTIDAD A INGRESAR: ");
        float cantidad = teclado.nextFloat();
        teclado.nextLine();
        cuentas.get(numCuenta).ingresar(cantidad);//accedo al AL
        System.out.println("\nOPERACIÓN REALIZADA CON ÉXITO\n");
        System.out.println("\nPulse intro para continuar...");
        teclado.nextLine();
        menu();
    }
    private void extraerCantidad() {
        System.out.print("CANTIDAD A RETIRAR: ");
        float cantidad = teclado.nextFloat();
        teclado.nextLine();
        cuentas.get(numCuenta).extraer(cantidad);
        System.out.println("\nOPERACIÓN REALIZADA CON ÉXITO");
        System.out.println("\nPulse intro para continuar...");
        teclado.nextLine();        
        menu();
    }

    private void mostrarSaldo() {
        System.out.println("\nSALDO: " + 
			  cuentas.get(numCuenta).retornarCantidad()+ " €");        
        System.out.println("\nPulse intro para continuar...");
        teclado.nextLine();        
        menu();
    }
}
