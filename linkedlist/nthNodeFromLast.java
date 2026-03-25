public class nthNodeFromLast {
    public static Node nthNode(Node head,int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        if(n > size) return null;
        temp = head; // Reset temp to head
        for(int i = 1; i < size - n + 1; i++){  // Move temp to the (size-n+1)th node AP ka formula
            temp = temp.next;
        }
        return temp;
    }
    public static Node nthNode2(Node head,int n){
        Node slow = head;
        Node fast = head;
        for(int i=0;i<n;i++){
            if(fast == null) return null; // If n is greater than the length of the list
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow; // slow will be at the nth node from the end
    }
    public static Node deleteNthFromEnd(Node head,int n){
        Node slow = head;
        Node fast = head;
        for(int i = 1; i <=n; i++) {
            fast = fast.next;
            if(fast == null){  // If n is greater than the length of the list
                 head = head.next;
                 return head;
            }
        }
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // Now slow is at the node before the nth node from the end
        slow.next = slow.next.next; // Delete the nth node from the end
        return head; // Return the modified list
    }
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.next = b;
        b.next = c; 
        c.next = d;
        d.next = e;
        e.next = f;
        Node temp = nthNode(a, 3);
        if(temp != null) {
            System.out.println("The nth node from the last is: " + temp.data);
        } else {
            System.out.println("The nth node from the last does not exist.");
        }
        Node temp2 = nthNode2(a, 3);
        if(temp2 != null) {
            System.out.println("The nth node from the last using the second method is: " + temp2.data);
        } else {
            System.out.println("The nth node from the last does not exist using the second method.");
        }
        a = deleteNthFromEnd(a, 6); // now a is the head of the modified list
        System.out.println("After deleting the nth node from the end, the list is:");
        display(a);
    }
}