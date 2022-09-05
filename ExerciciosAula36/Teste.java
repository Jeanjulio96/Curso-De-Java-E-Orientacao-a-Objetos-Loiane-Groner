package ExerciciosAula36;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome da agenda:");
		String nomeAgenda = sc.nextLine();
		Agenda agenda = new Agenda();
		agenda.setNome(nomeAgenda);

		Contato[] contatos = new Contato[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Entre com as informacoes do contato " + (i + 1));
			Contato c = new Contato();

			System.out.println("Entre com o nome: ");
			String nome = sc.nextLine();
			c.setNome(nome);
			System.out.println("Entre com o telefone: ");
			String telefone = sc.nextLine();
			c.setTelefone(telefone);
			System.out.println("Entre com email: ");
			String email = sc.nextLine();
			c.setEmail(email);

			contatos[i] = c;

		}

		agenda.setContatos(contatos);

		if (agenda != null) {
			System.out.println(agenda.obterInfo());

		}
		
		sc.close();
	}

}
