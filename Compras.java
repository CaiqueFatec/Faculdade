/*ler o valor da compra e uma opção de pagamento (a vista / a prazo). Em caso de pagamento a vista,
perguntar se ´r no pix ou boleto. Para pagamento no Pix, conceder desconto de 10%, no boleto, 5%. 
Em caso de pagamento a prazo perguntar se é em 2 ou 3 parcelas, se for 2 parcelas, não tem acrécimo, se for
3, acrescentar 5%. Para cada caso, exibir a resposta adequada*/
import java.util.Scanner;
public class Compras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double compra =  scanner.nextDouble();
        int vistaOuPrazo;
        do {
            System.out.print("Digite \n1 - para pagamento a vista \n2 - para pagamento a prazo\n");
            vistaOuPrazo = scanner.nextInt();
        } while(vistaOuPrazo != 1 && vistaOuPrazo != 2);
        scanner.nextLine();
        if (vistaOuPrazo == 1){
            System.out.print("O pagamento vai ser no Pix ou Boleto?\n");
            char pix = scanner.nextLine().charAt(0);
            double desconto;
            if (pix == 'p' || pix == 'P'){
                desconto = compra * 0.10;
                System.out.println("Seu desconto foi de " + desconto + " o valor de sua compra ficou " + (compra - desconto));
            }
            else if (pix == 'b' || pix == 'B') {
                desconto = compra * 0.05;
                System.out.println("Seu desconto foi de " + desconto + " o valor de sua compra ficou " + (compra - desconto));
            }
            else{
                System.out.println("Opção invalida, reinicie o sistema");
            }
        }
        else{
            int parcelas;
            do{
                System.out.println("Escolha entre 2 ou 3 parcelas: ");
                parcelas = scanner.nextInt();
            } while ( parcelas != 2 && parcelas != 3);
            if(parcelas == 3){
                double acrescimo = 0.05 * compra;
                compra = compra + acrescimo;
                System.out.println("Você em  um acrécimo de R$: " + acrescimo);
            }
            System.out.println("Total a pagar: R$ " + compra + "\nvalor de cada parcela: R$ " + (compra/parcelas));
        }
        scanner.close();
    }
}
