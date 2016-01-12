import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/** 
 * Convert a given number, n, from decimal (base 10) to binary (base 2).
 * 
 * Input Format
 * The first line contains a single integer, T, the number of test cases. 
 * The T subsequent lines of test cases each contain a single value, n, the base 10 positive integer to be converted.
 */

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = t; i > 0; i--) {
            System.out.println(convert(sc.nextInt()));
        }
    }
    public static String convert(int dec) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        String printer = "";
        while (dec > 0) {
            if (dec%2 == 0) {
                result.add(0);
                dec /= 2;
            }
            else {
                result.add(1);
                dec = (dec - 1) / 2;
            }
        }
        for (int i : result) {
            printer = i + printer;
        }
        return printer;
    }
}