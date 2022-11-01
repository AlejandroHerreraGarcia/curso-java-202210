

/*1 clase Colegio
nombre
direccion

2 Colegios: con 3 Alumnos
Map<Colegio,List<Alumnos>>

Pintar por cada colegio el nombre y direccion los alumnos que tiene
Pedir dni y se indica en que Colegio se encuentra el alumno*/


package curso.java.mapas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import curso.java.colecciones.enotas.pojo.Asignatura;
import curso.java.colecciones.enotas.pojo.Estudiante;
import curso.java.funciones.Utils;
import curso.java.mapas.pojo.Colegio;

public class Main {
	
	private List<Estudiante> estudiantesColegio1;
	private List<Estudiante> estudiantesColegio2;
	private Map<String, Colegio> mapa1;
	
	public Main() {
		this.estudiantesColegio1 = new CopyOnWriteArrayList<Estudiante>();
		this.estudiantesColegio2 = new CopyOnWriteArrayList<Estudiante>();
		this.mapa1 = new HashMap<String,Colegio>();
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.crearMetodos();

	}

	private void crearMetodos() {
		iniciarObjetos();
		//mostrarColegios();
		buscarAlumnoPorDNI();
		
	}
	
	private void iniciarObjetos() {
		
		Estudiante estudiante1Colegio1 = new Estudiante("pepe", "brbrbr", "1111111A");
		Estudiante estudiante2Colegio1 = new Estudiante("Nieves", "Bejarano", "2222222B");
		Estudiante estudiante3Colegio1 = new Estudiante("Angustias", "Jaramillo", "3333333C");
		
		estudiantesColegio1.add(estudiante1Colegio1);
		estudiantesColegio1.add(estudiante2Colegio1);
		estudiantesColegio1.add(estudiante3Colegio1);
		
		Estudiante estudiante1Colegio2 = new Estudiante("Irati", "Arias", "4444444D");
		Estudiante estudiante2Colegio2 = new Estudiante("Desire", "Mendoza", "5555555E");
		Estudiante estudiante3Colegio2 = new Estudiante("Cayetano", "Oliveira", "6666666F");
		
		estudiantesColegio2.add(estudiante1Colegio2);
		estudiantesColegio2.add(estudiante2Colegio2);
		estudiantesColegio2.add(estudiante3Colegio2);
		
		Colegio colegio1 = new Colegio("Colegio1", "Calle de la Mentira", estudiantesColegio1);
		Colegio colegio2 = new Colegio("Colegio2", "Imaginacion Limitada", estudiantesColegio2);
		
		mapa1.put("Colegio1", colegio1);
		mapa1.put("Colegio2", colegio2);
	}
	
	private void mostrarColegios() {
		
		for (String clave : mapa1.keySet()) {
			System.out.println(clave);
			System.out.println((mapa1.get(clave)));
		}
	}
	
	private void buscarAlumnoPorDNI() {
		String alumnoDNI = Utils.pideValor("Indique le DNI del alumno que busca");

		for (String clave : mapa1.keySet()) {
			for (Estudiante estudiante: mapa1.get(clave).getEstudiantes()) {
				if (estudiante.getNombre().equals(alumnoDNI)) {
					System.out.println(clave);
				}
			}
		}
	}

}
