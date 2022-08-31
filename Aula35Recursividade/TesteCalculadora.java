package Aula35Recursividade;

public class TesteCalculadora {

	static int resultSoma;

	public static void main(String[] args) {

		int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
		System.out.println(fatorialNR);
		
		int fatorialR = Calculadora.fatorial(5);
		System.out.println(fatorialR);

}
	
}
