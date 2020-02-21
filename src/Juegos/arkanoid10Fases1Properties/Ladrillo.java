package Juegos.arkanoid10Fases1Properties;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;


public class Ladrillo extends ObjetoAPintar{

	protected  Color color;
	
	protected int dureza;
	public final int ANCHO_LADRILLO = 40;
	public final int ALTO_LADRILLO = 20;
	public static int SCORE_FOR_CRUSH = 20;

	
	public Ladrillo() {
		super();
		this.color = color;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.ancho = ANCHO_LADRILLO;
		this.alto = ALTO_LADRILLO;
		this.dureza = dureza;
	}

	@Override
	public void paint(Graphics2D g) {
		g.setColor(getColor());
		g.fillRect(xCoord, yCoord, ANCHO_LADRILLO, ALTO_LADRILLO);
		g.setColor(Color.white);
		g.drawRect(xCoord, yCoord, ANCHO_LADRILLO, ALTO_LADRILLO);
		g.setColor(Color.black);
		g.drawRect(xCoord+2, yCoord+(ANCHO_LADRILLO/4), ANCHO_LADRILLO-4, 2);
		g.drawRect(xCoord+2, yCoord+(ANCHO_LADRILLO/2), ANCHO_LADRILLO-2, 2);
		
	}
	
	
	

	/**
	 * @return the color
	 */
	public  Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	

	@Override
	public void seMueve() {
		// TODO Auto-generated method stub
		
	}

	protected boolean isMarketParaBorrar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void collisionWith(ObjetoAPintar objetoCollisioned) {
		super.collisionWith(objetoCollisioned);
		if (objetoCollisioned instanceof Pelota) {
			dureza --;
			if (dureza == 0) {
				this.setMarketParaBorrar(true);
				this.createExplosion();
				PintaArkanoid.getInstance().getNave().addScore(SCORE_FOR_CRUSH);
			}
			
		}
	}

	/**
	 * 
	 */
	public void createExplosion () {
		Explosion explota = new Explosion();
		explota.setxCoord(this.xCoord + 10);
		explota.setyCoord(this.yCoord + 5);
		PintaArkanoid.getInstance().addNewObjetoParaLaProximaIteracion(explota);
	}

	/**
	 * @return the dureza
	 */
	public int getDureza() {
		return dureza;
	}

	/**
	 * @param dureza the dureza to set
	 */
	public void setDureza(int dureza) {
		this.dureza = dureza;
	}
	

	
}
