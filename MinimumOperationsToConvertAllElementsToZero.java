class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        Stack<Integer> st = new Stack<>();

        for (int n: nums){
            while (!st.isEmpty() && st.peek() > n) st.pop();
            if (n==0) continue;
            if (st.isEmpty() || st.peek() < n) {
                count++;
                st.push(n);
            }
        }
        return count;
    }
}

// Input: nums = [3,1,2,1]
// Output: 3
