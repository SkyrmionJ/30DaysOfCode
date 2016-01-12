import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/** 
 * Given three integers a, b, and N, output the following series:
 * 
 * a + (2^0 * b), a + (2^0 * b) + (2^1 * b), ..., a + (2^0 * b) + (2^1 * b) + ... + (2^(N-1) * b)
 */

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        while (k > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            printer (a, b, n);
        	k--;
        }
    }

    public static void printer(int a, int b, int n){
    	String result = "";
    	int exp = 0;
    	int prev = a;
    	while (exp < n) {
    		prev += (Math.pow(2, exp) * b);
    		result = result + prev + " "; 
    		exp++;
    	}
    	System.out.println(result.trim());
    }
}