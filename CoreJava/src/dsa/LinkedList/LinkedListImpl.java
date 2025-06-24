package dsa.LinkedList;

// Node class
class Node{
    int data;
    Node next;
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class LinkedListImpl {
    Node head;
    // Insert node
    public void insert(int data){
        Node newNode = new Node(data,null);
        // If no LL already present
        if(head==null){
            head=newNode;
        }
        Node current = head;
        // Find the lastNode in LL
        while (current.next!=null){
           current=current.next;
        }
        current.next=newNode;
    }

    // Delete node
    public void delete(int key){
        // No LL
        if(head==null){
            return;
        }
        // Delete the node
        while (head.data==key){
            head=head.next;
            return;
        }
        Node curr=head;
        
    }

    // Display List

    // Search node



}
