import java.util.Scanner;

public class EmpresaImposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do produto:");
        double valor = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite o Estado desejado:\nMG Minas Gerais \nSP São Paulo \nRJ Rio de Janeiro \nMS Mato Grosso do Sul");
        String estado = sc.nextLine().toUpperCase();
        double imposto;
        switch (estado) {
            case "MG":
                imposto = valor * 0.07;
                System.out.printf("Valor final do produto com o imposto: R$ %.2f", imposto + valor);
                break;
            case "SP":
                imposto = valor * 0.12;
                System.out.printf("Valor final do produto com o imposto: R$ %.2f", imposto + valor);
                break;
            case "RJ":
                imposto = valor * 0.15;
                System.out.printf("Valor final do produto com o imposto: R$ %.2f", imposto + valor);
                break;
            case "MS":
                imposto = valor * 0.08;
                System.out.printf("Valor final do produto com o imposto: R$ %.2f", imposto + valor);
                break;
            default:
                System.err.println("Digite um estado válido!!!");
                break;
        }
        sc.close();
    }
}
