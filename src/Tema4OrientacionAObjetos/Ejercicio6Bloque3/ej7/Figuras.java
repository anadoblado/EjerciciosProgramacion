package Tema4OrientacionAObjetos.Ejercicio6Bloque3.ej7;

public abstract class Figuras {
	protected int base;
	protected int altura;
	protected String figuraRelleno = "*";
	
	
	/**
	 * @param base
	 * @param algura
	 */
	public Figuras (int base, int algura) {
		super();
		this.base = base;
		this.altura = algura;
	}


	

	/**
	 * @return the base
	 */
	public int getBase() {
		return base;
	}


	/**
	 * @param base the base to set
	 */
	public void setBase(int base) {
		this.base = base;
	}


	/**
	 * @return the altura
	 */
	public int getAlgura() {
		return altura;
	}


	/**
	 * @param algura the altura to set
	 */
	public void setAlgura(int altura) {
		this.altura = altura;
	}
	
	public abstract void imprimir ();


}
