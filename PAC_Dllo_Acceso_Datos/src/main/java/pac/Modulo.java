package pac;
import org.hibernate.Session;
public class Modulo {
	/*a. Modulo:
		• Long id, nombre de la columna idModulo
		• String nombre
		• String código*/
    private long id;
    private String nombre;
    private String codigo;
    
    //Constructor (usar en el Main)
    public Modulo(String nombre, String codigo) {
    	//this.id = id;
    	this.nombre = nombre;
    	this.codigo = codigo;
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
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    //método toString() de cada clase.
    /*Ejemplo:
	Insert into modulo, nombre: Programacion B, codigo: M03B*/
    @Override
    public String toString() {
        return "Insert into modulo, nombre: " + getNombre() + ", codigo: " + getCodigo();
    }

}
