package Telas;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class TelaGeral extends JFrame {

	private static final long serialVersionUID = 1L;
	private JToggleButton dezenas[];
	private JRadioButton bot;
	private ButtonGroup itens;
	public int xxx = 0;

	public void TelaGeral(int linhax, int colunay, int minimus, int maximus) {

		// Prepando o Container
		Container container = getContentPane();

		// Criando os paineis para tela
		JPanel cartoes = new JPanel();
		JPanel QuantidadeDeDezenas = new JPanel();

		// Definindo variaveis de ambiente
		NumberFormat f = new DecimalFormat("00");

		// iniciando variaveis para preparar tela dos cartoes
		cartoes.setLayout(new GridLayout(linhax, colunay));
		dezenas = new JToggleButton[linhax * colunay];
		// tratarDezenas tratarDezenas = new tratarDezenas();

		for (int i = 0; i < dezenas.length; i++) {

			dezenas[i] = new JToggleButton(f.format(i + 1));
			cartoes.add(dezenas[i]);
			//Incluir aqui o tratamento das dezenas escolhidas
		}

		QuantidadeDeDezenas.setLayout(new GridLayout(1, maximus - minimus + 1));
		itens = new ButtonGroup();

		for (int i = minimus; i <= maximus; i++) {

			String nome = f.format(i);
			bot = new JRadioButton(nome);
			// bot.addItemListener(nome);
			bot.setActionCommand(nome);
			QuantidadeDeDezenas.add(bot);
			itens.add(bot);
			//Faz o tratamento da opção escolhida
			/*
			 * bot.addActionListener(new ActionListener() { public void
			 * actionPerformed(ActionEvent e) { CombVisual.totn =
			 * Integer.parseInt(e.getActionCommand()); }
			 * 
			 * });
			 */
		}

		container.add(cartoes, BorderLayout.NORTH);
		container.add(QuantidadeDeDezenas, BorderLayout.SOUTH);
//				container.add(itens,BorderLayout.SOUTH);
	}

	// executa a aplicação
	public static void main(String args[]) {
		TelaGeral aplicacao = new TelaGeral();

		// configura o encerramento da aplicação
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
