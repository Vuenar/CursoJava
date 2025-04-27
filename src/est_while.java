package exercicios_seq_cond;

import java.util.Scanner;

public class est_while {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t Posto de Gasolina");
		System.out.println(" 1 . Gasolina");
		System.out.println(" 2 . Álcool");
		System.out.println(" 3 . Diesel");
		System.out.println(" 4 . Fim");
		int x = sc.nextInt();
		int g,a,d;
		g = 0;
		a = 0;
		d = 0;
		while(x != 4) {
			if(x == 1) {
				g = g + 1;
				System.out.println("Gasolina");
			} else if(x == 2) {
				a = a + 1;
				System.out.println("Álcool");
			} else if(x == 3) {
				d = d + 1;
				System.out.println("Diesel");
			}else {
			}
			x = sc.nextInt();
		}
		
		sc.close();
		System.out.println(" Muito Obrigado !");
		System.out.println(" Gasolina: " + g);
		System.out.println(" Álcool: " + a);
		System.out.println(" Diesel: " + d);
	}
}
