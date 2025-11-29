class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int num:nums){
            sum+=num;
        }
        return sum%k;
    }
}

// Take sum % k – this gives the remainder after dividing the sum by k.
// Return that remainder – it’s the minimum value you need to add (or remove) to make the sum divisible by k.

// Input: nums = [3,9,7], k = 5
// Output: 4
// Explanation:
// Perform 4 operations on nums[1] = 9. Now, nums = [3, 5, 7].
// The sum is 15, which is divisible by 5.
