import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++)
        {
            int n1=sc.nextInt();
            
           int n2=sc.nextInt();
            int[][] a=new int[n1][n2];
            for(int i=0;i<n1;i++)
            {
                for(int j=0;j<n2;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            int m1=sc.nextInt();
            int m2=sc.nextInt();
             int[][] b=new int[m1][m2];
            for(int i=0;i<m1;i++)
            {
                for(int j=0;j<m2;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }
            int[][] c=new int[n1][m2];
           
               for(int i=0;i<n1;i++)
            {
                for(int j=0;j<m2;j++)
                {
                    c[i][j]=0;
                    for(int k=0;k<n2;k++)
                    {//System.out.println(a[i][k]+" "+b[k][j]);
                        c[i][j]+=a[i][k]*b[k][j];
                    }System.out.print(c[i][j]+" ");
                }
                System.out.println();   
            }
           
                  
               
           }
        sc.close();
        }
    }
