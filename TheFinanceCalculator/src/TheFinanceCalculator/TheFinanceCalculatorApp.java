package TheFinanceCalculator;
import java.util.Scanner;
public class TheFinanceCalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the values of principal,rate,time");
		double principal=scan.nextDouble();
		double rate=scan.nextDouble();
		double time=scan.nextDouble();
		TheFinanceCalculator calculator = new TheFinanceCalculator();

		System.out.printf("%.2f",calculator.calculateSimpleInterest(principal,rate,time));

		
		}

}
