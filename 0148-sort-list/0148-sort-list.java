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
    public ListNode sortList(ListNode head) {
        if(head==null) return head;
        ListNode temp = head;
        int count=0;
        while(temp!=null){
            temp = temp.next;
             count++;
        }
        return mergeSort(head,count);
        
    }
    public ListNode mergeSort(ListNode list,int length){
        if(length==1) return list;
        int k = length/2;
        ListNode prev = list;
        ListNode cur = list;
        for(int i=0;i<k;i++){
            prev=list;
            list=list.next;
        }
        prev.next = null;
        ListNode left = mergeSort(cur,k);
        ListNode right = mergeSort(list,length-k);
        return merge(left,right);
    }
    public ListNode merge(ListNode left,ListNode right){
        ListNode temp = new ListNode();
        ListNode dummy = temp;
        while(left!=null && right!=null){
            if(left.val<right.val){
                temp.next = left;
                left = left.next;
            }
            else{
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        if(left!=null) temp.next = left;
        if(right!=null) temp.next=right;
        return dummy.next;
    }
}