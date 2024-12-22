package com.javaProgram4;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//String str[]= {"Java","C++","C#","Python","java","++"};
	int str[]= {10,20,10,25,20,26,28};

	boolean flag = false;
		for(int i=0;i<str.length;i++) {
		for(int j=i+1;j<str.length;j++) {
			if (str[i]==str[j]) {
			System.out.println("found duplicate Element found:"+str[i]);
			flag=true;
			}
		}
	}
	if(flag==false) {
		System.out.println("Duplicate Element does not  found:");
		
	} 
	}

}
