package exercicios_seq_cond;

public class exerc_while3 {

	public static void main(String[] args) {
		
		double x = 100;
		double y = 100;
		
		while (x != y) {
			System.out.println("olha");
			x = Math.sqrt(y);
		}
	}
}
