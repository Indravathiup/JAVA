package PlanetExplorer;

import java.util.Scanner;

public class PlanetExplorer {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double radius=scan.nextDouble();
	PlanetExplorer explorer = new PlanetExplorer();

	System.out.printf("%.2f",explorer.calculateSurfaceArea(radius));
}

}
