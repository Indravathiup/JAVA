package TheTimeConverter;
import java.util.Scanner;
public class TheTimeConverter {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the minutes");
		int hours=scan.nextInt();
		System.out.printf("%.1f",convertToHours(hours));
	}
	public static double convertToHours(int minutes)
	{
		return minutes/60.0;
	}

	

}
