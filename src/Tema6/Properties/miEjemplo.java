package Tema6.Properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class miEjemplo {
	
	private static Properties propiedades = null;

	public miEjemplo() {
		super();
	}

	/**
	 * 
	 * @return
	 */
	private static Properties getPropiedades() {
		if (propiedades == null) {
			propiedades = new Properties();
		    
			try {
				// Una forma de leer el fichero de propiedades
//				propiedades.load(propiedades.getClass().getResourceAsStream("/tutorialJava/capitulo6_Recursos/ejemplo.properties"));

				// Otra forma de leer el fichero de propiedades
				File file = new File("./src/Tema6/Properties/ejemplo.properties");
				System.out.println("Fichero encontrado: " + file.exists());
				propiedades.load(new FileReader(file));
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		return propiedades;
	}
	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static String getProperty(String nombrePropiedad) {
		return getPropiedades().getProperty(nombrePropiedad);
	}
	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static int getIntProperty (String nombrePropiedad) {
		return Integer.parseInt(getPropiedades().getProperty(nombrePropiedad));
	}
	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static Float getFloatProperty (String nombrePropiedad) {
		return Float.parseFloat(getPropiedades().getProperty(nombrePropiedad));
	}
	
	
	public static void main(String[] args) {
		String usuario = miEjemplo.getProperty("USUARIO");
		String password = miEjemplo.getProperty("PASSWORD");
		int id = miEjemplo.getIntProperty("ID_USUARIO");
		String nick = miEjemplo.getProperty("NICK");
		
		System.out.println("Usuario leído del fichero de propiedades: " + usuario);
		System.out.println("Password leído del fichero de propiedades: " + password);
		System.out.println("Id de usuario leído del fichero de propiedades: " + id);
		System.out.println("Nick leído del fichero de propiedades: " + nick);

	}

}
