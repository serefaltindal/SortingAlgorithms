package com.seref.selectionSort;

import java.util.Random;

public class SelectionSortAlgorithm {

	
	public static void main(String args[]) {
		
		long startTime = System.nanoTime();
		
		int unsortedArray[]=createArray();
		int sortedArray[]=sortArray(unsortedArray);
		printArray(sortedArray);
		
		long endTime = System.nanoTime();
		System.out.println(Double.valueOf(endTime-startTime)/1000000000.0+ " s"); 
	}
	
	
	public static int[] createArray() {
		int arr[]=new int[100000];
		Random random=new Random();
		for(int i=0;i<99999;i++) 
			arr[i]=random.nextInt(100000) + 1;

		return arr;}
	
	
	public static int[] sortArray(int []arr) {
		if(arr.length<=0 || arr==null) 
			return null;
			
		for(int j=0;j<arr.length;j++) {
			int min_indx=j;
			for(int i=j+1;i<arr.length;i++) {
				 if(arr[i]<arr[min_indx]) {
					 min_indx=i;}				 			
			}
			int temp=arr[min_indx];
			arr[min_indx]=arr[j];
			arr[j]=temp;
		}		
		return arr;
	}
	
	public static void printArray(int sortedArray[]) {
		if(sortedArray!=null) {		
			for(int i=0;i<sortedArray.length;i++) {
				System.out.println("i:"+(i+1)+" value:"+sortedArray[i]);
			}
		}
	}
}
