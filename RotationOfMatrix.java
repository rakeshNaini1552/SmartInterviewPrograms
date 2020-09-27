import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            int[][] a=new int[n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Test Case #"+(k+1)+":");
           for(int i=0;i<n;i++)
            {
                for(int j=n-1;j>=0;j--)
                {
                   System.out.print(a[j][i]+" ");
                }
               System.out.println();
            }
        }
    }
}