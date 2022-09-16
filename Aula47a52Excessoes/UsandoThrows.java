package Aula47a52Excessoes;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		System.out.println("Entre com um numero decimal:");
		
		try {
			double num = lerNumero();
			System.out.println("Voce digitou " + num);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static double lerNumero() throws Exception {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		return num;
	}

}
