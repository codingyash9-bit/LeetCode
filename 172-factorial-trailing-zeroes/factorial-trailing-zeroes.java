class Solution {
    public int trailingZeroes(int n) {
        int count=0; 
        while(n>0){
            //i mean its a great logic man :)
            n = n/5;
            count+=n;
        }
        return count;
    }
}
//btw my logic was great but for limited cases :(
// class Solution {     public int trailingZeroes(int n) {         int ans = factorial(n);         int count = 0;         while(ans%10 == 0){             ans = ans/10;             count++;         }         return count;     }     public int factorial(int n){         if(n == 0){             return 1;         }         return n*factorial(n-1);     } }