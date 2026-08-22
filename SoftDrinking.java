import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the inputs
        int n = scanner.nextInt();  // Number of friends
        int k = scanner.nextInt();  // Number of bottles
        int l = scanner.nextInt();  // Milliliters in each bottle
        int c = scanner.nextInt();  // Number of limes
        int d = scanner.nextInt();  // Slices per lime
        int p = scanner.nextInt();  // Grams of salt
        int nl = scanner.nextInt(); // Drink needed per toast
        int np = scanner.nextInt(); // Salt needed per toast
        
        // Calculate maximum toasts possible from each resource
        int totalDrinkToasts = (k * l) / nl;
        int totalLimeToasts = c * d;
        int totalSaltToasts = p / np;
        
        // Find the bottleneck (minimum possible toasts)
        int maxToasts = Math.min(totalDrinkToasts, Math.min(totalLimeToasts, totalSaltToasts));
        
        // Divide equally among friends
        int toastsPerFriend = maxToasts / n;
        
        // Output the result
        System.out.println(toastsPerFriend);
        
        scanner.close();
    }
} SoftDrinking {
    
}
