package powerofSquares;
import java.util.*;
public class PowerofSquares {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(SquareNumber(num));
				
		
	}
public static int SquareNumber(int num)
{
	return num*num;
}
}
