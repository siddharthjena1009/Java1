import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a=obj.nextInt();
		int b,n;
		for(n=1;n<=10;n++)
		{
			b=a*n;
			System.out.println(a+"x"+n+"="+b);
		}
		

	}

}
