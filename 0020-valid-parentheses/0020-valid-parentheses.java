class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // Iterate over each character in the string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // If the character is a closing bracket
            else {
                // If the stack is empty or the top of the stack doesn't match the closing bracket, return false
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If the stack is empty at the end, all brackets were matched, so return true
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution ValidParentheses = new Solution();

        // Test cases
        System.out.println(ValidParentheses.isValid("()"));       // Output: true
        System.out.println(ValidParentheses.isValid("()[]{}"));   // Output: true
        System.out.println(ValidParentheses.isValid("(]"));       // Output: false
        System.out.println(ValidParentheses.isValid("([)]"));     // Output: false
        System.out.println(ValidParentheses.isValid("{[]}"));     // Output: true
    }
}