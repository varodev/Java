package pooHerencia;
import java.util.*;

public class E4ListinProfesores  {
	ArrayList<E4Profesor> misProfesores = new ArrayList<>();
	
	public void addProfesor(E4Profesor profesor) {
		misProfesores.add(profesor);
	}
	
    public void listar(){
        System.out.println("\tLISTA DE PROFESORES");
        for(int i=0;i<misProfesores.size();i++){
            misProfesores.get(i).mostrarDatos();
        }
    }

}
