package examenA;

import javax.swing.JOptionPane;

public class apartadoB {

	public static void main(String[] args) {
		//  Crea una clase con un método “main” que cree un array con 100 elementos de
		//longitud, los elementos deben ser números enteros al azar comprendidos entre dos límites, que
		//deben ser preguntados al usuario. Muestra el array en orden normal y también en orden
		//invertido
		
		
		int limInf=0,limSup=0;
		String src=JOptionPane.showInputDialog("Pon el limite inferior del array");
		limInf=Integer.parseInt(src);
		src=JOptionPane.showInputDialog("Pon el límite superior del array");
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
