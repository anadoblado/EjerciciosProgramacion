import javax.swing.JOptionPane;

public class Utils {


		/**
		 * 
		 * @return
		 */
		public static int numeroAleatorioSimple() {
			return (int) Math.round(Math.random() * 100);
		}
		

		/**
		 * 
		 * @return
		 */
		//la vida de las variables que se declaran duran solo la duración de las llaves, no sirven fuera
		public static int obtenerNumeroAleatorio(int limiteInferior, int limiteSuperior) {
			return (int) Math.round(Math.random()*(limiteSuperior-limiteInferior)+limiteInferior);
		}
		/**
		 * 
		 * @param longitud
		 * @param limiteSuperior
		 * @param limiteInferior
		 * @return
		 */
		public static int [] crearArrayNumerosAzar (int longitud, int limSuperior, int limInferior) {
			int array[]=new int[longitud];
			for(int i=0; i<array.length;i++) {
			array[i]=obtenerNumeroAleatorio(limInferior, limSuperior);
			}
			return array;
		}
		/**
		 * 
		 * @param array
		 */
		public static void mostrarArray (int[] array) {
			System.out.println("Contenido del array");
			for (int i = 0; i < array.length; i++) {
				System.out.println(array+ " ") ;
				
			}
		}
		
		/**
		 * 
		 * @return
		 */
		public static int pedirNumUsuario() {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduza un número"));
			return num;
		}
		
		/**
		 * 
		 * @return
		 */
		public static int pedirNumUsuario (String mensaje) {
			int num = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
			return num;
		}
		
		public static int pedirNumUsuarioEntreLimites (String mensaje, int limInf, int limSup) {
			int num;
			do {
				 num = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				 
				if(num < limInf || num > limSup ) {
					JOptionPane.showConfirmDialog(null, "El número debe de estar entre " + limInf + " y " + limSup);
				}
				
			}while(num < limInf || num > limSup );
			return num;
			
		}
		


	}


