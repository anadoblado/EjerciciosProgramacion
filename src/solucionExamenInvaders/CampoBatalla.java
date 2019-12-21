package solucionExamenInvaders;

public class CampoBatalla {

	private String nombre;
	public static int LONGITUD_ARRAY = 20;
	private Humano humanos[] = new Humano[LONGITUD_ARRAY];
	private Malvado malvados[] = new Malvado[LONGITUD_ARRAY];
	
	
	public CampoBatalla(String nombre) {
		this.nombre = nombre;
		
		for (int i = 0; i < LONGITUD_ARRAY; i++) {
			humanos[i] = new Humano("Hum-" + i);
			malvados[i] = new Malvado("Malv-" + i);
		}
		
		// Doblo los puntos de vida del último elemento de cada array
		humanos[humanos.length-1].doblarPuntosDeVida();
		malvados[malvados.length-1].doblarPuntosDeVida();
		
		// Mezclo los arrays
		mezclarArray(humanos);
		mezclarArray(malvados);
	}
	
	
	/**
	 * 
	 * @param array
	 */
	public void mezclarArray (Personaje array[]) {
		for (int i = 0; i < array.length; i++) {
			int indice1 = (int) Math.round(Math.random() * (array.length - 1));
			int indice2 = (int) Math.round(Math.random() * (array.length - 1));
			
			Personaje aux = array[indice1];
			array[indice1] = array[indice2];
			array[indice2] = aux;
		}
	}
	
	
	/**
	 * 
	 * @return
	 */
	public boolean esFinDeJuego () {
		// Para saber si ha llegado el fin del juego, necesito saber si los arrays de humanos o de malvados
		// tienen algún elemento vivo.
		// Empiezo con el array de los humanos
		boolean humanosVivos = quedanElementosVivosEnArray(humanos);
		boolean malvadosVivos = quedanElementosVivosEnArray(malvados);		
		
		if (!malvadosVivos || !humanosVivos) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public boolean quedanElementosVivosEnArray (Personaje array[]) {
		if (getPrimerElementoVivoEnArray(array) != null) {
			return true;
		}
		return false;
	}

	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public Personaje getPrimerElementoVivoEnArray (Personaje array[]) {
		for (Personaje p : array) {
			if (p.isVivo()) {
				return p;
			}
		}		
		return null;
	}

	/**
	 * 
	 */
	public void imprimirSituacionActual () {
		System.out.println("\nSituación actual");
		for (Malvado m : this.malvados) {
			System.out.print(m.getNombre() + ":" + m.getPuntosVida() + "  ");
		}
		System.out.println();
		for (Humano h : this.humanos) {
			System.out.print(h.getNombre() + ":" + h.getPuntosVida() + "  ");
		}
	}

	/**
	 * @return the humanos
	 */
	public Humano[] getHumanos() {
		return humanos;
	}


	/**
	 * @param humanos the humanos to set
	 */
	public void setHumanos(Humano[] humanos) {
		this.humanos = humanos;
	}


	/**
	 * @return the malvados
	 */
	public Malvado[] getMalvados() {
		return malvados;
	}


	/**
	 * @param malvados the malvados to set
	 */
	public void setMalvados(Malvado[] malvados) {
		this.malvados = malvados;
	}
	
	
	
}
