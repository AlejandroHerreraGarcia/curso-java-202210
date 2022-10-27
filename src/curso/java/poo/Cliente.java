package curso.java.poo;

public class Cliente {
	
	private String nombre;
	private String apellidos;
	private String dni;
	private double importeCompra;
	
	
	
	public Cliente(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		importeCompra = 0;
	}

	

	public Cliente(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		importeCompra = 0;
	}

	

	public Cliente(String nombre) {
		importeCompra = 0;
		this.nombre = nombre;
	}
	
	

	public String getNombre() {
		return nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public String getDni() {
		return dni;
	}



	public double getImporteCompra() {
		return importeCompra;
	}



	void comprar(double importe) {//acttualiza el campo importe compra
		this.importeCompra += importe;
		
	}
	
	
}
