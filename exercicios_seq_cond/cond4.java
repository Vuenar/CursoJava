package exercicios_seq_cond;

import java.util.Scanner;

public class cond4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double N;
		
		System.out.println("Informe sua nota: ");
		N = sc.nextDouble();
		
		if (N >= 7) {
			System.out.println("Aprovado !");
		}
		else if (N <= 5) {
			System.out.println("Recuperação !");
		}
		else {
			System.out.println("Reprovado !");
		}
		
		sc.close();
		
	}
}
