
/*Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X,
um valor por linha, inclusive o X ser for o caso */

import java.util.Scanner;

public class LeImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Digite um numero: ");
        int n = scanner.nextInt();
        int i = 1;
        while(i <= 6){
            if(n % 2 != 0){
                System.out.print(n + "\n");
                i++;
            }
            n++;
        }
        scanner.close();
    }
    
}