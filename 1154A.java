
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] x = new long[4];
        
        for (int i = 0; i < 4; i++) {
            x[i] = scanner.nextLong();
        }
        
        Arrays.sort(x);
        
        // x[3] is always a + b + c because it is the largest sum
        // Subtracting other values from x[3] gives a, b, and c
        long a = x[3] - x[0];
        long b = x[3] - x[1];
        long c = x[3] - x[2];
        
        System.out.println(a + " " + b + " " + c);
    }
}