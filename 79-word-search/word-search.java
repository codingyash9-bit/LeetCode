class Solution {
    public boolean exist(char[][] board, String word) {
        //this is a great code for backtracking in 2D data
        
        int rows = board.length; 
        int cols = board[0].length; 
        
        // backtrack(0,cols,rows,word,board);
        for(int i = 0 ; i < rows ; i++){ // EDITED: loop bounds updated to match the corrected row/col variables
            for(int j = 0 ; j < cols ; j++){ // EDITED: loop bounds updated
                if(backtrack(0,j,i,word,board)){
                    return true;
                }
            }
        }
        return false;
    }
    //first time :) using boolean backtrack instead of a void one
    public boolean backtrack(int index , int cols , int rows , String word ,char[][] board ){
            if(index == word.length()){
                return true;
            }
            //this logic is great
            if(cols < 0||rows < 0||cols >= board[0].length||rows >= board.length ||board[rows][cols] != word.charAt(index)){
                return false;
            }
            //nice logic for checking the initial position while exploring the others
            char temp = board[rows][cols];
            //to mark it as read
            board[rows][cols] = '#';

            boolean ans = 
            backtrack(index+1,cols+1,rows,word,board)||
            backtrack(index+1,cols-1,rows,word,board)||
            backtrack(index+1,cols,rows+1,word,board)||
            backtrack(index+1,cols,rows-1,word,board);

            //to re-go to the initial state or position after checking;
            board[rows][cols] = temp;

            return ans;
    }
}