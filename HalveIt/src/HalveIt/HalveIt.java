package HalveIt; 
import java.util.Scanner;
public class HalveIt {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		double num=scan.nextDouble();
		System.out.printf("%.2f",halveTheNumber(num));
	}
	public static double halveTheNumber(double num)
	{
		return num/2.0;
	}
}