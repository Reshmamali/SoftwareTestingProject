package com.javaIndis;

public class ReverseString {

	public static void main(String[] args) {
String str="Pune"; //enup
System.out.println("current string is "+ str);

String revstr="";
for(int i=str.length()-1;i>=0;i--) { 
	revstr=revstr+str.charAt(i);
}
System.out.println("reverse string is "+ revstr);
	}

}
