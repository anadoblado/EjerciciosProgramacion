package examenA;

public class apartadoC {

	public static void main(String[] args) {
		// Crea una clase con un método “main” que cree un array de 20 posiciones al azar
		//con números generados al azar, pares, mayores de 25 y menores de 100.

		
		int array[]=new int[20];
		int aux=0;
		boolean numPar=false;
		
		for (int i = 0; i < array.length; i++) {
			
			do {
				aux=Utils.obtenerNumeroAleatorio(25, 100);
				if(aux%2==0) {
					array[i]=aux;
					numPar=true;
				}
			}while(numPar==false);
			
		}
		UtilsArrays.mostrarArray(array);
		
			
		
	}

}
