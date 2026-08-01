public import java.util.Scanner;
public class NextRound 
{
    public static void main(String[] args) 
    {
        Scanner ip = new Scanner(System.in);
        int count = 0;
        int n = ip.nextInt();
        int k = ip.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i <= n; i++)
            a[i] = ip.nextInt();
        if (a[k] > 0)
        {
            for (int i = 1; i <= n; i++) 
            {
                if (a[i] >= a[k])
                    count++;
            }
        }
        else 
        {
            for (int i = 1; i <= n; i++) 
            {
                if (a[i] > a[k])
                    count=count+1;
            }
        }
    System.out.println(count);
    }
}
@shubhamkumarux
Comment
 NextRound {
    
}
