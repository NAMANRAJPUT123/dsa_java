public class linkedList {
    public static void display(Node head){  // printing using recursion
        if(head==null) return;
        System.out.print(head.data+" ");   // 5 6 8 9
        display(head.next);
    }
    public static class Node{
        int data;          // store data of particular node
        Node next;         // store adderess of next node 
        Node(int data){
            this.data = data;
        }
        public static int lenght(Node head){  // length of linked list
            if(head==null) return 0;
            return 1 + lenght(head.next);  // 1 + next node ki length
        }
}
    public static void main(String[] args) {
        Node x = new Node(5);
        Node y = new Node(6);
        Node z = new Node(8);
        Node a = new Node(9);
        // 5 6  8  9
        x.next = y; // 5->6 8 9
        y.next = z; // 5->6->8 9
        z.next = a; // 5->6->8->9
        // System.out.println(x);      // linkedList$Node@372f7a8d
        // System.out.println(x.next); // linkedList$Node@2f92e0f4
        // System.out.println(y);      // linkedList$Node@2f92e0f4
        // System.out.println(y.next); // linkedList$Node@28a418fc
        // System.out.println(z);      // linkedList$Node@28a418fc
        // System.out.println(x.next.data); // 6
        //Node temp = x;
        // for(int i=1;i<=4;i++){  // for loop jb pta ho linkedlist ka size pta ho
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;  // next ko point krte rahega
        // }
        // while(temp!=null){  // 5 6 8 9 .
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;  // next ko point krte rahega
        // }
        System.out.println("Length of linked list is: "+Node.lenght(x)); // 4
        display(x);
    }
}
