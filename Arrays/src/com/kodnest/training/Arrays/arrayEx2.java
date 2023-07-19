package com.kodnest.training.Arrays;
import java.util.Scanner;
public class arrayEx2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	float arr[]=new float[7];
	System.out.println("enter the array elements");
	for(int i=0;i<=arr.length-1;i++)
	{
	arr[i]=scan.nextFloat();
	}
	System.out.println("array contents are");
	for(int i=0;i<=arr.length-1;i++)
		{
		System.out.println(arr[i]+" ");
		}
		}
}
