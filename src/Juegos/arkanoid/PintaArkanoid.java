package Juegos.arkanoid;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class PintaArkanoid extends Canvas {
	//Con JFrame se hará la ventana que albergará el juego
	JFrame ventana = new JFrame("Arkanoid");

	// Con variables estatáticas, ya que las queremos fijas, indicamos el
	//ancho y alto de la ventana
	private static final int JFRAME_WIDTH = 500;
	private static final int JFRAME_HEIGHT = 800;
	public static final int SPEED = 30;
	//Vamos a crear una variable para establecer la instancia del patrón Singleton
	private static PintaArkanoid instance = null;
	public BufferedImage nave = null;
	
	ObjetoAPintar ladrillo1 = new Ladrillo(Color.green, 30, 0);
	ObjetoAPintar ladrillo2 = new Ladrillo(Color.cyan, 60, 0);
	ObjetoAPintar ladrillo3 = new Ladrillo(Color.magenta, 90, 0);
	ObjetoAPintar ladrillo4 = new Ladrillo(Color.yellow, 120, 0);
	Pelota ball = new Pelota("ball");
	
	public List<Ladrillo> muro = new ArrayList<Ladrillo>();
	
	
	
	

	/**
	 * Constructor para inicializar la ventana y verla
	 */
	public PintaArkanoid() {
		// Obtengo la referencia al panel principal, después de haber implementado
		//el Canvas
		JPanel panel = (JPanel) ventana.getContentPane();
		// Creo una plantilla en el panel, para poder ponerle el Canvas bordes
		panel.setLayout(new BorderLayout());
		// Se agrega el Canvas al Panel
		panel.add(this, BorderLayout.CENTER);

		//Así le damos las dimensiones a la venta, no uso el constructor
		//que genera con el Source porque así le doy las dimensiones a la
		//ventana
		ventana.setBounds(0, 0, JFRAME_WIDTH, JFRAME_HEIGHT);

		//Agrego un windowListener, pero el adaptador para solo 
		//coger un método de todos los que implementa el windowListener
		ventana.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}
		});
		// Para que la ventana esté en visible
		ventana.setVisible(true);
		// El foco de Windows irá al Canvas, para que directamente podamos interactuar
		//con el juego mediante teclado
		this.requestFocus();
		
		muro.add((Ladrillo) ladrillo1);
		muro.add((Ladrillo) ladrillo2);
		muro.add((Ladrillo) ladrillo3);
		muro.add((Ladrillo) ladrillo4);
	}

	/**
	 * Métodos para devolver la instancia del patrón Singleton
	 * @return
	 */
	public static PintaArkanoid getInstance () {
		if (instance == null) {
			instance = new PintaArkanoid ();
		}
		return instance;
	}
	/**
	 * Método para antes de cerrar la ventana con la equis de la esquina, le pregunta al usuario
	 */
	private void cerrarAplicacion() {
		// Un array de opciones, que nos dará los nombres de los botones
		String [] opciones = {"Aceptar", "Cancelar"};
		// Genera la ventana de diálogo, con los mensajes y las opciones
		int eleccion = JOptionPane.showOptionDialog(ventana, "¿Seguro que quieres cerrar la ventana?", "Salir de la aplicación",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		// Si la elección es Aceptar, le decimos que se cierre
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	/**
	 * Método para pintar el Canvas
	 */
	public void paint (Graphics g) {
		//System.out.println("Estoy en paint()");
		
		// Pinto el rectángulo tan grande como el Canvas
		super.paint(g);
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		//ladrillo1.paint(g);
		//ladrillo2.paint(g);
		//ladrillo3.paint(g);
		ball.paint(g);
		for (Ladrillo brick : muro) {
			brick.paint(g);
			
		}
		
		if (nave==null) {
			nave = loadImage("../res/nave-50x15.png");
		}
		g.drawImage(nave, 250, 720,this);
		
		
		
	}
	
	
	
	public void game() {
		while (this.isVisible()) {
			ball.seMueve();
			ball.paint(this.getGraphics());
			paint(this.getGraphics());
			try { 
				 Thread.sleep(SPEED);
			} catch (InterruptedException e) {}
			
			
		}
	}
	
	/**
	 * 
	 * @param nombre
	 * @return
	 */
	public BufferedImage loadImage(String nombre) {
		URL url=null;
		try {
			url = getClass().getResource(nombre);
			return ImageIO.read(url);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se pudo cargar la imagen " + nombre +" de "+url);
			System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
			System.exit(0);
			return null;
		}
	}



	public static void main(String[] args) {
		PintaArkanoid.getInstance().game();

	}

	/**
	 * @return the ventana
	 */
	public JFrame getVentana() {
		return ventana;
	}

	/**
	 * @param ventana the ventana to set
	 */
	public void setVentana(JFrame ventana) {
		this.ventana = ventana;
	}

	/**
	 * @return the jframeWidth
	 */
	public static int getJframeWidth() {
		return JFRAME_WIDTH;
	}

	/**
	 * @return the jframeHeight
	 */
	public static int getJframeHeight() {
		return JFRAME_HEIGHT;
	}

	/**
	 * @param instance the instance to set
	 */
	public static void setInstance(PintaArkanoid instance) {
		PintaArkanoid.instance = instance;
	}
	

}
