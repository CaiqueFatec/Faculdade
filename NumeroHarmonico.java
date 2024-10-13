//Exercicío 27
import java.util.Scanner;
public class NumeroHarmonico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor inteiro para n:");
        int n = scanner.nextInt();
        double har = 0.0;
        int i = 1;
        while( i <= n){
            har += 1.0/i;
            System.out.println(har);
            i++;
        }
        System.out.printf("O valor de H(%d) = %.3f", n , har);
        scanner.close();
    }
}
