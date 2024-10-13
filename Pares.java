//Exercico 13 lista 3
import java.util.Scanner;
public class Pares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite:");
        int n = scanner.nextInt();
        int i = 0;
        while( i <= n ){
            if( i % 2 == 0){
                System.out.print(" " + i);
            }
            i++;
        }
        scanner.close();
    }
}
