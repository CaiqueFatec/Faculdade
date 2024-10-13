//EXERCICIO 13
import java.util.Scanner;
public class ConverteDistancia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a distância em quilometros para ser convertida em milhas: ");
        double dist = scanner.nextDouble();
        double mile = dist/1.61;
        System.out.println("A Distância: "+ dist + "km convertido em milhas é: " + mile);
        scanner.close();
    }
}
