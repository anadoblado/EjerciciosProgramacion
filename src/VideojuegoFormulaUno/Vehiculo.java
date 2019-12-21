package VideojuegoFormulaUno;

public abstract class Vehiculo {
	private String nombre;
	private int posicion;
	private String color;
	private Pista p;
	
	
	
	/**
	 * @param nombre
	 * @param posicion
	 * @param color
	 */
	public Vehiculo(String nombre) {
		super();
		this.nombre = nombre;
		this.posicion = 0;
		this.p = new Pista();
	}

	
    /**
     * 
     */
	public abstract void paint();
	
	@Override
	public String toString() {
		return "Vehiculo [nombre=" + nombre + ", posicion=" + posicion + ", color=" + color + "]";
	}

    /**
     * 
     */
	public void seMueve() {
		this.posicion += Utils.obtenerNumeroAleatorio(1, 6);
		
		for (int i = 0; i < p.getObstaculos().size(); i++) {
			if (p.getObstaculos().get(i).getPosicion() == posicion) {
				posicion += p.getObstaculos().get(i).getImpulso();
				System.out.println("Pisa un obstaculo");
			}
			
		}
		
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
	 * @return the color
	 */
	public String getColor() {
		return color;
	}



	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}


	

}
