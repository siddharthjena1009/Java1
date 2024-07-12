import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		int a=sc.nextInt();
		if(a%100==0)
		if(a%400==0)	
			System.out.println("Leap year");
		else
			System.out.println("No");
		else
			if(a%4==0)
				System.out.println("Leap year");
			else
				System.out.println("Not");
			
	}
}
