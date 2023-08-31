package pac;
import org.hibernate.Session;
public class Profesor {
	/*c. Profesor:
			• Long id, nombre de la columna idProfesor
			• String nombre
			• String sexo*/
    private long id;
    private String nombre;
    private String sexo;
    
    
  //Constructor (usar en el Main)
    public Profesor(String nombre, String sexo) {
		this.nombre = nombre;
    	this.sexo = sexo;
	}
    
  //Getters y Setters
	public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //método toString() de cada clase.
    /*Ejemplo:
	Insert into profesor, nombre: Alvaro, sexo: Hombre*/
    @Override
    public String toString() {
        return "Insert into profesor, nombre: " + nombre + ", sexo: " + sexo;
    }

}
