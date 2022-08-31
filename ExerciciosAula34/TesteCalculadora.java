package ExerciciosAula34;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		double resultado1 = Calculadora.somar(4, 2);
		double resultado2 = Calculadora.subtrair(4, 2);
		double resultado3 = Calculadora.multiplicar(4, 2);
		double resultado4 = Calculadora.dividir(4, 2);
		double resultado5 = Calculadora.elevarPotencia(4, 2);
		double resultado6 = Calculadora.calcularFatorial(4);
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(resultado3);
		System.out.println(resultado4);
		System.out.println(resultado5);
		System.out.println(resultado6);
		
		
	}

}
