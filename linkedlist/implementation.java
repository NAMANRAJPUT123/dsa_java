public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size = 0;
        void inserAtBeginning(int val){
            Node temp = new Node(val);
            if(head == null){  // if there is no node initially
                head = temp;
                tail = temp;
            }else{
                temp.next = head; 
                head= temp;
            }
            size++;
        }
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){  // if there is no node initially
                head = temp;
                tail = temp;
            }else{
                tail.next = temp; // last node ka next new node ko point krta hai
                tail = temp; // tail ko new node pe point krte hai
            }
            size++; 
        }
        // insert at any index
        void insertAtIndex(int index, int val){
            if(index == 0){
                inserAtBeginning(val);
                return;
            }
            Node temp = new Node(val);
            Node current = head;
            for(int i=0; i<index-1 && current!=null; i++){
                current = current.next;
            }
            if(current == null) return; // index is out of bounds
            temp.next = current.next; // pehele temp ko jodhna hai agar pehele current temp se jodh diya toh curent next se tut jaega
            current.next = temp;
            if(temp.next == null) tail = temp; // update tail if inserted at end
            size++;
        }
        // getElement at index
        int getElementAtIndex(int index){
            Node current = head;
            for(int i=0;i<index && current!=null;i++){
                current = current.next;
            }
            if(current == null) return -1; // index is out of bounds
            return current.data;
        }
        // delete at index
        void deleteAtIndex(int index){
            if(index == 0 && head != null){ // delete first node
                head = head.next; // head ko he aage badha diya
                if(head == null) tail = null; // if list becomes empty
                size--;
                return;
            }
            Node current = head;
            for(int i=0; i<index-1 && current!=null; i++){
                current = current.next;
            }
            if(current == null || current.next == null) return; // index is out of bounds
            current.next = current.next.next; // skip the node to be deleted bho uske next ko current ka next bana diya
            if(current.next == null) tail = current; // update tail if last node is deleted
            size--;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist(); 
        ll.insertAtEnd(4);
        //ll.display();              // 4
        ll.insertAtEnd(6);
        //ll.display();              // 4 6
        ll.inserAtBeginning(28);
        //ll.display();              // 28 4 6
        ll.insertAtIndex(1, 10);
        //ll.display();              // 28 10 4 6
       // System.out.println(ll.getElementAtIndex(3)); // returns 6
        System.out.println(ll.size);
    }
}
