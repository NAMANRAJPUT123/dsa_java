public class splitIntoTwo {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
// Helper class to return both lists
    public static class Pair {
        ListNode oddHead;
        ListNode evenHead;
        Pair(ListNode odd, ListNode even) {
            this.oddHead = odd;
            this.evenHead = even;
        }
    }
    public static Pair split(ListNode head) {
        if (head == null) return new Pair(null, null);
        ListNode odd = null, even = null;
        ListNode oddTail = null, evenTail = null;
        ListNode temp = head;
        while (temp != null) {
            if (temp.val % 2 == 0) {
                if (even == null) {
                    even = evenTail = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = evenTail.next;
                }
            } else {
                if (odd == null) {
                    odd = oddTail = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = oddTail.next;
                }
            }
            temp = temp.next;
        }
        // End both lists
        if (oddTail != null) oddTail.next = null;
        if (evenTail != null) evenTail.next = null;

        return new Pair(odd, even);
    }
    public static void printList(String label, ListNode head) {
        System.out.print(label + ": ");
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(5);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(12);
        l1.next.next.next.next = new ListNode(54);
        l1.next.next.next.next.next = new ListNode(63);
        Pair result = split(l1);
        printList("Odd List", result.oddHead);
        printList("Even List", result.evenHead);
    }
}

