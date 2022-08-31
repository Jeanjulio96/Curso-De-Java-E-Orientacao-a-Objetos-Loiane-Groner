package Aula31ModificadoresDeAcessoPrivateEPublic;

public class Carro {

	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
		System.out.println("Chamando o construtor com 3 parametros");
	}
	
	public Carro() {
		
	}


	public Carro(String marca, String modelo) {
		this(marca,modelo, 10);
		System.out.println("Chamando o construtor com 2 parametros");
	}
	
	
	public Carro(String marca, String modelo, int numPassageiros) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
	}

	void exibirAutonomia() {

		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + "km");
	}

	double obterAutonomia() {

		System.out.println("Método obter automomia foi chamado.");
		
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	public double divideKMPorConsumoCombustivel(double km) {
		return km / this.consumoCombustivel;
		

	}
	
	private double calcularCombustivel(double km) {
		
		return this.divideKMPorConsumoCombustivel(km);
	}
	
	

}
