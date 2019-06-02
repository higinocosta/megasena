package combinacao;

import java.awt.Rectangle;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

import Telas.Jogos;
import processos.CombVisual;
import processos.Fatorial;

public class Combina {

	// Declara componentes
	public static JProgressBar progressBar;

	static CombVisual xxx = new CombVisual();
	static Jogos jg = new Jogos();
	public static double totg;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		xxx.lin = 0;

		System.out.print("Entre quantidade numero a combinar: ");
		int n = sc.nextInt();
		System.out.println("Entre quantidade de dezenas por combinação: ");
		xxx.totn = sc.nextInt();

		totg = Fatorial.Fatorial(n, xxx.totn);
		System.out.println("total de combinações a serem geradas:" + totg);

		xxx.temparray = new String[(int) totg][xxx.totn];
		String[] vet = new String[n];
		String[] linhas = new String[xxx.totn];

		vet[0] = sc.nextLine();

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite " + (i + 1) + "ª dezena : ");
			vet[i] = sc.nextLine();
		}
		for (int i = 0; i < xxx.totn; i++) {
			linhas[i] = "N-" + (i + 1);
		}

		ativaBarra();
		xxx.Comb2(n, xxx.totn, 1, "", vet);
		System.out.println(Arrays.toString(linhas) + "  " + xxx.temparray.length);
		jg.Jogos2(linhas, xxx.temparray);
		System.out.println("Acabou......");

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
