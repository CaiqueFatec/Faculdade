//EXERCICIO 31
import java.util.Scanner;

public class LeExibeAntecessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int num1 = scanner.nextInt();
        int ante = num1 - 1;
        int suce = num1 + 1;
        System.out.println("O Antecessor do número: " + num1 + " é: " + ante + " e o sucessor é: " + suce);
        scanner.close();
    }
    
}
