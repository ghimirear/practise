 import java.util.Scanner;
public class Quadratic { 
    public static void main(String[] arg) {
        
        int a, b,c;
        double discriminant, root1, root2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the coefficent of x squared: ");
        a = scan.nextInt();

        System.out.println(" Enter the coefficent of x: ");
        b = scan.nextInt();
        System.out.println(" Enter the constant: ");
        c = scan.nextInt();
        discriminant = Math.pow(b, 2)- (4 * a * c);
        root1 = ( (-1*b) + Math.sqrt(discriminant)) / (2*a);
        root2 = ( (-1 * b) - Math.sqrt(discriminant)) / (2*a);
        System.out.println("Root #1: "+ root1);
        System.out.println("Root #2: " + root2);


    }
}
