package Juegos.arkanoid7;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public abstract class ObjetoAPintar {
	protected static String nombre;
	protected  int xCoord;
	protected  int yCoord;
	protected int ancho, alto;
	protected boolean markedParaBorrar = false;
	protected int spriteChangeSpeed = 0;
	private int timeUnit = 0;
	protected BufferedImage currentSprite = null;
	public List <BufferedImage> sprites = new ArrayList<BufferedImage>();
	

	/**
	 */
	public ObjetoAPintar() {
		super();
	
	}
	
	ObjetoAPintar(String spriteName){
		this.spriteChangeSpeed = 1;
		cargarImagenesDeSprite(new String[] {spriteName});
	}
	/**
	 * Indica los nombres de los sprites que vamos a usar
	 * @param spriteNames
	 */
	public ObjetoAPintar(String spriteNames[]) {
		this.spriteChangeSpeed = 1;
		cargarImagenesDeSprite(spriteNames);
		
	}
	/**
	 * A cada objeto de tipo Sprite le da una velocidad
	 * @param spriteNames
	 * @param spriteChangeSpeed
	 */
	public ObjetoAPintar(String spriteNames[], int spriteChangeSpeed) {
		this.spriteChangeSpeed = spriteChangeSpeed;
		cargarImagenesDeSprite(spriteNames);
	}
	
	/**
	 * Carga una lista de imágenes en la lista de Sprites
	 * @param spriteNames
	 */
	private void cargarImagenesDeSprite(String[] spriteNames) {
		for (String sprite : spriteNames) {
			this.sprites.add(SpritesRepository.getInstance().getSprite(sprite));
		}
		//ajusto el primer sprite del actor
		if (this.sprites.size() > 0) {
			this.currentSprite = this.sprites.get(0);
		}
		adjustHeightAndWidth();
	}
	
	
	/**
	 * Ajusta el ancho y alto de los sprites
	 */
	private void adjustHeightAndWidth() {
		if(this.sprites.size() > 0) {
			this.alto = this.sprites.get(0).getHeight();
			this.ancho = this.sprites.get(0).getWidth();
		}
		for(BufferedImage sprite : this.sprites) {
			if(sprite.getWidth() > this.ancho) {
				this.ancho = sprite.getWidth();
			}
			if(sprite.getHeight() > this.alto) {
				this.alto = sprite.getHeight();
			}
		}

	}
	
	/**
	 * pinta el sprite actual en las coordenadas establecidas
	 * @param g
	 */
	public void paint(Graphics2D g) {
		g.drawImage(this.currentSprite, this.xCoord, this.yCoord, null);
	}

		
	public void seMueve() {
		if(this.sprites != null && this.sprites.size() > 1) {
			timeUnit++;
			if(timeUnit % spriteChangeSpeed == 0) {
				timeUnit = 0;
				
				int indexCurrentSprite = sprites.indexOf(this.currentSprite);
				int indexNextSprite = (indexCurrentSprite + 1) % sprites.size();
				this.currentSprite = sprites.get(indexNextSprite);
			}
		}
	}


	

	@Override
	public String toString() {
		return "ObjetosAPintar [nombre=" + nombre + ", xCoord=" + xCoord + ", yCoord=" + yCoord
				+ ", ancho=" + ancho + ", alto=" + alto + ", getNombre()=" + getNombre() 
				+ ", getxCoord()=" + getxCoord() + ", getyCoord()=" + getyCoord() + ", getAncho()=" + getAncho()
				+ ", getAlto()=" + getAlto() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	

	/**
	 * Son los objetos marcados para eliminar
	 * @return
	 */
	public boolean isMarkedParaBorrar() {
		return markedParaBorrar;
	}

	/**
	 * Marcamos con el boolean los que van a salir
	 * @param markedParaBorrar
	 */
	public void setMarketParaBorrar(boolean markedParaBorrar) {
		this.markedParaBorrar = markedParaBorrar;
	}
	
	/**
	 * Detecta las colisiones con los objetos
	 * @param objetoCollisioned
	 */
	public void collisionWith (ObjetoAPintar objetoCollisioned) {}
	
	/**
	 * 
	 * @return
	 */
	public BufferedImage getImage() {
		return currentSprite;
	}
	
	/**
	 * 
	 * @param image
	 */
	public void setImage (BufferedImage image) {
		this.currentSprite = image;
		this.adjustHeightAndWidth();
	}
	
	

	/**
	 * @return the spriteChangeSpeed
	 */
	public int getSpriteChangeSpeed() {
		return spriteChangeSpeed;
	}
	/**
	 * @param spriteChangeSpeed the spriteChangeSpeed to set
	 */
	public void setSpriteChangeSpeed(int spriteChangeSpeed) {
		this.spriteChangeSpeed = spriteChangeSpeed;
	}
	/**
	 * @return the timeUnit
	 */
	public int getTimeUnit() {
		return timeUnit;
	}
	/**
	 * @param timeUnit the timeUnit to set
	 */
	public void setTimeUnit(int timeUnit) {
		this.timeUnit = timeUnit;
	}
	/**
	 * @return the currentSprite
	 */
	public BufferedImage getCurrentSprite() {
		return currentSprite;
	}
	/**
	 * @param currentSprite the currentSprite to set
	 */
	public void setCurrentSprite(BufferedImage currentSprite) {
		this.currentSprite = currentSprite;
	}
	/**
	 * @return the sprites
	 */
	public List<BufferedImage> getSprites() {
		return sprites;
	}
	/**
	 * @param sprites the sprites to set
	 */
	public void setSprites(List<BufferedImage> sprites) {
		this.sprites = sprites;
	}

	

}
