package exercicios_seq_cond;

public class exerc_while {
	
	public static void main(String[] args) {
		
		int x = 5;
		int y = 0;
		
		while (x > 2) {
			System.out.println(x);
			y = y + x;
			x = x - 1;
		}
	}
}
