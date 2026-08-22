import java.util.Scanner;

public class Presents136A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of friends
        int n = scanner.nextInt();
        
        // Array to store the giver for each person
        int[] giverOf = new int[n + 1];
        
        // Read the receiver for each friend 'i'
        for (int i = 1; i <= n; i++) {
            int receiver = scanner.nextInt();
            // Friend 'i' gave a gift to 'receiver'
            // Therefore, the giver of 'receiver' is 'i'
            giverOf[receiver] = i;
        }
        
        // Print the result from friend 1 to n
        for (int i = 1; i <= n; i++) {
            System.out.print(giverOf[i] + " ");
        }
        
        scanner.close();
    }
}