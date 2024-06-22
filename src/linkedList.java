
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

        
        // Condition: Index == 0
        if (index == 0) {
            insertAtFront(newData);
            return;
        }

        // Make the new node
        Node newNode = new Node(newData);
            
        // Condition: Index > 0
        Node temp = head;

        // Getting to the element
        for (int i=0; i<index-1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteionFromFront() {
        if (!isEmpty()) {
            head = head.next;
        }
    }

    public void deletionAtIndex(int index) {

        // Condition: 
        if (index == 0) {
            head = head.next;
        }

        // Condition: 
        Node temp = head;
        for (int i=0; i<index-1; i++) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void deletetionFromRear() {

        // If the linkedlist is empty
        if (isEmpty()) {
            return;
        }

        // If there is only one element to be deleted
        if (head.next == null) {
            head = null;
            return;
        }

        // Other Conditions
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
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
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("");
        }
    }    
}
