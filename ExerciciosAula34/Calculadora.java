package ExerciciosAula34;

public class Calculadora {
	
	public static double somar(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double subtrair(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double multiplicar(double num1, double num2) {
		return num1 * num2;
	}
	
	public static double dividir(double num1, double num2) {
		return num1 / num2;
	}
	
	public static double elevarPotencia(double num1, double num2) {
		return Math.pow(num1, num2);
	}
	
	public static int calcularFatorial(int valor) {
		
		int fat = 1;
		
		for(int i=2; i<=valor; i++) {
			fat *=i;
		
		}
		return fat;
		
	}
	
	

}
