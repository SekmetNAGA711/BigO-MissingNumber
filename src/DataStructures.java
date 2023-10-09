import java.util.Stack;

public class DataStructures {

    public static void main(String[] args) {
        // Testing the functions with some sample inputs
        System.out.println(hasBalancedParentheses("((()))"));   // true: Every open bracket has a matching close
        System.out.println(hasBalancedParentheses(")("));       // false: They are in wrong order
        System.out.println(hasBalancedParentheses("(a+b)"));    // true: Properly enclosed with brackets
        System.out.println(hasBalancedParentheses("(a+b)("));   // false: Last open bracket doesn't close

        System.out.println(hasBalancedBrackets("{[()]}"));      // true: Properly enclosed with different brackets
        System.out.println(hasBalancedBrackets("{[(])}"));      // false: Square and round brackets are in the wrong order
        System.out.println(hasBalancedBrackets("<{[()]}>"));    // true: All brackets are properly matched
        System.out.println(hasBalancedBrackets("<{[(])}>"));   // false:  wrong order inside
    }

    // Function to check if a string has balanced parentheses only
    public static boolean hasBalancedParentheses(String str) {
        int count = 0;

        // Check each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                count++;   // Found an open bracket, increase the count
            } else if (ch == ')') {
                count--;   // Found a close bracket, decrease the count

                if (count < 0) {
                    // More closing brackets than opening ones found
                    return false;
                }
            }
        }
        // If count is zero, brackets are balanced
        return count == 0;
    }

    // Function to check if a string has balanced brackets of all types
    public static boolean hasBalancedBrackets(String str) {
        // Using a stack to keep track of open brackets
        Stack<Character> brackets = new Stack<>();

        // Check each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (isOpenBracket(ch)) {
                brackets.push(ch);  // Found an open bracket, push onto the stack
            } else if (isCloseBracket(ch)) {
                if (brackets.isEmpty() || !matches(brackets.pop(), ch)) {
                    // Stack is empty (no open bracket to match with) or
                    // the top bracket in the stack doesn't match with the current close bracket
                    return false;
                }
            }
        }
        // If stack is empty at the end, all brackets were balanced
        return brackets.isEmpty();
    }

    //  function to check if a character is an open bracket
    private static boolean isOpenBracket(char ch) {
        return ch == '(' || ch == '{' || ch == '[' || ch == '<';
    }

    //  function to check if a character is a close bracket
    private static boolean isCloseBracket(char ch) {
        return ch == ')' || ch == '}' || ch == ']' || ch == '>';
    }

    // function to check if two brackets match with each other
    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']') ||
                (open == '<' && close == '>');
    }
}


