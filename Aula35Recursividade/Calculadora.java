package Aula35Recursividade;

public class Calculadora {

	public static int fatorial(int valor) {

		int fat = 1;

		for (int i = 2; i <= valor; i++) {
			fat *= i;

		}
		return fat;
	}

	// fatorial(5) = 5 * fatorial(4)
	// fatorial(4) = 4 * fatorial(3)
	// fatorial(3) = 3 * fatorial(2)
	// fatorial(2) = 2 * fatorial(1)
	// fatorial(1) = 1 * fatorial(0)
	// fatorial(0) = 1
	public static int fatorialNaoRecursivo(int num) {
		if (num == 0) {
			return 1;
		}
		return num * fatorialNaoRecursivo(num - 1);
	}
}
