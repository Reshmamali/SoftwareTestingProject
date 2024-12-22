package com.javaIndis;

import java.util.Scanner;

public class CheckEvenOrOddNumber {

	public static void main(String[] args) {
	// To take input from user
		Scanner s=new Scanner(System.in);
	    System.out.println("Please Enter the number");
		int num = s.nextInt();
		System.out.println("the given number is "+ num);		
		if(num%2==0) {
			System.out.println("given number "+ num+ " is even");	
		}else {
			System.out.println("given number "+ num+ " is odd");	
		}

	}

}
