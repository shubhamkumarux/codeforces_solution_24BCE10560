import java.util.Scanner;
public class BeautifulMatrix
{
    public static void main(String args[])
    {
        Scanner z = new Scanner(System.in);
        int[][] a=new int[6][6];
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
                a[i][j]=z.nextInt();
        }
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(a[i][j]==1)
                    System.out.println(Math.abs(3-i)+Math.abs(3-j));
            }
        }
    }
}