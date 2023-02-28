package com.practice;
import java.util.Scanner;
public class Greetings {

	public static void main(String[] args) {
		System.out.println("What is your name");
		Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("Hello\t"+ name +"\thave a good day!");
	}

}
