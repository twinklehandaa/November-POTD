class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length - 1;
        int i = 0;
        while (i < n){
            if (bits[i] == 1) i += 2;
            else i++;
        }
        return i== n;
    }
}

// Input: bits = [1,0,0]
// Output: true
// Explanation: The only way to decode it is two-bit character and one-bit character.
// So the last character is one-bit character.

// Input: bits = [1,1,1,0]
// Output: false
// Explanation: The only way to decode it is two-bit character and two-bit character.
// So the last character is not one-bit character.
