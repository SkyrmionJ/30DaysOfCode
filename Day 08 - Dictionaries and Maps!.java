import java.util.*;
import java.io.*;

/** 
 * You are given a phone book that consists of your friend's names and their phone number. 
 * After that you will be given your friend's name as query. 
 * For each query, print the phone number of your friend. If the friend has no entry, print "Not found". 
 *
 * Sample Input: 
 * 3 (Number of phonebook entries to be added)
 * sam
 * 99912222
 * tom
 * 11122222
 * harry
 * 12299933
 * sam
 * edward
 * harry
 *
 * Sample Output: 
 * sam=99912222
 * Not found
 * harry=12299933
 */

class Solution{
   public static void main(String []argh) {
      Scanner in = new Scanner(System.in);
      int N=in.nextInt();
      in.nextLine();
      HashMap<String, Integer> phonebook = new HashMap<String, Integer>(N);
      for(int i=0;i<N;i++) {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
         phonebook.put(name, phone);
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         if (phonebook.containsKey(s))
             System.out.println(s + "=" + phonebook.get(s));
         else System.out.println("Not found");
      }
   }
}