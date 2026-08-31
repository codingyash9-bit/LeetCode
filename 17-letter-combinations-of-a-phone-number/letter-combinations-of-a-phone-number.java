class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }
        String[] map = {
            "",     
            "",     
            "abc",  
            "def",  
            "ghi",  
            "jkl",  
            "mno",  
            "pqrs", 
            "tuv",  
            "wxyz"  
        };

        backtrack(0, digits, map, new StringBuilder(), result);
        return result;
    }
    public void backtrack(int index,String digits,String[] map,StringBuilder current,List<String> result) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        int digit = digits.charAt(index) - '0';
        String letters = map[digit];
        for (int i = 0; i < letters.length(); i++) {
            // Choose
            current.append(letters.charAt(i));
            // Explore
            backtrack(index + 1, digits, map, current, result);
            // Undo
            current.deleteCharAt(current.length() - 1);
        }
    }
}