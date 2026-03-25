// LeetCode Problem: Merge Two Sorted Linked Lists using extra space

// public class mergeTwoSortedLinkedList {
//       public static class ListNode {
//       int val;
//       ListNode next;
//       ListNode() {}
//       ListNode(int val) 
//       { this.val = val; 
//     }
//       ListNode(int val, ListNode next) 
//       { 
//         this.val = val; 
//         this.next = next;
//      }
//   }
//     public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode temp1 = list1;
//         ListNode temp2 = list2;
//         ListNode head = new ListNode(100);
//         ListNode temp = head;
//         while(temp1!=null && temp2!=null){
//             if(temp1.val<temp2.val){
//                 ListNode a = new ListNode(temp1.val);
//                 temp.next = a;
//                 temp = a;
//                 temp1 = temp1.next;
//             }
//             else{
//                 ListNode a = new ListNode(temp2.val);
//                 temp.next = a;
//                 temp = a;
//                 temp2 = temp2.next;
//             }
//         } 
//         if(temp1==null){
//             temp.next = temp2;
//         }
//         else {
//             temp.next = temp1;
//         }
//         return head.next;
// }
// public static void main(String[] args) {
//     ListNode l1 = new ListNode(1);
//     l1.next = new ListNode(3);
//     l1.next.next = new ListNode(5);

//     // Second Sorted Linked List: 2 -> 4 -> 6
//     ListNode l2 = new ListNode(2);
//     l2.next = new ListNode(4);
//     l2.next.next = new ListNode(6);

//     // Merge the two sorted linked lists
//     ListNode mergedList = mergeTwoLists(l1, l2);

//     // Print the merged linked list
//     ListNode current = mergedList;
//     while (current != null) {
//         System.out.print(current.val + " ");
//         current = current.next;
//     }
// }
// }

// without using extra space
public class mergeTwoSortedLinkedList {
      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) 
      { this.val = val; 
    }
      ListNode(int val, ListNode next) 
      { 
        this.val = val; 
        this.next = next;
     }
  }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head = new ListNode(100);
        ListNode temp = head;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                temp.next = temp1; // point to smaller value
                temp = temp1;
                temp1 = temp1.next; // move to next node in list1
            }
            else{
               temp.next = temp2; // point to smaller value
                temp = temp2;
                temp2 = temp2.next; // move to next node in list2
            }
        } 
        if(temp1==null){
            temp.next = temp2;
        }
        else {
            temp.next = temp1;
        }
        return head.next;
}
public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(5);
    l1.next.next = new ListNode(9);
    // Second Sorted Linked List: 12 -> 54 -> 66
    ListNode l2 = new ListNode(12);
    l2.next = new ListNode(54);
    l2.next.next = new ListNode(66);
    // Merge the two sorted linked lists
    ListNode mergedList = mergeTwoLists(l1, l2);
    // Print the merged linked list
    ListNode current = mergedList;
    while (current != null) {
        System.out.print(current.val + " ");
        current = current.next;
    }
}
}
