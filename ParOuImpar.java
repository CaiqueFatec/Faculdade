import java.util.Scanner;

public class ParOuImpar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();
        if (num % 2 == 0 ){
            System.out.println(num + " é par");
        }
        else{
            System.out.println(num + " é impar");
        }
        scanner.close();
    }
}