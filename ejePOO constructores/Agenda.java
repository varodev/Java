package pooConstructores;
import java.util.ArrayList;
public class Agenda {
	private ArrayList<Password> contraseñas;
    
    public Agenda(){
        contraseñas=new ArrayList();
    }
    
    public void agregarPassword(){
        contraseñas.add(new Password());
        contraseñas.add(new Password(10));
        contraseñas.add(new Password(8,"CON12345"));
        contraseñas.add(new Password(8,"Con12345"));
    }
    
    public void listarContraseñas(){
        for(int i=0;i<contraseñas.size();i++){
            System.out.println("***********");
            System.out.println("Longitud:  "+contraseñas.get(i).getLongitud());
            System.out.println("Contraseña:  "+contraseñas.get(i).getContraseña());
            if(contraseñas.get(i).esFuerte()) 
                 System.out.println("La contraseña es fuerte");
            else System.out.println("La contraseña no es fuerte");
        }
    }

	public static void main(String[] args) {
		Agenda miAgenda=new Agenda() ;
	       miAgenda.agregarPassword();
	       miAgenda.listarContraseñas();
	    }

	}


