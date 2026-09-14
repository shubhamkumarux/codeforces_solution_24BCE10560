import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of drinks
        int n = scanner.nextInt();
        
        double sum = 0;
        
        // Sum up all the drink percentages
        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }
        
        // The answer is the total sum divided by the number of drinks
        double result = sum / n;
        
        // Print the result
        System.out.printf("%.12f\n", result);
        
        scanner.close();
    }
}
