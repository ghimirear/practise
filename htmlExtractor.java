import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.regex.Pattern; 

public class htmlExtractor{
	public static void main(String[] args){
		// final String regularExpression ="<([A-Z][A-Z0-9]*)\b[^>]*>(.*?)</\1>";
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
            boolean matchFound = false;
			Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = p.matcher(line);
          	//Write your code here
			 while (m.find()) {

            // get the matching group
            String codeGroup = m.group(2);
      
            // print the group
            System.out.println(codeGroup);
            matchFound = true;
            }if(!matchFound) System.out.println("None");
			testCases--;
		}
        in.close();
	}
}




