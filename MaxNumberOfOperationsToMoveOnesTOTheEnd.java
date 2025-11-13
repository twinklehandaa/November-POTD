class Solution {
    public int maxOperations(String s) {
        int n = s.length();
        int count = 0;
        int count1 = s.charAt(0) - '0';
        for (int i = 1; i < n; i++){
            int x = s.charAt(i) - '0'; //convert char to number
            count1 += x;
            count += (x==0 && s.charAt(i-1) - '0' == 1) ? count1 : 0;
        }
        return count;
    }
}

// Input: s = "1001101"
// Output: 4
// Explanation:
// We can perform the following operations:
// Choose index i = 0. The resulting string is s = "0011101".
// Choose index i = 4. The resulting string is s = "0011011".
// Choose index i = 3. The resulting string is s = "0010111".
// Choose index i = 2. The resulting string is s = "0001111".
