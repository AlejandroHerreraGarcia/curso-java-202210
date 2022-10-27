package curso.java.excepciones;

public class ExcepcionesMain {

	public static void main(String[] args) {
		System.out.println("Inicio");
		try {
			int num = 7/0;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fin");

	}

}
