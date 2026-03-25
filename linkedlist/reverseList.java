// public class reverseList {
//     public  static class Node{
//         int val;
//         Node next;
//         Node(int val) {
//             this.val = val;
//             this.next = null;
//         }
//     }
//     public static void display(Node head) {
//         if(head==null) return;
//         System.out.print(head.val + " ");
//         display(head.next);
//         //System.out.print(head.val + " "); // for reverse order  
//     }
//     public static Node reverse(Node head){
//         if(head.next==null) return head;
//         Node newHead = reverse(head.next);
//         head.next.next = head;
//         head.next = null;
//         return newHead;
//     }
//     public static void main(String[] args) {
//         Node head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = new Node(4);
//         head.next.next.next.next = new Node(5);
//         System.out.println("Original List:");
//         display(head);
//         System.out.println();
//         Node r = reverse(head);
//         display(r);
//     }
// }

public class reverseList {
    public  static class Node{
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static void display(Node head) {
        if(head==null) return;
        System.out.print(head.val + " ");
        display(head.next);
        //System.out.print(head.val + " "); // for reverse order  
    }
    public static Node reverse(Node head){
        if(head.next==null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("Original List:");
        display(head);
        System.out.println();
        Node r = reverse(head);
        display(r);
    }
}
