package Juegos.arkanoid;

import java.awt.Color;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;


public class Ladrillo extends ObjetoAPintar{

	protected  Color color;
	public static Color COLORES[] = new Color[] {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GREEN,
			Color.LIGHT_GRAY, Color.MAGENTA};

	
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
