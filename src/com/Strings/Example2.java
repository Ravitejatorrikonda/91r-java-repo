package com.Strings;

public class Example2 {

	public static void main(String[] args) {

		String[] str = { "flower", "flow", "floor", "float", "flex" };
		String prefix = "";

		String smallest = str[0];
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() < smallest.length()) {
				smallest = str[i];
			}

		}
		for (int i = 0; i < smallest.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length; j++) {
				if (str[j].charAt(i) == smallest.charAt(i)) {
					count++;
				}

			}
			
			if (count == str.length) {
				prefix = prefix + smallest.charAt(i);
			} else {
				break;
			}

		}
		System.out.println(prefix);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		String str="ABCDEFGH";
//		        //1
//		for (int i = 0; i < str.length(); i++) {
//			//       2
//			for (int j = i+1; j <= str.length(); j++) {
//				String st=str.substring(i,j);         
//				if(st.length()==3) {
//					System.out.println(st);
//				}
//			}
//			
//		}

	}

}
