package Exercicio36a43;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome do cliente: ");
		String nomeCliente = sc.nextLine();
		System.out.println("Numero da conta: ");
		int numConta = sc.nextInt();
		System.out.println("Digite o saldo: ");
		double saldo = sc.nextDouble();
		System.out.println("Dia do rendimento: ");
		Date diaRendimento = sdf.parse(sc.next());

		ContaPoupanca cp = new ContaPoupanca(nomeCliente, numConta, saldo, diaRendimento);

		sc.nextLine();
		System.out.println("Nome do cliente: ");
		String nomeCliente2 = sc.nextLine();
		System.out.println("Numero da conta: ");
		int numConta2 = sc.nextInt();
		System.out.println("Digite o saldo: ");
		double saldo2 = sc.nextDouble();
		System.out.println("Limite: ");
		double limite = sc.nextDouble();

		ContaEspecial ce = new ContaEspecial(nomeCliente2, numConta2, saldo2, limite);

		System.out.println("Digite um valor para sacar: ");
		double valor = sc.nextDouble();
		cp.sacar(valor);
		ce.sacar(valor);
		System.out.println("Conta Poupanca: " + cp.saldo);
		System.out.println("Conta Especial: " + ce.saldo);
		System.out.println("Digite um valor para depositar: ");
		double deposito = sc.nextDouble();
		cp.depositar(deposito);
		ce.depositar(deposito);
		System.out.println("Conta Poupanca: " + cp.saldo);
		System.out.println("Conta Especial: " + ce.saldo);

		System.out.println("Taxa de rendimento da Conta Poupanca: ");
		double rendimento = sc.nextDouble();
		cp.calcularNovoSaldo(rendimento);

		System.out.println(cp);
		System.out.println(ce);

		sc.close();
	}

}
