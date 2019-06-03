package Telas;

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
import javax.swing.JTextField;
import javax.swing.JToggleButton;

import processos.CombVisual;

public class TabelaDezenas extends JPanel {

	private static final long serialVersionUID = 1L;
	private GridBagLayout gridBagLayoutLeftTop;
	private JPanel panel;
	private JTextField numeros, ordenados;
	static ArrayList<String> dezenas = new ArrayList<String>();
	ArrayList<String> dezenasordenadas = new ArrayList<String>();
	Botoes botoes = new Botoes();
	static CombVisual combinar = new CombVisual();
	
	public static double totg;

	public TabelaDezenas() {
		setupGui();
	}

	public void setupGui() {

		NumberFormat f = new DecimalFormat("00");
		// ArrayList<String> dezenas = new ArrayList<String>();

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
					botoes.vet = dezenas.toArray(new String[dezenas.size()]);
					System.out.println(" vet " + Arrays.toString(botoes.vet));
					System.out.println("dezena -> " + dezenas.size());
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
