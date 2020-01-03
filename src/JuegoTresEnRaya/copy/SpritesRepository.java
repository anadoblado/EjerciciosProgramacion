package JuegoTresEnRaya.copy;

import java.util.HashMap;

public class SpritesRepository<BufferedImage> {
	// En el almacén de imágenes se mapeará con un objeto de tipo HashMap<String, BufferedImage>
	// En este tipo de HashMap todas las claves serán de tipo String y todos los objetos
	// almacenados de tipo BufferedImage
	private HashMap<String, BufferedImage> sprites = new HashMap<String, BufferedImage>();
	
	// Variable principal del patrón Singleton
	private static SpritesRepository instance = null;
	
	

}
