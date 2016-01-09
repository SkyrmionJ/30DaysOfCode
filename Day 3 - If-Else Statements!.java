import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/** 
 * Given an integer N as input, check the following:
 * 
 * If N is odd, print "Weird".
 * If N is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
 * If N is even and, in between the range of 6 and 20(inclusive), print "Weird".
 * If N is even and N>20, print "Not Weird".
 */

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            
        String ans="";
        if (n%2==1) ans = "Weird";
        else {
        	if ((n >= 6) && (n <= 20)) ans = "Weird";
            else ans = "Not Weird";    
        }
            System.out.println(ans);
    }
}