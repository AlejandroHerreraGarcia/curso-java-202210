package curso.java.colecciones.enotas;

import java.util.HashSet;
import java.util.Set;

import curso.java.colecciones.enotas.pojo.Asignatura;
import curso.java.colecciones.enotas.pojo.Estudiante;

public class MainNotas {

	public static void main(String[] args) {

		MainNotas mn = new MainNotas();
		
		mn.crearColeccion();

	}

	private void crearColeccion() {
		Asignatura a1 = new Asignatura ("Lengua", "3");
		Asignatura a2 = new Asignatura ("Matematicas", "7");
		Asignatura a3 = new Asignatura ("Fisica", "5");
		
		Set <Asignatura> asignaturas1 = new HashSet <Asignatura>();
		asignaturas1.add(a1);
		asignaturas1.add(a2);
		asignaturas1.add(a3);
		
		Estudiante e1 = new Estudiante("pepe", "brbrbr", "1111111A", asignaturas1);
		
		//--------------------------------------------------------------------------
		
		Asignatura b1 = new Asignatura ("Lengua", "4");
		Asignatura b2 = new Asignatura ("Matematicas", "8");
		Asignatura b3 = new Asignatura ("Fisica", "6");
		
		Set <Asignatura> asignaturas2 = new HashSet <Asignatura>();
		asignaturas2.add(b1);
		asignaturas2.add(b2);
		asignaturas2.add(b3);
		
		Estudiante e2 = new Estudiante("juan", "juan", "222222B", asignaturas2);
		
		//--------------------------------------------------------------------------
		
		Asignatura c1 = new Asignatura ("Lengua", "7");
		Asignatura c2 = new Asignatura ("Matematicas", "3");
		Asignatura c3 = new Asignatura ("Fisica", "5");
		
		Set <Asignatura> asignaturas3 = new HashSet <Asignatura>();
		asignaturas3.add(c1);
		asignaturas3.add(c2);
		asignaturas3.add(c3);
		
		Estudiante e3 = new Estudiante("gigi", "gaga", "33333C", asignaturas1);
		
		//--------------------------------------------------------------------------
		
		Asignatura d1 = new Asignatura ("Lengua", "5");
		Asignatura d2 = new Asignatura ("Matematicas", "5");
		Asignatura d3 = new Asignatura ("Fisica", "5");
		
		Set <Asignatura> asignaturas4 = new HashSet <Asignatura>();
		asignaturas4.add(d1);
		//asignaturas4.add(d2);
		asignaturas4.add(d3);
		
		Estudiante e4 = new Estudiante("ye", "a", "4444444D", asignaturas2);
		
		//--------------------------------------------------------------------------
		
		Asignatura f1 = new Asignatura ("Lengua", "4");
		Asignatura f2 = new Asignatura ("Matematicas", "6");
		Asignatura f3 = new Asignatura ("Fisica", "5");
		
		Set <Asignatura> asignaturas5 = new HashSet <Asignatura>();
		asignaturas5.add(f1);
		asignaturas5.add(f2);
		asignaturas5.add(f3);
		
		Estudiante e5 = new Estudiante("chris", "to", "5555555E", asignaturas2);
		
		//--------------------------------------------------------------------------
		
		Set <Estudiante> estudiantes = new HashSet <Estudiante>();
		estudiantes.add(e1);
		estudiantes.add(e2);
		estudiantes.add(e3);
		estudiantes.add(e4);
		estudiantes.add(e5);
		
		mostrarTodos(estudiantes);
		mostrarMatematicas(estudiantes);
		mostrarAprobados(estudiantes);
		eliminiarALengua(estudiantes);
		
	}

	private void mostrarTodos(Set <Estudiante> estudiantes) {
		
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante.getNombre() + " " + estudiante.getApellidos() + " " + estudiante.getAsignaturas().toString());
		}
	}
	
	private void mostrarMatematicas(Set <Estudiante> estudiantes) {
		
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante.getNombre() + " " + estudiante.getApellidos() + " " + estudiante.getAsignaturas().toString());
		}
	}
	
	private void mostrarAprobados(Set <Estudiante> estudiantes) {
		
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante.getNombre() + " " + estudiante.getApellidos() + " " + estudiante.getAsignaturas().toString());
		}
	}
	
	private void eliminiarALengua(Set <Estudiante> estudiantes) {
		
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante.getNombre() + " " + estudiante.getApellidos() + " " + estudiante.getAsignaturas().toString());
		}
	}

}
