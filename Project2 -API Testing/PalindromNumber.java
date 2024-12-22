package com.javaIndis;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the number");
		
		int num1=s.nextInt();//1234
		int num=num1;
		System.out.println("The given number is "+num);
		
		int rev=0;
		
		while(num!=0) {//1234   123 12  1
			rev=rev*10+num%10; //0*10+4=4    4*10+123%10=43   43*10+12%10=432   432*10+1%10=4321
			num=num/10; //1234/10=123 123/10=12 12/10=1 1/10=0.1
		}
		if(num1==rev) {
			System.out.println("enter the number is palindrom");	
		}
		else {
			System.out.println("enter the number is not palindrom");	
		
		}

	}

}
