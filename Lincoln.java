// // public class Lincoln {
// // // defining the method to log the presidential quote
// // public static void main(String[] args){



      
    
    // public static void main(String[] arg){
    //     int keys = 88;
    //     final int PRIMITIVE_DATATYPES = 8;
    //     System.out.print("Three...");
    //     System.out.print("Two...");
    //     System.out.print("One...");
    //     System.out.println("Lifyoff.....");
    //     System.out.println("Houston, We have a problem....");
    //     System.out.println(keys);
    //     System.out.println(PRIMITIVE_DATATYPES);
    //     // four subsets of intiger (B, S, I, L, F, D) =>(Byte, Short, Intiger, Long, Float, Double)
    //     // two subsets of floating point numbers
    //     // character data types 
    //     // boolean data type.

    // }

    // public static void main (String[] arg){
    //     Random generator =  new Random();
    //     String  name;
    //     double miles, gallons, mpg;
    //     // int num1;
    //     // float num2;
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Enter a name of your car");
    //     name = scan.nextLine();
    //     System.out.println("Enter no. of miles:");
    //     miles = scan.nextInt();
    //     System.out.println("Enter no of gallos used.");
    //     gallons = scan.nextInt();
    //     mpg = miles/gallons;
    //     System.out.println("your car "+ name + " mpg is " + mpg + " mpg") ;

    //         // string.substring("string no to start from", "string no to end or upto.")
    //     // generating random number
    //     System.out.println("First random number" + generator.nextInt(10));
    //     System.out.println("Second random number" + generator.nextInt());
    //     System.out.println("third random number" + (generator.nextInt(20)-10));



    // }












// //     System.out.println("A quote by Abraham Lincoln");
// //     System.out.println("Whatever you are, be a good one");
// // };

// // };

//   // software development activities.
//   // 1> Establishing the requirement  => Tasks that program should perform.
//   // 2> Creating a Design => How to accomplish the requirements.

//   // 3> Implementing the design. => Process of writing the code.
//   // 4> testing. => Ensuring program will solve all the problems

//   // ----------------------OBJECT ORIENTED PROGRAMMING-------------------// 
//                 /*
//                 1. Object
//                 2. Attribute
//                 3. Method
//                 4. Class
//                 5. Encapsulation
//                 6. Inheritence 
//                 7. Polymorphism
//                 */
import java.util.Scanner;
//                 import java.util.Random;
public class Lincoln{
 


    public static void main(String[] arg) {
        
        int a, b,c;
        double discriminant, root1, root2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the coefficent of x squared: ");
        a = scan.nextInt();

        System.out.println(" Enter the coefficent of x: ");
        b = scan.nextInt();
        System.out.println(" Enter the constant: ");
        c= scan.nextInt();
        discriminant = Math.pow(b, 2)- (4 * a * c);
        root1 = ((-1*b)+ Math.sqrt(discriminant)/(2*a));
        root2 = ((-1*b)-Math.sqrt(discriminant)/ (2*a));
        System.out.println("Root #1: "+ root1);
        System.out.println("Root #2: " + root2);


    }
    
}
