package Telas;

import java.awt.Button;
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
		botao.setEnabled(true);;
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
					} else {
						dezenas.remove(e.getActionCommand());
					}
					numeros.setText(Arrays.toString(dezenas.toArray()));
					dezenasordenadas = dezenas;
					Collections.sort(dezenasordenadas);
					ordenados.setText(Arrays.toString(dezenasordenadas.toArray()));
					Botoes.vet = dezenas.toArray(new String[dezenas.size()]);
					CombVisual.n = dezenas.size();

					if (dezenas.size() >= 6) {
						
						System.out.print(dezenas.size() + " - ");
						System.out.println("-----");
						botoes.AtivaBotao();
						botoes.bot.setEnabled(true);
						System.out.println(botoes.bot.getText());
						System.out.println("-----");
						//LiberaBotoes(botoes.quantidade.)
						/*
						for (int i = dezenas.size();i <= dezenas.size(); i++) {
							botoes.panel1.setVisible(true);
							((Container) botoes.quantidade).getComponent(1).setEnabled(true);
							//AtivarBotoes(botoes.bot., true);
							//System.out.println(botoes.bot.);
						}
						//botoes.panel1.setEnabled(true);
						 */
					}
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
