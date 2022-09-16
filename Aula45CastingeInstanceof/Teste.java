package Aula45CastingeInstanceof;

public class Teste {

	public static void main(String[] args) {

		/*
		 * Aluno aluno = new Aluno(); Pessoa pessoaAluno = aluno; //upcasting
		 * 
		 * Pessoa aluno2 = (Pessoa) new Aluno();
		 * 
		 * Pessoa aluno3 = new Pessoa(); Aluno aluno4 = (Aluno) aluno3;
		 */

		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor prof = new Professor();

		if (pessoa instanceof Pessoa) {
			System.out.println("é do tipo pessoa");
		}
		if (aluno instanceof Pessoa) {
			System.out.println("é do tipo pessoa");
		}
		if (prof instanceof Pessoa) {
			System.out.println("é do tipo pessoa");
		}

	}

}
