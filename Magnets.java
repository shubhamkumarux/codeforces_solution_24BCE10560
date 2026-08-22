import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Magnets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the total number of magnets
        int n = Integer.parseInt(br.readLine());
        
        // Base case: if there are no magnets, there are 0 groups
        if (n == 0) {
            System.out.println(0);
            return;
        }
        
        // Initialize groups count to 1 since the first magnet starts the first group
        int groups = 1;
        
        // Read the first magnet's configuration ("01" or "10")
        String previousMagnet = br.readLine();
        
        // Loop through the remaining magnets
        for (int i = 1; i < n; i++) {
            String currentMagnet = br.readLine();
            
            // If the current magnet differs from the previous one, a new group forms
            if (!currentMagnet.equals(previousMagnet)) {
                groups++;
                previousMagnet = currentMagnet; // Update the tracking pointer
            }
        }
        
        // Print the final group count
        System.out.println(groups);
    }
}
