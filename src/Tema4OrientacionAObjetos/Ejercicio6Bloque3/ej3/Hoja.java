package Tema4OrientacionAObjetos.Ejercicio6Bloque3.ej3;

public class Hoja extends ElementoDeArbol {

	private String nombre;
	
	public Hoja() {
		super();
	}

	
	/**
	 * @param nombre
	 */
	public Hoja(String nombre) {
		super();
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Hoja [nombre=" + nombre + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	
}
