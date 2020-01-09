package ExamenBichos;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class CampoDeBatalla {

	private String nombre;
	public static int LONGITUD_ARRAY = 20;
	
	Humano trooper [] = new Humano [LONGITUD_ARRAY];
	Malvado battleDroid [] = new Malvado [LONGITUD_ARRAY];
	
	
	
	/**
	 * @param nombre
	 */
	public CampoDeBatalla(String nombre) {
		this.nombre = nombre;
		
		for (int i = 0; i < trooper.length; i++) {
			trooper [i] = new Humano("Hum "+i);
			battleDroid [i] = new Malvado ("Mal " + i);
			
		}
		duplicarPuntosDeVida(trooper);
		duplicarPuntosDeVida(battleDroid);
		mezclarArray(trooper);
		mezclarArray(battleDroid);
	}
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public Bicharraco getMasDisparosRecibidos (Bicharraco array[]) {
		Bicharraco disparoMayor = array[0];
		for (int i = 1; i < array.length; i++) {
			if (disparoMayor.getDisparosRecibidos() < array[i].getDisparosRecibidos()) {
				disparoMayor = array [i];
			}
			
		}
		return disparoMayor;
	}
	
	public Bicharraco getMenosDismaposRecibidos (Bicharraco array []) {
		Bicharraco disparoMenor = array [0];
		for (int i = 1; i < array.length; i++) {
			if(disparoMenor.getDisparosRecibidos() > array[i].getDisparosRecibidos()) {
				disparoMenor = array [i];
			}
			
		}
		return disparoMenor;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean finDeJuego () {
		if (!quedanHumanosVivos() || !quedanMonstruosVivos()) {
			return true;
		}
		return false;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public boolean quedanHumanosVivos () {
		if (getPrimerBichoVivoEnArray(trooper) != null) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean quedanMonstruosVivos () {
		if (getPrimerBichoVivoEnArray(battleDroid) != null) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public Bicharraco getPrimerBichoVivoEnArray(Bicharraco [] array) {
		for (Bicharraco p : array) {
			if(p.isVivo()) {
				return p;
			}
		}
		return null;
	}
	
	/**
	 * 
	 */
	public void mostrarSituacion (Bicharraco array []) {
		
		for (int i = 0; i < LONGITUD_ARRAY; i++) {
			if(array[i].isVivo()) {
			System.out.println(trooper[i]);
			}
			//else System.out.println("X  \t");
			
		}
		System.out.println();
		
		for (int i = 0; i < battleDroid.length; i++) {
			if(array[i].isVivo()) {
			System.out.println(battleDroid[i]);
			}
			//else System.out.println("X  \t");
		}
		
		System.out.println();
	}
	
	
	/**
	 * 
	 * @param array
	 */
	public void mezclarArray (Bicharraco [] array) {
		Bicharraco aux;
		int indice1, indice2;
		for (int i = 0; i < array.length*2; i++) {
			indice1 = (int) Math.round(Math.random()*(array.length-1));
			indice2 = (int) Math.round(Math.random()*(array.length-1));
			
			aux = array[indice1];
			array [indice1] = array [indice2];
			array [indice2] = aux;
		}
		
	}
	
	/**
	 * 
	 * @param array
	 */
	public void duplicarPuntosDeVida (Bicharraco [] array) {
		array[array.length-1].setPuntosDeVida(array[array.length-1].getPuntosDeVida()*2);
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
	 * @return the trooper
	 */
	public Humano[] getTrooper() {
		return trooper;
	}

	/**
	 * @param trooper the trooper to set
	 */
	public void setTrooper(Humano[] trooper) {
		this.trooper = trooper;
	}

	/**
	 * @return the battleDroid
	 */
	public Malvado[] getBattleDroid() {
		return battleDroid;
	}

	/**
	 * @param battleDroid the battleDroid to set
	 */
	public void setBattleDroid(Malvado[] battleDroid) {
		this.battleDroid = battleDroid;
	}
	
	
	
	
	

}
