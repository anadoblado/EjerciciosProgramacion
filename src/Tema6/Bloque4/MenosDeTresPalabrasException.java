package Tema6.Bloque4;

public class MenosDeTresPalabrasException extends Exception {

	private int minimoPalabras;
	
	public MenosDeTresPalabrasException() {
		// TODO Auto-generated constructor stub
	}

	public MenosDeTresPalabrasException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MenosDeTresPalabrasException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public MenosDeTresPalabrasException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MenosDeTresPalabrasException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public MenosDeTresPalabrasException(int minimoPalabras) {
		this.minimoPalabras = minimoPalabras;
		// TODO Auto-generated constructor stub
	}

}
