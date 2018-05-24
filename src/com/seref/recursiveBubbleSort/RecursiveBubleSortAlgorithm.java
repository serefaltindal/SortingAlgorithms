package com.seref.recursiveBubbleSort;

import java.util.Random;

public class RecursiveBubleSortAlgorithm {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		int unsortedArray[]=createArray();
		int sortedArray[]=sortArray(unsortedArray,unsortedArray.length);
		printArray(sortedArray);
		
		long endTime = System.nanoTime();
		System.out.println(Double.valueOf(endTime-startTime)/1000000000.0+ " s"); 
	}

		

	public static int[] createArray() {
		int arr[]=new int[10000];
		Random random=new Random();
		for(int i=0;i<=9999;i++) 
			arr[i]=random.nextInt(10000) + 1;
		return arr;
		}
	
	
	public static int[] sortArray(int []arr,int indx) {

		if(indx==1) 
			return arr;
				
            for (int j = 0; j < indx-1; j++) {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
         }
		return 	sortArray(arr,(indx-1));
	}
	
	public static void printArray(int sortedArray[]) {
		if(sortedArray!=null) {		
			for(int i=0;i<sortedArray.length;i++) {
				System.out.println("i:"+(i+1)+" value:"+sortedArray[i]);
			}
		}
	}

	
}
