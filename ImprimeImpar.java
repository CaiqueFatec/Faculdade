import java.util.Scanner;
public class ImprimeImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = scanner.nextInt();
        int j = n;
        int i = 1;
        while(i <= j){
            if(n % 2 != 0){
                System.out.print(n + "\n");
                i++;
            }
            n++;
        }
        scanner.close();
    }
}