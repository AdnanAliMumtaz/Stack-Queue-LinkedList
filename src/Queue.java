// Queue, a linear data structure implemented using linked list.
public class Queue {

    Node front, rear;

    private class Node {
        int data;
        Node next;

        Node(int newData){
            this.data = newData;
            this.next = null;
        }
    }

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int newData) {

        // Making a new node
        Node newNode = new Node(newData);
        
        // First Node Condition
        if (this.rear == null) {
            this.front = newNode;
            this.rear = newNode;
            return;
        }

        // Added at the end of the queue
        this.rear.next = newNode;
        this.rear = newNode;
    }

    public void dequeue() {
        // Remove the node from the top of the queue
        if (!isEmpty())
        {
            this.front = this.front.next;
            if (this.front == null) {
                this.rear = null;
            }
        }
    }

    public int peek() {
        return this.front.data;
    }

    public boolean isEmpty() {
        return this.front == null && this.rear == null;
    }

    public void traversal() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        }
        else {
            Node temp = front;

            while (temp != null) { 
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("");
        }
    }

}
