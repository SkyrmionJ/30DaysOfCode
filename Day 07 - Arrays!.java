import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/** 
 * Given an array of N integers. 
 * Print the integers in reverse order. 
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        for(int i=0; i < N; i++){
            arr[i] = in.nextInt();
        }
        String result = "";
        for (int i = N - 1; i > -1; i--) {
            result = result + arr[i] + " "; 
        }
        System.out.println(result);
    }
}
