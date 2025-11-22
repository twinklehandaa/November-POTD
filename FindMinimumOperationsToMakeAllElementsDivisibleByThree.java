class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++){
            int rem = nums[i]%3;
            if (rem > 0) count++;
        }
        return count;
    }
}
// Input: nums = [1,2,3,4]
// Output: 3
// Explanation:
// All array elements can be made divisible by 3 using 3 operations:
// Subtract 1 from 1.
// Add 1 to 2.
// Subtract 1 from 4.
