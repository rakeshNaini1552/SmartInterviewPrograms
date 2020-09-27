import java.io.*;
import java.util.*;

public class Solution {
    private static final Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     int t=sc.nextInt();
        
        for(int i=0;i<t;i++){
    int x=sc.nextInt();
            int c=x,r=x;
    int[][]  a=new int[r][c];
        for(int j=0;j<r;j++)
        {
            for(int k=0;k<c;k++)
            {
               a[j][k]=sc.nextInt();
            }
        }
        sp(r,c,a);
          System.out.println();
    }
    }
     static void sp(int m,int n,int[][] a)
        {
           int k=0,l=0,i;
             while (k < m && l < n) { 
            for (i = l; i < n; ++i) { 
                System.out.print(a[k][i] + " "); 
            } 
            k++; 
  
            for (i = k; i < m; ++i) { 
                System.out.print(a[i][n - 1] + " "); 
            } 
            n--; 
  
            if (k < m) { 
                for (i = n - 1; i >= l; --i) { 
                    System.out.print(a[m - 1][i] + " "); 
                } 
                m--; 
            } 
  
            if (l < n) { 
                for (i = m - 1; i >= k; --i) { 
                    System.out.print(a[i][l] + " "); 
                } 
                l++; 
            } 
        }
}
}
