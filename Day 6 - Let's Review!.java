/**
 * Given an integer N depicting the height of the staircase.
 * Print a staircase of height N that consists of # symbols and spaces.
 *
 * Sample Input:
 * 6
 *
 * Sample Output: 
 *      #
 *     ##
 *    ###
 *   ####
 *  #####
 * ######
 */ 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n--;
        int hash = 1;
        String printer;
        while (n >= 0) {
        	printer = "";
        	for (int i = n; i > 0; i--){
        		printer += " ";
        	}
        	for (int j = hash; j > 0; j--){
        		printer += "#";
        	}
        	System.out.println(printer);
        	n--;
        	hash ++;
        }
    }
}