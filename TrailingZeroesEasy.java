import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int i=0;i<t;i++)
        {
            long count=0,j=1;
        long n=sc.nextLong();
            while(n>0)
            {
            count+=(long)(n/Math.pow(5,j));
            j++;
                if((n/(long)Math.pow(5,j))==0)
                    break;
            }
            System.out.println(count);
        }
    }
}