import java.util.Stack;

public class ValidParentheses {
    public boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(': stack.push('('); break;
                case '{': stack.push('{'); break;
                case '[': stack.push('['); break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{')
                        return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
