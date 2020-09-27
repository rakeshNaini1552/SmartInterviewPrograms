import java.io.*;
import java.util.*;

public class Solution {

 
     static long gcd(long a, long b) 
    { 
    if (a == 0) 
        return b;  
    return gcd(b % a, a);  
    } 
      
    static long hcf(long a, long b) 
    { 
        return (a*b)/gcd(a, b); 
    }
    
      
    public static void main(String[] args)  
    { Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
     for(long i=0;i<t;i++){
        long a = sc.nextLong();
        long b = sc.nextLong(); 
        long gc=gcd(a,b);
        long hc=hcf(a,b);
        System.out.println(hc+" "+gc); 
    }  
}
}