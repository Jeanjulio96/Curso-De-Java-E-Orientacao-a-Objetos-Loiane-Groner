package Exercicio36a43;

public class PessoaJuridica extends Contribuinte {

	private String cnpj;

	public PessoaJuridica(String nome, Double rendaBruta, String cnpj) {
		super(nome, rendaBruta);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {

		return this.getRendaBruta() * 0.1;
		// return (this.getRendaBruta()/100) * 10;
	}

	@Override
	public String toString() {
		String s = "Pessoa Jurídica [";
		s += super.toString();
		s += " ;cnpj: " + cnpj;
		s += ";imposto a ser pago: " + calcularImposto();
		s += "]";
		return s;
	}

}
