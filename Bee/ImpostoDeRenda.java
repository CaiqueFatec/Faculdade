import java.util.Scanner;
public class ImpostoDeRenda {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu salário? ");
        double salario = scanner.nextDouble();
        double totalImposto = 00.00;
        if (salario <= 2000){
            System.out.println("Isento");
        } else if(salario <= 3000) {
            double primeiroImposto = salario - 2000; //2000 são isentos de impostos
            double segundoImposto = primeiroImposto * 0.08;
            totalImposto = segundoImposto;  
            System.out.printf("R$ %.2f\n",totalImposto );
        } else if (salario <= 4500){
            double primeiroImposto = salario - 2000; //2000 são isentos de impostos
            double segundoImposto = 1000 * 0.08;
            double salarioDois = primeiroImposto - 1000;
            double terceiroImposto = salarioDois * 0.18;
            totalImposto = segundoImposto + terceiroImposto ;  
            System.out.printf("R$ %.2f\n",totalImposto );

        } else{
            double primeiroImposto = salario - 2000; //2000 são isentos de impostos
            double segundoImposto = 1000 * 0.08;
            double salarioDois = primeiroImposto - 1000;
            double terceiroImposto = 1500 * 0.18;
            double salarioTres = salarioDois - 1500;
            double quartoImposto = salarioTres * 0.28;
            totalImposto = segundoImposto + terceiroImposto + quartoImposto;
            System.out.printf("R$ %.2f\n",totalImposto );

        }
        scanner.close();
    }
}