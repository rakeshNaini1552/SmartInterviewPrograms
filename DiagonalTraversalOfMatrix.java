import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {int sum=0;
            int n=sc.nextInt();
            int a[][]=new int[n][n];
         for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
      
        int l=0,m=n-1,temp=n;
         if(n==1)
         {System.out.println(a[0][0]);
         }
         else{
         ArrayList<Integer> ar=new ArrayList<>();
         while(!(m<0)){
             
         for(int i=l,j=m;j<n;i++,j++)
         {      
             sum+=a[i][j];
             if(i==n && j==n)
             {l++;
              n--;
              m=temp-1;
                 }
         }ar.add(sum);
             sum=0;
             m--;
             
         }n=temp;
             l=1;m=0;
         while(!(l>temp-1)){
         for(int i=l,j=m;j<n-1;i++,j++)
         {
             sum+=a[i][j];
         }
             ar.add(sum);
             sum=0;
             n--;
             l++;
         }
         for(int i: ar)
                 System.out.print(i+" ");
         System.out.println();
         }
        }
    }
}