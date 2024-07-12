import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a distance Kilometers:");
		int d=sc.nextInt();
		int m=d*1000;
		double i=d*39370.0787;
		int cm=d*100000;
		double f=d*3280.8399;
	
		System.out.println(d+"km is "+m+" meters.\n"+d+"km is "+i+" inch.\n"+d+"km is "+cm+" centimeter.\n"+d+ "km is "+f+"feet.");

	}

}
