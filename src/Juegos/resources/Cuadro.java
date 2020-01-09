package Juegos.resources;

import java.awt.Color;
import java.awt.Graphics;

import JuegoTresEnRaya.copy.TresEnRaya;

/**
 * 
 * @author anita
 *En esta clase se crea la clase del objeto "cuadro"
 *que irá pintado en el Canvas
 */
public class Cuadro {
	// Coordenadas de cada cuadro sobre el tablero
	private int xCoord, yCoord;
	// Coordenadas del pixel superior izquierdo de cada cuadro que se representará
	//en el Canvas
	private int esquinaSuperiorIzquierdaX, esquinaSuperiorIzquierdaY;
	// Ancho y alto del cuadro
	private int ancho, alto;
	// Variable booleana que cambiará cuando se haga click en un cuadro
	// del Paso 9
	// Esta variable ya no se necesita desde el paso 10
	//      private boolean clickHecho = false;
	
	// Jugador que ha hecho click sobre este cuadro, pasando el cuadro a ser
	// de su propiedad. El valor 0 indica que el cuadro no pertenece 
	// a ningún jugador
	private int jugadorPropietario = 0;

	/**
	 * @param xCoord
	 * @param yCoord
	 */
	public Cuadro(int xCoord, int yCoord) {
		super();
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	/**
	 * Utilizo este método para que cada cuadro pueda pintarse a sí mismo.
	 * Necesitamos un objeto de tipo Graphics, que nos permita acceder a la memoria de video
	 * @param g
	 */
	public void paint (Graphics g) {
		// Obtengo el ancho y alto de cada cuadro, obteniéndolos del Canvas
		// principal del juego, dividiendo el ancho y alto del Canvas entre 3
		ancho = TresEnRaya.getInstance().getWidth() / 3;
		alto = TresEnRaya.getInstance().getHeight() / 3;
		esquinaSuperiorIzquierdaX = this.xCoord * ancho;
		esquinaSuperiorIzquierdaY = this.yCoord * alto;
		
		// Lo siguiente pinta el borde de cada cuadro
		g.setColor(Color.BLACK);
		g.drawRect(esquinaSuperiorIzquierdaX, esquinaSuperiorIzquierdaY, ancho, alto);
		
		// Pinta imágenes vectoriales sobre el cuadro sobre el que se hace
		//click dentro del Paso 9
		//if (this.clickHecho) { 
		// En el Paso 10, ya no necesito sólo saber que hacen click, sino saber quién,
		// por lo que implementamos esa comprobación en el método paint
			pintaImagenesVectoriales(g);
			
		//}
	}
	
	/**
	 * Paso 9, que pinta círculos
	 * Paso 10, incorpora a este método que según el jugador se pinte una X o un círculo
	 * @param g
	 */
	private void pintaImagenesVectoriales (Graphics g) {
		// En el Paso 10, dependiendo del propietario del cuadro, se pinta una cosa u otra
		if (this.jugadorPropietario == TresEnRaya.JUGADOR_1) { // Comprueba el jugador, para 1 pinta una cruz
			// Para pintar una cruz, pintamos dos líneas que se cruzan
			g.drawLine(this.esquinaSuperiorIzquierdaX, this.esquinaSuperiorIzquierdaY, this.esquinaSuperiorIzquierdaX + this.ancho, this.esquinaSuperiorIzquierdaY + alto);
			g.drawLine(this.esquinaSuperiorIzquierdaX, this.esquinaSuperiorIzquierdaY + this.alto, this.esquinaSuperiorIzquierdaX + this.ancho, this.esquinaSuperiorIzquierdaY);
		}
		// Si es el jugador 2, reutilizamos el círculo
		if (this.jugadorPropietario == TresEnRaya.JUGADOR_2) {
			// Dentro del Paso 9 va a pintar un círculo cuando se haga 
			// click en un cuadro
			g.drawOval(this.esquinaSuperiorIzquierdaX, this.esquinaSuperiorIzquierdaY, this.ancho, this.alto);
		
		}
		}
	
	private void pintaImagenesMapasDeBits (Graphics g) {
		
	}
	
	/**
	 * Paso 8
	 * Este método detecta si el click se ha hecho dentro de las coordenadas del cuadro
	 * en el que se hace click, es decir, el cuadro que representa ese objeto sobre
	 * el que estamos
	 * @param xClick
	 * @param yClick
	 * @return
	 */
	public boolean seHaHechoClickSobreCuadro (int xClick, int yClick) {
		// Hay que comprobar si las coordenadas están dentro del espacio ocupado
		//por el cuadro
		if (xClick > this.esquinaSuperiorIzquierdaX && xClick < (esquinaSuperiorIzquierdaX + ancho) // comprueba si la coord X está dentro del ancho
				&&
			yClick > this.esquinaSuperiorIzquierdaY && yClick < (esquinaSuperiorIzquierdaY + alto)) // comprueba si la coord Y está dentro del alto 
			{
			return true;
			
		}
		return false;
	}
	
	/**
	 * En el paso 10, hacemos propietario del cuadro al jugador que hace click
	 * pasándole su dibujo
	 * Este método se ejecuta al hacer click sobre el cuadro
	 * Paso 8
	 */
	public void click ( int jugador) {// le pasamos la variable jugador, para comprobar turno, Paso 10
		if (this.jugadorPropietario == 0) {
			this.jugadorPropietario = jugador;
			
		}
		//this.clickHecho = true; // Actualizamos la bandera con el Paso 9
		// Va a obligar a repintar el Canvas en cada click con el Paso 9
		TresEnRaya.getInstance().repaint();
		TresEnRaya.getInstance().revalidate();
		
		
		// Imprime en consola dónde se hizo click
		System.out.println("Click sobre el cuadro " + this.toString());
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Cuadro [xCoord=" + xCoord + ", yCoord=" + yCoord + "," + 
				", jugadorPropietario=" + jugadorPropietario + "]";
	}

	/**
	 * @return the xCoord
	 */
	public int getxCoord() {
		return xCoord;
	}

	/**
	 * @param xCoord the xCoord to set
	 */
	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	/**
	 * @return the yCoord
	 */
	public int getyCoord() {
		return yCoord;
	}

	/**
	 * @param yCoord the yCoord to set
	 */
	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}

	/**
	 * @return the esquinaSuperiorIzquierdaX
	 */
	public int getEsquinaSuperiorIzquierdaX() {
		return esquinaSuperiorIzquierdaX;
	}

	/**
	 * @param esquinaSuperiorIzquierdaX the esquinaSuperiorIzquierdaX to set
	 */
	public void setEsquinaSuperiorIzquierdaX(int esquinaSuperiorIzquierdaX) {
		this.esquinaSuperiorIzquierdaX = esquinaSuperiorIzquierdaX;
	}

	/**
	 * @return the esquinaSuperiorIzquierdaY
	 */
	public int getEsquinaSuperiorIzquierdaY() {
		return esquinaSuperiorIzquierdaY;
	}

	/**
	 * @param esquinaSuperiorIzquierdaY the esquinaSuperiorIzquierdaY to set
	 */
	public void setEsquinaSuperiorIzquierdaY(int esquinaSuperiorIzquierdaY) {
		this.esquinaSuperiorIzquierdaY = esquinaSuperiorIzquierdaY;
	}

	/**
	 * @return the ancho
	 */
	public int getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return the alto
	 */
	public int getAlto() {
		return alto;
	}

	/**
	 * @param alto the alto to set
	 */
	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	
	
	
	
	

}
