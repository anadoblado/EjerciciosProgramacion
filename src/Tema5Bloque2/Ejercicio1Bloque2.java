package Tema5Bloque2;

public class Ejercicio1Bloque2 {

	public static void main(String[] args) {
		// Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre -100 y 100. 
		//Debes conseguir que todos los números pares del array cambien de signo, 
		//los positivos deben pasar a negativos y viceversa

		int array[] = new int[150];
		int limInf=-100, limSup=100, numPar=0;
		for (int i = 0; i < array.length; i++) {
			array[i]= (int)Math.round(Math.random()*(limSup-limInf)+limInf);
			
			System.out.print(array[i]+ "  ");
			
		}
		System.out.println("");
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2==0) {
				numPar=array[i];
				numPar=-(numPar);
				
				System.out.println("Los números pares cambian de signo: "+ numPar);
			}
			
		}
	}

}
