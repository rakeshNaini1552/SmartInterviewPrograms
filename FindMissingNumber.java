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
            int m=n+1;
            long sum=m*(m+1)/2;
            int[]a=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
            for(int i=0;i<n;i++)
            {
                sum-=a[i];
            }
         System.out.println(sum);
        }
    }
}