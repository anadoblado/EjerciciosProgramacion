package JuegoTresEnRaya.copy.copy;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Clase principal para el juego
 * 
 * @author anita
 *
 */
public class TresEnRaya extends Canvas {

	//Con JFrame se har� la ventana que albergar� el juego
	JFrame ventana = new JFrame("Juego 3 en raya");
	
	// Con variables estat�ticas, ya que las queremos fijas, indicamos el
	//ancho y alto de la ventana
	private static final int JFRAME_WIDTH = 600;
	private static final int JFRAME_HEIGHT = 600;
	
	//Lista de objetos de tipo "Cuadro" que se van a representar en el Canvas
	//Cada uno con sus propias coordenadas de un tablero de 3x3 cuadros.
	//De esta manera el primer cuadro de la primera fila tendr� de coordenadas
	//el (0,0) y el �ltimo el (2,2)
	List<Cuadro> cuadros = new ArrayList<Cuadro>();
	
	//Vamos a crear una variable para establecer la instancia del patr�n Singleton
	private static TresEnRaya instance = null;
	
	// Variables que determinen si es jugador 1 o 2
	// y controlar� qu� jugador es, se usa en el Paso 10
	public static int JUGADOR_1 = 1;
	public static int JUGADOR_2 = 2;
	private int turnoActual = JUGADOR_1;
	
	/**
	 * Constructor para inicializar la ventana y verla
	 */
	public TresEnRaya() {
		// Obtengo la referencia al panel principal, despu�s de haber implementado
		//el Canvas
		JPanel panel = (JPanel) ventana.getContentPane();
		// Creo una plantilla en el panel, para poder ponerle el Canvas
		panel.setLayout(new BorderLayout());
		// Se agrega el Canvas al Panel
		panel.add(this, BorderLayout.CENTER);
		
		//As� le damos las dimensiones a la venta, no uso el constructor
		//que genera con el Source porque as� le doy las dimensiones a la
		//ventana
		ventana.setBounds(0, 0, JFRAME_WIDTH, JFRAME_HEIGHT);
		
		// Inicializo la lista de los 9 cuadros que formar�n el tablero
		inicializaCuadrosDelTablero();
		
		// En el paso 7, se agrega un MouserAdapter, que intercepta cuando se cliquea
		// dentro del Canvas. Para ello se sobrecarga el m�todo MouseClicked
		// que va a interceptar los eventos de click de rat�n que se produzcan
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				// S�lo interesa el click con el bot�n principal del rat�n
				if (e.getButton() == MouseEvent.BUTTON1) {
					for (Cuadro cuadro : cuadros) {
						if (cuadro.seHaHechoClickSobreCuadro(e.getX(), e.getY())) {
							cuadro.click(turnoActual); // Paso 10 a�ade la variable del turno
							// En el paso 8 comprobamos que el click se haga en el cuadro
							//representado por el objeto
							if (turnoActual == JUGADOR_1) {
								// Cambia el turno
								turnoActual = JUGADOR_2;				
							}
							else {
								// Cambia el turno
								turnoActual = JUGADOR_1;
							}
						}
					}
				}
			}
			
		});
		
		//Para quitar el comportamiento por defecto al pulsar en cerrar
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		//Agrego un windowListener, pero el adaptador para solo 
		//coger un m�todo de todos los que implementa el windowListener
		ventana.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}
		});
		// Para que la ventana est� en visible
		ventana.setVisible(true);
		// El foco de Windows ir� al Canvas, para que directamente podamos interactuar
		//con el juego mediante teclado
		this.requestFocus();

	}
	
	/**
	 * M�todos para devolver la instancia del patr�n Singleton
	 * @return
	 */
	public static TresEnRaya getInstance () {
		if (instance == null) {
			instance = new TresEnRaya ();
		}
		return instance;
	}
	
	/**
	 * Tenemos la lista de objetos de tipo "Cuadro", con este m�todo vamos a 
	 * crear los cuadros y meterlos en la lista, en bloques de filas y columnas
	 * como una matriz
	 */
	private void inicializaCuadrosDelTablero() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.cuadros.add(new Cuadro(i,j));
				
			}
			
		}
	}
	
	/**
	 * M�todo para antes del cierre al pulsar, pregunte al usuario si quiere cerrar
	 */
	private void cerrarAplicacion() {
		// Un array de opciones, que nos dar� los nombres de los botones
		String [] opciones = {"Aceptar", "Cancelar"};
		// Genera la ventana de di�logo, con los mensajes y las opciones
		int eleccion = JOptionPane.showOptionDialog(ventana, "�Seguro que quieres cerrar la ventana?", "Salir de la aplicaci�n",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		// Si la elecci�n es Aceptar, le decimos que se cierre
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	
	/**
	 * Sobreescribo el m�todo "paint" del Canvas, para que cada vez que el SO o la m�quina
	 * decida repintarlo, nosotros decidamos qu� se va a pintar en la pantalla
	 */
	@Override
	public void paint(Graphics g) {
		// Pinto un rect�ngulo tan grande como las dimensiones del Canvas
		super.paint(g);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		// Aqui vamos a recorrer el ArrayList y pintar cada uno de los cuadros
		for (Cuadro cuadro : cuadros) {
			cuadro.paint(g);
		}
	}

	/**
	 * M�todo principal para el juego. Inicializa un objeto de tipo Tres en Raya
	 * @param args
	 */
	public static void main(String[] args) {
		TresEnRaya.getInstance();
		
	}
	
	
	
}
