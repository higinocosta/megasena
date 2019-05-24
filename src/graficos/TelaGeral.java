package graficos;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

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
		
		ArrayList<String> dezenas = new ArrayList<String> ();
		setFont(new Font("Calibri", Font.PLAIN, 8));
		setTitle("Gerador de Combinações MEGA SENA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 433);
		contentPane = new JPanel();
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
		
		JLabel qtdDezenas = new JLabel("Quantidade de números por grupo");
		qtdDezenas.setBounds(41, 69, 172, 14);
		contentPane.add(qtdDezenas);
		
		JPanel panel = new JPanel();
		panel.setBounds(41, 97, 494, 245);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(6, 10, 1, 1));
		
		JToggleButton Bola01 = new JToggleButton("01");
		Bola01.setForeground(Color.BLACK);
		Bola01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Bola01.isSelected()) {
					dezenas.add(e.getActionCommand());
					System.out.println( Arrays.toString( dezenas.toArray() ) );
				} else 
				{
					dezenas.remove(e.getActionCommand());
					System.out.println( Arrays.toString( dezenas.toArray() ) );
				}
			}
		});
		Bola01.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola01);
		
		JToggleButton Bola02 = new JToggleButton("02");
		Bola02.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola02);
		
		JToggleButton Bola03 = new JToggleButton("03");
		Bola03.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola03);
		
		JToggleButton Bola04 = new JToggleButton("04");
		Bola04.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola04);
		
		JToggleButton Bola05 = new JToggleButton("05");
		Bola05.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola05);
		
		JToggleButton Bola06 = new JToggleButton("06");
		Bola06.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola06);
		
		JToggleButton Bola07 = new JToggleButton("07");
		Bola07.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola07);
		
		JToggleButton Bola08 = new JToggleButton("08");
		Bola08.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola08);
		
		JToggleButton Bola09 = new JToggleButton("09");
		Bola09.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola09);
		
		JToggleButton Bola10 = new JToggleButton("10");
		Bola10.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola10);
		
		JToggleButton Bola11 = new JToggleButton("11");
		Bola11.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola11);
		
		JToggleButton Bola12 = new JToggleButton("12");
		Bola12.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola12);
		
		JToggleButton Bola13 = new JToggleButton("13");
		Bola13.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola13);
		
		JToggleButton Bola14 = new JToggleButton("14");
		Bola14.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola14);
		
		JToggleButton Bola15 = new JToggleButton("15");
		Bola15.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola15);
		
		JToggleButton Bola16 = new JToggleButton("16");
		Bola16.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola16);
		
		JToggleButton Bola17 = new JToggleButton("17");
		Bola17.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola17);
		
		JToggleButton Bola18 = new JToggleButton("18");
		Bola18.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola18);
		
		JToggleButton Bola19 = new JToggleButton("19");
		Bola19.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola19);
		
		JToggleButton Bola20 = new JToggleButton("20");
		Bola20.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola20);
		
		JToggleButton Bola21 = new JToggleButton("21");
		Bola21.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola21);
		
		JToggleButton Bola22 = new JToggleButton("22");
		Bola22.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola22);
		
		JToggleButton Bola23 = new JToggleButton("23");
		Bola23.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola23);
		
		JToggleButton Bola24 = new JToggleButton("24");
		Bola24.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola24);
		
		JToggleButton Bola25 = new JToggleButton("25");
		Bola25.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola25);
		
		JToggleButton Bola26 = new JToggleButton("26");
		Bola26.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola26);
		
		JToggleButton Bola27 = new JToggleButton("27");
		Bola27.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola27);
		
		JToggleButton Bola28 = new JToggleButton("28");
		Bola28.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola28);
		
		JToggleButton Bola29 = new JToggleButton("29");
		Bola29.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola29);
		
		JToggleButton Bola30 = new JToggleButton("30");
		Bola30.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola30);
		
		JToggleButton Bola31 = new JToggleButton("31");
		Bola31.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola31);
		
		JToggleButton Bola32 = new JToggleButton("32");
		Bola32.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola32);
		
		JToggleButton Bola33 = new JToggleButton("33");
		Bola33.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola33);
		
		JToggleButton Bola34 = new JToggleButton("34");
		Bola34.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola34);
		
		JToggleButton Bola35 = new JToggleButton("35");
		Bola35.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola35);
		
		JToggleButton Bola36 = new JToggleButton("36");
		Bola36.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola36);
		
		JToggleButton Bola37 = new JToggleButton("37");
		Bola37.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola37);
		
		JToggleButton Bola38 = new JToggleButton("38");
		Bola38.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola38);
		
		JToggleButton Bola39 = new JToggleButton("39");
		Bola39.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola39);
		
		JToggleButton Bola40 = new JToggleButton("40");
		Bola40.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola40);
		
		JToggleButton Bola41 = new JToggleButton("41");
		Bola41.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola41);
		
		JToggleButton Bola42 = new JToggleButton("42");
		Bola42.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola42);
		
		JToggleButton Bola43 = new JToggleButton("43");
		Bola43.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola43);
		
		JToggleButton Bola44 = new JToggleButton("44");
		Bola44.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola44);
		
		JToggleButton Bola45 = new JToggleButton("45");
		Bola45.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola45);
		
		JToggleButton Bola46 = new JToggleButton("46");
		Bola46.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola46);
		
		JToggleButton Bola47 = new JToggleButton("47");
		Bola47.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola47);
		
		JToggleButton Bola48 = new JToggleButton("48");
		Bola48.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola48);
		
		JToggleButton Bola49 = new JToggleButton("49");
		Bola49.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola49);
		
		JToggleButton Bola50 = new JToggleButton("50");
		Bola50.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola50);
		
		JToggleButton Bola51 = new JToggleButton("51");
		Bola51.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola51);
		
		JToggleButton Bola52 = new JToggleButton("52");
		Bola52.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola52);
		
		JToggleButton Bola53 = new JToggleButton("53");
		Bola53.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola53);
		
		JToggleButton Bola54 = new JToggleButton("54");
		Bola54.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola54);
		
		JToggleButton Bola55 = new JToggleButton("55");
		Bola55.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola55);
		
		JToggleButton Bola56 = new JToggleButton("56");
		Bola56.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola56);
		
		JToggleButton Bola57 = new JToggleButton("57");
		Bola57.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola57);
		
		JToggleButton Bola58 = new JToggleButton("58");
		Bola58.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola58);
		
		JToggleButton Bola59 = new JToggleButton("59");
		Bola59.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola59);
		
		JToggleButton Bola60 = new JToggleButton("60");
		Bola60.setFont(new Font("Calibri", Font.PLAIN, 12));
		panel.add(Bola60);
	}
}
