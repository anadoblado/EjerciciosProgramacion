package Juegos.arkanoid6;

import java.awt.Graphics;
import java.awt.Graphics2D;


public class Explosion extends ObjetoAPintar {

	private static String[] SPRITES = new String[] {"sprite-explosion1.png", "sprite-explosion2.png", "sprite-explosion3.png",
			"sprite-explosion4.png", "sprite-explosion5.png", "sprite-explosion6.png", 
			"sprite-explosion7.png", "sprite-explosion8.png", "sprite-explosion9.png"};
	
	public Explosion() {
		super(SPRITES, 5);
		System.out.println("Explosión creada en x " + this.xCoord + " y " + this.yCoord);
	}

	/*@Override
	public void paint(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public void seMueve() {
		super.seMueve();
		if (this.currentSprite.equals(this.sprites.get(this.sprites.size()-1))) {
			this.setMarketParaBorrar(true);
			System.out.println("explotooo");
		}
	}
	


	

}
