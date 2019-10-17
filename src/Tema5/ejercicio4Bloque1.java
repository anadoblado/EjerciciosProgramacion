package Tema5;

public class ejercicio4Bloque1 {

	public static void main(String[] args) {
		/*Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
		 * Debes obtener la suma de los números pares y los impares en variables separadas.*/
		int numeros[] = new int[10];
		float sumaPar=0, sumaImpar=0;
		double numeroPar=0, numeroImpar=0;
		
		for(  int i = 0; i<numeros.length; i++) {
			numeros[i]= (int)Math.round(Math.random()*100);
			//numeros[i]=i+1;
			
			System.out.print(numeros[i]+" ");
			
		}
		System.out.println("");
		System.out.println("");

		for (int i=0; i<numeros.length;i++) {
			if((numeros[i]%2)==0) {
				numeroPar=numeros[i];
				//contadorPares=i%2;
				//i++;
				System.out.println("Los números pares son: " +numeroPar);
				/*numeroPar=(float)(numeros[i]%2==0);
				sumaPar=sumaPar+numeroPar;*/
				
			}
			else {
				numeroImpar=numeros[i];
				System.out.println("Los números impares son: "+ numeroImpar);
			}
		}
		
		for (int i=0; i<numeros.length; i++) {
			if((numeros[i]%2)==0) {
				numeroPar=numeros[i];
				sumaPar=(float) (numeroPar+sumaPar);
				//contadorPares=i%2;
				//i++;
				
				/*numeroPar=(float)(numeros[i]%2==0);
				sumaPar=sumaPar+numeroPar;*/
				
			}
			else {
				numeroImpar=numeros[i];
				sumaImpar=(float) (numeroImpar+sumaImpar);
				
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("La suma de  pares son: " + sumaPar);
		System.out.println("La suma de impares son: "+ sumaImpar);

	}

}
