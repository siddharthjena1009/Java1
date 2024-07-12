import java.util.Scanner;
	public class Q10 {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=obj.nextInt();
		int c=0,x=3;
		while(x<=n)
		{
			x=x*3;
			c++;
		}
		x=x/3;
		System.out.println("3 to the power "+c+" = "+x+" is largest power of 3 less than "+n);
	}

}
