package Tema5Bloque2;

import javax.swing.JOptionPane;

public class Ejercicio3Bloque2 {

	public static void main(String[] args) {
		// Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
		//Debes conseguir multiplicar cada uno de los elementos del array por un número determinado, pedido al usuario.
		
		int array[]=new int [10];
		int limSup=100, limInf=0; 
		
		for (int i = 0; i < array.length; i++) {
			array[i]= (int)Math.round(Math.random()*(limSup-limInf)+limInf);
			
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		
		int numMul=Integer.parseInt(JOptionPane.showInputDialog("Intruduce un número por el que multiplicar"));
	
		System.out.println("");
	
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]*numMul+" ");
		}
		

	}

}
