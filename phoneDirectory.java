//Complete this code or write your own from scratch
import java.util.*;
//import java.io.*;
import java.util.HashMap;
import java.util.Map;
class phoneDirectory{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<String, String>();
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            String phone = in.nextLine();
            phoneBook.put(name, phone);
        }
        while (in.hasNextLine()) {
            String name = in.nextLine();
            if (phoneBook.containsKey(name)) {
                System.out.println(name + "=" + phoneBook.get(name));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
	}
}




