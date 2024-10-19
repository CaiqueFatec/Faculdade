import java.util.Scanner;

public class NoPixTemDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double compra = scanner.nextDouble();
        scanner.nextLine();// consumindo <enter> anterior / esvaziando buffer
        System.out.print("A compra vai ser paga no pix? Sim ou não: ");
        char pix = scanner.nextLine().charAt(0);
        if (pix == 's' || pix == 'S'){
            compra = compra * 0.9;
        }
        System.out.println("Total a pagar: R$ " + compra);
        scanner.close();
    }
}
