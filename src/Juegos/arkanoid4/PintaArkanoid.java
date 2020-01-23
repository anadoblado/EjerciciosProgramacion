package Juegos.arkanoid4;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
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

	private BufferStrategy strategy;
	
	public List<ObjetoAPintar> newObjeto = new ArrayList<ObjetoAPintar>();
	
			
	public List<ObjetoAPintar> world = new ArrayList<ObjetoAPintar>();
	
	Pelota ball = null;
	
	
	
	

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
		ventana.setResizable(true);
		ventana.setIgnoreRepaint(true);
		this.createBufferStrategy(2);
		strategy = getBufferStrategy();
		// El foco de Windows irá al Canvas, para que directamente podamos interactuar
		//con el juego mediante teclado
		this.requestFocus();
		
		
		
	}
	
	public void initWorld() {
		// Creo el objeto de tipo pelota
		Pelota ball = new Pelota("ball");
		// Creo el objeto de tipo nave
		Nave nave = new Nave();
		// Coordenadas del ladrillo de la primera fila
		int coordX = 10;
		int coordY = 20;
		for (int i = 0; i < 6; i++) {
		coordY += 22;
			for (int j = 0; j < 9; j++) {
				if(i == 0) {
					Ladrillo brick = new Ladrillo();
					coordX += brick.ANCHO_LADRILLO + 2;
					brick.setColor(Color.cyan);
					brick.setxCoord(coordX);
					brick.setyCoord(coordY);
					world.add(brick);
				}
				if(i == 1) {
					Ladrillo brick = new Ladrillo();
					coordX += brick.ANCHO_LADRILLO + 2;
					brick.setColor(Color.yellow);
					brick.setxCoord(coordX);
					brick.setyCoord(coordY);
					world.add(brick);
				}
				if (i == 2) {
					Ladrillo brick = new Ladrillo();
					coordX += brick.ANCHO_LADRILLO + 2;
					brick.setColor(Color.magenta);
					brick.setxCoord(coordX);
					brick.setyCoord(coordY);
					world.add(brick);
				}
				if (i == 3) {
					Ladrillo brick = new Ladrillo();
					coordX += brick.ANCHO_LADRILLO + 2;
					brick.setColor(Color.green);
					brick.setxCoord(coordX);
					brick.setyCoord(coordY);
					world.add(brick);
				}
				if (i == 4) {
					Ladrillo brick = new Ladrillo();
					coordX += brick.ANCHO_LADRILLO + 2;
					brick.setColor(Color.ORANGE);
					brick.setxCoord(coordX);
					brick.setyCoord(coordY);
					world.add(brick);
				}
				if(i == 5) {
					Ladrillo brick = new Ladrillo();
					coordX += brick.ANCHO_LADRILLO + 2;
					brick.setColor(Color.blue);
					brick.setxCoord(coordX);
					brick.setyCoord(coordY);
					world.add(brick);
				}
				

			}
			coordX = 10;
		}
		world.add(ball); // Añade la bola al ArrayList de actores
		world.add(nave); // Añade la nave al ArrayList

		this.addKeyListener(nave); //Añade un escuchador de teclado
		this.addMouseMotionListener(nave); //añade un adaptador para mover la nave con raton
		
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
	public void paint () {
		//System.out.println("Estoy en paint()");
		
		// Pinto el rectángulo tan grande como el Canvas
		Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		
		for (ObjetoAPintar obj : world) {
			obj.paint(g);
			
		}
		
		//if (nave==null) {
			//nave = loadImage("../res/nave-50x15.png");
		//}
		//g.drawImage(nave, 250, 720,this);
		strategy.show();
		
		
		
	}
	
	public void upDateWorld() {
		List<ObjetoAPintar> actoresQueSalen = new ArrayList<ObjetoAPintar>();
		for(ObjetoAPintar a : this.world) {
			if(a.isMarkedParaBorrar()) {
				actoresQueSalen.add(a);
			}
		}
		
		for (ObjetoAPintar a : actoresQueSalen) {
			world.remove(a);
		}
		
		actoresQueSalen.clear();
		this.world.addAll(newObjeto);
		this.newObjeto.clear();
		
		// para detectar si colisionan
		for (ObjetoAPintar obj1 : this.world) {
			if(obj1 instanceof Pelota) {
				Rectangle rect1 = new Rectangle(obj1.getxCoord(), obj1.getyCoord(), obj1.getAncho(), obj1.getAlto());
				for (ObjetoAPintar obj2 : this.world) {
					if(!obj2.equals(obj1) && !obj2.isMarkedParaBorrar() && !obj1.isMarkedParaBorrar()) {
						Rectangle rect2 = new Rectangle (obj2.getxCoord(), obj2.getyCoord(), obj2.getAncho(), obj2.getAlto());
						
						if(rect1.intersects(rect2)) {
							System.out.println("choco");
							obj1.collisionWith(obj2);
							obj2.collisionWith(obj1);
							//Deben aparecer las explosiones
							
							if(obj2 instanceof Ladrillo) {
								break;
							}
						}
					}
				}
			}
			
		}
		for(ObjetoAPintar obj : this.world) {
			obj.seMueve();
		};
	}
	
	
	/**
	 * Método donde se ejecuta el movimiento del juego
	 */
	public void game() {
		initWorld();;
		while (this.isVisible()) {
			upDateWorld();
			//ball.seMueve();
			//ball.paint(this.getGraphics());
			paint();
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


/**
 * 
 * @param explota
 */
	public void addNewObjetoParaLaProximaIteracion(ObjetoAPintar explota) {
		this.newObjeto.add(explota);
	}
	/**
	 * 
	 * @param args
	 */
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
