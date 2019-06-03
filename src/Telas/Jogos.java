package Telas;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

import processos.CombVisual;

public class Jogos extends JFrame {
	private static final long serialVersionUID = 1L;
	JTable tabela;
	JScrollPane barraRolagem;
	JPanel painelFundo;
	static CombVisual combinar = new CombVisual();

	public void Jogos2(String colunas[], String dados[][]) {

		painelFundo = new JPanel();
		painelFundo.setLayout(new GridLayout(1, 1));
		tabela = new JTable(dados, colunas);
		barraRolagem = new JScrollPane(tabela);
		painelFundo.add(barraRolagem);

		// Definindo para não aumentar a largura das colunas da tabela
		tabela.setAutoResizeMode(0);

		// Centralizando cabeçalho da tabela
		((DefaultTableCellRenderer) tabela.getTableHeader().getDefaultRenderer())
				.setHorizontalAlignment(SwingConstants.CENTER);
		// Centralizando dados da tabela
		((DefaultTableCellRenderer) tabela.getDefaultRenderer(Object.class))
				.setHorizontalAlignment(SwingConstants.CENTER);

		getContentPane().add(painelFundo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Demo Application");
		setSize(400, 600);
		setVisible(true);
	}
}
