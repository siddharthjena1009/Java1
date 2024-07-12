import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number Between 0 and 1000:");
		int n=sc.nextInt();
		int u=n%10;
		n=n/10;
		int t=n%10;
		n=n/10;
		int h=n%10;
		n=n/10;
		int s=u+t+h;
		System.out.println("Sum of the Digits is:" +s);
	
		
		
	}

}
