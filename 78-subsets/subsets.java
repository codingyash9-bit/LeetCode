class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //is the main function where we call the backtracking function which backtracks the elements for permutations
        List<List<Integer>>result = new ArrayList<>();
        List<Integer>current = new ArrayList<>();
        backtrack(0,nums,current,result);
        return result;
    }
    public void backtrack(int start , int[]nums , List<Integer>current , List<List<Integer>>result){
        //adding of element
        result.add(new ArrayList<>(current));

        for(int i = start ; i<nums.length ; i++){
            //first step add the empty set then the other elements using same logic
            current.add(nums[i]);
            //backtracking 
            //i+1 ,so that zero is not backtracked again in the initial case
            backtrack(i+1,nums,current,result);
            //undo to check more possibilities
            current.remove(current.size()-1);
        }
    }
}