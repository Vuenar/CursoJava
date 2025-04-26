package exercicios_seq_cond;

import java.util.Scanner;

public class cond5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double s, h, v;
		
		System.out.print("Informe o seu salário R$: ");
		s = sc.nextDouble();
		System.out.print("Informe as horas trabalhadas: ");
		h = sc.nextDouble();
		v = s;
		
		if (h >= 40) {
			s = ( s * 10 ) / 100;
			System.out.printf("Seu bônus é R$ %.2f%n", s);
			v = v + s;
		}
		else if (h <= 40) {
			System.out.println("Você não tem hora extra a receber !");
		}
		
		System.out.printf("Seu salário é R$: " + v);
		
		sc.close();
		
	}
}
