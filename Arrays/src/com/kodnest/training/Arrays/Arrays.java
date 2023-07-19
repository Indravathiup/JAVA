package com.kodnest.training.Arrays;
import java.util.Scanner;
public class Arrays {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("enter array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
		arr[i]=scan.nextInt();
		}
		System.out.println(" array contents are");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}

}
