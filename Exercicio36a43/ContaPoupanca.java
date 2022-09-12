package Exercicio36a43;

import java.util.Date;

public class ContaPoupanca extends ContaBancaria {

	private Date diaRendimento;

	public ContaPoupanca(String nomeCliente, Integer numConta, Double saldo, Date diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}

	public Date getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(Date diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public void calcularNovoSaldo(double taxaRendimentoDaPoupanca) {

		super.saldo += taxaRendimentoDaPoupanca;
	}

	public String toString() {

		return "Nome do cliente: " + super.getNomeCliente() + " Numero da Conta: " + super.getNumConta() + " Saldo: "
				+ super.getSaldo() + " Dia do rendimento: " + diaRendimento;

	}

	@Override
	public void sacar(double valor) {
		if (super.saldo > 0) {
			super.saldo -= valor;
		} else {
			System.out.println("Nao foi possivel sacar! Saldo abaixo de 0!");
		}

	}

	@Override
	public void depositar(double valor) {
		if (super.saldo > valor && super.saldo > 0) {
			super.saldo += valor;
		} else {
			System.out.println("Nao foi possivel depositar! Saldo abaixo de 0!");
		}

	}
}
