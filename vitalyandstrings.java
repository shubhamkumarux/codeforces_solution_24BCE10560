import java.util.Scanner;

public class vitalyandstrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of red and blue socks
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // Days he can wear different colors
        int differentDays = Math.min(a, b);
        
        // Days he can wear the same color from the remaining socks
        int sameDays = Math.abs(a - b) / 2;
        
        // Print the two space-separated results
        System.out.println(differentDays + " " + sameDays);
        
        scanner.close();
    }
}