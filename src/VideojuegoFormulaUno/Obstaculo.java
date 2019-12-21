package VideojuegoFormulaUno;

public class Obstaculo {
	
	private int posicion = Utils.obtenerNumeroAleatorio(0, 99);
	private int dimension = Utils.obtenerNumeroAleatorio(1, 3);
	private int espacioOcupado = posicion+dimension;
	protected int impulso;
	
	/**
	 * @param posicion
	 * @param dimension
	 * @param manchurron
	 */
	public Obstaculo() {
		super();
		this.posicion = posicion;
		this.dimension = dimension;
		this.espacioOcupado = espacioOcupado;
		this.impulso = impulso;
	}

	@Override
	public String toString() {
		return "Obstaculo [posicion=" + posicion + ", dimension=" + dimension + ", espacioOcupado=" + espacioOcupado
				+ ", impulso=" + impulso + "]";
	}

	/**
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}

	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	/**
	 * @return the dimension
	 */
	public int getDimension() {
		return dimension;
	}

	/**
	 * @param dimension the dimension to set
	 */
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	/**
	 * @return the manchurron
	 */
	public int getEspacioOcupado() {
		return espacioOcupado;
	}

	/**
	 * @param manchurron the espacioOcupado to set
	 */
	public void setManchurron(int espacioOcupado) {
		this.espacioOcupado = espacioOcupado;
	}

	/**
	 * @return the impulso
	 */
	public int getImpulso() {
		return impulso;
	}

	/**
	 * @param impulso the impulso to set
	 */
	public void setImpulso(int impulso) {
		this.impulso = impulso;
	}

	


}
