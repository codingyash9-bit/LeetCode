class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(n,result,new StringBuilder(),0,0);
        return result;
    }
    public void backtrack(int n , List<String> result ,StringBuilder current, int left , int right){
        if(current.length() == n*2){
            //is important to do toString() because the data is scatered in StringBuilder with indexing
            result.add(current.toString());
            return;
        }
        if(left < n){
            //addition
            current.append("(");
            //backtracking
            backtrack(n,result,current,left+1,right);
            //undo
            current.deleteCharAt(current.length() -1);
        }
        if(right < left){
            //addition
            current.append(")");
            //backtracking
            backtrack(n,result,current,left,right+1);
            //undo
            current.deleteCharAt(current.length() -1);
        }
    }
}