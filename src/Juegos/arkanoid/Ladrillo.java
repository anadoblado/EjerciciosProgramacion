package Juegos.arkanoid;

import java.awt.Color;
import java.awt.Graphics;
public class Ladrillo extends ObjetoAPintar{

	protected  Color color;

	
	public Ladrillo(Color color, int xCoord, int yCoord) {
		super();
		this.color = color;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(this.color);
		g.fillRect(xCoord, yCoord, 30, 10);
		
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

	

	
}
