package JourneyCalculator;
public class JourneyCalculator {
public static void main(String[] args) {
	JourneyCalculator jc=new JourneyCalculator();
	double res=jc.calculateDistance(60.0,1.5);
	
	System.out.printf("%.2f",res);
	
	
}
private int calculateDistance(double d,double e)
{
	return(int) ((double)d*e);
}
}

