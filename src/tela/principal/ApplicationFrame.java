package tela.principal;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;

//INCLUIR BARRA DE PROGRESSO NO FRAMER

public class ApplicationFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private static ApplicationFrame instance = null;
	private MainPanel mainPanel;
	private GridBagLayout gridBagLayoutAppFrame;

	private ApplicationFrame() {
		setupGUI();
	}

	public static ApplicationFrame getInsance() {
		if (instance == null) {
			instance = new ApplicationFrame();
		}
		return instance;
	}

	public void setupGUI() {
		this.setTitle("Demo Application");
		this.setMinimumSize(new Dimension(570, 450));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gridBagLayoutAppFrame = new GridBagLayout();
		mainPanel = new MainPanel();
		this.setLayout(gridBagLayoutAppFrame);
		this.getContentPane().add(mainPanel, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(10, 10, 10, 10), 0, 0));
	}
}
