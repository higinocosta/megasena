package Telas;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import processos.CombVisual;
//import telas.BarraProgresso;

//ESTUDAR GETCOMPONETE PARA TORNAR BOTOES VISIVEIS
//INCLUIR BARRA DE PROGRESSO NO FRAMER

public class Botoes extends JPanel {

	private static final long serialVersionUID = 1L;

	// BarradeProgresso barra = new BarradeProgresso();
	public JButton botao1 = new JButton();
	public JButton botao2 = new JButton();
	public JRadioButton bot;

	public JPanel panel1; // botoes
	public ButtonGroup quantidade; // botoes
	int quantNum = 6; // botoes

	private GridBagLayout gridBagLayoutJogos = new GridBagLayout();
	static CombVisual combinacao = new CombVisual();
	static Jogos jg = new Jogos();
	JogosGerados jogos = new JogosGerados();
	BarraProgresso barra1 = new BarraProgresso();
	public static String[] vet;// = new String[];

	public Botoes() {
		setupGui();
	}

	public void AtivaBotao() {
		botao1.setEnabled(true);
		botao2.setEnabled(true);
	}

	private void setupGui() {

		int width = this.getWidth();
		this.setBorder(BorderFactory.createTitledBorder("Gerar Combinações"));

		this.setPreferredSize(new Dimension(width, 80));
		this.setMinimumSize(new Dimension(width, 80));
		this.setMaximumSize(new Dimension(width, 80));
		this.setLayout(gridBagLayoutJogos);

		Dimension btnDimension = new Dimension(100, 25);
		botao1.setMaximumSize(btnDimension);
		botao2.setMaximumSize(btnDimension);

		botao1.setMinimumSize(btnDimension);
		botao2.setMinimumSize(btnDimension);

		botao1.setText("Digitado");
		botao2.setText("Ordenado");
		
		botao1.setEnabled(false);
		botao2.setEnabled(false);

		// tentando colocar grupo de botoes
		NumberFormat f = new DecimalFormat("00");
		quantidade = new ButtonGroup();
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1, 10, 1, 1));

		for (int i = 6; i < 16; i++) {
			String nome = f.format(i);
			bot = new JRadioButton(nome);
			bot.setActionCommand(nome);
			panel1.add(bot);
			quantidade.add(bot);
			bot.setEnabled(false);
			bot.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (TabelaDezenas.dezenas.size() > 6) {
						bot.setEnabled(true);
					}
					quantNum = Integer.parseInt(bot.getActionCommand());
					CombVisual.totn = quantNum;
				}
			});
		}

		BarradeProgresso.getProgressBar();
		
		botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CombVisual.preparaJogos();
				// BarradeProgresso.getProgressBar();
				BarraProgresso.ativarBarra();
				BarradeProgresso.ativaBarra();
				// BarraProgresso.ativaBarra();
				combinacao.Comb2(CombVisual.n, CombVisual.totn, 1, "", vet);
				jg.Jogos2(CombVisual.linhas, CombVisual.temparray);
			}
		});
		
		botao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CombVisual.preparaJogos();
				Arrays.sort(vet);
				// BarradeProgresso.getProgressBar();
				BarraProgresso.ativarBarra();
				BarradeProgresso.ativaBarra();
				combinacao.Comb2(CombVisual.n, CombVisual.totn, 1, "", vet);
				jg.Jogos2(CombVisual.linhas, CombVisual.temparray);
			}
		});
		
		this.add(panel1, new GridBagConstraints(0, 0, 2, 1, 1.0, 1.0, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
		this.add(botao1, new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		this.add(botao2, new GridBagConstraints(1, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));

	}
}
