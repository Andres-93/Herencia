package Ejercicio1.pojo;

public class Aplicaciones extends CD {

	private String empresa;

	public Aplicaciones(int codigo, String tipo, String empresa) {
		super(codigo, tipo);
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Aplicaciones [empresa=" + empresa + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	
}
