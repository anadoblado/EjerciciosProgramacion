package Juegos.arkanoid2;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;


public class Nave extends ObjetoAPintar implements KeyListener {

	private BufferedImage image;
	protected boolean left, right;
	protected int vx;
	protected static final int SPEED = 4;
	
	public Nave() {
		// definimos las coordenadas para comenzar el juego
		this.xCoord = 250;
		this.yCoord = 700;
		image = SpritesRepository.getInstance().getSprite("nave-50x15.png");
		this.ancho = this.image.getWidth();
		this.alto = this.image.getHeight();
	}

	

	@Override
	public void paint(Graphics g) {
		drawImage(g);
		
	}
	
	private void drawImage(Graphics g) {
		g.drawImage(this.image, this.xCoord, this.yCoord, null);
		
	}
	

	@Override
	public void seMueve() {
		// la nave se mueve de forma horizontal
		this.xCoord += this.vx;
		
		// limitar el movimiento para que no se salga de los bordes del canvas
		if(this.xCoord < 0) {
			this.xCoord = 0;
		}
		if(this.xCoord > PintaArkanoid.getInstance().getWidth() - this.getAncho()) {
			this.xCoord = PintaArkanoid.getInstance().getWidth() - this.getAncho();
			
		}
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_RIGHT: right = true;
		break;
		case KeyEvent.VK_LEFT: left = true;
		break;
		
		default;
	
		}	
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
