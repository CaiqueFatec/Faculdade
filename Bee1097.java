public class Bee1097 {
    public static void main(String[] args) {
        int i = 1, j = 7;
        while( i <= 9 ){
            for( int c = 0; c < 3 ; c++){
                System.out.println("I=" + i + " J=" + j);
                j--;
            }
            i += 2;
            j += 5;
        }
    }
}
