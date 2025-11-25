class Solution {
    public int smallestRepunitDivByK(int k) {
        int rem = 0;
        for (int i = 1; i<=k; i++){
            rem = (rem * 10 + 1) % k;
            if (rem == 0) return i;
        }
        return -1;
    }
}

// Input: k = 3
// Output: 3
// Explanation: The smallest answer is n = 111, which has length 3.
