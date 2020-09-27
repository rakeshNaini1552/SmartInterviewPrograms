import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++)
        {
            int n=sc.nextInt();
            System.out.println("Case #"+(l+1)+":");
            char[][] a=new char[n][n];
            
            for(int i=0;i<n;i++)
            {for(int k=0;k<n-i-1;k++)
            {
                System.out.print(" ");
            }
                for(int j=n-1;j>n-i-2;j--)
                {
                System.out.print("*");
            }System.out.println();    
                
            }
            
        }
    }
}
