import java.util.Scanner;
public class SomaNaturais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int i = scanner.nextInt();
        int cont = 0;
        int soma = 0;
        while(cont < i){
            System.out.println(cont);
            cont++;
            soma += cont;
            System.out.println("Soma = " + soma);
        }
        scanner.close();
    }
}
