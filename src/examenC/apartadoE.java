package examenC;

import examenA.UtilsArrays;

public class apartadoE {

	public static void main(String[] args) {
		/*Crea una clase con un m�todo �main� que cree un array de 20 posiciones de valores
enteros. Los valores enteros deben generarse al azar entre los valores 0 y 40 y no pueden
repetirse. Muestra el array.*/ 

		//declaro y doy valores al array
		int array[]=UtilsArrays.crearArrayNumerosAzarSinRepetir(20, 0, 40);
		
		//muestro el array
		UtilsArrays.mostrarArray(array);
	}

}
