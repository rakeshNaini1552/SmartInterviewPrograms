import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner sc=new Scanner(System.in);
    long t=sc.nextLong();
    for(long k=0;k<t;k++)
    {String s="";
        long n=sc.nextLong();
     if(n==0)               
         System.out.print("0");
     else if(n>0){
        while(n>0)
        {
            s=(n%2)+s;
            n/=2;
        }
     }
     
     System.out.println(s);
    }
    }
}