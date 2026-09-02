class Solution {
    public boolean isValid(String s) {
        Stack<Character> par = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            
            // Push opening brackets onto the stack
            if (a == '(' || a == '[' || a == '{') {
                par.push(a);
            } 
            // Handle closing brackets
            else {
                // If stack is empty, there is no matching opening bracket
                if (par.isEmpty()) {
                    return false;
                }
                
                // Pop the top of the stack and check if it matches the current closing bracket
                char top = par.pop();
                if ((a == ')' && top != '(') || 
                    (a == ']' && top != '[') || 
                    (a == '}' && top != '{')) {
                    return false;
                }
            }
        }
        
        // If the stack is empty at the end, all brackets were successfully matched
        return par.isEmpty();
    }
}