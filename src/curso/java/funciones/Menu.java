package curso.java.funciones;

import java.util.Scanner;

public class Menu {
	
	public static void pintaMenu(String menu) {
		System.out.println(menu);
	}
	
	public static void pintaMenu() {		
		pintaMenu("1. Pintar cuadro\\n2. Validar email\\n3. Fibonacci\\n4. Escribir nombres\\5. Salir");

	}
	
	public static void pintamenu(String [] menu) {
		for (String opcion : menu) {
			pintaMenu(opcion);
		}
	}

}
