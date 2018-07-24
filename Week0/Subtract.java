/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode subtract(ListNode A) {
        if(A==null)
            return A;
        ListNode curr= A;
        int len= 0;
        while(curr!= null){
            curr= curr.next;
            len++;
        }
        int mid= len/2;
        ListNode middle= A;
        for(int i=0; i<mid; i++){
            middle= middle.next;
        }
        ListNode current= null;
        if(len%2==0){
            current= middle;
        }
        else
            current= middle.next;
        
        ListNode previous= null;
        ListNode pointer= null;
        ListNode temp=reverse(current, previous, pointer);
        ListNode tempHead= temp;
        ListNode prev= A;
        while(temp!= null){
            prev.val= temp.val- prev.val;
            temp= temp.next;
            prev= prev.next;
        }
        reverse(tempHead, previous, pointer);
        return A;
    }
    public ListNode reverse(ListNode current, ListNode previous, ListNode pointer){
        while(current!= null){
            pointer= current.next;
            current.next= previous;
            previous= current;
            current= pointer;
        }
        return previous;
    }
}

