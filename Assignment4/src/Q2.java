import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=obj.nextInt();
		int k=num;
		int sum=0;
		while (num!=0)
		{
			sum=sum+sum%10;
			num=num/10;
		}
		if(sum%9==0)
		{
			System.out.println("The number "+k+" is divisible by 9");
		}
		else
		{
			System.out.println("The number "+k+" is not divisible by 9");
		}

	}

}
