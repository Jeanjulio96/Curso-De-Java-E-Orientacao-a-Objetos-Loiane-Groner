package Aula44Interfaces;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

	private String raça;

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	@Override
	public void amamentar() {

	}

	@Override
	public void emitirSom() {

	}

	@Override
	public void brincar() {

	}

	@Override
	public void levarPassear() {

	}

	@Override
	public void levarVeterinario() {

	}

	@Override
	public void alimentar() {

	}

}
