import java.util.Scanner;

public class PrimeiraAula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, media;

        System.out.println("Digite o primeiro número: ");
        x = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        y = sc.nextDouble();
        media = (x + y) / 2;
        System.out.println("A média dos números é: " + media);
        sc.close();
    }
}