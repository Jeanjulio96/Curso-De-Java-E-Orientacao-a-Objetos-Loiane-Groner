package ExerciciosAula25a27;

import java.util.Locale;
import java.util.Scanner;

public class TestaConta {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ContaCorrente c1 = new ContaCorrente();
		int op = 1;

		while (op == 1) {
		System.out.println("Digite o numero da conta: ");
		c1.numero = sc.nextInt();
		System.out.println("Digite o valor do saldo: ");
		c1.saldo = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite o limite da sua conta: ");
		c1.limite = sc.nextDouble();
		System.out.println("Digite o status da conta: 1 - conta especial / 0 - nao conta comum ");
		c1.status = sc.nextInt();

			System.out.println("Digite o valor do deposito:");
			double valorDeposito = sc.nextDouble();
			c1.depositar(valorDeposito);
			System.out.println(c1.consultarSaldo());
			System.out.println("Digite o valor do saque:");
			double valorSaque = sc.nextDouble();
			c1.sacar(valorSaque);
			System.out.println(c1.consultarSaldo());
			System.out.println(c1.chequeEspecial());

			System.out.println("Deseja continuar? 1 - para sim / 0 para nao:");
			op = sc.nextInt();
			if (op == 0) {
				
				System.out.println("Programa finalizado.");
			}
			
		}

		sc.close();

	}

}
