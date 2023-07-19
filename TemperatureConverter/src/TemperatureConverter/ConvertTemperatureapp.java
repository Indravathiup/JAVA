package TemperatureConverter;
import java.util.Scanner;
public class ConvertTemperatureapp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the temperature");
	double f=scan.nextDouble();
	TemperatureConverter temperatureConverter = new TemperatureConverter();

	System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(f));
}
}
