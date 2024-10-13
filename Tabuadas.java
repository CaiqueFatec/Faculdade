public class Tabuadas {
    public static void main(String[] args) {
        for(int n = 1; n <= 10; n++){
            System.out.println("\nTabuda do " + n);
            for(int i = 0; i <= 10; i++){
                System.out.println(n + " x " + i + " = " + n*i);
            }
        }
    }
}
