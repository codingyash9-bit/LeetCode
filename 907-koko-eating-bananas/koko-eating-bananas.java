class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            long hours = 0;
            for (int pile : piles) {
                // FIX 1: Divide by mid, not 2, to get the correct ceiling division
                hours += (pile + mid - 1L) / mid; 
            }
            
            // FIX 2: mid could be the correct minimum speed, so do not exclude it
            if (hours <= h) {
                high = mid; 
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
