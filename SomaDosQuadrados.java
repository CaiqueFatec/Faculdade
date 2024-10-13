//EXERCICIO 28 Lê tres números e exibe a soma dos quadrados

import java.util.Scanner;
import java.lang.Math;

public class SomaDosQuadrados {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        double num1 = scanner.nextDouble();        
        System.out.println("Digite o segundo valor:");
        double num2 = scanner.nextDouble();
        System.out.println("Digite o primeiro valor:");
        double num3 = scanner.nextDouble();
        double result = Math.pow(num1,2) + Math.pow(num2,2) + Math.pow(num3, 2);
        System.out.printf("O resultado da soma dos quadrados dos números: %.1f, %.1f, %.1f é de: %.1f", num1, num2, num3, result);
        scanner.close();
    } 
}
