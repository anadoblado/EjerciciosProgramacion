package tema8;

import java.awt.Color;

import java.awt.Container;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {
	
	
	public static String TITULO_APLICACION = "Primera Ventana";

	public Ventana() {
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



	public JPanel getPanelPrincipal() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.cyan);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		//Panel para el Nombre
		JPanel pnNombre = new JPanel();
		pnNombre.add(new JLabel("Nombre"));
		JTextField jtfNombre = new JTextField(40);
		pnNombre.add(jtfNombre);
		//Inserto el pnNombre en el panel principal
		panel.add(pnNombre);
		
		// Panel para el Primer Apellido
		JPanel pnPrimerApellido = new JPanel();
		pnPrimerApellido.add(new JLabel("Primer Apellido"));
		JTextField jtfPApellido = new JTextField(40);
		pnPrimerApellido.add(jtfPApellido);
		// Inserto el pnNombre en el panel principal
		panel.add(pnPrimerApellido);
		
		// Panel para el Segundo Apellido
		JPanel pnSegundoApellido = new JPanel();
		pnSegundoApellido.add(new JLabel("Segundo Apellido"));
		JTextField jtfSApellido = new JTextField(40);
		pnSegundoApellido.add(jtfSApellido);
		// Inserto el pnNombre en el panel principal
		panel.add(pnSegundoApellido);
		
		// Panel para la DNI
		JPanel pnDni = new JPanel();
		pnDni.add(new JLabel("DNI"));
		JTextField jtfDni = new JTextField(40);
		pnDni.add(jtfDni);
		// Inserto el pnNombre en el panel principal
		panel.add(pnDni);
		
		
		// Panel para la Localidad
		JPanel pnLocalidad = new JPanel();
		pnLocalidad.add(new JLabel("Localidad"));
		JTextField jtfLocalidad = new JTextField(40);
		pnLocalidad.add(jtfLocalidad);
		// Inserto el pnNombre en el panel principal
		panel.add(pnLocalidad);
		
		// JButton
		JButton bt = new JButton("Botón");

		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Personalización del icono, otra vez
				JOptionPane.showMessageDialog(null, pnNombre);
				JOptionPane.showMessageDialog(null, pnPrimerApellido);
				JOptionPane.showMessageDialog(null, pnSegundoApellido);
				JOptionPane.showMessageDialog(null, pnDni);
				JOptionPane.showMessageDialog(null, pnLocalidad);
			}
		});
		panel.add(bt);
		
		
		
		return panel;
	}





	public static void main(String[] args) {
		
		Ventana v = new Ventana();
		// TODO Auto-generated method stub

	}

}
