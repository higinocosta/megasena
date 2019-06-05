package Telas;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import processos.CombVisual;
//import telas.BarraProgresso;

public class Botoes extends JPanel {

	private static final long serialVersionUID = 1L;
	
	
	//BarradeProgresso barra = new BarradeProgresso();
	private JButton botao1 = new JButton();
	private JButton botao2 = new JButton();
	private GridBagLayout gridBagLayoutJogos = new GridBagLayout();
	static CombVisual combinacao = new CombVisual();
	static Jogos jg = new Jogos();
	JogosGerados jogos = new JogosGerados();
	BarraProgresso barra1 = new BarraProgresso();
	public static String[] vet;// = new String[];

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
		
		BarradeProgresso.getProgressBar();
		
		botao1.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    	CombVisual.preparaJogos();
                    	//BarradeProgresso.getProgressBar();
                    	BarradeProgresso.ativaBarra();
                    	//BarraProgresso.ativaBarra();
                    	combinacao.Comb2(CombVisual.n, 6, 1, "", vet);
                    	jg.Jogos2(CombVisual.linhas, CombVisual.temparray);
                    }
                });
		
		botao2.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    	CombVisual.preparaJogos();
                    	Arrays.sort(vet);
                    	//BarradeProgresso.getProgressBar();
                    	BarradeProgresso.ativaBarra();
                    	combinacao.Comb2(CombVisual.n, 6, 1, "", vet);
                    	jg.Jogos2(CombVisual.linhas, CombVisual.temparray);
                    }
                });
	}
}
