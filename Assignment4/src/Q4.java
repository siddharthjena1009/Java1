
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int x=sc.nextInt();
		System.out.println("Enter the second number : ");
		int y=sc.nextInt();
		while (y!=0)
		{
			int temp=y;
			y=x%y;
			x=temp;
		}
		System.out.println("GCD "+x);

	}

}
