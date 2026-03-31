import java.util.Stack;

public class ValidParentheses {

    // Function to check if parentheses are valid
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else {
                if (stack.isEmpty() || stack.pop() != c) return false;
            }
        }
        
        return stack.isEmpty();
    }

    // Main method to test the function
    public static void main(String[] args) {
        String[] testCases = {
            "()",
            "()[]{}",
            "(]",
            "([)]",
            "{[]}"
        };

        for (String test : testCases) {
            System.out.println("Input: " + test + " → " + isValid(test));
        }
    }
}