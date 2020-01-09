package Juegos.juegoCarrera;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.util.HashMap;


public class SoundsRepository {
	// Almacén de sonidos
	private HashMap<String, AudioClip> sounds = new HashMap<String, AudioClip>();
	// Variable principal del patrón Singleton
	private static SoundsRepository instance = null;
	private static String RESOURCES_FOLDER = "../resources/sounds/";
	
	//Fijamos los sonidos que se van a utilizar en el juego
	public static String RUIDO_DE_FONDO = "coche_2.wav";
	public static String EFECTO_OIL = "mancha_aceite.wav";
	public static String EFECTO_RAMPA = "impulso.wav";
	public static String FINAL_CARRERA = "victory_sonic.wav";

	/**
	 * Constructor
	 */
	public SoundsRepository() {
		this.getAudioClip(RUIDO_DE_FONDO);
		this.getAudioClip(EFECTO_OIL);
		this.getAudioClip(EFECTO_RAMPA);
		this.getAudioClip(FINAL_CARRERA);
		
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
	 * CARGA EL SONIDO
	 * @param name
	 * @return
	 */
	private AudioClip loadResource (String name) {
		URL url = null;
		url = getClass().getResource(name);
		return Applet.newAudioClip(url);
	}
	
	/**
	 * 
	 * @param resourceName
	 * @return
	 */
	private AudioClip getAudioClip (String resourceName) {
		//PARA BUSCAR EL SONIDO EN EL HASMAP
		AudioClip clip = sounds.get(resourceName);
		// SI NO LO ENCUENTRA LO BUSCA EN EL DISCODURO
		if(clip == null) {
			clip = loadResource(RESOURCES_FOLDER + resourceName);
			//UNA VEZ QUE OBTENEMOS UN SONIDO, LO PONE EN EL HASMAP
			sounds.put(resourceName, clip);
		}
		return clip;
	}
	
	/**
	 * PARA SOLO OIR UNA VEZ EL SONIDO DE RAMPA Y OIL
	 * @param name
	 */
	public void playSound (final String name) {
		getAudioClip(name).play();
	}
	
	/**
	 * LANZA EL SONIDO EN BUCLE, PARA EL SONIDO DE LA CARRERA
	 * @param name
	 */
	public void loopSound (final String name) {
		getAudioClip(name).loop();
	}
	

	/**
	 * @return the sounds
	 */
	public HashMap<String, AudioClip> getSounds() {
		return sounds;
	}

	/**
	 * @param sounds the sounds to set
	 */
	public void setSounds(HashMap<String, AudioClip> sounds) {
		this.sounds = sounds;
	}


	/**
	 * @param instance the instance to set
	 */
	public static void setInstance(SoundsRepository instance) {
		SoundsRepository.instance = instance;
	}

	/**
	 * @return the rESOURCES_FOLDER
	 */
	public static String getRESOURCES_FOLDER() {
		return RESOURCES_FOLDER;
	}

	/**
	 * @param rESOURCES_FOLDER the rESOURCES_FOLDER to set
	 */
	public static void setRESOURCES_FOLDER(String RESOURCES_FOLDER) {
		RESOURCES_FOLDER = RESOURCES_FOLDER;
	}

	/**
	 * @return the mUSICA_DE_FONDO
	 */
	public static String getRUIDO_DE_FONDO() {
		return RUIDO_DE_FONDO;
	}

	/**
	 * @param mUSICA_DE_FONDO the mUSICA_DE_FONDO to set
	 */
	public static void setRUIDO_DE_FONDO(String mUSICA_DE_FONDO) {
		RUIDO_DE_FONDO = RUIDO_DE_FONDO;
	}

	/**
	 * @return the eFECTO_OIL
	 */
	public static String getEFECTO_OIL() {
		return EFECTO_OIL;
	}

	/**
	 * @param eFECTO_OIL the eFECTO_OIL to set
	 */
	public static void setEFECTO_OIL(String eFECTO_OIL) {
		EFECTO_OIL = eFECTO_OIL;
	}

	/**
	 * @return the eFECTO_RAMPA
	 */
	public static String getEFECTO_RAMPA() {
		return EFECTO_RAMPA;
	}

	/**
	 * @param eFECTO_RAMPA the eFECTO_RAMPA to set
	 */
	public static void setEFECTO_RAMPA(String eFECTO_RAMPA) {
		EFECTO_RAMPA = eFECTO_RAMPA;
	}
	
}
