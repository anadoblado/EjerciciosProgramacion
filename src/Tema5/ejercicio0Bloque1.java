package Tema5;

public class ejercicio0Bloque1 {

	public static void main(String[] args) {
		/*
		 Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
		 Debes mostrar el array en pantalla y obtener la suma, la media, el menor y el mayor de todos
		  los números que aparecen en el array.*/
		
		int numeros[] = new int[150];
		int suma=0, mayor=0,menor=0, media=0;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random()*100);
			System.out.println(numeros[i]);
			suma = numeros[i]+suma;//suma+=array[i]
			media = suma/150;
			mayor = (numeros[i]>mayor)?numeros[i]:mayor;
			menor = (numeros[i]<menor)?numeros[i]:menor;
				

	}
		System.out.println("la suma es: " + suma);
		System.out.println("la media es: " + media);
		System.out.println("el mayor es: "+ mayor);
		System.out.println("el menor es: " + menor);

}
}
