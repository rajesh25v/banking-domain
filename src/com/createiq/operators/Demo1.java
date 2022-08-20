package com.createiq.operators;

public class Demo1 {
	
	public static void main(String[] args) {
		int a=10; int x=8;
		a += 10;
		int b=a+10;
		System.out.println(" a values: "+a);
		System.out.println(" b values:  "+b);
		
		x -=3;//or 8-3=5
		x=x-3;//5-3=2
		System.out.println(" x values "+x);
		
		
		a *=5;
		System.out.println(a);
		System.out.println(b*b);
		System.out.println(b*=b*b);
		
		char c='a'+1;
		System.out.println(c);
		
		//modulo operation:---
		
		int num1=16,num2=3;
		
		if(num1%2==0) {
			System.out.println("even number: "+num1);
		}else {
			System.out.println("odd number");
		}
		
		int last_digit=num1%10;
		System.out.println("last_digit of number:--"+last_digit);
		
		
		//uniary operator:---
		
		boolean aa=!true;
		System.out.println("!true:  "+aa);
		System.out.println("!aa:  "+!aa);
		
		
		boolean ab=(a>x);
		System.out.println(ab);
			ab=!(a>x);
		System.out.println(ab);
		
		int bb=2;
		System.out.println("bb++ value:  "+bb++);//bb+1
		System.out.println("bb=3; bb-- values:  "+bb--);//bb-1
		
		System.out.println("bb=2; ++bb value:  "+ ++bb);
		System.out.println("bb=3; --bb value:  "+ --bb);
		
		System.out.println("bb+1 : "+bb+1);
		
	}

}
