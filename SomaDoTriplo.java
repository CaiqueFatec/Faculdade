//Leia um numero inteiro e imprima a soma do sucessor de seu triplo com o antecessor de ´
//seu dobro

import java.util.Scanner;

public class SomaDoTriplo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num1 = scanner.nextInt();
        int result = (num1*3 + 1) + (num1*2 - 1);
        System.out.println("O Resultado da soma do sucessor de seu triplo com o antecessor de seu dobro é: "+ result);
        scanner.close();

    }
}
