package com.arrays.task;

import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2= {7,8,9,10,11};
		int[] newarr=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			newarr[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			newarr[i + arr1.length]=arr2[i];
		}
		System.out.println(Arrays.toString(newarr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int search=40;
//		boolean status=true;
//		for (int i = 0; i < arr.length; i++) {
//			if(search==arr[i]) {
//				System.out.println("search elemenmt index position : "+ i);
//				status=false;
//				break;
//			}
//		}
//		if(status) {
//			System.out.println("no search element.....");
//		}
		
		
		
		
		
//		
//		for (int i = arr.length-1; i > 0; i--) {
//			System.out.println(arr[i]);
//		}
//		
		
		
		
		
		
		
//		int evencount=0;
//		int oddcount=0;
//		for (int i = 0; i < arr.length; i++) {
//			if(i%2==0) {
//				evencount++;
//			}else {
//				oddcount++;
//			}
//		}
//		System.out.println(evencount+" : "+oddcount);
		
		
		
		
		
		
		
//		int sum=0;
//		for (int i = 0; i < arr.length; i++) {
//		    sum=sum+arr[i];
//		    
//			
//		}
//		System.out.println(sum);

	}

}
