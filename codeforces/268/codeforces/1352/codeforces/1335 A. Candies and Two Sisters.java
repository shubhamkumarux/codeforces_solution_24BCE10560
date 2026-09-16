import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            long n = scanner.nextLong();
            
            // Calculate the number of valid distributions
            long ans = (n - 1) / 2;
            
            System.out.println(ans);
        }
        
        scanner.close();
    }
}
