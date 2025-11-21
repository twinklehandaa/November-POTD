class Solution {
    public int countPalindromicSubsequence(String s) {
       int count= 0;
       int n = s.length();
       for (char ch = 'a'; ch<='z'; ch++){
        int first = s.indexOf(ch);
        int last = s.lastIndexOf(ch);

        if (first == -1 || first == last) continue;
        boolean[] found = new boolean[26];
        for (int i = first + 1; i < last; i++){
            found[s.charAt(i) - 'a'] = true;
        }
        for (int i = 0; i < 26; i++) {
            if (found[i]) count++;
        }
       }
       return count;
    }
}

// Input: s = "aabca"
// Output: 3
// Explanation: The 3 palindromic subsequences of length 3 are:
// - "aba" (subsequence of "aabca")
// - "aaa" (subsequence of "aabca")
// - "aca" (subsequence of "aabca")
