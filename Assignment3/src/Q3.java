import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1st number");
		int first=sc.nextInt();
		System.out.println("Enter 2nd number");
		int second=sc.nextInt();
		System.out.println("Enter 3rd number");
		int third=sc.nextInt();
		if(first<second && second<third)
			System.out.println("Increasing");
		else if(first>second && second>third)
		    System.out.println("Decreasing");
		else
			 System.out.println("Neither Increasing nor decreasing");

	}

}
