class Solution {
 public ListNode mergeTwoLists(ListNode l1, ListNode l2){ 
   ListNode head = new ListNode (0);
   ListNode ans = head;
   
 while(l1 != null ¦¦ l2! = null)
 {#if(l1 == null)
 {
   if(l1 == null)
   {
     ans.ext = l2;
     break;
   }
   if(l2 == null)
   {
     ans.next = l1;
     break;
   }
   
   if(l1.val <= l2.val)
   {
     ans.next = new ListNode(l1.val);
     l1 = l1.next;
   }
   
   else if (l2.val < l1.val)
   {
     ans.next = new ListNode(l2.val);
     l2 = l2.next;
   }
   ams = ans.next;
 }
  return head.next;
 }
}
