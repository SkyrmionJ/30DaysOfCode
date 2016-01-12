import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Given a 6x6 2-D Array, we can find 16 "hourglasses" that take the form of
 *      a b c
 *        d
 *      e f g
 * The sum of an hourglass is the sum of all 7 values in the hourglass.
 * Find the largest sum of an hourglass in the 2-D Array. 
 * 
 * Input Format
 * There are 6 lines of input, where each line contains 6 space-separated integers describing 2D Array A. 
 * Every value in A will be in the inclusive range of −9 to 9.
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(maxSum(arr));
    }
    
    public static int maxSum(int[][] arr) {
        int max = 0;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];  
                if (sum > max) max = sum; 
            }
        }
        return max;
    }
}