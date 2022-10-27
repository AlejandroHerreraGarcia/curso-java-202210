package curso.java.inicio;

public class Arrays {

	public static void main(String[] args) {

		String [][] colores = new String [3][];
		colores[0] = new String [3];
		colores[1] = new String [5];
		colores[2] = new String [2];
		
		colores[0][1] = "Blanco"; 
		System.out.println(colores[0][0]); 
		System.out.println(colores[0][1]); 
		System.out.println(colores[0][2]); 
		
	}

}
