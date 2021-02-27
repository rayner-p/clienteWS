package ec.edu.ups.clases.vista;

import java.awt.EventQueue;
import java.net.URL;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.xml.namespace.QName;

import ec.edu.ups.g1.prueba.evaluacionwspalta.servicio.ClienteServicioSOAP;
import ec.edu.ups.g1.prueba.evaluacionwspalta.servicio.ClienteServicioSOAPService;
import ec.edu.ups.g1.prueba.evaluacionwspalta.servicio.Exception_Exception;
import ec.edu.ups.g1.prueba.evaluacionwspalta.servicio.Titulos;
import ec.edu.ups.clases.modelo.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import java.awt.Color;

public class vistaRegistro {

	private JFrame frame;
	private JTextField cedula;
	private JTextField txtNombe;
	private JTextField txtUniversidad;
	private List<Titulos> ll;
	private JLabel lb1;
	private JLabel lb2;
	private JLabel lb3;
	private JLabel lb4;

	private static final QName SERVICE_NAME = new QName("http://servicio.EvaluacionWSPALTA.prueba.g1.ups.edu.ec/",
			"ClienteServicioSOAPService");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaRegistro window = new vistaRegistro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public vistaRegistro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 463, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		cedula = new JTextField();
		cedula.setBounds(80, 27, 169, 31);
		frame.getContentPane().add(cedula);
		cedula.setColumns(10);

		txtNombe = new JTextField();
		txtNombe.setBounds(80, 70, 130, 26);
		frame.getContentPane().add(txtNombe);
		txtNombe.setColumns(10);

		txtUniversidad = new JTextField();
		txtUniversidad.setBounds(90, 116, 169, 26);
		frame.getContentPane().add(txtUniversidad);
		txtUniversidad.setColumns(10);

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registrar();
			}
		});
		btnRegistrar.setBounds(275, 132, 117, 29);
		frame.getContentPane().add(btnRegistrar);

		JLabel lblCdula = new JLabel(" Cédula");
		lblCdula.setBounds(6, 34, 61, 16);
		frame.getContentPane().add(lblCdula);

		JLabel lblTtulo = new JLabel("Título");
		lblTtulo.setBounds(6, 75, 61, 16);
		frame.getContentPane().add(lblTtulo);

		JLabel lblUniversidad = new JLabel("Universidad");
		lblUniversidad.setBounds(6, 121, 74, 16);
		frame.getContentPane().add(lblUniversidad);

		JButton btnBusca = new JButton("Buscar");
		btnBusca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listar();
			}
		});
		btnBusca.setBounds(275, 29, 117, 29);
		frame.getContentPane().add(btnBusca);

		lb1 = new JLabel("");
		lb1.setEnabled(false);
		lb1.setBounds(28, 257, 104, 31);
		frame.getContentPane().add(lb1);

		lb2 = new JLabel("");
		lb2.setEnabled(false);
		lb2.setBounds(145, 257, 104, 31);
		frame.getContentPane().add(lb2);

		lb3 = new JLabel("");
		lb3.setEnabled(false);
		lb3.setBounds(237, 257, 104, 31);
		frame.getContentPane().add(lb3);

		lb4 = new JLabel("");
		lb4.setEnabled(false);
		lb4.setBounds(353, 257, 104, 31);
		frame.getContentPane().add(lb4);
	}

	public void registrar() {
		URL wsdlURL = ClienteServicioSOAPService.WSDL_LOCATION;
		ClienteServicioSOAPService ss = new ClienteServicioSOAPService(wsdlURL, SERVICE_NAME);
		ClienteServicioSOAP port = ss.getClienteServicioSOAPPort();

		if (cedula.getText().length() > 10) {
			JOptionPane.showMessageDialog(null, "Ingrese un numero de correcto");
		} else {
			try {
				if (cedula.getText().isEmpty() && txtNombe.getText().isEmpty() && txtUniversidad.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Ingrese todos los valores");
				} else {
					port.registrarTitulo(cedula.getText(), txtNombe.getText(), txtUniversidad.getText());
					JOptionPane.showMessageDialog(null, "Registro correcto");

				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "error en el registro");
			}
		}
	}

	public void listar() {
		URL wsdlURL = ClienteServicioSOAPService.WSDL_LOCATION;
		ClienteServicioSOAPService ss = new ClienteServicioSOAPService(wsdlURL, SERVICE_NAME);
		ClienteServicioSOAP port = ss.getClienteServicioSOAPPort();
		if (cedula.getText() == null) {
			JOptionPane.showMessageDialog(null, "Ingrese un numero de cedula");
		} else
			try {
				if (port.obtenerTituLOS(cedula.getText()) == null) {
					JOptionPane.showMessageDialog(null, "El usuario no tiene títulos");
				} else {
					List<Titulos> tra = port.obtenerTituLOS(cedula.getText());
					for (Titulos titulos : tra) {
						System.out.println(titulos.getCodigoAlfa());
						lb1.setText(String.valueOf(titulos.getCodigo()));
						lb2.setText(titulos.getNombre());
						lb3.setText(titulos.getUniversidad());
						lb4.setText(titulos.getNumeroCuentaFk());
						JOptionPane.showMessageDialog(null, titulos.getCodigoAlfa());

					}

				}
			} catch (Exception_Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
