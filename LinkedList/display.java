package LinkedList;
public class display {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        // Node head = new Node(10);
        // //Node temp = head;//shallow copy
        // Node temp=new Node(10); // deep copy

        // System.out.println(head);
        // System.out.println(temp);

        // System.out.println(head.val);
        // System.out.println(temp.val);
        Node a=new Node(10);
        Node b=new Node(100);
        Node c=new Node(110);
        Node d=new Node(102);
        Node e=new Node(105);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        Node temp=a;
        for(int i=1; i<=5; i++){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}