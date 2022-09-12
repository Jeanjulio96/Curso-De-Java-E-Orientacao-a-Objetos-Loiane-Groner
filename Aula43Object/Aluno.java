package Aula43Object;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {

	private String curso;
	private double[] notas;

	public Aluno() {
		super();

	}

	public Aluno(String nome, String endereco, String telefone, String curso) {
		// super(nome, endereco, telefone);
		this.curso = curso;

	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		return 0;
	}

	public boolean verificarAprovado() {
		return true;
	}

	public void metodoQualquer() {
		// super.setCpf("3454678794");
	}

	public String obterEtiquetaEndereco() {

		String s = "Endereco do Aluno: ";
		// s += super.getEndereco();

		return s;

	}

	public void imprimirEtiquetaEndereco() {

		System.out.println(this.obterEtiquetaEndereco());

	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(notas);
		result = prime * result + Objects.hash(curso);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(curso, other.curso) && Arrays.equals(notas, other.notas);
	}

	/*
	 * public String toString() { String s = curso + "\n"; for (double nota : notas)
	 * { s += nota + " "; } return s; }
	 */

}
