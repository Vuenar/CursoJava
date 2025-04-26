package exercicios_seq_cond;

import java.util.Scanner;

public class cond1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double N;
		
		System.out.println("Digite um valor: ");
		N = sc.nextDouble();
		
		if (N == 0) {
			System.out.println("Zero");
		}
		else if (N > 0) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Negativo");
		}
		
		sc.close();
	}
}
