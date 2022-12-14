package curso.java.mapas.pojo;

import java.util.List;

import curso.java.colecciones.enotas.pojo.Estudiante;

public class Colegio {
	
	private String nombre;
	private String direccion;
	private List<Estudiante> estudiantes;
	
	
	public Colegio(String nombre, String direccion, List<Estudiante> estudiantes) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estudiantes = estudiantes;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	


	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}


	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}


	@Override
	public String toString() {
		return "Colegio [nombre=" + nombre + ", direccion=" + direccion + ", estudiantes=" + estudiantes + "]";
	}


	
	
	

}
