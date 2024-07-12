import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int N=sc.nextInt();
		int count=1;
		double sum=0;
		double avg=0;
		System.out.println("The random numbers are: ");
		do
		{
			int a=(int)(Math.random()*(N-1+1)+1);
			System.out.println(a);
			sum=sum+a;
			count++;
			
		} while(count<=N);
		avg=sum/N;
		System.out.println("Average of "+N+" random numbers are "+avg);
				

	}


	}


