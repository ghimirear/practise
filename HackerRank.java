// public class HackerRank {
    
// }
//import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class HackerRank {

// Write your code here
// static method and variables declaration.
static int B, H;
static boolean  flag = false;
static {
    Scanner scan = new Scanner(System.in);
    B = scan.nextInt();
    H = scan.nextInt();
    try{
        if(B<=0 || H<=0){
            throw new Exception("Breadth and height must be positive");
        } else flag = true ;
    }
    catch(Exception e){
        System.out.println(e);
    }
}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}
// converting integer to string with Integer.toString(int variable or number);
// import java.util.*;
// import java.security.*;
// public class Solution {
//  public static void main(String[] args) {

//   DoNotTerminate.forbidExit();

//   try {
//    Scanner in = new Scanner(System.in);
//    int n = in .nextInt();
//    in.close();
//    //String s=???; Complete this line below

//    //Write your code here
// checking whether the number is negative or positive if negative then multiply by -1 to make it positive;
//    if(n<0){
//        n = n * -1;
//    }
//    String s = Integer.toString(n);
   
//    if (n == Integer.parseInt(s)) {
//     System.out.println("Good job");
//    } else {
//     System.out.println("Wrong answer.");
//    }
//   } catch (DoNotTerminate.ExitTrappedException e) {
//    System.out.println("Unsuccessful Termination!!");
//   }
//  }
// }

// //The following class will prevent you from terminating the code using exit(0)!
// class DoNotTerminate {

//  public static class ExitTrappedException extends SecurityException {

//   private static final long serialVersionUID = 1;
//  }

//  public static void forbidExit() {
//   final SecurityManager securityManager = new SecurityManager() {
//    @Override
//    public void checkPermission(Permission permission) {
//     if (permission.getName().contains("exitVM")) {
//      throw new ExitTrappedException();
//     }
//    }
//   };
//   System.setSecurityManager(securityManager);
//  }
// }


// date formatter using localDate 
// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;
// import java.time.LocalDate;
// class Result {

//     /*
//      * Complete the 'findDay' function below.
//      *
//      * The function is expected to return a STRING.
//      * The function accepts following parameters:
//      *  1. INTEGER month
//      *  2. INTEGER day
//      *  3. INTEGER year
//      */

//     public static String findDay(int month, int day, int year) {

// LocalDate dt = LocalDate.of(year, month, day);
// return (dt.getDayOfWeek()).toString();
//     }

// }

// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//         String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

//         int month = Integer.parseInt(firstMultipleInput[0]);

//         int day = Integer.parseInt(firstMultipleInput[1]);

//         int year = Integer.parseInt(firstMultipleInput[2]);

//         String res = Result.findDay(month, day, year);

//         bufferedWriter.write(res);
//         bufferedWriter.newLine();

//         bufferedReader.close();
//         bufferedWriter.close();
//     }
// }

// currency formatting 
// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;
// import java.text.NumberFormat;
// import java.util.Locale;

// public class Solution {
    
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         double payment = scanner.nextDouble();
//         scanner.close();

//         // Write your code here.
//         Locale indianLocale = new Locale("en", "IN");
//         NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
//         NumberFormat india = NumberFormat.getCurrencyInstance(indianLocale);
//         NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
//         NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
//         System.out.println("US: " + us.format(payment));
//         System.out.println("India: " + india.format(payment));
//         System.out.println("China: " + china.format(payment));
//         System.out.println("France: " + france.format(payment));
//     }
// }

