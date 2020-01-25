package Juegos.arkanoid6;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.util.HashMap;



public class SoundsRepository {
	// Almacén de sonidos
	private HashMap<String, AudioClip> sounds = new HashMap<String, AudioClip>();
	
	// Variable principal del patrón Singleton
	private static SoundsRepository instance = null;
	
	// Carpeta con los recursos de sonido
	private static String RESOURCES_FOLDER = "../res/";
	
	// Se fijan los sonidos que vamos a utilizar
	public static String MUSICA_DE_FONDO = "Arkanoid-start-of-stage.wav";
	public static String EXPLOSION = "explosion.wav";
	public static String REBOTE = "Arkanoid-SFX-01.wav";
	
	
	/**
	 * Constructor por defecto de los sonidos
	 */
	public SoundsRepository() {
		this.getAudioClip(MUSICA_DE_FONDO);
		this.getAudioClip(EXPLOSION);
		this.getAudioClip(REBOTE);
		
	}
	
	/**
	 * Método principal del patrón Singleton
	 * @return
	 */
	public static SoundsRepository getInstance() {
		if (instance == null) {
			instance = new SoundsRepository();
		}
		return instance;
	}
	
	/**
	 * Carga un sonido en forma de AudioClip desde el disco duro
	 * @param name
	 * @return
	 */
	private AudioClip loadResource(String name) {
		URL url = null;
		url = getClass().getResource(name);
		return Applet.newAudioClip(url);
	}
	
	/**
	 * Obtiene el archivo de audio, AudioClip, del HashMap, si no lo encuentra allí
	 * va a buscarlo al disco duro y lo guarda en el HashMap para otras cargas
	 * @param resourceName
	 * @return
	 */
	private AudioClip getAudioClip(String resourceName) {
		// En primera instancia intentamos obtener el objeto AudioClip a partir del HashMap
		AudioClip clip = sounds.get(resourceName);
		
		// En caso de que no exista en el HashMap, se carga desde el disco duro
		if(clip == null) {
			System.out.println(RESOURCES_FOLDER + resourceName);
			clip = loadResource(RESOURCES_FOLDER + resourceName);
			// Una vez que cargo el recurso en la memoria, lo agrego al HashMap, así no habrá que volver a 
			// buscarlo en el disco duro. Como "clave" del objeto para buscarlo en el HashMap utilizo el nombre del fichero
			sounds.put(resourceName, clip);
			
		}
		return clip;
	}
	
	/**
	 * Lanza un sonido, el sonido solo se oye una vez
	 * @param name
	 */
	public void playSound (final String name) {
		getAudioClip(name).play();
	}
	
	/**
	 * Lanza el sonido en bucle
	 * @param name
	 */
	public void loopSound (final String name) {
		getAudioClip(name).loop();
	}
	

}
