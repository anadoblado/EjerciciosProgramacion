package examenA;

import Tema5Bloque2.UtilsArrays;

public class apartadoD {

	public static void main(String[] args) {
		//Crea una clase con un método “main” que cree un array de 5 posiciones con
		//números generados al azar entre 0 y 100. Muestra el array. Crea un nuevo array de 5 posiciones
		//en el que copies los números del primer array en posiciones aleatorias del segundo array. No
		//puedes repetir números del primer array en el segundo array

		int array1[] =Utils.crearArrayNumerosAzar(5, 100, 0);//creo array1
		Utils.mostrarArray(array1);//mostrar array1
		int array2[]=new int[array1.length];//declaro el array2
		int mix []= new int[array1.length];//examenA.UtilsArrays.crearArrayNumerosAzarSinRepetir(5, 0, 4);
		int aux=0;
		boolean NumRepe=false;
		
		System.out.println("");
		//examenA.UtilsArrays.mostrarArray(mix);
		for (int i = 0; i < mix.length; i++) {//es para hacer el array mix
					
					aux = (int) Math.round(Math.random()*(array1.length-1));
					for (int j = 0; j < i; j++) {//usamos la condición con el boolean para no repetir los numeros
						if(mix[j]==aux) {
							NumRepe=true;
							break;
						}
						
					}
					if (NumRepe==true) {
						NumRepe=false;
						i--; //volver a la posición anterior del array
					}
					else {
						mix[i]=aux;
					}
					
											
		}
		System.out.println("");
		examenA.UtilsArrays.mostrarArray(mix);
		System.out.println("");
		System.out.println("");
		
		for (int i = 0; i < array1.length; i++) {
		
				array2[i]=array1[mix[i]];
			
		}
		Utils.mostrarArray(array2);
	}

}
