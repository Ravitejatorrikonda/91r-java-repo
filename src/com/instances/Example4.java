package com.instances;

public class Example4 {

	public static void main(String[] args) {
		int[][] a = { { 1, 0, 0 }, { 0, 1, 0}, { 0, 0, 1 } };
		
		boolean status=true;
		int c=a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i !=j) {
					if(a[i][j] !=0) {
						status=false;
						break;
					}
				}else {
					if(a[i][j] != 1) {
						status=false;
						break;
					}
				}
			}
		}
		if(status) {
			System.out.println("It is a scalaer matrix");
		}else {
			System.out.println("it is not A scalar MATRIX");
		}

	}

}
