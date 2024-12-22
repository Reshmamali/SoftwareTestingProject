package com.javaProgram4;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]={10,30,20,40,60,15};
		int search_el=12;
		boolean flag = false;
		for(int i=0;i<a.length;i++) {
			if(search_el==a[i]) {
				System.out.println("Element found at:"+i);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Element not found");	
		}
	}
}
