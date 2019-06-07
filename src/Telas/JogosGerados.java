package Telas;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JogosGerados extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tabela = new JTable();
	private GridBagLayout gridBagLayoutJogos = new GridBagLayout();
	private JScrollPane jScrollPane;
	public String columnNames[];// = (String) new String();
	public String dataValues[][];// = {{}};

	public JogosGerados() {
		setupGui();
	}

	private void setupGui() {

		String columnNames[] = {};
		String dataValues[][] = {{}};

		this.setBorder(BorderFactory.createTitledBorder("Jogos Gerados"));
		this.setLayout(gridBagLayoutJogos);

		tabela = new JTable(dataValues, columnNames);
		jScrollPane = new JScrollPane(tabela);

		this.add(jScrollPane, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));

	}

}
