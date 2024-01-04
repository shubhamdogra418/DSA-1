class Node {
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next=null;
    }
}

class middle {
//MIDDLE OF THE LINKED LIST
    static Node findMiddle(Node head) {
        if(head == null || head.next == null) return null;
        Node slow=head;
        Node fast= head;
        while( fast != null && fast.next != null) {
            slow=slow.next;
            fast= fast.next.next;
        } return slow;
    }

// LINKED LIST CYCLE
    static boolean cycle (Node head) {
        Node slow=head;
        Node fast= head;
        while( fast != null && fast.next != null) {
            slow=slow.next;
            fast=fast.next.next;
            if(fast == slow) return true;
        } return false;
    }

    static void traverse (Node head) {
        if(head==null) return;
        Node curr= head;
        while(curr != null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
        } System.out.println();
    }

    public static void main(String[] args) {
        Node n1= new Node (10);
        Node n2= new Node (20);
        Node n3= new Node (30);
        Node n4= new Node (40);
        Node n5= new Node (50);

        Node head= n1;
        n1.next= n2;
        n2.next= n3;
        n3.next= n4;
        n4.next= n5;

        // head= findMiddle(head);
        System.out.println(cycle(head));
        traverse(head);
        
    }
}