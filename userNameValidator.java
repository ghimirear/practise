import java.util.Scanner;
class usernameValidator {
    /*
     * Write regular expression here.
     */
    // start with alphabet >8 and >32
    public static final String regularExpression = "[a-zA-Z](\\w){7,29}";
}


 class solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(usernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
