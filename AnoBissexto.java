import java.util.*;
public class AnoBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano: ");
        int ano = sc.nextInt();
        if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
            System.out.println("O ano é bissexto! ");
        } else{
            System.out.println("O ano não é bissexto! ");
        }
        sc.close();
    }
}