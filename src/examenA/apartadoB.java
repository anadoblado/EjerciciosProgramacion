package examenA;

import javax.swing.JOptionPane;

public class apartadoB {

	public static void main(String[] args) {
		//  Crea una clase con un m�todo �main� que cree un array con 100 elementos de
		//longitud, los elementos deben ser n�meros enteros al azar comprendidos entre dos l�mites, que
		//deben ser preguntados al usuario. Muestra el array en orden normal y tambi�n en orden
		//invertido
		
		
		int limInf=0,limSup=0;
		String src=JOptionPane.showInputDialog("Pon el limite inferior del array");
		limInf=Integer.parseInt(src);
		src=JOptionPane.showInputDialog("Pon el l�mite superior del array");
		limSup=Integer.parseInt(src);
		
		int array[]=UtilsArrays.creaArrayNumerosAzar(100, limInf, limSup);
		
		UtilsArrays.mostrarArray(array);
		
		System.out.println("");
		System.out.println("Contenido del array con orden inverso");
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i]+" ");
		}
	}

}
