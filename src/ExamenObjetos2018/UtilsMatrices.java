package ExamenObjetos2018;

public class UtilsMatrices {

	/**
	 * 
	 * @param matriz
	 * @param limiteInferior
	 * @param limiteSuperior
	 */
	public static void crearMatrizNumerosAzar(int matriz[][], int limiteInferior, int limiteSuperior){
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAleatorio(limiteInferior, limiteSuperior);
			}
		}
	}
	
	/**
	 * 
	 * @param matriz
	 */
	public static void imprimirMatriz (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			} 
			System.out.println();
		}
		
	}
}
