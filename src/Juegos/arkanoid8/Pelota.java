package Juegos.arkanoid8;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;

public class Pelota extends ObjetoAPintar /*implements MouseListener*/ {
	
	protected int vx = 5;
	protected int vy = -5;
	protected final int ANCHO_PELOTA = 15;
	protected final int ALTO_PELOTA = 15;
	PuntoAltaPrecision coordenadas = null;
	TrayectoriaRecta trayectoria = null;
	private long millisEnInicializacion = 0;
	private float distaciaSiguienteFrame = 5;
	private float aceleracion = 1.005f;
	private static int MAX_VELOCIDAD = 14;
	
	public int contador= 0;
	
	

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

	private static Pelota instance = null;
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
	/**
	 * el método que hace que se muevan los actores
	 */
	public void seMueve() {
		
		Nave nave = PintaArkanoid.getInstance().getNave();
		
		System.out.println("trayectoria" + this.trayectoria);
		
		if (trayectoria == null) {
			long millisAhora = new Date().getTime();
			if (millisAhora - millisEnInicializacion > 2000) {
				this.coordenadas = new PuntoAltaPrecision(this.xCoord, this.yCoord);
				this.trayectoria = new TrayectoriaRecta(-0.12f, this.coordenadas, true);
			}
			else {
				this.xCoord = nave.getxCoord() + nave.getAncho() / 2 - this.ancho / 2;
				this.yCoord = nave.getyCoord() - this.alto - 1;
			}
		}
		else { // ya existe una trayectoria
			// Rebotes
			if (this.yCoord < 0 || this.yCoord > PintaArkanoid.getInstance().getHeight() - this.alto) {
				this.trayectoria.reflejarVerticalmenteRespectoAPunto(this.coordenadas);
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
		
		
		
		// TODO: Si toco espacio o pasan 5 seg sin tocar espacio
		//if (PintaArkanoid.getInstance().getNave().isSpace() || PintaArkanoid.getInstance().getNave().isBOTTON1()) {
			
			//xCoord += vx;
			//yCoord += vy;
//		if (contador == 1) {
//			if (xCoord>PintaArkanoid.getInstance().getWidth() - ANCHO_PELOTA|| xCoord < 0) {
//				//vx = -vx  ;
//				t.reflejarHorizontalmenteRespectoAPunto(p);
//			}
//			if (yCoord>PintaArkanoid.getInstance().getHeight() - ALTO_PELOTA || yCoord < 0) {
//				//vy = -vy;
//				t.reflejarVerticalmenteRespectoAPunto(p);
//				
//			}
//			p.toString();
//			p = t.getPuntoADistanciaDePunto(p, 5);
//			xCoord = Math.round (p.x);
//			yCoord = Math.round (p.y);
//
//		}
		
						
		//}
		//else {
			//this.xCoord = PintaArkanoid.getInstance().getNave().getxCoord() +15;
			//this.yCoord = PintaArkanoid.getInstance().getNave().getyCoord() -15;
		//}
		/*xCoord += vx;
		yCoord += vy;
	
		if (xCoord>PintaArkanoid.getInstance().getWidth() - ANCHO_PELOTA|| xCoord < 0) {
			vx = -vx  ;		
		}
		if (yCoord>PintaArkanoid.getInstance().getHeight() - ALTO_PELOTA || yCoord < 0) {
			vy = -vy;
			
		}*/
		
		
	}
	/**
	 * es el movimiento de la pelota
	 */
	/*public void moverse() {
		xCoord += vx;
		yCoord += vy;
	
		if (xCoord>PintaArkanoid.getInstance().getWidth() - ANCHO_PELOTA|| xCoord < 0) {
			vx = -vx  ;		
		}
		if (yCoord>PintaArkanoid.getInstance().getHeight() - ALTO_PELOTA || yCoord < 0) {
			vy = -vy;
			
		}
		
	}*/
	

	@Override
	public void collisionWith(ObjetoAPintar objetoCollisioned) {
		super.collisionWith(objetoCollisioned);
		
//		if (objetoCollisioned instanceof Ladrillo) {
//			//vx = -vx;
//			//vy = -vy;
//			this.trayectoria.reflejarVerticalmenteRespectoAPunto(this.coordenadas);
//			SoundsRepository.getInstance().playSound(SoundsRepository.EXPLOSION);
//			
//			
//		}
//		if (objetoCollisioned instanceof Nave) {
//			//vx = -vx;
//			//vy = -vy;
//			t.reflejarVerticalmenteRespectoAPunto(p);
//			SoundsRepository.getInstance().playSound(SoundsRepository.REBOTE);
//		}
	}

	@Override
	public String toString() {
		return "Pelota [nombre=" + nombre + ", xCoord=" + xCoord + ", yCoord=" + yCoord + ", ancho=" + ancho + ", alto="
				+ alto + ", toString()=" + super.toString() + ", getNombre()=" + getNombre() + ", getxCoord()="
				+ getxCoord() + ", getyCoord()=" + getyCoord() + ", getAncho()=" + getAncho() + ", getAlto()="
				+ getAlto() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

	/**
	 * 
	 * @return
	 */
	public static Pelota getInstance() {
		if (instance == null) {
			instance = new Pelota (nombre);
		}
		return instance;
	}

	/**
	 * 
	 * @param instance
	 */
	public static void setInstance(Pelota instance) {
		Pelota.instance = instance;
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

	/*@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			this.seMueve();
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}*/

	


	
}
