import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conversor {

	private JFrame frame;
	private JTextField txtKms;
	private JTextField txtMetros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor window = new Conversor();
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
	public Conversor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblConversor = new JLabel("Conversor");
		lblConversor.setBounds(183, 27, 88, 16);
		frame.getContentPane().add(lblConversor);
		
		JLabel lblKms = new JLabel("Kms");
		lblKms.setBounds(30, 77, 56, 16);
		frame.getContentPane().add(lblKms);
		
		JLabel lblMetros = new JLabel("Metros");
		lblMetros.setBounds(30, 164, 56, 16);
		frame.getContentPane().add(lblMetros);
		
		txtKms = new JTextField();
		txtKms.setBounds(74, 74, 116, 22);
		frame.getContentPane().add(txtKms);
		txtKms.setColumns(10);
		
		txtMetros = new JTextField();
		txtMetros.setBounds(94, 161, 116, 22);
		frame.getContentPane().add(txtMetros);
		txtMetros.setColumns(10);
		
		JButton Convertir = new JButton("Convertir");
		Convertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!txtKms.getText().isEmpty()) {
					txtMetros.setText(""+Integer.parseInt(txtKms.getText())*1000);
				}
			}
		});
		Convertir.setBounds(268, 120, 97, 25);
		frame.getContentPane().add(Convertir);
		
		JButton Limpiar = new JButton("Limpiar");
		Limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMetros.setText("");
				txtKms.setText("");
			}
		});
		Limpiar.setBounds(268, 180, 97, 25);
		frame.getContentPane().add(Limpiar);
	}
}
