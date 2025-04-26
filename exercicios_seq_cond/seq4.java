package exercicios_seq_cond;

import java.util.Scanner;

public class seq4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double N1, N2, N3, M;
		
		System.out.println("Digite a primeira nota: ");
		N1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		N2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		N3 = sc.nextDouble();
		
		M = (N1 + N2 + N3) / 3;
		System.out.printf("A média das notas é: %.2f%n", M);
		
		sc.close();
	}
}
