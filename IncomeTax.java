// Calculate income tax of an employee to the governement as per he slabs mentioned below;
// Income Slab    Tax
//  2.5L-5.0L      5%
//  5.0L-10.0L     20%
// Above 10.0L     30%
// note that there is no tax below 2.5L Take input amount as an input from the user


package com.practice;
import java.util.Scanner;


public class IncomeTax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float tax=0;

		System.out.println("Enter the Income");
		float income=sc.nextFloat();
		if(income<=2.5) {
			tax=tax+0;
		}
		else if(income>2.5f && tax<=5f) {
			tax=tax+0.05f*(income-2.5f);
		}
		else if(income>5f && tax<=10f)
			tax=tax+0.05f*(5.0f-2.5f);
		tax=tax+0.2f*(income-2.5f);
 if  (income>10f)
		tax=tax+0.05f*(5.0f-2.5f);
	tax=tax+0.2f*(10.0f-2.5f);
	tax=tax+0.3f*(income-10.0f);
}
}

