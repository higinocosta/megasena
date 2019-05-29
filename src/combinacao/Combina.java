package combinacao;

import java.util.Scanner;

import processos.Comb;
import processos.Fatorial;

public class Combina {

	static Comb xxx = new Comb();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		xxx.lin = 0;

		System.out.print("Entre quantidade numero a combinar: ");
		int n = sc.nextInt();
		System.out.println("Entre quantidade de dezenas por combinação: ");
		xxx.totn = sc.nextInt();

		double totg = Fatorial.Fatorial(n, xxx.totn);
		System.out.println("total de combinações a serem geradas:" + totg);

		xxx.temparray = new String[(int) totg][xxx.totn];
		String[] vet = new String[n];

		vet[0] = sc.nextLine();

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite " + (i + 1) + "ª dezena : ");
			vet[i] = sc.nextLine();
		}

		xxx.Comb2(n, xxx.totn, 1, "", vet);
		System.out.println("Acabou......");

	}

}
