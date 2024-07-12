import java.util.*;
public class q10{
	public static void main(String[] args){
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the marks-");
		int Marks = sc.nextInt();
		switch(Marks/100){
		
		case 1 :System.out.println("O"); break;
		case 2 :System.out.println("A"); break;
		case 3 :System.out.println("B"); break;
		case 4 :System.out.println("c"); break;
		case 5 :System.out.println("D"); break;
		case 6 :System.out.println("E"); break;
		default:System.out.println("Fail");
		}
}
}