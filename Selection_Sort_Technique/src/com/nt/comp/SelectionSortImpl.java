package com.nt.comp;



public class SelectionSortImpl {
public void Select(int arr[])
{
	int n = arr.length;
	for(int i=0;i<n-1;i++)
	{
		int min = arr[i];int min_index= i;
		for(int j=i+1;j<n;j++)
		{
			if(arr[min_index]>arr[j])
			{
				min=arr[j];
				min_index = j;
				
			}
		}
		int temp = arr[min_index];
		arr[min_index] =  arr[i];
		arr[i] = temp;
		
	}
	
}
void print(int arr[])
{
	int n = arr.length;
	for(int i=0;i<n;i++)
	{
		System.out.print(arr[i]+" ");
	}
}

public static void main(String[] args) {
	int a[] = {10,9,15,2,8,27,1,0,-5};
	SelectionSortImpl obj = new SelectionSortImpl();
	obj.Select(a);
	obj.print(a);	
}
}