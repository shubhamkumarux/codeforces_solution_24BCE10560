import java.util.Scanner;
import java.lang.Math;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long diff = Math.abs(a - b);
            long ans = (diff + 9) / 10;
            System.out.println(ans);
        }
        scanner.close();
    }
}