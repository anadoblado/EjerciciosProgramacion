package Juegos.juegoCarrera;

public class UtilsArrays {

	/**
	 * 
	 * @param array
	 */
	public static void mostrarArray (int [] array) {

		System.out.println("Contenido del array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	/**
	 * 
	 * @param longitud
	 * @param limInf
	 * @param limSup
	 * @return
	 */
	public static int[] creaArrayNumerosAzar (int longitud, int limInf, int limSup) {
		int array[] = new int[longitud];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAleatorio(limInf, limSup);
		}
		return array;
	}

	
	/**
	 * 
	 * @param longitud
	 * @param limInf
	 * @param limSup
	 * @return
	 */
	public static int[] crearArrayNumerosAzarSinRepetir(int longitud, int limInf, int limSup) {
		int array[]=new int[longitud];
		int aux=0;
		boolean NumRepe=false;
		
		for (int i = 0; i < array.length; i++) {
			
			aux = (int) Utils.obtenerNumeroAleatorio(limInf, limSup);
			for (int j = 0; j < array.length; j++) {
				if(array[j]==aux) {
					NumRepe=true;
					break;
				}
				
			}
			if (NumRepe==true) {
				NumRepe=false;
				i--; //volver a la posición anterior del array
			}
			else {
				array[i]=aux;
			}
			
		}
		return array;
		
	}
	
	
	
	
}
