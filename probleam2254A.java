import java.util.Arrays;
import java.util.Scanner;

public class probleam2254A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int[] p = new int[3];
            p[0] = scanner.nextInt();
            p[1] = scanner.nextInt();
            p[2] = scanner.nextInt();
            
            int rounds = 0;
            while (true) {
                Arrays.sort(p);
                // Check if any two players have the same number of tokens
                if (p[0] == p[1] || p[1] == p[2]) {
                    break;
                }
                // Player with most tokens gives 1 to player with fewest tokens
                p[2]--;
                p[0]++;
                rounds++;
            }
            System.out.println(rounds);
        }
        scanner.close();
    }
}