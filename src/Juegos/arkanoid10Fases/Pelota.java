package Juegos.arkanoid10Fases;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;

import Juegos.arkanoid7.SoundsRepository;

public class Pelota extends ObjetoAPintar {
	
	protected int vx = 5;
	protected int vy = -5;
	protected final int ANCHO_PELOTA = 15;
	protected final int ALTO_PELOTA = 15;
	PuntoAltaPrecision coordenadas = null; // bandera de las coordenadas del punto
	TrayectoriaRecta trayectoria = null;
	private long millisEnInicializacion = 0;// empieza a contar el tiempo cuando comenzamos
	private float distaciaSiguienteFrame = 5; // distancia al siguiente punto en pixeles, que marcará la velocidad
	private float aceleracion = 1.0005f; // aceleración de la bola
	private static int MAX_VELOCIDAD = 10; // límites para la velocidad
	
	public int contador= 0;
	
	

	
	
	public Rectangle dimensionBall = null;
	
	public Pelota(String nombre) {
		super();
		
		this.ancho = ANCHO_PELOTA;
		this.alto = ALTO_PELOTA;
		this.millisEnInicializacion = new Date().getTime();
	}

	@Override
	public void paint(Graphics2D g) {
		
		g.setColor(Color.gray);
		g.fillOval(xCoord, yCoord, ANCHO_PELOTA, ALTO_PELOTA);
		
		
	}
	public void reiniciarMillis() {
		millisEnInicializacion = new Date().getTime();
		trayectoria = null;
	}
	/**
	 * 
	 */
	public void lanzarPelota() {
		this.coordenadas = new PuntoAltaPrecision(this.xCoord, this.yCoord);
		this.trayectoria = new TrayectoriaRecta(-1.12f, this.coordenadas, true);
	}
	/**
	 * el método que hace que se muevan los actores
	 */
	public void seMueve() {
		
		Nave nave = PintaArkanoid.getInstance().getNave();
		
		System.out.println("trayectoria" + this.trayectoria);
		
		if (trayectoria == null) { // si la trayectoria está a null, creamos la trayectoria y las coordenadas del punto
			long millisAhora = new Date().getTime();
			if (millisAhora - millisEnInicializacion > 5000  ) {
				lanzarPelota();
			}
			else {
				this.xCoord = nave.getxCoord() + nave.getAncho() / 2 - this.ancho / 2;
				this.yCoord = nave.getyCoord() - this.alto - 1;
			}
		}
		else { // ya existe una trayectoria
			// Rebotes
			if (this.yCoord < 0) {
				this.trayectoria.reflejarVerticalmenteRespectoAPunto(this.coordenadas);
			}
			if (this.yCoord > PintaArkanoid.getInstance().getHeight() + 20) {
	
				
				
			}
			
			if (this.xCoord < 0 || this.xCoord > PintaArkanoid.getInstance().getWidth() - this.ancho) {
				this.trayectoria.reflejarHorizontalmenteRespectoAPunto(this.coordenadas);
			}
			
			System.out.println("distacia: " + this.distaciaSiguienteFrame + " x: " + this.xCoord + " y: " + this.yCoord);
			
			this.coordenadas = this.trayectoria.getPuntoADistanciaDePunto(this.coordenadas, this.distaciaSiguienteFrame);
			this.xCoord = Math.round(this.coordenadas.x);
			this.yCoord = Math.round(this.coordenadas.y);
			
			// Aceleración
			if (this.distaciaSiguienteFrame < MAX_VELOCIDAD) {
				this.distaciaSiguienteFrame *= this.aceleracion;
			}
		}
		
 }		
		
			

	@Override
	public void collisionWith(ObjetoAPintar objetoCollisioned) {
		super.collisionWith(objetoCollisioned);
		
		if(objetoCollisioned instanceof Ladrillo) {
			trayectoria.reflejarVerticalmenteRespectoAPunto(coordenadas);
			SoundsRepository.getInstance().playSound(SoundsRepository.EXPLOSION);
		}
		if(objetoCollisioned instanceof Nave ) {
			trayectoria.reflejarVerticalmenteRespectoAPunto(coordenadas);
			SoundsRepository.getInstance().playSound(SoundsRepository.REBOTE);
		}
	}

	@Override
	public String toString() {
		return "Pelota [nombre=" + nombre + ", xCoord=" + xCoord + ", yCoord=" + yCoord + ", ancho=" + ancho + ", alto="
				+ alto + ", toString()=" + super.toString() + ", getNombre()=" + getNombre() + ", getxCoord()="
				+ getxCoord() + ", getyCoord()=" + getyCoord() + ", getAncho()=" + getAncho() + ", getAlto()="
				+ getAlto() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	





	/**
	 * @return the vx
	 */
	public int getVx() {
		return vx;
	}

	/**
	 * @param vx the vx to set
	 */
	public void setVx(int vx) {
		this.vx = vx;
	}

	/**
	 * @return the vy
	 */
	public int getVy() {
		return vy;
	}

	/**
	 * @param vy the vy to set
	 */
	public void setVy(int vy) {
		this.vy = vy;
	}

	/**
	 * @return the dimensionBall
	 */
	public Rectangle getDimensionBall() {
		return dimensionBall;
	}

	/**
	 * @param dimensionBall the dimensionBall to set
	 */
	public void setDimensionBall(Rectangle dimensionBall) {
		this.dimensionBall = dimensionBall;
	}
	
	/**
	 * @return the contador
	 */
	public int getContador() {
		return contador;
	}

	/**
	 * @param contador the contador to set
	 */
	public void setContador(int contador) {
		this.contador = contador;
	}

	/**
	 * @return the trayectoria
	 */
	public TrayectoriaRecta getTrayectoria() {
		return trayectoria;
	}

	/**
	 * @param trayectoria the trayectoria to set
	 */
	public void setTrayectoria(TrayectoriaRecta trayectoria) {
		this.trayectoria = trayectoria;
	}


//	/**
//	 * @return the p
//	 */
//	public PuntoAltaPrecision getP() {
//		return p;
//	}
//
//	/**
//	 * @param p the p to set
//	 */
//	public void setP(PuntoAltaPrecision p) {
//		this.p = p;
//	}
//
//	/**
//	 * @return the t
//	 */
//	public TrayectoriaRecta getT() {
//		return t;
//	}
//
//	/**
//	 * @param t the t to set
//	 */
//	public void setT(TrayectoriaRecta t) {
//		this.t = t;
//	}

	
	

	


	
}
