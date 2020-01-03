package VideojuegoFormulaUno;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import ExamenObjetos2018.Examen2.Utils;

public class Pista {

	List<Obstaculo> tropezones = new  ArrayList <Obstaculo>();
	private int longitud = 100;
	int ancho, alto;
	int xCoord = 0, yCoord = 0;
    int esquinaSuperiorIzquierdaX = 0, esquinaSuperiorIzquierdaY = 0;
	//static int contador = 0;
	
	public Pista(int yCoord) {
		this.yCoord = yCoord;
		crearObstaculo();
		//System.out.println("------------------------------------------------------>"+ contador  );
		//contador = contador + 1;
	}
	/**
	 * 
	 */
	public void crearObstaculo() {
		System.out.println("Estamos en la pista"  );
		for (int i = 0; i < 4; i++) {
			float ale = Utils.obtenerNumeroAleatorio(0, 1);
			if (ale < 0.5) {
				tropezones.add(new Rampa("Rampa", this.yCoord));
			}
			if (ale >= 0.5) {
				tropezones.add(new ManchaAceite("Mancha", this.yCoord));
			}
			System.out.println("el obstaculo " + tropezones.get(i).getNombre() + " está en la posición " + tropezones.get(i).getPosicion() + "," + tropezones.get(i).getY() + " ocupa " +
			tropezones.get(i).getDimension());
			System.out.println("");
		}
	}

	/**
	 * @return the obstaculos
	 */
	public List<Obstaculo> getObstaculos() {
		return tropezones;
	}

	/**
	 * @param obstaculos the obstaculos to set
	 */
	public void setObstaculos(List<Obstaculo> obstaculos) {
		this.tropezones = obstaculos;
	}

	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	/**
	 * 
	 * @param g
	 */
	public void paint(Graphics g) {
		
		// Pinto un rectángulo tan grande como las dimensiones del Canvas
//		ancho = PintaCarrera.getInstance().getWidth();
//		alto = PintaCarrera.getInstance().getHeight()/4;
		ancho = PintaCarrera.getJframeWidth();
		alto = PintaCarrera.getJframeHeight()/4;
			esquinaSuperiorIzquierdaX = xCoord;
			esquinaSuperiorIzquierdaY = yCoord;
			g.setColor(Color.red);
			g.drawRect(esquinaSuperiorIzquierdaX, esquinaSuperiorIzquierdaY, ancho, alto);
			for (Obstaculo obstaculo : tropezones) {
				obstaculo.paint(g);
				
			}
		
		
		
	}
	
	
}

