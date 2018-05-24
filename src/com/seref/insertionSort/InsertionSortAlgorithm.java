package com.seref.insertionSort;

import java.util.Random;

//InsertionSort 100000 data için sıralama süresi [4.30-4.91] sn
public class InsertionSortAlgorithm {
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
		for(int i=0;i<=99999;i++) 
			arr[i]=random.nextInt(100000) + 1;
		return arr;
		}
	
	
	public static int[] sortArray(int []arr) {
		if(arr.length<=0 || arr==null) 
			return null;
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}else {
					break;
				}
			}
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
