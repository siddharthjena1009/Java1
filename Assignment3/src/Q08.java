import java.util.*;
public class Q08
{
public static void main(String[] args)
{
Scanner sc= new Scanner (System.in);
System.out.println("Enter x coordinate-");
int x= sc.nextInt();
System.out.println("Enter y coordinate-");
int y= sc.nextInt();
if (x==0 && y==0)
{
System.out.println("("+x+","+y+")"+" is at origin ");
}
else if (x==0)
{
System.out.println("("+x+","+y+")"+" is on y axis ");
}
else if (y==0)
{
System.out.println("("+x+","+y+")"+" is on x axis ");
}
else if (x>0 && y>0)
{
System.out.println("("+x+","+y+")"+"is in quadrant I");
}
else if (x<0 && y>0)
{
System.out.println("("+x+","+y+")"+" is in quadrant II");
}
else if (x<0 && y <0)
{
System.out.println("("+x+","+y+")"+" is in quadrant III");
}
else
{
System.out.println("("+x+","+y+")"+" is in quadrant IV");
}
}
}

