package solucionExamenInvaders;

public class Personaje {

	private String nombre;
	private int puntosVida;
	private boolean vivo;
	
	/**
	 * 
	 * @param nombre
	 */
	public Personaje(String nombre) {
		this.nombre = nombre;
		this.vivo = true;
		this.puntosVida = (int) Math.round(Math.random() * (100 - 50) + 50);
	}
	
	
	/**
	 * 
	 */
	public void doblarPuntosDeVida() {
		this.puntosVida *= 2;
	}
	
	
	/**
	 * 
	 */
	public void recibirDisparo () {
		this.puntosVida -= (int) Math.round(Math.random() * (25 - 5) + 5);
		if (this.puntosVida <= 0) {
			this.vivo = false;
		}
	}
	

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", puntosVida=" + puntosVida + ", vivo=" + vivo + "]";
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
	 * @return the puntosVida
	 */
	public int getPuntosVida() {
		return puntosVida;
	}

	/**
	 * @param puntosVida the puntosVida to set
	 */
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	/**
	 * @return the vivo
	 */
	public boolean isVivo() {
		return vivo;
	}

	/**
	 * @param vivo the vivo to set
	 */
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
	

}
