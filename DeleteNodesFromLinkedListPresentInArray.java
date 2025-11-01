/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) set.add(num); //add each element in hashset

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = dummy; // start from the 0 node since checking next value
        
        while (temp.next!=null){
            if (set.contains(temp.next.val)) temp.next = temp.next.next;
            else temp = temp.next;
        }
        return dummy.next;
    } 
}

// Input: nums = [1,2,3], head = [1,2,3,4,5]
// Output: [4,5]
// Explanation:
// Remove the nodes with values 1, 2, and 3.
