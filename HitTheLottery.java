import java.util.Scanner;

public class HitTheLottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.util.Scanner);
        
        // Read the total amount of money
        int n = scanner.nextInt();
        int count = 0;
        
        // Array containing all standard bill denominations
        int[] bills = {100, 20, 10, 5, 1};
        
        // Greedily divide by the largest possible bills
        for (int bill : bills) {
            count += n / bill; // Add number of bills of this denomination
            n %= bill;         // Remaining money left to withdraw
        }
        
        // Output the total minimum number of bills
        System.out.println(count);
        
        scanner.close();
    }



}
    

