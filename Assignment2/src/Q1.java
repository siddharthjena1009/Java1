import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a degree in Fahrenheit:");
		double F=sc.nextDouble();
		
		double C=(F-32)*(5.0/9);
		System.out.println(F+"Fahrenheit is "+C+" Celsius.");
		
		
		

	}

}
