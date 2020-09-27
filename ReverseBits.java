import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   
    Scanner sc=new Scanner(System.in);
    long t=sc.nextLong();
        for(int i=0;i<t;i++)
        {
            long n=sc.nextLong();
            String s=Long.toBinaryString(n);
//System.out.println(s+" "+s.length()); 
         long len=s.length();
         for(int k=0;k<32-len;k++)
             s="0"+s;
                //  System.out.println(s+" "+s.length());
        len=s.length();
            long sum=0;
            for(int j=0;j<len;j++)
            {  if(s.charAt(j)=='1')
                sum=(long)(sum+((Math.pow(2,j))));
            }
         System.out.println(sum);
        }
    }
}