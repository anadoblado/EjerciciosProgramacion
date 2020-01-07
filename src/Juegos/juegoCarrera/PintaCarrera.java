package Juegos.juegoCarrera;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class PintaCarrera extends Canvas {
	// Aquí inicio la carrera, la creo y le damos forma gráfica
	Carrera carrera1 = new Carrera();

	// Es la ventana donde lanzaremos la carrera
	JFrame ventana = new JFrame("Let's go!!!");

	// Dimensiones de la ventana
	protected static final int JFRAME_WIDTH = 1000;
	protected static final int JFRAME_HEIGHT = 400;

	private static PintaCarrera instance = null;

	public PintaCarrera() {
		SoundsRepository.getInstance();
		// Obtengo la referencia al panel principal, después de haber implementado
		// el Canvas
		JPanel panel = (JPanel) ventana.getContentPane();
		// Creo una plantilla en el panel, para poder ponerle el Canvas bordes
		panel.setLayout(new BorderLayout());
		// Se agrega el Canvas al Panel
		panel.add(this, BorderLayout.CENTER);
		// Así le damos las dimensiones a la venta, no uso el constructor
		// que genera con el Source porque así le doy las dimensiones a la
		// ventana
		ventana.setBounds(0, 0, JFRAME_WIDTH + 50, JFRAME_HEIGHT + 80);

		// Aquí capturo el click del ratón para en cada click hacer avanzar un turno las tiradas de los vehículo
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (e.getButton() == MouseEvent.BUTTON1) {
					carrera1.avanzar();
					PintaCarrera.getInstance().repaint();
					PintaCarrera.getInstance().revalidate();

				}
			}

		});
		
		SoundsRepository.getInstance().loopSound(SoundsRepository.RUIDO_DE_FONDO);
		

		// Para quitar el comportamiento por defecto al pulsar en cerrar
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		// Agrego un windowListener, pero el adaptador para solo
		// coger un método de todos los que implementa el windowListener
		ventana.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}
		});
		// Para que la ventana esté en visible
		ventana.setVisible(true);
		// El foco de Windows irá al Canvas, para que directamente podamos interactuar
		// con el juego mediante teclado
		this.requestFocus();

	}

	/**
	 * Método para antes del cierre al pulsar, pregunte al usuario si quiere cerrar
	 */
	private void cerrarAplicacion() {
		// Un array de opciones, que nos dará los nombres de los botones
		String[] opciones = { "Aceptar", "Cancelar" };
		// Genera la ventana de diálogo, con los mensajes y las opciones
		int eleccion = JOptionPane.showOptionDialog(ventana, "¿Seguro que quieres cerrar la ventana?",
				"Salir de la aplicación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones,
				"Aceptar");
		// Si la elección es Aceptar, le decimos que se cierre
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	/**
	 * Sobreescribo el método "paint" del Canvas, para que cada vez que el SO o la
	 * máquina decida repintarlo, nosotros decidamos qué se va a pintar en la
	 * pantalla
	 */
	@Override

	public void paint(Graphics g) {
		Font monoFont = new Font("Monospaced", Font.BOLD | Font.ITALIC, 36);
		// Pinto un rectángulo tan grande como las dimensiones del Canvas para pintar las pistas
		super.paint(g);
		g.setColor(Color.DARK_GRAY);
		// g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.fillRect(0, 0, PintaCarrera.getJframeWidth(), PintaCarrera.getJframeHeight());

		// Aqui vamos a recorrer el ArrayList y pintar cada uno de los vehiculos
		for (Vehiculo vehiculo : carrera1.vehiculos) {
			vehiculo.paint(g);
		}

		if (carrera1.finPartida()) {
			SoundsRepository.getInstance().playSound(SoundsRepository.FINAL_CARRERA);
			g.setColor(Color.CYAN);
			g.fillRect(0, 0, PintaCarrera.getJframeWidth(), PintaCarrera.getJframeHeight());
			g.setColor(Color.white);
			g.fillRect(200, PintaCarrera.getJframeHeight() - 120, 200, 120);
			g.fillRect(400, PintaCarrera.getJframeHeight() - 150, 200, 150);
			g.fillRect(600, PintaCarrera.getJframeHeight() - 130, 200, 130);
			g.setColor(Color.black);
			g.drawRect(200, PintaCarrera.getJframeHeight() - 120, 200, 120);
			g.drawRect(400, PintaCarrera.getJframeHeight() - 150, 200, 150);
			g.drawRect(600, PintaCarrera.getJframeHeight() - 130, 200, 130);

			g.setFont(monoFont);
			FontMetrics fm = g.getFontMetrics();
			int w = fm.stringWidth("2");
			int h = fm.getAscent();
			g.setColor(Color.BLACK);
			g.drawString("3", 300 - (w / 2), 320 + (h / 4));
			g.drawString("1", 500 - (w / 2), 320 + (h / 4));
			g.drawString("2", 700 - (w / 2), 320 + (h / 4));
			
			carrera1.podium.get(0).setPosicion(47);
			carrera1.podium.get(0).setyCoord(175);
			carrera1.podium.get(0).paintMe(g);
			
			carrera1.podium.get(1).setPosicion(70);
			carrera1.podium.get(1).setyCoord(187);
			carrera1.podium.get(1).paintMe(g);
			
			carrera1.podium.get(2).setPosicion(30);
			carrera1.podium.get(2).setyCoord(197);
			carrera1.podium.get(2).paintMe(g);
			
			carrera1.podium.get(3).setPosicion(85);
			carrera1.podium.get(3).setyCoord(320);
			carrera1.podium.get(3).paintMe(g);
		
				
			
		}
	}

	/**
	 * 
	 * @return
	 */
	public static PintaCarrera getInstance() {
		if (instance == null) {
			instance = new PintaCarrera();
		}
		return instance;
	}

	/**
	 * @return the carrera1
	 */
	public Carrera getCarrera1() {
		return carrera1;
	}

	/**
	 * @param carrera1 the carrera1 to set
	 */
	public void setCarrera1(Carrera carrera1) {
		this.carrera1 = carrera1;
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
		// return PintaCarrera.getInstance().getWidth();
		return PintaCarrera.JFRAME_WIDTH;
	}

	/**
	 * @return the jframeHeight
	 */
	public static int getJframeHeight() {
		// return PintaCarrera.getInstance().getHeight();
		return PintaCarrera.JFRAME_HEIGHT;
	}

	/**
	 * @param instance the instance to set
	 */
	public static void setInstance(PintaCarrera instance) {
		PintaCarrera.instance = instance;
	}

}
