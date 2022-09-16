package Aula47a52Excessoes;

public class Excesao {

	public static void main(String[] args) {

		try {
			int[] vetor = new int[4];

			System.out.println("Antes da Exception");

			vetor[5] = 10;

			System.out.println("Esse texto nao sera impresso");

		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Excessao ao acessar um indice do vetor que não existe");
		}
		System.out.println("Esse texto será impresso apos a exception");

	}

}
