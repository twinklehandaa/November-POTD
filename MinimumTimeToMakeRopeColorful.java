class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time = 0;
        int maxTime = neededTime[0];
        for (int i = 1; i < colors.length(); i++){
            if (colors.charAt(i) == colors.charAt(i - 1)){
                time += Math.min(neededTime[i], maxTime);
                maxTime = Math.max(maxTime, neededTime[i]);
            }
            else maxTime = neededTime[i]; // new color, reset
        }
        return time;
    }
}

// Input: colors = "abaac", neededTime = [1,2,3,4,5]
// Output: 3
// Explanation: In the above image, 'a' is blue, 'b' is red, and 'c' is green.
// Bob can remove the blue balloon at index 2. This takes 3 seconds.
// There are no longer two consecutive balloons of the same color. Total time = 3.
