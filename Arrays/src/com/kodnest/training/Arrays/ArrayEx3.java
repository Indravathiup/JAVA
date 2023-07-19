package com.kodnest.training.Arrays;
import java.lang.reflect.Array;
import java.util.Scanner;
public class ArrayEx3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter people count");
	boolean arr[]=new boolean[scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("is person" +" " + i +"  " + "married? ");
		arr[i]=scan.nextBoolean();
	}
	System.out.println("array contents are");
	for(int i=0;i<arr.length-1;i++)
	{
		System.out.println("person" +  " " + i + "  " + "married" + arr[i]);
	}
}
}
