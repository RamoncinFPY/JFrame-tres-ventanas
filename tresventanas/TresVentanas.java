package eventos.tresventanas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TresVentanas extends JFrame {

	private JPanel contentPane;
	private JPanel ventana0;
	private JPanel ventana1;
	private JPanel ventana2;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldNif;
	private Cliente cliente = new Cliente();

	private JLabel lblMostrando;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					TresVentanas frame = new TresVentanas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TresVentanas() {

		// Contenedor principal
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("By Ramón     Registro de clientes.");
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Ventana para crear el usuario.
		ventana0 = new JPanel();
		ventana0.setBounds(0, 0, 584, 556);
		contentPane.add(ventana0);
		ventana0.setLayout(null);

		JButton btnCrear = new JButton("Crear Usuario");
		btnCrear.setBounds(213, 244, 158, 54);
		ventana0.add(btnCrear);

		btnCrear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnCrear) {
					ventana0.setVisible(false);
					ventana1.setVisible(true);
					ventana2.setVisible(false);
				}
			}
		});

		// VENTANA 1 REGISTRO DE CLIENTES.
		ventana1 = new JPanel();
		ventana1.setBounds(0, 0, 584, 556);
		contentPane.add(ventana1);
		ventana1.setLayout(null);

		JLabel lblVentana1_1 = new JLabel("VENTANA 1");
		lblVentana1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVentana1_1.setForeground(Color.RED);
		lblVentana1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblVentana1_1.setBounds(210, 46, 158, 54);
		ventana1.add(lblVentana1_1);

		textFieldNombre = new JTextField();

		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(312, 174, 207, 20);
		ventana1.add(textFieldNombre);

		JLabel lblNombre_1 = new JLabel("Nombre: ");
		lblNombre_1.setBounds(176, 180, 46, 14);
		ventana1.add(lblNombre_1);

		JLabel lblApellido_1 = new JLabel("Apellido: ");
		lblApellido_1.setBounds(175, 247, 46, 14);
		ventana1.add(lblApellido_1);

		textFieldApellido = new JTextField();

		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(314, 240, 207, 20);
		ventana1.add(textFieldApellido);

		JLabel lblNif_1 = new JLabel("NIF: ");
		lblNif_1.setBounds(179, 315, 46, 14);
		ventana1.add(lblNif_1);

		textFieldNif = new JTextField();

		textFieldNif.setColumns(10);
		textFieldNif.setBounds(316, 310, 207, 20);
		ventana1.add(textFieldNif);

		JButton btnGuardar_1 = new JButton("GUARDAR");
		btnGuardar_1.setBounds(202, 410, 191, 29);
		ventana1.add(btnGuardar_1);

		// VENTANA 2 MOSTRAR DATOS
		ventana2 = new JPanel();
		ventana2.setBounds(0, 0, 584, 556);
		contentPane.add(ventana2);
		ventana2.setLayout(null);
		ventana2.setBounds(0, 0, 585, 556);
		ventana2.setVisible(false);

		JButton btnMostrarDatos = new JButton("Mostrar Datos");

		btnMostrarDatos.setBounds(217, 196, 185, 57);
		btnMostrarDatos.setForeground(Color.ORANGE);
		btnMostrarDatos.setFont(new Font("Tahoma", Font.BOLD, 12));
		ventana2.add(btnMostrarDatos);

		lblMostrando = new JLabel("Registro Correcto!");
		lblMostrando.setForeground(Color.GREEN);
		lblMostrando.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblMostrando.setBounds(10, 320, 548, 107);
		ventana2.add(lblMostrando);

		btnMostrarDatos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnMostrarDatos) {

					ventana0.setVisible(false);
					ventana1.setVisible(false);
					// System.out.println(cliente.toString());
					lblMostrando.setForeground(Color.BLUE);

					lblMostrando.setText(cliente.toString());
				}
			}
		});

		btnGuardar_1.addActionListener(e -> {
			ventana0.setVisible(false);
			ventana1.setVisible(false);
			ventana2.setVisible(true);

			// System.out.println("antes");
			cliente.setNombre(textFieldNombre.getText());
			// System.out.println("despues");
			cliente.setApellido(textFieldApellido.getText());
			cliente.setNif(textFieldNif.getText());
			// System.out.println(cliente.toString());
		});

		JLabel lblVentana0 = new JLabel("VENTANA 0");
		lblVentana0.setHorizontalAlignment(SwingConstants.CENTER);
		lblVentana0.setForeground(Color.RED);
		lblVentana0.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblVentana0.setBounds(213, 114, 158, 54);

	}
}
