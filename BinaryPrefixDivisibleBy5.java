class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int val = 0;

        for (int n : nums){
            val = ((val << 1) + n) % 5;
            ans.add(val == 0);
        }

        return ans;
    }
}

// Input: nums = [0,1,1]
// Output: [true,false,false]
// Explanation: The input numbers in binary are 0, 01, 011; which are 0, 1, and 3 in base-10.
// Only the first number is divisible by 5, so answer[0] is true.
