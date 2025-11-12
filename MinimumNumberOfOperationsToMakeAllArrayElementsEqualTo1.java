class Solution {
    int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public int minOperations(int[] nums) {
        int count = 0;
        for (int n : nums){
            if (n == 1) count++;
        }
        if (count > 0) return nums.length - count;

        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++){
            int x = nums[i];
            for (int j = i + 1; j < nums.length; j++){
                x = gcd(x, nums[j]);
                if (x == 1) {
                    minLen = Math.min(j - i ,minLen);
                    break;
                }
            }
        }
        if (minLen == Integer.MAX_VALUE) return -1;
        return minLen + nums.length - 1;
    }
}

// Input: nums = [2,6,3,4]
// Output: 4
// Explanation: We can do the following operations:
// - Choose index i = 2 and replace nums[2] with gcd(3,4) = 1. Now we have nums = [2,6,1,4].
// - Choose index i = 1 and replace nums[1] with gcd(6,1) = 1. Now we have nums = [2,1,1,4].
// - Choose index i = 0 and replace nums[0] with gcd(2,1) = 1. Now we have nums = [1,1,1,4].
// - Choose index i = 2 and replace nums[3] with gcd(1,4) = 1. Now we have nums = [1,1,1,1].

// Input: nums = [2,10,6,14]
// Output: -1
// Explanation: It can be shown that it is impossible to make all the elements equal to 1.
