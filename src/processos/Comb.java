package processos;

import java.util.Arrays;

public class Comb {

	public String[][] temparray;
	public int totn, lin;
	String[] v1;

	public void Comb2(int n, int m, int k, String s, String[] v) {

		System.out.println(m + " -> n = " + n + "  k = " + k);

		if (m > n - k + 1) { // se o número de elementos para combinação for maior que a quantidade de
			return; // elementos é encerrado a macro
		}

		if (m == 0) { // quando m for igual a 0 inicia a montagem das combinações

			System.out.println("s = " + s + " lin=" + (lin + 1));

			v1 = s.trim().split(" "); // v1 armazena a posição que serão recuperados da matriz

			for (int i = 0; i < v1.length; i++) { // loop da matriz v1 que possui o endereço do elemento da matriz v
				v1[i] = v[Integer.parseInt(v1[i]) - 1];
			}

			Arrays.sort(v1); // ordena o array com combinação
			temparray[lin++] = v1; // amarzena a combinação no array definitivo
			System.out.println(Arrays.toString(v1));
			System.out.println();
			
			return;

		}

		Comb2(n, m - 1, k + 1, s + k + " ", v); // incrementa as variáveis m utilizada para dar start nas combinações e
		Comb2(n, m, k + 1, s, v); // quando elimina cada bloco de combinação reinicia a Macro Comb2 até que m seja
									// maior que n
	}

}
