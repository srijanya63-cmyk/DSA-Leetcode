import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        // Stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse each character of the string
        for (char c : s.toCharArray()) {

            // If opening bracket, push into stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // If closing bracket
            else {
                // If stack empty, no matching opening bracket
                if (stack.isEmpty())
                    return false;

                // Pop top opening bracket
                char top = stack.pop();

                // Check if popped bracket matches closing bracket
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets matched correctly
        return stack.isEmpty();
    }
}

//Time complexity- O(n)
//Space complexity-O(N)