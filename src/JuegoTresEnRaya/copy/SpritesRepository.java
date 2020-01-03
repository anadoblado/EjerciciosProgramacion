package JuegoTresEnRaya.copy;

import java.util.HashMap;

public class SpritesRepository<BufferedImage> {
	// En el almac�n de im�genes se mapear� con un objeto de tipo HashMap<String, BufferedImage>
	// En este tipo de HashMap todas las claves ser�n de tipo String y todos los objetos
	// almacenados de tipo BufferedImage
	private HashMap<String, BufferedImage> sprites = new HashMap<String, BufferedImage>();
	
	// Variable principal del patr�n Singleton
	private static SpritesRepository instance = null;
	
	

}
