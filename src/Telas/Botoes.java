package Telas;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import processos.CombVisual;

public class Botoes extends JPanel {

	private static final long serialVersionUID = 1L;
	

	// Declara componentes
	public static JProgressBar progressBar;
	
	private JButton botao1 = new JButton();
	private JButton botao2 = new JButton();
	private GridBagLayout gridBagLayoutJogos = new GridBagLayout();
	static CombVisual xxx = new CombVisual();
	public int n;
	public String[] vet;// = new String[];
	JogosGerados jogos = new JogosGerados();

	public Botoes() {
		setupGui();
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
		
		this.add(botao1, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		this.add(botao2, new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		botao1.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    	ativaBarra();
                		//xxx.Comb2(n, xxx.totn, 1, "", vet);
                    	xxx.Comb2(n, 6, 1, "", vet);
                    }
                });
		
		botao2.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    //	xxx.Comb2(n, 6, 1, "", Arrays.sort(vet));
                    }
                });

	}
	

	private static JProgressBar getProgressBar() {
		if (progressBar == null) {
			progressBar = new JProgressBar();
			progressBar.setBounds(new Rectangle(18, 459, 419, 25));
			progressBar.setStringPainted(true);
			progressBar.setMinimum(0);
			progressBar.setMaximum(100);
		}
		return progressBar;
	}

	public static void atualizaBarra(int valor) {
		progressBar.setValue(valor);
	}

	public static void ativaBarra() {

		// final BarraProgresso barra = new BarraProgresso();

		JFrame frame = new JFrame("Progress Bar Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(getProgressBar());
		frame.pack();
		frame.setVisible(true);
		frame.setLocation(400, 300);

	}

}
