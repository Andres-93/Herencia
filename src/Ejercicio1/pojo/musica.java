package Ejercicio1.pojo;

public class musica extends CD {

	private String discografica;

	public musica(int codigo, String tipo, String discografica) {
		super(codigo, tipo);
		this.discografica = discografica;
	}

	@Override
	public String toString() {
		return "musica [discografica=" + discografica + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
