package pac;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;



public class Alumno implements java.io.Serializable {
	/*b. Alumno:
			• Long id , nombre de la columna idAlumno
			• String nombre
			• String nacionalidad
			• int edad
			• String sexo
			• Set<Módulos>)
				1. La relación entre Alumno y Modulo será llamada alumno_modulo*/
	private long id;
	private String nombre;
	private String nacionalidad;
	private int edad;
	private String sexo;
	Set<Modulo> modulos;
	
	//Constructor (usar en el Main)
	public Alumno(String nombre, String nacionalidad, int edad, String sexo, Set<Modulo> modulos) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.sexo = sexo;
		this.modulos = modulos;
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
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Set<Modulo> getModulos() {
		return modulos;
	}
	public void setModulos(Set<Modulo> modulos) {
		this.modulos = modulos;
	}
	
	//método toString() de cada clase.
	/*Ejemplo:
	Insert into alumno, nombre: Juan, nacionalidad: Espaniola, edad 26, sexo: Hombre, modulos: 4*/
    @Override
    public String toString() {
        return "Insert into alumno, nombre: " + nombre + ", nacionalidad: " + nacionalidad	
        		+ ", edad: " + edad + ", sexo: " + sexo + ", modulos: " + modulos;
    }
}
