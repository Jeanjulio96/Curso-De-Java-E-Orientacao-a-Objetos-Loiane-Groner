package Aula26ClassesEMetodosComRetorno;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() {

		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
	}

	double obterAutonomia() {

		System.out.println("Método obter automomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}

}
