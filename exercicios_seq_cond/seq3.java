package exercicios_seq_cond;

import java.util.Locale;
import java.util.Scanner;

public class seq3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float C, F;
		
		System.out.println("Digite a temperatura de conversão C/F: ");
		C = sc.nextFloat();
		F = (C * 9 / 5) + 32;
		
		System.out.printf("A Temperatura Convertida em Fahrenheit é: %.2f%n ", F);
		
		sc.close();
	}
}
