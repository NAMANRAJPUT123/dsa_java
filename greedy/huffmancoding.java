import java.util.*;

// file name → huffmancoding.java
public class huffmancoding {

    // -------- Node Class --------
    static class Node {
        char data;
        int freq;
        Node left, right;

        Node(char data, int freq) {
            this.data = data;
            this.freq = freq;
            left = right = null;
        }
    }

    // -------- Comparator (Min Heap) --------
    static class Compare implements Comparator<Node> {
        public int compare(Node a, Node b) {
            return a.freq - b.freq;
        }
    }

    // -------- Print Huffman Codes --------
    static void printCodes(Node root, String code) {

        if (root == null)
            return;

        // print only leaf nodes
        if (root.data != '$')
            System.out.println(root.data + " : " + code);

        printCodes(root.left, code + "0");
        printCodes(root.right, code + "1");
    }

    // -------- Huffman Coding Algorithm --------
    static void huffmanCoding(char[] chars, int[] freq) {

        PriorityQueue<Node> minHeap =
                new PriorityQueue<>(new Compare());

        // insert nodes into heap
        for (int i = 0; i < chars.length; i++) {
            minHeap.add(new Node(chars[i], freq[i]));
        }

        // build Huffman Tree
        while (minHeap.size() > 1) {

            Node left = minHeap.poll();
            Node right = minHeap.poll();

            Node newNode =
                    new Node('$', left.freq + right.freq);

            newNode.left = left;
            newNode.right = right;

            minHeap.add(newNode);
        }

        // print Huffman Codes
        printCodes(minHeap.peek(), "");
    }

    // -------- Main Function --------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();

        char[] chars = new char[n];
        int[] freq = new int[n];

        System.out.println("Enter characters:");
        for (int i = 0; i < n; i++)
            chars[i] = sc.next().charAt(0);

        System.out.println("Enter frequencies:");
        for (int i = 0; i < n; i++)
            freq[i] = sc.nextInt();

        System.out.println("\nHuffman Codes:");
        huffmanCoding(chars, freq);

        sc.close();
    }
}