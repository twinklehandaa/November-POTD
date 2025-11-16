class Solution {
    public int numSub(String s) {
        int count = 0;
        int total = 0;
        int mod = 1000000007;
        for (int i = 0 ; i < s.length(); i++){
            if (s.charAt(i)=='1') count++;
            else count = 0;
            total = (total + count) % mod;
        }
        return total;
    }
}

// Input: s = "0110111"
// Output: 9
// Explanation: There are 9 substring in total with only 1's characters.
// "1" -> 5 times.
// "11" -> 3 times.
// "111" -> 1 time.
