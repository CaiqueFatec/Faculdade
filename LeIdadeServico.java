import java.util.Scanner;

public class LeIdadeServico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, servico;
        do {
            System.out.println("Qual a sua idade?: ");
            idade = sc.nextInt();
            System.out.println("Quanto tempo de serviço?: ");
            servico = sc.nextInt();
            if(idade < servico){
                System.out.println("Você não pode ter mais tempo de serviço do que de idade. Tente Novamente");
            }
        } while(idade < servico);
        
        if(idade >= 65 || servico >= 30){
            System.out.println("Você está apto a se aposentar!");
        } else if (idade >= 60 && servico >= 25) {
            System.out.println("Você está apto a se aposentar!");
        } else {
            System.out.println("Você não está apto a se aposentar");
        }
        sc.close();
    }
}
