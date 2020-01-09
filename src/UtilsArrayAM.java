

public class UtilsArrayAM {

	public static int[] createRandomArray(int length, int numMin, int numMax) {
			
			int array[] = new int[length];
			
			for (int i = 0; i < array.length; i++) {
				array[i]=UtilsAM.generateRandomNum(numMin, numMax);
				
				
			}
			return array;
		}
	
		/**
		 * 
		 * @param length
		 * @param numMax
		 * @param numMin
		 * @return
		 */
	
	
	public static int[] createNumberedArray(int length) {
		int array[] = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i]= i + 1;
		}
		return array;
	}
	
	public static void printArray( int[] array) {
		System.out.println("\nContenido del array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
