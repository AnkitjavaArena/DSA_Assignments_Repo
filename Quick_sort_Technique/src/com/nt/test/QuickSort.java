package com.nt.test;

import com.nt.comp.Sorting;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = {8,3,5,0,-3,1,9,4};
		int n = arr.length;
		Sorting.quicksort(arr,0,n-1);
		System.out.println("Sorted array is :");
		Sorting.printarray(arr,n);
	}

}