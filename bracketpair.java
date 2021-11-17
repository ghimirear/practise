import java.util.*;
class bracketpair{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            System.out.println(balanced(input));
		}
		
	}
    public static boolean balanced(String input){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            if(c=='['|| c=='(' || c=='{'){
                stack.push(c);
            }else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}




