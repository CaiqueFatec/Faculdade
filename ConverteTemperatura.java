//EXECICIO 07 Converter Fahrenheit para Celcius
import java.util.Scanner;
public class ConverteTemperatura{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a Temperatura em Fahrenheit: ");
        double num1 = scanner.nextDouble();
        double convt = 5.0*(num1 - 32.0)/9;
        System.out.printf("A conversão de %.2fº Fahrenheit para Celsius é: %.2fº", num1,convt);
        scanner.close();
    }
}