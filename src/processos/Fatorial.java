package processos;

public class Fatorial {

	public static double Fatorial(int n, int p) {
		int fatorialp = 1;
		int fatorialn = 1;

		while (p > 0) {
			fatorialp *= p;
			fatorialn *= n;
			p--;
			n--;
		}
		
		double resultado = (double) (fatorialn / fatorialp);

		return resultado;
	}

}
