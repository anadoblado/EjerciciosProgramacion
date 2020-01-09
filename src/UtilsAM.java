

import javax.swing.JOptionPane;

public class UtilsAM {

	public static int generateRandomNum(int min, int max) {
		return (int) Math.round(Math.random()*(max - min)) + min;

	}
	
	public static int requestUserNumber(String message) {
		int num = Integer.parseInt(JOptionPane.showInputDialog(message));
		return num;
	}

}
