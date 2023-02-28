// write a java program to tell whether student is pass or fail if it requires total 40% and atleast 33% in each subject to pass
// assume 3 subjects and take marks as input from the user
package com.practice;
import java.util.Scanner;


public class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		byte m1, m2, m3;
		System.out.println("Enter your marks in physics");
		 m1=sc.nextByte();
		 
         System.out.println("Enter marks in Chemistry");
         m2= sc.nextByte();
         System.out.println("Enter marks in Mathematics");
         m3=sc.nextByte();
         float avg=(m1+m2+m3)/3.0f; 
         System.out.println("Your overall percentage is "+avg);
         if(avg>=40&& m1>=33&& m2>=33 && m3>=33)
         {
        	 System.out.println("Congratulation you have promoted");
         }
         else
         {
        	 System.out.println("Not Promoted");
         }
	}

}
