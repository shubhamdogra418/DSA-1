class Node {
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next=null;
    }
}

class insertion {
//TAVERSING THE LINKED LIST
    static void traverse (Node head) {
        if(head == null) return;
        Node curr=head;
        while( curr != null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
        } System.out.println();
    }

//RECURSIVELY TRAVERSING THE LINKED LIST
    static void recursive(Node head) {
        if (head==null) return;
        Node curr=head;
        // recursive(curr.next); //backwards
        System.out.print(curr.data+" ");
        recursive(curr.next); //from front
    } 

//INSERTION AT THE KFIRST POSITION
    static Node addFirst( Node head, int data) {
        Node temp= new Node(data);
        if(head==null) {
            head=temp;
        } 
        temp.next=head;
        return temp; 
    }

//INSERTION AT THE LAST POSITION
    static Node addLast(Node head, int data) {
        Node temp= new Node(data);
        if(head==null) return temp;
        Node curr=head;
        while(curr.next !=null) {
            curr=curr.next; 
        } curr.next=temp;
        return head;
    }

//INSERTION AT THE GIVEN POSITION
    static Node insertPos(Node head, int data,int pos) {
        Node temp=new Node (data);
        if(pos == 1 && head ==null) {
            head=temp;
        } 
        int i=1;
        Node curr= head;
        while (i < pos-1) {
            curr=curr.next;
            i++;
        } 
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }

//DELETE FIRST NODE FROM THE LINKED LIST
    static Node removeFirst (Node head) {
        if(head==null) return null;
        head=head.next;
        return head;
    }

//DELETE LAST NODE 
    static Node removeLast (Node head) {
        if(head == null) return null;
        Node curr=head;
        while(curr.next.next != null) {
            curr=curr.next;
        } curr.next=null;
        return head;
    }

//DELETE FROM GIVEN POSITION
    static Node removePos (Node head, int pos) {
        if(pos==0) {
            head=head.next;
            return head;
        }
        Node curr=head;
        for(int i=0;i<pos-1;i++) {
            curr=curr.next;
        } curr.next=curr.next.next;
        return head;
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


        traverse(head);
        // head= addFirst(head, 40);
        // head= addLast(head, 60);
        // head= insertPos(head, 25, 3);
        // head= removeFirst(head);
        // head= removeLast(head);
        head= removePos(head, 3);
        traverse(head);
    }
}