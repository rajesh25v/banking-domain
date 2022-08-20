package com.createiq.operators;

public class Demo2 {
	
	public static void main(String[] args) {
		
		int a = 10, b = 10;
		 int result = a > b ? 5 : 1; // Expression can be a constant value
		 int result2 = a > b ? a : b; // Expression can be a variable
		 int result3 = a > b ? (a-b) : (b-a);
		 String str = (a == b) ? "Equal" : "Not Equal";
		 
		 System.out.println(result);
		 System.out.println(str);
		 
		 
		 int x=2,y=4;
		 
		 System.out.println(x&y);
		 System.out.println(x|y);
		 System.out.println(~x);
	}

}
