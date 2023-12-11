import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        // Iterate through each character in the string
        //simple loop - for (int i = 0; i < s.length(); i++) {char c = s.charAt(i);
        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push to stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If stack is empty, it means no matching opening bracket
                if (stack.isEmpty()) return false;
                char top = stack.pop(); // Get the top element of the stack
                // Check if the current closing bracket matches the top of the stack
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        // If stack is empty, all brackets were matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("(]")); // false
        System.out.println(validParentheses.isValid("{[]}")); // true
        System.out.println(validParentheses.isValid("[{]}")); // false
    }
}