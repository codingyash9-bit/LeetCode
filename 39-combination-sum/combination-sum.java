class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>result = new ArrayList<>();
        List<Integer>current = new ArrayList<>();
        backtrack(0,target,candidates,current,result);
        return result;
    }
    public void backtrack(int start , int target , int[] candidates , List<Integer>current , List<List<Integer>>result){
        if(target == 0){
            //empty braces since we only have positive numbers
            result.add(new ArrayList<>(current));
            return;
        }
        if(target < 0){
            return;
        }
        for(int i = start; i < candidates.length ; i++){
            //add
            current.add(candidates[i]);
            //backtrack
            backtrack(i,target-candidates[i],candidates,current,result);
            //undo
            current.remove(current.size()-1);
        }
    }
}