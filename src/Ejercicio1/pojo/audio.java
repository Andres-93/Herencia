package Ejercicio1.pojo;

public class audio extends CD {

	private String formato;

	public audio(int codigo, String tipo, String formato) {
		super(codigo, tipo);
		this.formato = formato;
	}

	@Override
	public String toString() {
		return "audio [formato=" + formato + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
