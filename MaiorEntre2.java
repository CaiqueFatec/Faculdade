
import java.util.Scanner;
public class MaiorEntre2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = scanner.nextInt();
        System.out.print("Digite outro numero: ");
        int num2 = scanner.nextInt();
        if (num >= num2){
            System.out.print(num + " O numero é maior");
        }
        else{
            System.out.print(num2 + " O numero é maior");
        }
        scanner.close();
    }
}

