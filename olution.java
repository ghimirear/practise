import java.util.Scanner;

public class olution {
    // checking for anagrams
    static boolean isAnagram(String a, String b) {
        // Complete the function
         String s = a.toLowerCase();
   String t = b.toLowerCase();
   char A[]=s.toCharArray();
   char B[] = t.toCharArray();
   char charA[]=new char[s.length()];
   char charB[] = new char[t.length()];
   int count=0;
   int nextCount =0;
   for(int i=0;i<A.length;i++){
       count=0;
       // taking each letter and sorting them in an order in an character array.
       for(int j=0;j<A.length;j++)
       {
       if(A[i]>A[j])
       {
       count++;
       }
       }
       charA[count]=A[i];
   }
   
     // for another string
      for(int k=0;k<B.length;k++)
      {
          nextCount=0;
          for(int l=0;l<B.length;l++)
          {
          if(B[k]>B[l])
          {
          nextCount++;
          }
          }
          charB[nextCount]=B[k];
      }
// converting back to string again
    String stringA = new String(charA);
   String stringB = new String(charB);
   // comparing both string are equal or not
   if (stringA.compareTo(stringB)==0) {
     return true;
   } else return false;
      
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

