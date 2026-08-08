import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read the number of games
        int n = scan.nextInt(); 
        
        // Read the game results string
        String s = scan.next(); 
        
        int antonWins = 0;
        int danikWins = 0;
        
        // Count wins for each player
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                antonWins++;
            } else {
                danikWins++;
            }
        }
        
        // Compare counts and print the result
        if (antonWins > danikWins) {
            System.out.println("Anton");
        } else if (danikWins > antonWins) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
        
        scan.close();
    }
}
import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read the number of games
        int n = scan.nextInt(); 
        
        // Read the game results string
        String s = scan.next(); 
        
        int antonWins = 0;
        int danikWins = 0;
        
        // Count wins for each player
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                antonWins++;
            } else {
                danikWins++;
            }
        }
        
        // Compare counts and print the result
        if (antonWins > danikWins) {
            System.out.println("Anton");
        } else if (danikWins > antonWins) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
        
        scan.close();
    }
}
