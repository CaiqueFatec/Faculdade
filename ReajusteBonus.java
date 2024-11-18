import java.util.Scanner;

public class ReajusteBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu salário?");
        double salario = sc.nextDouble();
        System.out.println("Quanto tempo de serviço na empresa? Abaixo de 1 ano digite 0 ");
        int tempoServico = sc.nextInt();
        double reajuste, salarioReajustado = 0.0;
        if (salario <= 500) {
            reajuste = salario * 0.25;
            salarioReajustado = salario + reajuste;
            System.out.printf("Salário com reajuste: R$ %.2f", salarioReajustado);
        } else if (salario <= 1000) {
            reajuste = salario * 0.20;
            salarioReajustado = salario + reajuste;
            System.out.printf("Salário com reajuste: R$ %.2f", salarioReajustado);
        } else if (salario <= 1500) {
            reajuste = salario * 0.15;
            salarioReajustado = salario + reajuste;
            System.out.printf("Salário com reajuste: R$ %.2f", salarioReajustado);
        } else if (salario <= 2000) {
            reajuste = salario * 0.10;
            salarioReajustado = salario + reajuste;
            System.out.printf("Salário com reajuste: R$ %.2f", salarioReajustado);      
        } else {
            System.out.print("Salários acima de R$ 2000 não tem reajuste!!");
            salarioReajustado = salario;
        }

        double bonus = 0.0;
        if (tempoServico < 1) {
            System.out.print("\nSem bônus por tempo de casa!!!");
        } else if (tempoServico <= 3) {
            bonus = 100;
        } else if (tempoServico <= 6) {
            bonus = 200;
        } else if (tempoServico <= 10) {
            bonus = 300;
        } else {
            bonus = 500;
        }

        double salarioAtual;
        salarioAtual = bonus + salarioReajustado;
        System.out.printf("\nSalário novo com o bônus de tempo de empresa = R$ %.2f", salarioAtual);
        sc.close();
    }
}
