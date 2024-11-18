import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Digite um numero: ");
        int n =  scanner.nextInt();
        for(int i = 1; i <= 1000; i++){
            while( i <= n){
                if( i % 2 != 0){
                    System.out.println(i);
                }
            i++;
            }
            
        }
        scanner.close(); 
    }
}