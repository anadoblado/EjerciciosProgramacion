package examenC;

import javax.swing.JOptionPane;

import examenA.UtilsArrays;

public class apartadoD {

	public static void main(String[] args) {
		/*Crea una clase con un m�todo �main� que cree un array de 100 elementos enteros
creados al azar. Debes mostrar el array. A continuaci�n debes detectar, y sacar en pantalla,
todos los n�meros que acaben en un valor de una sola cifra que debes pedir al usuario.*/ 
		
		//declarar y rellenar el array con n�meros de 0 a 100
		int array[]=UtilsArrays.creaArrayNumerosAzar(100, 0, 100);
		
		//mostrar el array
		UtilsArrays.mostrarArray(array);
		
		String num=JOptionPane.showInputDialog("introducir un n�mero entre 0 y 9");
		int numPedido=Integer.parseInt(num);
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]%10==numPedido) {
				System.out.println("Los n�meros que acaban en "+numPedido+" son "+array[i]);
			}
			
			
		}

	}

}
