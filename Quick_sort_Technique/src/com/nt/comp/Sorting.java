package com.nt.comp;

public class Sorting
{
	public static void sort(int arr[],int i,int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static int partition(int arr[],int low,int high)
	{
		int pivot = arr[high];
		int i = low-1;
		for(int j=low;j<=high;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				sort(arr,i,j);
			}
		}
		sort(arr,i+1,high);
		return (i+1);
	}
	public static void quicksort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int p1 = partition(arr,low,high);
			quicksort(arr,low,p1-1);
			quicksort(arr,p1+1,high);
			
		}
	}
	public static void printarray(int arr[],int size)
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
