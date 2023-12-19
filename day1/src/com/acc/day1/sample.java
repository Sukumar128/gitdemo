package com.acc.day1;

public class sample {
	public static void main(String[] args) {
		int x=28;
		int y=4;
		//decrement
		/*--x;
		System.out.println(x);*/
		//division
		float result1=y/x;
		//modulo
		float result2=y%x;
		//Modulo assignment
		y%=x;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(y);
		//logical OR & not
		boolean result;
		if(x==28 || y==5) {
			System.out.println("May be one of hte given condition is true");
		}
		if(x!=28) {
			System.out.println("The given condition is not satisfied");
		}
	}
}
