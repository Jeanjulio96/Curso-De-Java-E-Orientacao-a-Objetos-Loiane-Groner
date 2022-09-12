package Exercicio36a43;

public class ContaEspecial extends ContaBancaria {

	private double limite;

	public ContaEspecial(String nomeCliente, Integer numConta, Double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public void sacar(double valor) {
		if (super.saldo > valor && super.saldo > 0 && valor < limite) {
			super.saldo -= valor;
		} else {
			System.out.println("Nao foi possivel sacar! Saldo abaixo de 0 ou limite excedido!");
		}

	}

	@Override
	public void depositar(double valor) {
		if (super.saldo > 0 && valor < limite) {
			super.saldo += valor;
		} else {
			System.out.println("Nao foi possivel depositar! Saldo abaixo de 0 ou limite excedido!");
		}

	}

	public String toString() {

		return "Nome do cliente: " + super.getNomeCliente() + " Numero da Conta: " + super.getNumConta() + " Saldo: "
				+ super.getSaldo() + " Limite: " + limite;

	}

}
