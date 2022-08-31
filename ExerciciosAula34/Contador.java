package ExerciciosAula34;

public class Contador {
	
	static int cont;
	
	public static int incrementar(int valorIncremento) {
		System.out.println(cont);
		return cont += valorIncremento;
		
	}
	
	public static int decrementar(int valorIncremento) {
		System.out.println(cont);
		return cont -= valorIncremento;
		
	}
	
	public static void zerar() {
		System.out.println(cont);
		cont = 0;
		
	}
	
	

}
