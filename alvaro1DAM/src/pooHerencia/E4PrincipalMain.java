package pooHerencia;
public class E4PrincipalMain {

	public static void main(String[] args) {
		
		E4ListinProfesores miListin=new E4ListinProfesores();
			E4Profesor profesor1=new E4Profesor("Raquel","Lopez",38,"t122");
			E4Profesor titular1=new E4ProfesorTitular("Jose","Lozano",50,"t123",12);
			E4Profesor interino1=new E4ProfesorInterino("Pepe","Luna",25,"t123",1990);
       
             miListin.addProfesor(profesor1);
             miListin.addProfesor(interino1);
             miListin.addProfesor(titular1);
             miListin.listar();
    }
}
