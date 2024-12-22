package com.javaIndis;

public class PalindromString {

	public static void main(String[] args) {
		String str="madam"; 
		
		System.out.println("current string is "+ str);

		String revstr="";
		for(int i=str.length()-1;i>=0;i--) { 
			revstr=revstr+str.charAt(i);
		}		
		
		if(str.equals(revstr)) {
			System.out.println("The Given String is palindrom");	
		}
		else {
			System.out.println("The given String is not palindrom");	
		
		}
			}

}
