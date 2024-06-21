
// Stack, a linear data structure implemented using linked list.
public class Stack {
    Node top;


    private class Node {
        int data;
        Node next;
    }

    public Stack(){
        this.top = null;
    }

    public void push(int newData){
        
        // Created a new node
        Node newNode = new Node();
        newNode.data = newData;
        newNode.next = top;

        // Assigned the new node to the top  
        top = newNode;
    }

    public void pop() {
        if (!isEmpty()) {
            // Pop the top node
            top = top.next;
        }
    }

    public Node peekElement() {
        return top;
    }

    public int peekData() {
        if (isEmpty())
        {
            return -1;
        }
        else {
            return top.data;
        }
    }

    public void traversal() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("");
        }
    }

    private boolean isEmpty() {
        return this.top == null;
    }
}
