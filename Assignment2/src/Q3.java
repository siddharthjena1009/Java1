import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic salary");
		int basic=sc.nextInt();
		double da=basic*0.4;
		double hra=basic*0.2;
		double gross= (int)(basic+da+hra);
		System.out.println("DA is "+da+" \n"+"HRA is"+hra+"\n"+"Gross salary is " +gross+"\n");
		

	}

}
