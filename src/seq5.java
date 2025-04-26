package exercicios_seq_cond;

import java.util.Scanner;

public class seq5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double peso, altura, IMC;
		
		System.out.println("Digite o seu peso: ");
		peso = sc.nextDouble();
		System.out.println("Digite sua altura: ");
		altura = sc.nextDouble();
		
		IMC = peso / (altura * altura);
		System.out.printf("Seu IMC é: %.2f%n", IMC);
		
		sc.close();
	}
}
