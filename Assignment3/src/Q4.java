import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int lb=1,ub=10;
		int comp=(int)(lb+(ub-lb)*Math.random());
		System.out.println("Enetr a number between 1 to 9:");
		int u=sc.nextInt();
		System.out.println("Computer guesses:"+comp);
		if(comp==u)
			System.out.println("you got it right");
		else if(Math.abs(u-comp)==1)
		System.out.println("Almost got it");
		else
			System.out.println("you got it wrong");
				
	}
}
