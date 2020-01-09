package ExamenObjetos2018.Examen2;

public class Malvado extends Ser {
	
	private String nombre;
	private int puntosDeVida = (int) Math.round(Math.random()*(100-50)+50);
	private boolean vivo;
	
	public boolean estaVivo (boolean vivo) {
		if (puntosDeVida <= 0) {
			return false;
		}
		return true;
	}
	/**
	 * @param nombre
	 */
	public Malvado(String nombre) {
		super();
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Malvado \n[nombre=" + nombre + ", puntosDeVida=" + puntosDeVida + ", vivo=" + estaVivo(vivo) + "]\n";
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
	 * @return the puntosDeVida
	 */
	public int getPuntosDeVida() {
		return puntosDeVida;
	}
	/**
	 * @param puntosDeVida the puntosDeVida to set
	 */
	public void setPuntosDeVida(int puntosDeVida) {
		this.puntosDeVida = puntosDeVida;
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
