package curso.java.inicio;

import curso.java.funciones.Utils;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		crearColegio();

	}

	static void crearColegio() {
		int numAulas = Integer.parseInt(Utils.pideValor("¿Cuántas aulas tiene el colegio?"));
		int numAlumnos = 0;
		
		String [][] colegio;
		colegio= new String [numAulas][];
		
		for (int j = 0; j < colegio.length; j++) {
			colegio[j] = new String [numAlumnos = Integer.parseInt(Utils.pideValor("¿Cuantos alumnos caben en el aula " + (j +1) + "?"))];
		}
		mostrarMenu(colegio);
	}

	static void mostrarMenu(String [][] colegio) {
		
		int opcion=0;
		do {
			
			String [] menu = {"1. Insertar Alumno por Aula","2. Buscar Alumno","3. Borrar Alumno", "4. Mostrar Alumnos por Aula", "5. Mostrar Alumnos", "6. Salir"};
			Utils.pintaMenu(menu);
			opcion = Integer.parseInt(Utils.pideValor());

			switch (opcion){
				case 1: insertarAlumno(colegio);break;
				case 2: buscarAlumno(colegio);break;
				case 3: borrarAlumno(colegio);break;
				case 4: mostrarAlumonsAula(colegio);break;
				case 5: mostrarAlumnosColegio(colegio);break;
				case 6: mostrarPlazasLibres(colegio);break;
				case 7: System.out.println("Adios");break;
				default: System.out.println("Opcion incorrecta");
			}
			
		}while(opcion!=7);
		
		System.out.println("Termina");
		
		
	}

	private static void insertarAlumno(String [][] colegio) {
		
		int posicion = 0;
		int numAula =0;
		boolean aulaCorrecta = true;
		do {
			numAula = Integer.parseInt(Utils.pideValor("¿En que aula quieres meter al alummno?"))-1;
			aulaCorrecta = validaAula(numAula, colegio);
			if (!aulaCorrecta) {
				System.out.println("El aula introducida no existe");
			}
			
		}while(!aulaCorrecta);
		
		for (int i=0;i<colegio.length;i++){
            for(int j=0;j<colegio[numAula].length;j++){
            	if (colegio[numAula][j] == null) {
            		posicion = j;
            	}else {
            		System.out.println("el aula esta llena, llevando al menu");
            		mostrarMenu(colegio);
            	}
                
            }
        }
		
		String nombreAlumno = Utils.pideValor("¿Como se llama el alumno?");
		colegio[numAula][posicion] = nombreAlumno;
		System.out.println("Accion Completada");
		mostrarMenu(colegio);
		
	}

	private static void buscarAlumno(String [][] colegio) {
		
		String nombreAlumno = Utils.pideValor("¿Como se llama el alumno?");
		
		int contadorAula = 0;
		for (String[] aula : colegio) {
			contadorAula++;
			for (String alumno : aula) {
				if (alumno.equals(nombreAlumno)) {
					System.out.println("Alumno encontrado en el aula " + contadorAula);
				}
				
			}
		}
		
		mostrarMenu(colegio);
		
	}

	private static void borrarAlumno(String [][] colegio) {

		int posicionAula = 0;
		int posicionAlumno = 0;
		String nombreAlumno = Utils.pideValor("¿En que aula quieres meter al alummno?");
		for (int i=0;i<colegio.length;i++){
            for(int j=0;j<colegio[i].length;j++){
            	if (colegio[i][j].equals(nombreAlumno)) {
            		posicionAula = i;
            		posicionAlumno = j;
            	}else {
            		System.out.println("no se encontro al alumno, llevando al menu");
            		mostrarMenu(colegio);
            	}
                
            }
        }
		
		colegio[posicionAula][posicionAlumno] = null;
		System.out.println("Accion Completada");
		mostrarMenu(colegio);
		
	}

	private static void mostrarAlumonsAula(String [][] colegio) {
		int numAula = Integer.parseInt(Utils.pideValor("¿En que aula se encuentra el alumno?"))-1;
		for (int i=0;i<colegio.length;i++){
            for(int j=0;j<colegio[numAula].length;j++){
                System.out.println(colegio[numAula][j]);
            }
        }
		mostrarMenu(colegio);
		
	}

	private static void mostrarAlumnosColegio(String [][] colegio) {
		for (int i=0;i<colegio.length;i++){
            for(int j=0;j<colegio[i].length;j++){
                System.out.println(colegio[i][j]);
            }
        }
		mostrarMenu(colegio);
	}
	
	private static void mostrarPlazasLibres(String [][] colegio) {
		
		for (int i=0;i<colegio.length;i++){
            for(int j=0;j<colegio[i].length;j++){
            	if (colegio[i][j] == null) {
            		System.out.println(colegio[i][j]);
            	}else {
            		System.out.println("el colegio esta completo, llevando al menu");
            		mostrarMenu(colegio);
            	}
                
            }
        }
		
		System.out.println("Accion Completada");
		mostrarMenu(colegio);
	}
	
	static boolean validaAula (int aula, String [][] colegio) {
		return aula <= colegio.length && aula > 0;
	}

}
