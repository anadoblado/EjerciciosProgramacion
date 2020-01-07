package Juegos.juego3EnRaya;

import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.HashMap;

import javax.imageio.ImageIO;

// Paso 11 donde se van a cargar imágenes desde el HashMap

/**
 * Esta clase es para el almacén de imágenes
 * @author anita
 *
 * @param <BufferedImage>
 */
public class SpritesRepository {
	// En el almacén de imágenes se mapeará con un objeto de tipo HashMap<String, BufferedImage>
	// En este tipo de HashMap todas las claves serán de tipo String y todos los objetos
	// almacenados de tipo BufferedImage
	private HashMap<String, BufferedImage> sprites = new HashMap<String, BufferedImage>();
	
	// Variable principal del patrón Singleton
	private static SpritesRepository instance = null;
	
	// Carpeta en la que se encuentran los recursos: imágenes, sonidos
	private static String RESOURCES_FOLDER = "../resources/images/";
	
	// Imágenes que van a usarse en el juego en el paso 13, que hace la carga de 
	// recursos antes de empezar
	public static String IMAGEN_JUGADOR_1 = "r2d2_a_-_copia.png";
	public static String IMAGEN_JUGADOR_2 = "bb8_a_-_copia.png";

	/**
	 * 
	 */
	public SpritesRepository() {
		this.getSprite(IMAGEN_JUGADOR_1);
		this.getSprite(IMAGEN_JUGADOR_2);
	}
	
	/**
	 * Método principal del patrón Singleton
	 * @return
	 */
	public static SpritesRepository getInstance() {
		if (instance == null) {
			instance = new SpritesRepository();
		}
		return instance;
	}
	
	/**
	 * Carga un recurso del disco duro, dentro de un objeto de tipo BufferedImage
	 * @param resourceName
	 * @return
	 */
	private BufferedImage loadImage(String resourceName) {
		// Localiza el recurso objeto de tipo URL
		URL url = null;
		
		try {
			url = getClass().getResource(resourceName);
			return ImageIO.read(url);
		}catch (Exception e) {
			// Aquí capturamos el error y vemos qué error es
			System.out.println("No se pudo cargar la imagen " + resourceName + " de " + url);
			System.out.println("El error fue: " + e.getClass().getName()+" "+e.getMessage());
			System.exit(0); //Fin del programa
		}
		return null; // A esta línea se llega si no se puede cargar el recurso
	}
	
	/**
	 * Método para obtener una imagen
	 * @param resourceName
	 * @return
	 */
	public BufferedImage getSprite(String resourceName) {
		// En la primera instancia intentamos obtener el objeto BufferedImage a partir del HashMap
		BufferedImage img = sprites.get(resourceName);
		
		// En caso de que el objeto BufferedImage no exista dentro del HashMap
		// se carga desde el discoduro
		if (img == null) {
			img = loadImage(RESOURCES_FOLDER + resourceName);
			// Una vez eue se carga en la memoria, lo agrego al HashMap
			// así no hay que volver a buscarlo fuera del HashMap. Como
			// clave del objeto en el HashMap utilizo el nombre del archivo
			sprites.put(resourceName, img);
		}
		return img;
	}
	
	
}
