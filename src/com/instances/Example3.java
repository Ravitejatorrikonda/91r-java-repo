package com.instances;

import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int[][] b = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int arows = a.length;
		int brows = b.length;

		int acols = a[0].length;
		int bcols = b[0].length;

		int[][] c = new int[arows][acols];
		
		if(arows==brows && acols==bcols) {
			for (int i = 0; i < arows; i++) {
				for (int j = 0; j < bcols; j++) {
					 c[i][j]=a[i][j]+b[i][j];
				}
				
			}
			
		}else {
			System.out.println("matrix addition not possible....");
		}
		//leftsum
		int leftsum=0;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if(i==j) {
					leftsum=leftsum+c[i][j];
				}
			}
		}
		System.out.println(leftsum);
		
		
		//rightsum
		int rightsum=0;
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if(i+j==c.length-1) {
					rightsum=rightsum+c[i][j];
				}
			}
		}
		System.out.println(rightsum);
		
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(Arrays.toString(c[i]));
		}

	}

}
