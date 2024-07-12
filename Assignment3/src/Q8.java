import java.util.Scanner;

public class Q8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the x-coordinate: ");
        double x = scanner.nextDouble();

        
        System.out.print("Enter the y-coordinate: ");
        double y = scanner.nextDouble();
        if (x == 0 && y == 0) {
            System.out.println("(" + x + ", " + y + ") is the origin");
        } else if (x == 0) {
            System.out.println("(" + x + ", " + y + ") is on the y-axis");
        } else if (y == 0) {
            System.out.println("(" + x + ", " + y + ") is on the x-axis");
        } else {
           
            String quadrant;
            if (x > 0 && y > 0) {
                quadrant = "I";
            } else if (x < 0 && y > 0) {
                quadrant = "II";
            } else if (x < 0 && y < 0) {
                quadrant = "III";
            } else {
                quadrant = "IV";
            }
            System.out.println("(" + x + ", " + y + ") is in quadrant " + quadrant);
        }
    }
}
