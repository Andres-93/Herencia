package Ejercicio1.pojo;

public class CD implements Comparable<CD>{

	protected int codigo;
	protected String tipo;

	public CD(int codigo,String tipo) {
		this.codigo = codigo;
		this.tipo = tipo;
	}
	
	
	

	public int getCodigo() {
		return codigo;
	}




	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}




	public String getTipo() {
		return tipo;
	}




	public void setTipo(String tipo) {
		this.tipo = tipo;
	}




	@Override
	public String toString() {
		return "CD [codigo=" + codigo + ", tipo=" + tipo + "]";
	}




	@Override
	public int compareTo(CD cd) {
		return this.tipo.compareTo(cd.tipo) ;
	}
/*
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CD other = (CD) obj;
		if (codigo != other.codigo)
			return false;		
		return true;
	}
	*/
	
}
