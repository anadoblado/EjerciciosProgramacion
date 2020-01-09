package Tema4OrientacionAObjetos.Ejercicio6Bloque3;

public class PrimerPlato extends Plato {
	
	private String bebida;
	
	public PrimerPlato () {
		super ();
	}
	
	/**
	 * 
	 * @param nombre
	 * @param precio
	 * @param bebida
	 */
	public PrimerPlato (String nombre, float precio, String bebida) {
		super (nombre, precio);
		this.bebida = bebida;
	}

}
