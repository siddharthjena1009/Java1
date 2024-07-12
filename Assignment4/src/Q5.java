import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        System.out.println("The Factors of "+num+" are: ");
        while (i<num) {
        	if (num%i==0) {
        		System.out.println(i);
        		sum=sum+i;
        	}
        	i++;
        }
        if (sum==num) {
        	System.out.println(num +" is a perfect number.");
        }
        else
        {
        	System.out.println(num + " is not a perfect number.");
        }
        
        
	}

}
