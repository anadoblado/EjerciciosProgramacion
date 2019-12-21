package Tema4OrientacionAObjetos.Ejercicio6Bloque3.ej3;

public class Fruta extends ElementoDeArbol {

	private String nombre;
	
	public Fruta() {
		super();
	}
	/**
	 * @param nombre
	 */
	public Fruta(String nombre) {
		super();
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	

	
}
