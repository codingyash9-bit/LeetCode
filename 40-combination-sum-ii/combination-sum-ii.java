class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0,target,candidates,current,result);
        return result;
    }
    public void backtrack(int start,int target,int[]candidates,List<Integer>current,List<List<Integer>>result){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return ;
        }
        // if(target<0){
        //     return;
        // }
        for(int i= start ;i<candidates.length; i++ ){
            //we use this instead to solve duplicates issue
            if(i>start && candidates[i] == candidates[i-1]){
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            //add
            current.add(candidates[i]);
            //explore
            backtrack(i+1,target-candidates[i],candidates,current,result);
            //undo
            current.remove(current.size()-1);
        }

    }
}