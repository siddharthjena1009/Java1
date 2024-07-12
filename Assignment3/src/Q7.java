import java.util.Scanner;
public class Q7 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Unit--:");
		int unit=sc.nextInt();
		double amount;
		if(unit<=50) {
			amount=unit*3;
		}
		else if(unit<=200) {
			amount=(50*3+(unit-50)*4.8);
		}
		else if(unit<=400) {
			amount=(50*3+(unit-50)*4.8+(unit-200)*5.80);
	    }
		else {
			amount=(50*3+(unit-50)*4.8+(unit-200)*5.80+(unit-400)*6.2);
		}
		System.out.print("Do you want to pay bill online? (Y/N)--: ");
    	int ans=sc.nextInt();
		if(ans==0) {
			System.out.println("You are getting 3% Discount:)");
			Double netamount=amount*0.07;
			System.out.println("Total Amount-->"+(amount));
			System.out.println("Discount Amount-->"+(amount*0.03));
			System.out.println("Net Amount-->"+netamount);
		}
		else {
			System.out.println("Total Amount-->"+amount);
			System.out.println("Net Amount-->"+amount);
		}
	}

}
