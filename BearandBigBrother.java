import java.util.Scanner;

public class BearandBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read initial weights of Limak (a) and Bob (b)
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int years = 0;
        
        // Loop until Limak's weight is strictly greater than Bob's
        while (a <= b) {
            a *= 3; // Limak's weight triples
            b *= 2; // Bob's weight doubles
            years++;
        }
        
        // Output total years
        System.out.println(years);
        
        sc.close();
    }
}