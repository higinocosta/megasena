package Telas;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

import processos.CombVisual;

public class TabelaDezenas extends JPanel {

	private static final long serialVersionUID = 1L;
	private GridBagLayout gridBagLayoutLeftTop;
	private JPanel panel;
	private JTextField numeros, ordenados;
	public static ArrayList<String> dezenas = new ArrayList<String>();
	ArrayList<String> dezenasordenadas = new ArrayList<String>();
	Botoes botoes = new Botoes();
	static CombVisual combinar = new CombVisual();
	String xxx;
	

	public TabelaDezenas() {
		setupGui();
	}

	public void AtivarBotoes(Object painel, boolean acao) {
		Container c = (Container)painel;
        Component[] components = c.getComponents();
        for (Component component : components) {
            //setEnabledAll(component, acao);
            component.setEnabled(acao);
        };
	}

	public void LiberaBotoes(JRadioButton botao, boolean acao) {
		botao.setEnabled(true);
	}
	public void setupGui() {

		NumberFormat f = new DecimalFormat("00");

		gridBagLayoutLeftTop = new GridBagLayout();

		this.setBorder(BorderFactory.createTitledBorder("Tabela de Dezenas"));
		this.setLayout(gridBagLayoutLeftTop);

		numeros = new JTextField();
		ordenados = new JTextField();
		panel = new JPanel();
		panel.setLayout(new GridLayout(6, 10, 1, 1));

		for (int i = 1; i <= 60; i++) {
			String name = f.format(i);
			JToggleButton b = new JToggleButton(name);
			panel.add(b);
			b.setActionCommand(name);
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (b.isSelected()) {
						dezenas.add(e.getActionCommand());
						//dezenas.add(ActionEvent);
						//b.setBackground(Color.GREEN);
					} else {
						dezenas.remove(e.getActionCommand());
					}
					
					
					xxx = String.join(",", dezenas);
					numeros.setText(xxx);
					Botoes.vet = xxx.split(",");
					System.out.println(xxx);
					Botoes.veto = xxx.split(",");
					Arrays.sort(Botoes.veto);
					ordenados.setText(Arrays.toString(Botoes.veto));
					CombVisual.n = dezenas.size();

				}
			});
		}

		this.add(panel, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.NORTH, GridBagConstraints.NONE,
				new Insets(5, 5, 5, 5), 0, 0));

		this.add(numeros, new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.SOUTH,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));

		this.add(ordenados, new GridBagConstraints(0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.SOUTH,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
	}
}
