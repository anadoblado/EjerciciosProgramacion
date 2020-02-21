package Juegos.arkanoid10Fases1Properties;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class PintaArkanoid extends Canvas /*implements MouseListener, KeyListener*/ {
	//Con JFrame se har� la ventana que albergar� el juego
	JFrame ventana = new JFrame("Arkanoid");

	// Con variables estat�ticas, ya que las queremos fijas, indicamos el
	//ancho y alto de la ventana
	private static final int JFRAME_WIDTH = 500;
	private static final int JFRAME_HEIGHT = 800;
	public static final int SPEED = 60;
	public long usedTime;
	//Vamos a crear una variable para establecer la instancia del patr�n Singleton
	private static PintaArkanoid instance = null;

	private BufferStrategy strategy;
	public List<ObjetoAPintar> newObjeto = new ArrayList<ObjetoAPintar>();
	public List<ObjetoAPintar> world = new ArrayList<ObjetoAPintar>();
	
	Pelota ball = null;
	Nave nave = null;
	public boolean space;
	private int vidas = 8;
	private boolean gameOver = false;
	private boolean esFinDeFase = false;
	
	
	
	


	/**
	 * Constructor para inicializar la ventana y verla
	 */
	public PintaArkanoid() {
		SoundsRepository.getInstance();
		// Obtengo la referencia al panel principal, despu�s de haber implementado
		//el Canvas
		JPanel panel = (JPanel) ventana.getContentPane();
		// Creo una plantilla en el panel, para poder ponerle el Canvas bordes
		panel.setLayout(new BorderLayout());
		// Se agrega el Canvas al Panel
		panel.add(this, BorderLayout.CENTER);

		//As� le damos las dimensiones a la venta, no uso el constructor
		//que genera con el Source porque as� le doy las dimensiones a la
		//ventana
		ventana.setBounds(0, 0, JFRAME_WIDTH, JFRAME_HEIGHT);

		//Agrego un windowListener, pero el adaptador para solo 
		//coger un m�todo de todos los que implementa el windowListener
		ventana.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}
		});
		
		SoundsRepository.getInstance().playSound(SoundsRepository.MUSICA_DE_FONDO);
		// Para que la ventana est� en visible
		ventana.setVisible(true);
		ventana.setResizable(true);
		ventana.setIgnoreRepaint(true);
		this.createBufferStrategy(2);
		strategy = getBufferStrategy();
		// El foco de Windows ir� al Canvas, para que directamente podamos interactuar
		//con el juego mediante teclado
		this.requestFocus();
		
		
		
	}
    /**
     *M�todo que crea el muro de ladrillos de la primera fase
     */
	public void muroDeLadrillos() {
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
					brick.setDureza(1);
					world.add(brick);
				}
				if(i == 1) {
					Ladrillo brick = new Ladrillo();
					coordX += brick.ANCHO_LADRILLO + 2;
					brick.setColor(Color.yellow);
					brick.setxCoord(coordX);
					brick.setyCoord(coordY);
					brick.setDureza(1);
					world.add(brick);
				}
				if (i == 2) {
					Ladrillo brick = new Ladrillo();
					coordX += brick.ANCHO_LADRILLO + 2;
					brick.setColor(Color.magenta);
					brick.setxCoord(coordX);
					brick.setyCoord(coordY);
					brick.setDureza(1);
					world.add(brick);
				}
				if (i == 3) {
					Ladrillo brick = new Ladrillo();
					coordX += brick.ANCHO_LADRILLO + 2;
					brick.setColor(Color.green);
					brick.setxCoord(coordX);
					brick.setyCoord(coordY);
					brick.setDureza(1);
					world.add(brick);
				}
				if (i == 4) {
					Ladrillo brick = new Ladrillo();
					coordX += brick.ANCHO_LADRILLO + 2;
					brick.setColor(Color.ORANGE);
					brick.setxCoord(coordX);
					brick.setyCoord(coordY);
					brick.setDureza(1);
					world.add(brick);
				}
				if(i == 5) {
					Ladrillo brick = new Ladrillo();
					coordX += brick.ANCHO_LADRILLO + 2;
					brick.setColor(Color.blue);
					brick.setxCoord(coordX);
					brick.setyCoord(coordY);
					brick.setDureza(1);
					world.add(brick);
				}
				

			}
			coordX = 10;
		}

	}
	/**
	 * Inicia el mundo del juego
	 */
	public void initWorld() {
		muroDeLadrillos();
		// Creo el objeto de tipo pelota
		Pelota ball = new Pelota("ball");
		
		// Creo el objeto de tipo nave
		Nave nave = new Nave();
		// Coordenadas del ladrillo de la primera fila
				world.add(ball); // A�ade la bola al ArrayList de actores
		world.add(nave); // A�ade la nave al ArrayList
		this.ball = ball;
		this.nave = nave;
		
		if(esFinDeFase == true) {
			segundoMuro();
			ball.lanzarPelota();
			
		}
		
		ball.setxCoord(nave.getxCoord() + (nave.getAncho()/2) - 15);
		ball.setyCoord(nave.getyCoord() - (nave.getAlto() + 12));

		
		this.addKeyListener(nave); //A�ade un escuchador de teclado
		this.addMouseMotionListener(nave); //a�ade un adaptador para mover la nave con raton
		this.addMouseListener(nave);
		
	}
	
	public void segundoMuro() {
		int coordX = 10;
		int coordY = 20;
		for (int i = 0; i < 6; i++) {
		coordY += 22;
			for (int j = 0; j < 9; j++) {
				if(i == 0) {
					Ladrillo brick = new Ladrillo();
					coordX += brick.ANCHO_LADRILLO + 2;
					brick.setColor(Color.red);
					brick.setxCoord(coordX);
					brick.setyCoord(coordY);
					brick.setDureza(-1);
					world.add(brick);
				}
				if(i == 1) {
					Ladrillo brick = new Ladrillo();
					coordX += brick.ANCHO_LADRILLO + 2;
					brick.setColor(Color.yellow);
					brick.setxCoord(coordX);
					brick.setyCoord(coordY);
					brick.setDureza(1);
					world.add(brick);
				}
				if (i == 2) {
					Ladrillo brick = new Ladrillo();
					coordX += brick.ANCHO_LADRILLO + 2;
					brick.setColor(Color.cyan);
					brick.setxCoord(coordX);
					brick.setyCoord(coordY);
					brick.setDureza(2);
					world.add(brick);
				}
				if (i == 3) {
					Ladrillo brick = new Ladrillo();
					coordX += brick.ANCHO_LADRILLO + 2;
					brick.setColor(Color.cyan);
					brick.setxCoord(coordX);
					brick.setyCoord(coordY);
					brick.setDureza(2);
					world.add(brick);
				}
				if (i == 4) {
					Ladrillo brick = new Ladrillo();
					coordX += brick.ANCHO_LADRILLO + 2;
					brick.setColor(Color.ORANGE);
					brick.setxCoord(coordX);
					brick.setyCoord(coordY);
					brick.setDureza(1);
					world.add(brick);
				}
				if(i == 5) {
					Ladrillo brick = new Ladrillo();
					coordX += brick.ANCHO_LADRILLO + 2;
					brick.setColor(Color.red);
					brick.setxCoord(coordX);
					brick.setyCoord(coordY);
					brick.setDureza(-1);
					world.add(brick);
				}
				

			}
			coordX = 10;
		}

	}
	

	/**
	 * M�todos para devolver la instancia del patr�n Singleton
	 * @return
	 */
	public static PintaArkanoid getInstance () {
		if (instance == null) {
			instance = new PintaArkanoid ();
		}
		return instance;
	}
	/**
	 * M�todo para antes de cerrar la ventana con la equis de la esquina, le pregunta al usuario
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
	 * M�todo para pintar el Canvas
	 */
	public void paint () {
		//System.out.println("Estoy en paint()");
		
		// Pinto el rect�ngulo tan grande como el Canvas
		Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
		//g.setColor(Color.black);
		//g.fillRect(0, 0, this.getWidth(), this.getHeight());
		BufferedImage fondo = SpritesRepository.getInstance().getSprite(SpritesRepository.getInstance().FONDO);
		g.drawImage(fondo, 0, 0, null);
		//g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		// en el for que recorre el ArrayList de objetos que intervienen metemos una variable que compruebe si es fin de fase
		esFinDeFase = true;
		for (ObjetoAPintar obj : world) {
			obj.paint(g);
			if ( obj instanceof Ladrillo) { 
				esFinDeFase = false;
				}
		System.out.println(" cambia a: " + esFinDeFase);	
		}
		if ( esFinDeFase == true) {
			System.out.println("Chaaaaaaaaampion de la fase uno");
			
		}
		
		for (int i = 0; i < vidas; i++) {
			BufferedImage vida = SpritesRepository.getInstance().getSprite(SpritesRepository.getInstance().VIDAS);
			g.drawImage(vida, 30*i, 730, this);
		}
		
		if(vidas == 0) {
			System.out.println("acaboooo");
			BufferedImage finJuego = SpritesRepository.getInstance().getSprite(SpritesRepository.getInstance().GAME_OVER);
			g.drawImage(finJuego, 50, 200, this);

			this.strategy.show();
		}
		
		this.paintPuntuacion(g);
		strategy.show();
		
		
		
	}
	
	public void paintPuntuacion (Graphics2D g) {
		g.setFont(new Font ("Arial", Font.BOLD,20));
		g.setPaint(Color.green);
		g.drawString("Puntuacion:" , 300, 745);
		g.setPaint(Color.cyan);
		g.drawString(nave.getScore() + "" , 441, 745);
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
							System.out.println(obj2.getClass().getName());
							if(obj2 instanceof Ladrillo) {
								break;
							}
						}
					}
				}
//				for(ObjetoAPintar obj3 : this.world) {
//					if(!obj3.equals(obj1) && !obj3.isMarkedParaBorrar() && !obj1.isMarkedParaBorrar()) {
//						Rectangle rect3 = new Rectangle (obj3.getxCoord(), obj3.getyCoord()+11, obj3.getAncho(), 8);
//						
//						if(rect1.intersects(rect3)) {
//							obj1.collisionWith(obj3);
//							obj3.collisionWith(obj1);
//							System.out.println(obj3.getClass().getName());
//							if(obj3 instanceof Ladrillo) {
//								break;
//							}
//						}
//						
//					}
//				}
			}
			
		}
		for(ObjetoAPintar obj : this.world) {
			obj.seMueve();
		};
	}
	
	
	/**
	 * M�todo donde se ejecuta el movimiento del juego
	 */
	public void game() {
		initWorld();
		
		while (this.isVisible() && gameOver == false) {
			long starTime = System.currentTimeMillis();
			upDateWorld();
			paint();
			usedTime = System.currentTimeMillis() - starTime;
			// se genera la segunda fase de ladrillos
			if(esFinDeFase == true) {
				Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
				
				long millisAhora = new Date().getTime();
				while (new Date().getTime() - millisAhora  < 5000  ) {
					BufferedImage finJuego = SpritesRepository.getInstance().getSprite(SpritesRepository.getInstance().GAME_OVER);
					g.drawImage(finJuego, 50, 200, this);
				}
				segundoMuro();
			}
			
			if (getBall().getyCoord() > PintaArkanoid.JFRAME_HEIGHT + 20) {
				restarVida();
				System.out.println(" tas pirao");
				
			}
			
			try { 
				int millisToSleep = (int) (1000 / SPEED - usedTime);
				if(millisToSleep < 0) {
					millisToSleep = 0;
				}
				  Thread.sleep(millisToSleep);
			} catch (InterruptedException e) { e.printStackTrace();}
			
			
		}
		paint();
		//pintarFinDeJuego();
	}
	
	
//	private void pintarFinDeJuego() {
//		System.out.println("acaboooo");
//		Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
//		this.strategy.show();
//		
//		BufferedImage finJuego = SpritesRepository.getInstance().getSprite(SpritesRepository.getInstance().GAME_OVER);
//		//g.drawImage(finJuego, JFRAME_WIDTH/2, JFRAME_HEIGHT/2, ventana);
//		g.setPaint(new TexturePaint(finJuego, new Rectangle (0, 0, finJuego.getWidth(), finJuego.getHeight())));
//		this.strategy.show();
//		System.out.println("me pinto");
//		
//		
//	}

	
		
	
	/**
	 *Me da las vidas y la cantidad de vidas que hay 
	 */
	public void restarVida() {
		
		if (vidas == 1) {
			gameOver = true;
		}
		vidas --;
		System.out.println("vidas: " + vidas);
		getNave().setxCoord(JFRAME_WIDTH/2);
		getBall().reiniciarMillis();
		
//		List<ObjetoAPintar> actoresQueSalen = new ArrayList<ObjetoAPintar>();
//		for(ObjetoAPintar a : this.world) {
//			if(a instanceof Pelota) {
//				actoresQueSalen.add(a);
//			}
//		}
//		
//		for (ObjetoAPintar a : actoresQueSalen) {
//			world.remove(a);
//		}
//		
//		actoresQueSalen.clear();
//		
//		this.world.add (new Pelota("ball"));
//		this.newObjeto.clear();
		
//		for (ObjetoAPintar objetoAPintar : world) {
//			
//			if (objetoAPintar instanceof Pelota) {
//				
//				//world.remove(objetoAPintar);
//				objetoAPintar = new Pelota("ball");
//				
//				world.add(objetoAPintar);
//				System.out.println("entroo");
//			}
//		}
		
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
	
	/**
	 * @return the ball
	 */
	public Pelota getBall() {
		return ball;
	}

	/**
	 * @param ball the ball to set
	 */
	public void setBall(Pelota ball) {
		this.ball = ball;
	}

	/**
	 * @return the nave
	 */
	public Nave getNave() {
		return nave;
	}

	/**
	 * @param nave the nave to set
	 */
	public void setNave(Nave nave) {
		this.nave = nave;
	}

	/**
	 * @return the vidas
	 */
	public int getVidas() {
		return vidas;
	}

	/**
	 * @param vidas the vidas to set
	 */
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	



}
