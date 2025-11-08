class Solution {
    public int minimumOneBitOperations(int n) {
        int x = 0;
        while (n>0){
            x = x ^ n;
            n = n>>1;   //we repeatedly XOR n with right-shifted copies of itself until the number becomes 0.
        }
        return x;
    }
}

// Input: n = 6
// Output: 4
// Explanation: The binary representation of 6 is "110".
// "110" -> "010" with the 2nd operation since the 1st bit is 1 and 0th through 0th bits are 0.
// "010" -> "011" with the 1st operation.
// "011" -> "001" with the 2nd operation since the 0th bit is 1.
// "001" -> "000" with the 1st operation.
