package Telas;

import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class BarradeProgresso {

	// Declara componentes da Barra de progresso
	public static JProgressBar progressBar;

	public static JProgressBar getProgressBar() {
		if (progressBar == null) {
			progressBar = new JProgressBar();
			progressBar.setBounds(new Rectangle(18, 459, 419, 25));
			progressBar.setStringPainted(true);
			progressBar.setMinimum(0);
			progressBar.setMaximum(100);
		}
		return progressBar;
	}

	public void atualizaBarra(int valor) {
		progressBar.setValue(valor);
		progressBar.repaint();
	}

	public void ativaBarra() {

		//final BarraProgresso barra = new BarraProgresso();

		JFrame frame = new JFrame("Barra de Progresso");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(getProgressBar());
		frame.pack();
		frame.setVisible(true);
		frame.setLocation(800, 300);

	}

}
