package ExamenObjetos2018;

import java.util.Arrays;

public class Jugador {

	private String nombre;
	private Carta mano[] = new Carta[5];
	/**
	 * @param nombre
	 * @param mano
	 */
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
		
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", mano=" + Arrays.toString(mano) + "]";
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
	/**
	 * @return the mano
	 */
	public Carta[] getMano() {
		return mano;
	}
	/**
	 * @param mano the mano to set
	 */
	public void setMano(Carta[] mano) {
		this.mano = mano;
	}
	
	
	
	

}
