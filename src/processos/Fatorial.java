package processos;

public class Fatorial {

	public static double Fatorial(int n, int p) {
		double fatorialp = 1;
		double fatorialn = 1;

		while (p > 0) {
			fatorialp *= p;
			fatorialn *= n;
			p--;
			n--;
		}
		
		double resultado = (double) (fatorialn / fatorialp);
		//System.out.println("n -> " + n + " ( " + fatorialn + " )  p -> " + p + " (" + fatorialp + " ) resultado -> " + resultado);

		return resultado;
	}

}
