import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {long sum=0;
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int j=0;j<n;j++)
                a[j]=sc.nextLong();
        for(int k=0;k<n;k++)
            sum+=a[k];
            System.out.println(sum);
        }
    }
}