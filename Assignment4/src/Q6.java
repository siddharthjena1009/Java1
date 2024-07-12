
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the base number : ");
		int a=obj.nextInt();
		System.out.println("Enter the exponenent number : ");
		int b=obj.nextInt();
		int s=1;
		int temp;
		temp=b;
		while(b>0)
		{
			
			s=s*a;
			b--;
		}
		System.out.println(a+" raised to the power "+temp+" is : "+s);

	}

}
