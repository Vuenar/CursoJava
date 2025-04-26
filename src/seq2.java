package exercicios_seq_cond;

import java.util.Scanner;

public class seq2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double V, A;
		double PI;
		
		PI = 3.1415;
		
		System.out.println("Qual o valor do raio do circulo?");
		V = sc.nextDouble();
		
		A = PI * V * V;
		System.out.printf("O valor do raio é: %.2f%n", A);
		
		sc.close();
	}
}
