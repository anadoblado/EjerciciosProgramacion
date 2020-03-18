package tema8;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormularioFabricante extends JFrame{
	public static String TITULO_APLICACION="Formulario de fabricantes";
	
	JTextField jtfId = new JTextField(5);
	JTextField jtfCif = new JTextField(10);
	JTextField jtfNombre = new JTextField(20);
	
	
	
	public  FormularioFabricante() {
		super(TITULO_APLICACION);
		this.setBounds(0, 0, 600, 600);
		this.setContentPane(getPanelPrincipal());
		this.setVisible(true);
		
		
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				String posiblesRespuestas[] = {"Sí","No"};
				// En esta opción se utiliza un showOptionDialog en el que personalizo el icono mostrado
				int opcionElegida = JOptionPane.showOptionDialog(null, "¿Realmente desea cerrar la aplicación?", TITULO_APLICACION , 
				        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, posiblesRespuestas, posiblesRespuestas[1]);
			    if(opcionElegida == 0) {
			      System.exit(0);          
			    }
			}
		});
	}

	
	private JPanel getPanelPrincipal() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill = GridBagConstraints.NONE;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.EAST;
		c.insets= new Insets (2, 2, 2, 2);
		panel.add(new JLabel("Identificador: "), c);
		
		c.gridx = 1;
		c.gridy = 1;
		jtfId.setEnabled(false);//habilita o deshabilita el campo
		c.anchor = GridBagConstraints.WEST;
		panel.add(jtfId, c);
		
		// Introducción de CIF
		c.gridx = 0;
		c.gridy = 2;
		c.anchor = GridBagConstraints.EAST;
		panel.add(new JLabel("CIF: "), c);
		
		c.gridx = 1;
		c.gridy = 2;
		jtfCif.setEnabled(false);
		c.anchor = GridBagConstraints.WEST;
		panel.add(jtfCif, c);
		
		// Introducción de nombre
		c.gridx = 0;
		c.gridy = 3;
		c.anchor = GridBagConstraints.EAST;
		panel.add(new JLabel("Nombre: "), c);
		
		c.gridx = 1;
		c.gridy = 3;
		jtfNombre.setEnabled(false);
		c.anchor = GridBagConstraints.WEST;
		panel.add(jtfNombre, c);

		
	
		return panel;
	}
	
	private void componentes() {
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
//		// Panel de navegación
//		c.fill = GridBagConstraints.HORIZONTAL;
//		c.gridx = 0;
//		c.gridy = 0;
//		c.gridwidth = 2;
//		c.insets = new Insets(0, 0, 25, 0);
//		this.add(getPanelNavegacion(),c);
		
		// Introducción Identificador
		c.fill = GridBagConstraints.NONE;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.EAST;
		c.insets= new Insets (2, 2, 2, 2);
		this.add(new JLabel("Identificador: "), c);
		
		c.gridx = 1;
		c.gridy = 1;
		jtfId.setEnabled(false);//habilita o deshabilita el campo
		c.anchor = GridBagConstraints.WEST;
		this.add(jtfId, c);
		
		// Introducción de CIF
		c.gridx = 0;
		c.gridy = 2;
		c.anchor = GridBagConstraints.EAST;
		this.add(new JLabel("CIF: "), c);
		
		c.gridx = 1;
		c.gridy = 2;
		jtfCif.setEnabled(false);
		c.anchor = GridBagConstraints.WEST;
		this.add(jtfCif, c);
		
		// Introducción de nombre
		c.gridx = 0;
		c.gridy = 3;
		c.anchor = GridBagConstraints.EAST;
		this.add(new JLabel("Nombre: "), c);
		
		c.gridx = 1;
		c.gridy = 3;
		jtfNombre.setEnabled(false);
		c.anchor = GridBagConstraints.WEST;
		this.add(jtfNombre, c);
		
		
	}

	private Component getPanelNavegacion() {
		// TODO Auto-generated method stub
		return null;
	}


	public static void main(String[] args) {
		FormularioFabricante v = new FormularioFabricante();

	}

}
