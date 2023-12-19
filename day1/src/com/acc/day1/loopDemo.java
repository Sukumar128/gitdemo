package com.acc.day1;

public class loopDemo {
public static void main(String[] args) {
	/*for(int x=1;x<5;x++) {
		for (int y=1;y<=x;y++) {
			System.out.print("*");
		}
		System.out.println();
	}*/
	/*int x=1;
	while(x<=5) {
		int y=1;
		while(y<x) {
		System.out.print("*");
		y++;
	}
		x++;
		System.out.println();
		}*/
	int[] x= {1,2,3,4,5};
	for(int y:x) {
		System.out.println(y);
	}
}
}
