package exercicios_seq_cond;

public class exerc_while6 {

	public static void main(String[] args) {

		int x = 4;
		int y = 0;
		int i = 0;
		
		while (i < x) {
			i = i + 1;
			y = y + i;
			System.out.println(i);
			System.out.println(y);
		}
	}
}
