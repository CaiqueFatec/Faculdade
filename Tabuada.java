//

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor para a tabuada: ");
        int n = scanner.nextInt();
        System.out.println("Tabuda do " + n);
        for(int i=0; i<=10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }   
        scanner.close();
    }
}
