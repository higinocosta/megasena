package graficos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaGeral extends JFrame {

	private JPanel contentPane;
	private JTextField n;
	private JTextField totn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGeral frame = new TelaGeral();
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
	public TelaGeral() {
		setTitle("Gerador de Combinações MEGA SENA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		n = new JTextField();
		n.setBounds(250, 35, 86, 20);
		contentPane.add(n);
		n.setColumns(10);
		
		totn = new JTextField();
		totn.setBounds(250, 66, 86, 20);
		contentPane.add(totn);
		totn.setColumns(10);
		
		JLabel lblQuantidadeDeNmeros = new JLabel("Quantidade de números a combinar");
		lblQuantidadeDeNmeros.setBounds(41, 38, 200, 14);
		contentPane.add(lblQuantidadeDeNmeros);
		
		JLabel lblQuantidadeDeNmeros_1 = new JLabel("Quantidade de números por grupo");
		lblQuantidadeDeNmeros_1.setBounds(41, 69, 172, 14);
		contentPane.add(lblQuantidadeDeNmeros_1);
		
		JButton btnNewButton = new JButton("01");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 94, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("02");
		button.setBounds(99, 94, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("04");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(275, 94, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("03");
		button_2.setBounds(186, 94, 89, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("05");
		button_3.setBounds(10, 117, 89, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("06");
		button_4.setBounds(99, 117, 89, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("07");
		button_5.setBounds(186, 117, 89, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("08");
		button_6.setBounds(275, 117, 89, 23);
		contentPane.add(button_6);
	}
}
