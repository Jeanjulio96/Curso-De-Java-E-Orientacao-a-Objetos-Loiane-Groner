package ExerciciosAula25a27;

public class ContaCorrente {

	int numero;
	double saldo;
	int status;
	double limite;

	double depositar(double valor) {
		System.out.println("Depositando...");
		if (saldo <= limite && valor < limite) {
			System.out.println("Deposito realizado com sucesso!");
			return saldo += valor;

		}
		
		System.out.println("Falha no deposito!! Valor ou saldo maior que o limite!!");
		return saldo;
	}

	double sacar(double valor) {
		System.out.println("Sacando...");
		if (valor <= limite && valor <= saldo) {
			System.out.println("Saque realizado com sucesso!");
			return saldo -= valor;

		}

		System.out.println("Falha ao sacar!! Valor ou saldo maior que o limite!!");
		return saldo;
	}

	double consultarSaldo() {
		return saldo;
	}

	String chequeEspecial() {
		if (status == 1) {
			return "Esta conta é especial!";
		} else if (status == 0) {
			return "Esta é uma conta comum";
		}
		return "Opcao Invalida";
	}

}
