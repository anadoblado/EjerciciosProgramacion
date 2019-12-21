package examenC;

import javax.swing.JOptionPane;

import examenA.UtilsArrays;

public class apartadoD {

	public static void main(String[] args) {
		/*Crea una clase con un método “main” que cree un array de 100 elementos enteros
creados al azar. Debes mostrar el array. A continuación debes detectar, y sacar en pantalla,
todos los números que acaben en un valor de una sola cifra que debes pedir al usuario.*/ 
		
		//declarar y rellenar el array con números de 0 a 100
		int array[]=UtilsArrays.creaArrayNumerosAzar(100, 0, 100);
		
		//mostrar el array
		UtilsArrays.mostrarArray(array);
		
		String num=JOptionPane.showInputDialog("introducir un número entre 0 y 9");
		int numPedido=Integer.parseInt(num);
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]%10==numPedido) {
				System.out.println("Los números que acaban en "+numPedido+" son "+array[i]);
			}
			
			
		}

	}

}
