import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class linkedList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int length = sc.nextInt();
        for(int i =0; i<length; i++){
            int value = sc.nextInt();
            list.add(value);
            //
            
        }
        //sc.nextLine();
        // System.out.println(list);
        int query = sc.nextInt();
        // System.out.println(query);
        for(int k=0; k<query; k++){
            String Q = sc.next();
            // System.out.println(Q);
            if(Q.equals("Insert")){
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } else{int index = sc.nextInt();
                list.remove(index);
                }
        }
         sc.close();
        
        // lets print the linkedList array
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        
        
    }
}
