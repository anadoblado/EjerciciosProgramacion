package Tema5Bloque4;

public class Ejercicio3Bloque4 {

	public static void main(String[] args) {
		// Crea un array de 20 n�meros decimales creados al azar entre 0 y 100.
		//Para crear el n�mero decimal debes generar al azar la parte entera y 
		//la parte decimal por separado para despu�s unir las dos partes. 
		//A continuaci�n debes examinar la cantidad de n�meros cuya parte decimal 
		//est� comprendida entre .00 y .49

		int parteEntera [] = new int [20];
		float parteDecimal [] = new float [20];
		float numeros [] = new float [20];
		int i, contador = 0;
		for ( i = 0; i < parteEntera.length; i++) {
			parteEntera [i] = (int) Math.round(Math.random()*100);
			parteDecimal [i] =(float) Math.random();
			numeros [i] =  (parteEntera[i]+parteDecimal[i]);
			
			System.out.print("La parte entera es: " + parteEntera[i]);
			System.out.println(" ");
			System.out.print("La parte decimal es: " + parteDecimal[i]);
			System.out.println(" ");
			System.out.print("los numeros son: " + numeros[i]);
			System.out.println(" ");
			System.out.println(" ");
			
			if(parteDecimal[i]<0.5) {
				 contador++;
			}
			System.out.println("Hay " + contador + " n�meros cuya parte decimal es menor de 0,5");
		}
		
		
	}

}
