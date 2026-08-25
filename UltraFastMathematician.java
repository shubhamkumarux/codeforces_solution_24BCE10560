import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the two input binary strings
        String n1 = sc.next();
        String n2 = sc.next();
        
        StringBuilder result = new StringBuilder();
        
        // Compare each character position
        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) != n2.charAt(i)) {
                result.append('1');
            } else {
                result.append('0');
            }
        }
        
        // Print the final string
        System.out.println(result.toString());
        
        sc.close();
    }
}