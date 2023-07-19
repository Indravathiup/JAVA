package com.kodnest.training.Arrays;
import java.util.Scanner;
public class ArrayEx1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String arr[]=new String[10];
		System.out.println("enter the name of the employee");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the name of employee"+i);
			arr[i]=scan.nextLine();
		}
		System.out.println("enter the array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i] + " ");
		}
	}

}
