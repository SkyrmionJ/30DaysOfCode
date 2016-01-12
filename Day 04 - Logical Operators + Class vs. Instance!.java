import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/** 
 * You will create a class Person and write a constructor that takes an integer, initial_Age. 
 * In this constructor, you should check that the initial_Age is not negative because we can't have people with negative ages.
 * 
 * If the initial_Age is negative, set the instance's age equal to zero then print
 * "This person is not valid, setting age to 0."
 * 
 * In amIOld(), do the following things:
 * 
 * If the age of the Person instance is less than 13, then print "You are young."
 * If the age of the Person instance is equal or greater than 13, but less 18, print "You are a teenager."
 * Otherwise, print "You are old."
 * 
 * In addition, create an instance function called yearPasses() that increases the age of the person instance by one.
 */ 

public class Person {
  
    int age;	
	public Person(int initial_Age) {
  		if (initial_Age < 0){
  		this.age = 0;
  		System.out.println("This person is not valid, setting age to 0.");
  		}
  		else this.age = initial_Age;
	}

	public void amIOld() {
  		if (this.age < 13) System.out.println("You are young.");
  		else if (this.age >= 18) System.out.println("You are old.");
  		else System.out.println("You are a teenager.");
	}

	public void yearPasses() {
  		this.age++;
	}

 	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	int T = sc.nextInt();
      		for (int i = 0; i < T; i++) {
        		int age = sc.nextInt();
          		Person p = new Person(age);
          		p.amIOld();
          		for (int j = 0; j < 3; j++) {
            		p.yearPasses();
          		}
          		p.amIOld();
                System.out.println();
        }
    }
}