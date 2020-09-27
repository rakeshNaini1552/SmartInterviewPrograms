import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            int count=0;
            String c=Long.toBinaryString(a);
            String d=Long.toBinaryString(b);
            long al=c.length();
            long bl=d.length();
            if(al>bl)
            {
                long len=al-bl;
                for(long i=0;i<len;i++)
                {
                    d='0'+d;
                }
            }
             if(al<bl)
            {
                long len=bl-al;
                for(long i=0;i<len;i++)
                {
                    c='0'+c;
                }
            }
            for(int i=0;i<Math.max(c.length(),d.length());i++)
            {
                if(c.charAt(i)!=d.charAt(i))
                   count++;
            }
                   System.out.println(count);
            
        }
    }
}