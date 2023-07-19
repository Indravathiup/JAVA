package HeightConverter1;
import java.util.Scanner;
public class HeightConverter1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double inches=scan.nextDouble();
		HeightConverter converter = new HeightConverter();
		System.out.printf("%.2f",converter.convertInchesToFeet(inches));
	}
}
