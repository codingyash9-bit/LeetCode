class Solution {
    public String longestPalindrome(String s) {
        if(s.length() < 2){
            return s;
        }
        int start = 0;
        int end = 0;
        for(int i=0 ; i<s.length() ; i++){
            int len1 = expand(s,i,i);//for odd
            int len2 = expand(s,i,i+1);//for even
            int len = Math.max(len1,len2);
            if(len > end-start+1){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start,end+1);
    }
    public int expand(String s , int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        //-1 because the non palindrome character is detected when the value is incremented 
        //so that incremented value should be substracted or it will affect the length
        return right-left-1;
    }
}