package Tema4Ejercicio3Bloque2;

public abstract class Cuestion {

	private String Enunciado;
	private String respuestaCorrecta;
	
	public Cuestion() {
	
	}
	
	
	/**
	 * @param enunciado
	 * @param respuestaCorrecta
	 */
	public Cuestion(String enunciado, String respuestaCorrecta) {
		super();
		this.Enunciado = enunciado;
		this.respuestaCorrecta = respuestaCorrecta;
	}


	
	@Override
	public String toString() {
		return "Cuestion [Enunciado=" + Enunciado + ", respuestaCorrecta=" + respuestaCorrecta + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	

	public abstract void mostrarPantalla();
	
	public abstract void evaluarPregunta();


	/**
	 * @return the enunciado
	 */
	public String getEnunciado() {
		return Enunciado;
	}


	/**
	 * @param enunciado the enunciado to set
	 */
	public void setEnunciado(String enunciado) {
		Enunciado = enunciado;
	}


	/**
	 * @return the respuestaCorrecta
	 */
	public String getRespuestaCorrecta() {
		return respuestaCorrecta;
	}


	/**
	 * @param respuestaCorrecta the respuestaCorrecta to set
	 */
	public void setRespuestaCorrecta(String respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}
	
	

}
