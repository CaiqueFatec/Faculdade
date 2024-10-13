//Exercício 52 Lista 1
import java.util.Scanner;
public class Aposta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor do premio: ");
        double premio = scanner.nextDouble();
        System.out.println("Valor da aposta do primero jogador: ");
        double apostador1 = scanner.nextDouble();
        System.out.println("Valor da aposta do segundo jogador: ");
        double apostador2 = scanner.nextDouble();
        System.out.println("Valor da aposta do terceiro jogador: ");
        double apostador3 = scanner.nextDouble();
        double totalApostado = apostador1 + apostador2 + apostador3;
        double apos1 = (apostador1/totalApostado) * premio;
        double apos2 = (apostador2/totalApostado) * premio;
        double apos3 = (apostador3/totalApostado) * premio;
        System.out.printf("Valor da aposta 1 = R$ %.2f, valor da aposta 2 = R$ %.2f e valor da aposta 3 = R$ %.2f ,\nValor do Premio = R$ %.2f\nQuantia ganha pelo apostador 1 = R$ %.2f, apostador 2 = R$ %.2f e apostador 3 = R$ %.2f",apostador1, apostador2, apostador3, premio, apos1, apos2,apos3);
        scanner.close();
    }
}
