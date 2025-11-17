class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count = k;
        for (int i = 0; i<nums.length; i++){
            if ( nums[i] == 1 ){
                if (count < k) return false;
                count = 0;
            }
            else count++;
        }
        return true;
    }
}

// Input: nums = [1,0,0,0,1,0,0,1], k = 2
// Output: true
// Explanation: Each of the 1s are at least 2 places away from each other.
