package com.acc.day1;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		int length,element;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length:");
		length=scan.nextInt();
		int arr[]=new int[length+1];
		System.out.println("Enter "+length+" elements:");
		for(int x=0;x<length;x++) {
			arr[x]=scan.nextInt();
		}
		System.out.println("Enter the element whic will be inserted:");
		element=scan.nextInt();
		arr[length]=element;
		System.out.println("AFter inserting");
		for(int y=0;y<length;y++) {
			System.out.println(arr[y]+",");
		}
		System.out.println(arr[length]);

	}

}
