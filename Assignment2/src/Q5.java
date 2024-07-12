import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the Hemisphere:");
		int r=sc.nextInt();
		double pi=Math.PI;
		double s=3*pi*r*r;
		double v=pi*r*r*r*2/3;
		System.out.println("The surface area of the Hemisphere:" +s);
		System.out.println("The voloume area of the Hemisphere is" +v);

	}

}
