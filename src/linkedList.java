
public class linkedList {
    Node head;

    public linkedList() {
        this.head = null;
    }

    private class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtFront(int newData) {

        // Making the new node
        Node newNode = new Node(newData);

        // Adding the node at the front of the list
        newNode.next = head;
        this.head = newNode;
    }

    public void insertAtEnd(int newData) {
        
        // Making the new node
        Node newNode = new Node(newData);

        // Adding the node at the end of the list
        // Condition: Empty the linkedlist 
        if (isEmpty())
        {
            head = newNode;
            return;
        }

        // Condition: Other
        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtIndex(int index, int newData){

        // Make the new node
        Node newNode = new Node(newData);

        // Condition: Index == 0
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Condition: Index 0 >
        Node temp = head;
        for (int i=0; i<index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteion() {

    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void traversal() {
        if (isEmpty())
        {
            System.out.println("Linked List is empty!");
        }
        else {
            Node temp =  head;

            while (temp != null) 
            { 
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }    
}
