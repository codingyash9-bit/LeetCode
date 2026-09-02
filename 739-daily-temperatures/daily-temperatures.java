class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> current = new Stack<>();
        int[] answers = new int[temperatures.length];

        for(int i = 0 ; i<temperatures.length ; i++){
            //instead of storing the temp we store there index
            int currentIndex = i;
            //use while instead of if because we need to traverse for each index
            while(!current.isEmpty() && temperatures[i] > temperatures[current.peek()]){
                //this should be inside while loop
                int prevIndex = current.peek();
                int ans = currentIndex-prevIndex;
                current.pop();
                //use prevIndex not i to store it at the correct location
                answers[prevIndex] = ans;
            }
            current.push(i);
        }
        return answers;
    }
}