/*Leia o valor do raio de um cırculo e calcule e imprima a area do cırculo correspondente.
A area do cırculo e´ π ∗ raio2, considere π = 3.141592 */
import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do raio do circulo: ");
        double raio = scanner.nextDouble();
        double area = 3.141592*(Math.pow(raio, 2));
        System.out.println("A área do círculo e: " + area);
        scanner.close();
    }
}
