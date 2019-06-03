package processos;

import java.util.Arrays;

import Telas.Botoes;
import combinacao.Combina;

public class CombVisual {

	public static String[][] temparray;
	public static int totn, lin, n;
	public static double totg;
	String[] v1;
	static String[] linhas;

	public void Comb2(int n, int m, int k, String s, String[] v) {

		if (m > n - k + 1) { // se o número de elementos para combinação for maior que a quantidade de
			return; // elementos é encerrado a macro
		}

		if (m == 0) { // quando m for igual a 0 inicia a montagem das combinações

			v1 = s.trim().split(" "); // v1 armazena a posição que serão recuperados da matriz

			for (int i = 0; i < v1.length; i++) { // loop da matriz v1 que possui o endereço do elemento da matriz v
				v1[i] = v[Integer.parseInt(v1[i]) - 1];
			}

			Arrays.sort(v1); // ordena o array com combinação
			temparray[lin++] = v1; // amarzena a combinação no array definitivo

			Botoes.atualizaBarra((int) ((int) lin * 100 / Combina.totg));

			return;

		}

		Comb2(n, m - 1, k + 1, s + k + " ", v); // incrementa as variáveis m utilizada para dar start nas combinações e
		Comb2(n, m, k + 1, s, v); // quando elimina cada bloco de combinação reinicia a Macro Comb2 até que m seja
									// maior que n
	}
	
	public static void preparaJogos() {

		totg = Fatorial.Fatorial(n, totn);
		System.out.println("total de combinações a serem geradas:" + totg);

		temparray = new String[(int) totg][totn];
		linhas = new String[totn];

		for (int i = 0; i < totn; i++) {
			linhas[i] = "N-" + (i + 1);
		}
		
		
	}

}
