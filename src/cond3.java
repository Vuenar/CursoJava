package exercicios_seq_cond;

import java.util.Scanner;

public class cond3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("Digite um número: ");
		N = sc.nextInt();
		
		if (N % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
		
		sc.close();
		
	}
}
