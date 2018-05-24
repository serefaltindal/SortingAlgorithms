package com.seref.bubbleSort;

import java.util.Random;

//BubbleSort 100000 data için sıralama süresi [15.28-17.42] sn
public class BubleSortAlgorithm {

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
			
		int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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
