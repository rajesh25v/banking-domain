package com.createiq.operators;

public class DuplicteChar {
	public static void main(String[] args) {
		String s="rajeshrarj";
		int[]fre=new int[s.length()];
		char []str=s.toCharArray();
		int i,j;
		for(i=0;i<s.length();i++) {
			fre[i]=1;
			for(j=i+1;j<s.length();j++) {
				if(str[i]==str[j]) {
					fre[i]++;
					str[j]='0';
				}
			}
		}
		System.out.println("corresponding values");
		for(i=0;i<str.length;i++) {
			if(str[i]!='0'&& str[i]!=' ') {
				if(fre[i]>1) 
				System.out.println(str[i]+"-"+fre[i]);
			}
		}
		
	}

}
