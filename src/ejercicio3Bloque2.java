import javax.swing.JOptionPane;

public class ejercicio3Bloque2 {

	public static void main(String[] args) {
		// Ejercicio que obtenga todos los m�ltiplos de un n�mero introducido por el usuario.
		//Se imprimir�n todos los m�ltiplos menores de 100, este ser� el l�mite.

		int numPedido = Integer.parseInt(JOptionPane.showInputDialog("Introduce el n�mero del que quieras saber los m�ltipolos menores de 100"));
		
		
		for (int i = 1; i*numPedido < 100; i++) {
			System.out.println("Los factores son: " + i*numPedido);
		}
	}

}
