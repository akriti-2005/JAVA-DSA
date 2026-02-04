package LinkedList;

    class Node{ // parameteraized constructor
    int val;
    Node next;
    Node(int val){
    this.val=val;
    //this.next=null; by default in java
}

    public static void main(String[] args){
        Node a=new Node(10);// head node
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        System.out.println(a);
        System.out.println(b);
        a.next=b;
        b.next=c;
        c.next=d;// linking
        d.next=e;
        // System.out.println(a.val);
        // System.out.println(a.next);
        // System.out.println(c.next);
        System.out.println(a.val);
        // System.out.println(b.val);
        // System.out.println(c.val);
        // System.out.println(d.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
    }
}
