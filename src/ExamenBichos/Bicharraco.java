package ExamenBichos;

public class Bicharraco {

	private String nombre;
	private int puntosDeVida;
	private boolean vivo;
	private int disparosRecibidos;
	
	
	/**
	 * 
	 */
	public void recibirTrallazo () {
		this.puntosDeVida -= Math.round(Math.random()*(25-5)+5);
		disparosRecibidos++;
		if (puntosDeVida<=0) {
			vivo = false;
		}
	}
	
	/**
	 * @param nombre
	 * @param  
	 * @param puntosDeVida
	 * @param vivo
	 * @param disparosRecibidos
	 */
	public Bicharraco(String nombre) {
		this.nombre = nombre;
		this.puntosDeVida = (int) Math.round(Math.random()*(100-50)+50);
		this.vivo = true;
		this.disparosRecibidos = 0;
	}

	
	
	
	@Override
	public String toString() {
		return "Bicharraco [nombre=" + nombre + ", puntosDeVida=" + puntosDeVida + ", vivo=" + vivo
				+ ", disparosRecibidos=" + disparosRecibidos + "]";
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

	/**
	 * @return the disparosRecibidos
	 */
	public int getDisparosRecibidos() {
		return disparosRecibidos;
	}

	/**
	 * @param disparosRecibidos the disparosRecibidos to set
	 */
	public void setDisparosRecibidos(int disparosRecibidos) {
		this.disparosRecibidos = disparosRecibidos;
	}
	
	
	
	
	
	
	
	
	
	

}
