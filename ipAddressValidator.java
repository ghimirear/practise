import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class ipAddressValidator{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            // calling the method of MyRegex which returns true or false.
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {
    // regex pattern for correct IP.
    String pattern =
                    "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                    "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                    "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                    "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
                    // compiling alll the pattern together with the help of regex Pattern
        final Pattern IPv4_PATTERN = Pattern.compile(pattern);
        // making a function to check ip
         boolean isValidInet4Address(String ip){
             // if ip is null then return false no need to match
        if (ip == null) {
            return false;
        }
            // Matcher helps to match the pattern it takes the pattern and the value 
            //to the matcher function

        Matcher matcher = IPv4_PATTERN.matcher(ip);
 
        return matcher.matches();
    }
}