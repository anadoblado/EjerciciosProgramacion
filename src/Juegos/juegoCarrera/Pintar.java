package Juegos.juegoCarrera;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Juegos.juego3EnRaya.Cuadro;
import Juegos.juego3EnRaya.SoundsRepository;
import Juegos.juego3EnRaya.TresEnRaya;

public class Pintar extends Canvas {
	// para ir haciendo pruebas de cómo ir pintando, crear el Canvas e ir cambiándolo, 
	// tiene un pricipal para ir ejecutando ahí código, pero realmente sólo me sirvio de 
	// marco de pruebas

	JFrame window = new JFrame("Dibujar ventana");
	private static int ancho = 800;
	private static int alto = 400;

	private static Pintar instance = null;

	public Pintar() {
		
		JPanel panel = (JPanel) window.getContentPane();
		panel.setLayout(new BorderLayout());
		panel.add(this, BorderLayout.CENTER);
		window.setBounds(0, 0, ancho, alto);
		// Para quitar el comportamiento por defecto al pulsar en cerrar
		window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		// Agrego un windowListener, pero el adaptador para solo
		// coger un método de todos los que implementa el windowListener
		window.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}
		});
		// Para que la ventana esté en visible
		window.setVisible(true);
		// El foco de Windows irá al Canvas, para que directamente podamos interactuar
		// con el juego mediante teclado
		this.requestFocus();
	}
	
	public static Pintar getInstance () {
		if (instance == null) {
			instance = new Pintar ();
		}
		return instance;
	}

	protected void cerrarAplicacion() {

		// Un array de opciones, que nos dará los nombres de los botones
		String[] opciones = { "Aceptar", "Cancelar" };
		// Genera la ventana de diálogo, con los mensajes y las opciones
		int eleccion = JOptionPane.showOptionDialog(window, "¿Tú te lo has pensado bien?",
				"Saliendo, al carajo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones,
				"Aceptar");
		// Si la elección es Aceptar, le decimos que se cierre
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}

	}
	
	public void paint(Graphics g) {
		// Pinto un rectángulo tan grande como las dimensiones del Canvas
		super.paint(g);
		//g.setColor(Color.yellow);
		//g.fillRect(50, 0, this.getWidth()/2, this.getHeight()/2);
		Font monoFont = new Font("Monospaced", Font.BOLD | Font.ITALIC, 36);
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
		
		
		
		
	}

	public static void main(String[] args) {
		//Pintar.getInstance();
		PintaCarrera.getInstance();
		

	}

}
