class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>result = new ArrayList<>();
        List<Integer>current = new ArrayList<>();
        backtrack(nums,current,result);
        return result;
    }
    public void backtrack(int[]nums,List<Integer>current,List<List<Integer>>result){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = 0; i<nums.length ; i++){
            if(current.contains(nums[i])){
                continue;
            }
            //choose
            current.add(nums[i]);
            //explore
            backtrack(nums,current,result);
            //undo
            current.remove(current.size()-1);
        }
    }
}