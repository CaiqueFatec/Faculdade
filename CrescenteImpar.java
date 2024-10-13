import java.util.Scanner;

public class CrescenteImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero impar:");
        int n = scanner.nextInt();
        while(n % 2 == 0){
            System.out.println("Digite apenas numeros impares:");
            n = scanner.nextInt();
        }
        int i = 1;
        while (i <= n) {
            if(i % 2 != 0){
                System.out.println(i);
            } 
            i++;
        }
        scanner.close();
    }
}
