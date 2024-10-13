/*. Sejam a e b os catetos de um triangulo, onde a hipotenusa e obtida pela equacao: ˜
hipotenusa =√a2 + b2. Faca um programa que receba os valores de a e b e calcule
o valor da hipotenusa atraves da equacao. Imprima o resultado dessa operacao 
EXERCIOCIO 35*/
//EXERCICIO 35

import java.util.Scanner;

public class CalculoHipotenusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do cateto a:");
        double cat1 = scanner.nextDouble();
        System.out.println("Digite o valor do cateto b:");
        double cat2 = scanner.nextDouble();
        double hipo = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
        System.out.println("O valor da Hipotenusa é: " + hipo);
        scanner.close();
    }
}
