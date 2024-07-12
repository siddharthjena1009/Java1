import java.util.Scanner;

public class p8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter x--:");
		double x=sc.nextDouble();
		System.out.print("Enter y--:");
		double y=sc.nextDouble();
		if(x>0 && y>0) {
			System.out.print(x+","+y+" is in 1st coordinate");
		}
		else if(x<0 && y>0) {
			System.out.print(x+","+y+" is on origin");
		}
		else if(x<0 && y>0) {
			System.out.print(x+","+y+" is in 2nd coordinate");
		}
		else if(x<0 && y<0) {
			System.out.print(x+","+y+" is in 2nd coordinate");
		}
		else if(x>0 && y<0) {
			System.out.print(x+","+y+" is in 2nd coordinate");
		}
		else if(x==0) {
			System.out.print(x+","+y+" on y-Axis");
		}
		else if(y==0) {
			System.out.print(x+","+y+" on x-Axis");
		}
		
	}

}
