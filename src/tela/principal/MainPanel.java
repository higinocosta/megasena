package tela.principal;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import Telas.Botoes;
import Telas.JogosGerados;
import Telas.TabelaDezenas;

public class MainPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TabelaDezenas tabeladezenas;
	private Botoes botoes;
	private JogosGerados jogosgerados;
	private GridBagLayout gridBagLayoutMain;

	public MainPanel() {
		setupGui();
	}

	private void setupGui() {
		gridBagLayoutMain = new GridBagLayout();
		tabeladezenas = new TabelaDezenas();
		botoes = new Botoes();
		jogosgerados = new JogosGerados();
		this.setBorder(BorderFactory.createTitledBorder("Main-Panel"));
		this.setLayout(gridBagLayoutMain);
		this.add(tabeladezenas, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTHWEST,
				GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0));
		//this.add(jogosgerados, new GridBagConstraints(1, 0, 1, 2, 1, 1, GridBagConstraints.NORTHEAST,
		//		GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0));
		this.add(botoes, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.SOUTH,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
		
	}
}
