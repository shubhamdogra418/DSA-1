
public class basics {
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            next=null;
        }
    }
        static void traverse(Node head) {
            // Node curr=head;
            while(head != null) {
                System.out.println(head.data);
                head=head.next;
            }
        }

        static void recursive (Node head) {
            // Node curr=head;
            //base condition
            if(head==null) return ;
                recursive(head.next);
                System.out.println(head.data+" ");
                
        } 
        
    
    public static void main(String[] args) {
        Node n1= new Node(10);
        Node n2= new Node(20);
        Node n3= new Node(30);
        Node n4= new Node(40);

        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;

        traverse(head);
        recursive(head);
    }    
}
