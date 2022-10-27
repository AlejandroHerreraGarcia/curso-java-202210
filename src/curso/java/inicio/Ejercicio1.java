package curso.java.inicio;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mostrarMenu();
		

	}

	private static void mostrarMenu() {
		Scanner opcionMenu = new Scanner(System.in);
		System.out.println("1. Pintar cuadro");
		System.out.println("2. Validar email");
		System.out.println("3. Fibonacci");
		System.out.println("4. Insertar nombres");
		System.out.println("5. Salir\n");
		System.out.println("Selecciona una opcion");
		
		int respuesta = opcionMenu.nextInt();
		
		validarRespuestaMenu(respuesta);
	}

	private static void validarRespuestaMenu(int respuesta) {
		// TODO Auto-generated method stub
		
		 if(respuesta == 1) {
			pintarCuadro();
		}else if(respuesta == 2) {
			validarEmail();
		}else if(respuesta == 3) {
			fibonacci();
		}else if(respuesta == 4) {
			insertarNombres();
		}else if(respuesta == 5) {
			System.exit(0);
		} else {
			System.out.println("Respuesta incorrecta vuelve a seleccionar");
			mostrarMenu();
		}
			
		}

	private static void insertarNombres() {
		System.out.println("Escribe los nombres");
		
	}

	private static void fibonacci() {
		Scanner numerosMostrar = new Scanner(System.in);
		System.out.println("Indica la cantidad de numeros a mostrar");
		int numeroFibo = numerosMostrar.nextInt();
		int suma = 0;
		int num1 = 0;
		int num2 = 1;
		for (int i = 0; i <= numeroFibo; i++) {
			
			System.out.println(suma);		//muestro la suma
			suma = num1 + num2;				//hacemos la suma
			num1 = num2;					// igualamos el valor de el primer numero por el segundo (ej: 0, 1, 1, 2, 3, 5)
			num2 = suma;					//cambiamos la suma pro el segundo numero

		}
		
	}

	private static void validarEmail() {
		Scanner emailValidar = new Scanner(System.in);
		System.out.println("Escribe el email a validar");
		String email = emailValidar.nextLine();
		email = email.trim();
		
		int contArroba = 0;
		for (int i = 0; i < email.length(); i++) {
			if (String.valueOf(email.charAt(i)).contains("@")) {
				contArroba++;
			}
		}
		
		int contLastChar = 0;
		/*
		 * for (int j = email.length() -1; j >= 0; j--) { if
		 * (String.valueOf(email.charAt(j)).contains(".")) { contLastChar =
		 * email.length() - j -1; System.out.println(contLastChar); } }
		 */
		contLastChar = email.substring(email.lastIndexOf(".")+1).length();
		
		
		
		if (email.contains(" ") ) {
			System.out.println("El email no es valido, No puede contener espacios en blanco");
		}else if(contArroba != 1) {
			System.out.println("El email no es valido, Solo tiene que haber 1 @");
			
		}else if(!email.substring(email.indexOf("@")).contains(".")){
			System.out.println("el email no es valido, Después de la @ tiene que haber al menos un punto");
		}else if(contLastChar < 2 || contLastChar > 6){
			System.out.println("El email no es valido, Después del último punto tiene que haber entre 2 y 6 caracteres");
		}else {
			System.out.println("El email es valido");
		}
		
	}

	private static void pintarCuadro() {
		Scanner tamanoCuadro = new Scanner(System.in);
		System.out.println("Indica el tamano del cuadro");
		int tamano = tamanoCuadro.nextInt();
		for (int i = 0; i < tamano; i++) {
			for (int j = 0; j < tamano; j++) {
				if (i > 0 && i < (tamano -1) && j > 0 && j < (tamano -1)) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
		
	


	

}
