package pooConstructores;
import java.util.ArrayList;
public class E5Agenda {
	private ArrayList<E5Password> pass;
    
    public E5Agenda(){
        pass=new ArrayList<E5Password>();
    }
    
    public void agregarPassword(){
    	pass.add(new E5Password());
    	pass.add(new E5Password(10));
    	pass.add(new E5Password(8,"CON12345"));
    	pass.add(new E5Password(8,"Con12345"));
    }
    
    public void listarpass(){
        for(int i=0;i<pass.size();i++){
            System.out.println("***********");
            System.out.println("Longitud:  "+pass.get(i).getLongitud());
            System.out.println("Contraseña:  "+pass.get(i).getpass());
            if(pass.get(i).esFuerte()) 
                 System.out.println("La contraseña es fuerte");
            else System.out.println("La contraseña no es fuerte");
        }
    }

	public static void main(String[] args) {
		E5Agenda miAgenda=new E5Agenda() ;
	       miAgenda.agregarPassword();
	       miAgenda.listarpass();
	    }

	}


