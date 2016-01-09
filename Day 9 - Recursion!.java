/** 
 * Euclid's Algorithm for Computing the GCD of two integers
 * Given two integers a and b, find the GCD recursively using Euclid's Algorithm. 
 */ 

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd=find_gcd(a,b);
        System.out.println(gcd);
    }

   public static int find_gcd(int a,int b) {
        if ((a != 0) && (b != 0)){
        	if (a > b) return find_gcd(a%b, b);
        	else if (a < b) return find_gcd (a, b%a);
        	else return a;
        }
        return Math.max (a, b);
      }
}