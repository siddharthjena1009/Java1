
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=obj.nextInt();
		System.out.println("Enter second number: ");
		int b=obj.nextInt();
		System.out.println("Enter third number: ");
		int c=obj.nextInt();
		int sum = 0;
        for (int i = a; i <= b; i += c) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The sum of number displayed is "+sum);
        

		
		

	}

}
