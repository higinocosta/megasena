package processos;

public class Comb {

	public String[][] temparray; // = new String[210][totn];
	public int totn, lin;
	public String sss;
	String[] v1;

	public void Comb2(int n, int m, int k, String s, String[] v) {

		System.out.println(m + " -> n = " + n + "  k = " + k);

		if (m > n - k + 1) {
			return;
		} // se o número de elementos para combinação for maior que a quantidade de
			// elementos é encerrado a macro

		if (m == 0) { // quando m for igual a 0 inicia a montagem das combinações

			System.out.println("s = " + s + " lin=" + (lin + 1));

			s = s.trim();
			v1 = s.split(" "); // v1 armazena a posição que serão recuperados da matriz
			sss = ""; // sss assim como ss são utilizadas para a junção dos números da combinação

			for (int i = 0; i < v1.length; i++) { // loop da matriz v1 que possui o endereço do elemento da matriz v
				temparray[lin][i] = v[Integer.parseInt(v1[i]) - 1];
				System.out.print(v[Integer.parseInt(v1[i]) - 1] + " ");
			}

			System.out.println();
			// Quicksort(v1, 0, v1.length);

			// for (int i = 0; i<v1.length;i++) { //Ordena array
			// temparray[lin][i] = v1[i];
			// }

			++lin;
			return;

		}

		Comb2(n, m - 1, k + 1, s + k + " ", v); // incrementa as variáveis m utilizada para dar start nas combinações e
		Comb2(n, m, k + 1, s, v); // quando elimina cada bloco de combinação reinicia a Macro Comb2 até que m seja
									// maior que n

	}

}
