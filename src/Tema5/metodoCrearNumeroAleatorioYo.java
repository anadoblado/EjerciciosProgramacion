package Tema5;

public class metodoCrearNumeroAleatorioYo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//solo reconocible en este fichero (hay que poner'/**' y espacio
	/**
	 * 
	 * @return
	 */
	private static int numeroAleatorioSimple() {
		return (int) Math.round(Math.random()*100);
	}
	

	/**
	 * 
	 * @return
	 */
	//la vida de las variables que se declaran duran solo la duración de las llaves, no sirven fuera
	private static int obtenerNumeroAleatorio(int limiteInferior, int limiteSuperior) {
		return (int) Math.round(Math.random()*(limiteSuperior-limiteInferior)+limiteInferior);
	}
	/**
	 * 
	 * @param longitud
	 * @param limiteSuperior
	 * @param limiteInferior
	 * @return
	 */
	private static int [] crearArrayNumerosAzar (int longitud, int limSuperior, int limInferior) {
		int array[]=new int[longitud];
		for(int i=0; i<array.length;i++) {
		array[i]=obtenerNumeroAleatorio(limInferior, limSuperior);
		}
		return array;
	}
	/**
	 * 
	 * @param array
	 */
	public static void mostrarArray (int[] array) {
		System.out.println("Contenido del array");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array+ " ") ;
			
		}
	}
	

}
