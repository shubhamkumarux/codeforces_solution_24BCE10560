import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        int maxIndex = -1;
        int minIndex = -1;
        
        for (int i = 0; i < n; i++) {
            int current = sc.nextInt();
            
            // Look for the strict maximum to get the leftmost occurrence
            if (current > maxVal) {
                maxVal = current;
                maxIndex = i;
            }
            
            // Look for less than or equal to get the rightmost occurrence
            if (current <= minVal) {
                minVal = current;
                minIndex = i;
            }
        }
        
        // Base formula for calculating steps
        int totalSwaps = maxIndex + (n - 1 - minIndex);
        
        // If the max element passes the min element, we save 1 swap
        if (maxIndex > minIndex) {
            totalSwaps--;
        }
        
        System.out.println(totalSwaps);
        
        sc.close();
    }
