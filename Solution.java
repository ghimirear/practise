// import java.util.Scanner;
// import java.util.Stack;
// public class Solution {



//     public static String getSmallestAndLargest(String s, int k) {
//         // String smallest = "";
//       String currentString = s.substring(0, k);
//         String smallest = currentString;
//         String largest = currentString;
        
//         // Complete the function
//         // 'smallest' must be the lexicographically smallest substring of length 'k'
//         // 'largest' must be the lexicographically largest substring of length 'k'
//         Stack < String > computingArray = new Stack < String > ();
        
//         for(int i=0; i<=s.length(); i++){
//             computingArray.add(s.substring(i,k));
//             k++;
//             if(k>s.length()) break;
//         }
         
//          for(String array :computingArray){
//              if(largest.compareTo(array)<0)largest = array;
//              else if(smallest.compareTo(array)>0)smallest= array; 
//          }
//          System.out.println(computingArray);
//         return smallest + "\n" + largest;
//     }


//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String s = scan.next();
//         int k = scan.nextInt();
//         scan.close();
      
//         System.out.println(getSmallestAndLargest(s, k));
       
//     }
// }

// import java.util.Scanner;

// public class Solution {



//     public static String getSmallestAndLargest(String s, int k) {
//         // String smallest = "";
//       String currentString = s.substring(0, k);
//         String smallest = currentString;
//         String largest = currentString;
        
//         // Complete the function
//         // 'smallest' must be the lexicographically smallest substring of length 'k'
//         // 'largest' must be the lexicographically largest substring of length 'k'
//         for(int i=0; i<s.length(); i++){
//             currentString = s.substring(i,k);
//             //System.out.println(currentString);
//             k++;
            
//             if(largest.compareTo(currentString)<0) largest=currentString;
//             else if (smallest.compareTo(currentString)>0) smallest=currentString;
//             if(k>s.length())break;
//         }
        
//         return smallest + "\n" + largest;
//     }


//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String s = scan.next();
//         int k = scan.nextInt();
//         scan.close();
      
//         System.out.println(getSmallestAndLargest(s, k));
//     }
// }
// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         String A=sc.next();
//         /* Enter your code here. Print output to STDOUT. */
// lets initiliaze the string first on a name reverse
//         String reverse = "";
//         for(int i= A.length()-1; i>=0; i--){
    // assigning the value to reverse string by taking character starting from the end of string
//           reverse+=A.charAt(i);
//         }
//         //System.out.println(reverse);
// checking the values of both reversed and original one 
//         if(A.equals(reverse))System.out.println("Yes");
//          else System.out.println("No");
//     }
// }


import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        if(s.length()==0){
            System.out.println(0);
        } else{
        // Write your code here.
        String[] splited = s.split("\\s*[^a-zA-Z]+\\s*");
        System.out.println(splited.length);
        for(int i =0; i<splited.length; i++){
            System.out.println(splited[i]);
            } 
        scan.close();
    }}
}