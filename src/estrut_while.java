package exercicios_seq_cond;

import java.util.Scanner;

public class estrut_while {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while( x != 2002) {
			System.out.println("Senha invalida");
			x = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido ");
		
		sc.close();
	}
}
