package Tema5Bloque3;

public class Ejercicio3Bloque3 {

	public static void main(String[] args) {
		// Realiza un ejercicio que inicialice un array de 150 elementos 
		//enteros al azar entre 0 y 1.000. Una vez que lo hayas conseguido 
		//debes realizar implementar el algoritmo de ordenación llamado "Shell",
		//con el objetivo de ordenar el array completamente

		int array[]=new int [10];
		
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)Math.round(Math.random()*100);
			System.out.print(array[i]+" ");
		}
		
		System.out.println("");
		int aux, i = 0;
		boolean cambios;
	
			//recorro el array
				
				for (int j = (array.length)/2; j !=0; j/=2) {
					cambios=true;
					while(cambios) {
						cambios=false;
						for (i=j; i<array.length;i++){
							if(array[i-j]>array[i]) {
								aux=array[i];
								array[i]=array[i-j];
								array[i-j]=aux;
								cambios=true;
							}
							
						}
						
					}
					
					
				}
				System.out.print(array[i]+" ");			
		
			
		
	}

}
