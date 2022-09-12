package Exercicio36a43;

public class TesteConta {

	public static void main(String[] args) {

		PessoaFisica p1 = new PessoaFisica("Contribuinte 01", 1000.00, "12345678945");

		PessoaJuridica p2 = new PessoaJuridica("Contribuinte 02", 5000.00, "35.434.693/0001-05");

		PessoaFisica p3 = new PessoaFisica("Contribuinte 03", 2000.00, "16458794676");

		PessoaJuridica p4 = new PessoaJuridica("Contribuinte 04", 3000.00, "28.412.587/0008-04");

		PessoaFisica p5 = new PessoaFisica("Contribuinte 05", 3700.00, "25167849757");

		PessoaJuridica p6 = new PessoaJuridica("Contribuinte 06", 4000.00, "48.425.845/0004-08");

		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;

		for (Contribuinte c : contribuintes) {
			System.out.println(c.toString());
		}

	}

}
