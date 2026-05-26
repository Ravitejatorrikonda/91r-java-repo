package com.anonymous;

import java.sql.Array;
import java.util.Arrays;


interface Removedublicate{
	abstract int[] getDublicates(int [] arr);
}

interface Sorter{
	public abstract int[] getSorter(int [] arr);
}

public class Example3 {

	public static void main(String[] args) {
		int [] arr= {1,3,5,4,2,6,8,9};
		
		Sorter s=new Sorter() {
			@Override
		public int[] getSorter(int[] arr) {
				
				
				for (int i = 0; i < arr.length; i++) {
					for (int j = i+1; j < arr.length; j++) {
						if(arr[i]> arr[j]) {
							int temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
					}
					
				}
				
				
//			Arrays.sort(arr);
			return arr;
		}
				
		};
		System.out.println(Arrays.toString(s.getSorter(arr)));
		

	}

}
