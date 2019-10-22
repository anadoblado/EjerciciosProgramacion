package Tema5Bloque2;

public class ArrayConNumerosSinRepetir {

	public static void main(String[] args) {
		// Un array con 90 números de 0 a 100 y que no se repitan
		
		int array[]=new int[90];
		int aux=0;
		boolean NumRepe=false;
		
		for (int i = 0; i < array.length; i++) {
			
			aux = (int) Math.round(Math.random()*100);
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
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		
		

	}

}
