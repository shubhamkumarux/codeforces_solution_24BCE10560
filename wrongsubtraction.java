import java.util.Scanner;

public class wrongsubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the initial number n and the number of subtractions k
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        // Perform the subtraction logic k times
        for (int i = 0; i < k; i++) {
            if (n % 10 == 0) {
                n /= 10; // If the last digit is 0, divide by 10
            } else {
                n--;     // Otherwise, subtract 1
            }
        }
        
        // Print the final result
        System.out.println(n);
        
        scanner.close();
    }
}