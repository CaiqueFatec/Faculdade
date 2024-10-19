//ler um numero e verificar se é positivo ou negativo

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = scanner.nextInt();
        if (num >= 0){
            System.out.print(num + " O numero é positivo!");
        }
        else{
            System.out.print(num + " O numero é negativo");
        }
        scanner.close();
    }
}
