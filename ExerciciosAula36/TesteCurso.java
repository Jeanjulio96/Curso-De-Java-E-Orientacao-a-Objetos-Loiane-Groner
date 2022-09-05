package ExerciciosAula36;

import java.util.Locale;
import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com nome do curso:");
		String nome = sc.nextLine();
		
		System.out.println("Entre com o horario do curso:");
		String horario = sc.nextLine();
		
		System.out.println("Entre com o nome do professor:");
		String nomeProf = sc.nextLine();
		
		System.out.println("Entre com o departamento do professor:");
		String depProf = sc.nextLine();		
		
		System.out.println("Entre com o email do professor:");
		String emailProf = sc.nextLine();
		
		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setHorario(horario);
		
		Professor professor = new Professor();
		professor.setNome(nomeProf);
		professor.setDepartamento(depProf);
		professor.setEmail(emailProf);
		
		curso.setProfessor(professor);
		
		System.out.println("----Alunos----");
		
		Aluno[] alunos = new Aluno[5];
		for(int i=0 ;i<5; i++) {
			
			sc.nextLine();
			
			System.out.println("Entre com o nome do aluno " + (i+1));
			String nomeAluno = sc.nextLine();
			System.out.println("Entre com a matricula do aluno:");
			String matricula = sc.nextLine();
			
			double[] notas = new double[4];
			
			for(int j=0; j<4; j++) {
				System.out.println("Entre com a nota " + (j+1));
				notas[j] = sc.nextDouble();
			}
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matricula);
			aluno.setNotas(notas);
			
			alunos[i] = aluno;
			
		}
		
		curso.setAlunos(alunos);
		
		System.out.println(curso.obterInfo());
		
		

		
		sc.close();
	}

}
