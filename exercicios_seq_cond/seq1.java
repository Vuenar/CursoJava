package exercicios_seq_cond;

import java.util.Scanner;

public class seq1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 double N1, N2, S;
		 
		 System.out.println("Qual o primeiro número? ");
		 N1 = sc.nextDouble();
		 
		 System.out.println("Qual o primeiro segundo? ");
		 N2 = sc.nextDouble();
		 
		 S = N1 + N2;
		 
		 System.out.print("A Soma dos números é: " + S);
		 
		sc.close();
	}
}
