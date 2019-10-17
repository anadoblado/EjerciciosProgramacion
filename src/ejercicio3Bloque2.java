import javax.swing.JOptionPane;

public class ejercicio3Bloque2 {

	public static void main(String[] args) {
		// Ejercicio que obtenga todos los múltiplos de un número introducido por el usuario.
		//Se imprimirán todos los múltiplos menores de 100, este será el límite.

		int numPedido = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número del que quieras saber los múltipolos menores de 100"));
		
		
		for (int i = 1; i*numPedido < 100; i++) {
			System.out.println("Los factores son: " + i*numPedido);
		}
	}

}
