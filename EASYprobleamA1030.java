import java.util.Scanner;

public class EASYprobleamA1030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of people asked
        int n = scanner.nextInt();
        boolean isHard = false;
        
        // Check each person's opinion
        for (int i = 0; i < n; i++) {
            int opinion = scanner.nextInt();
            if (opinion == 1) {
                isHard = true;
            }
        }
        
        // Output the final verdict
        if (isHard) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
        
        scanner.close();
    }
}
