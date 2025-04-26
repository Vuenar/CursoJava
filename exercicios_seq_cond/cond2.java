package exercicios_seq_cond;

import java.util.Scanner;

public class cond2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double N1, N2;
		
		System.out.println("Digite um número: ");
		N1 = sc.nextDouble();
		System.out.println("Digite outro número: ");
		N2 = sc.nextDouble();
		
		if (N1 > N2) {
			System.out.println("O número " + N1 + " é maior que o " + N2);
		}
		else {
			System.out.println("O número " + N2 + " é maior que o " + N1);
		}
		
		sc.close();
	}
}
