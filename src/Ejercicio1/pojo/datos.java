package Ejercicio1.pojo;

public class datos extends CD {

	private String tipoDato;

	public datos(int codigo, String tipo, String tipoDato) {
		super(codigo, tipo);
		this.tipoDato = tipoDato;
	}

	@Override
	public String toString() {
		return "datos [tipoDato=" + tipoDato + ", toString()=" + super.toString() + "]";
	}


	
}
