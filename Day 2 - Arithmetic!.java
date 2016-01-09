import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/** Input Format
 * 
 * Three numbers, (M, T, and X), each on separate lines:
 * M will be a double representing the original price of the meal.
 * T will be a integer representing the percentage that the customer wants to tip based off of the original price of the meal.
 * X will be an integer representing the tax percentage that the customer has to pay based off of the original price of the meal.
 * 
 * Output Format
 * 
 * A string stating...
 * 
 * The final price of the meal is $-.
 * 
 * where the final price of the meal is substituted for the dash. 
 * The price should be rounded to the nearest integer (dollar) - the code for rounding has already been added in the editor if you are coding in Java.
 */

public class Arithmetic {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage
      
      double tip = M * T / 100;
      double tax = M * X / 100; 
      
      int total = (int) Math.round(M + tip + tax);
      
      System.out.println("The final price of the meal is $" + total + ".");
      
    }
}