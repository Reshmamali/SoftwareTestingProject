package com.javaProgram4;

import java.util.Arrays;
import java.util.Collections;

public class SortingElement {

	public static void main(String[] args) {
		int a[]= {10,30,20,5,50};
		System.out.println("Array before sorting:"+Arrays.toString(a));
		//Arrays.parallelSort(a);
		Arrays.sort(a);
		System.out.println("Array after sorting:"+Arrays.toString(a));
		/*
		//Reverse Descending order
		Integer a[]= {10,30,20,5,50};
		System.out.println("Array before sorting:"+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array after sorting:"+Arrays.toString(a));
				*/
	}

}
