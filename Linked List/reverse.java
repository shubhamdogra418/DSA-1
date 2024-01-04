class Node {
    int data;
    Node next;
    Node(int data) {
        this.data=data;
    }
}

public class reverse {
    static void traverse (Node head) {
        if(head==null) return;
        Node curr= head;
        while(curr != null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
        } System.out.println();
    }

//REVERSING A LINKED LIST
    static void reverse (Node head) {
        if(head== null) return;
        reverse(head.next);
        System.out.print(head.data+" ");
    }
//ITERATIVE a linked list
    static Node revList (Node head) {
        if(head == null) return null;
        Node prev= null;
        Node forw=null;
        Node curr=head;
        while (curr != null) {
            forw= curr.next;
            curr.next=prev; 
            prev=curr;
            curr=forw;
        } return prev;

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

        // traverse(head);
        // reverse(head);
        head=revList(head);
        traverse(head);
    }
}
