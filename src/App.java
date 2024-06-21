
public class App {
    public static void main(String[] args) throws Exception {
        
        ///////////////LinkedList
        linkedList myLinkedList = new linkedList();
        myLinkedList.insertAtFront(1);
        myLinkedList.insertAtFront(2);
        myLinkedList.insertAtFront(3);
        myLinkedList.insertAtFront(4);
        myLinkedList.insertAtFront(5);
        myLinkedList.insertAtIndex(1, 555);
        myLinkedList.insertAtFront(6);
        myLinkedList.insertAtFront(7);
        myLinkedList.insertAtFront(8);
        
        myLinkedList.traversal();





        // /////////////STACK
        // // Making stack
        // Stack myStack = new Stack();

        // // Adding values to the top of the stack
        // myStack.push(1);
        // myStack.push(2);
        // myStack.push(3);
        // myStack.push(4);
        // myStack.push(5);

        // System.out.println("Stack Before;");
        // myStack.traversal();

        // // Removing values from the top of the stack
        // myStack.pop();
        // myStack.pop();
        // myStack.pop();

        // // Displaying the stack
        // System.out.println("Stack After:");
        // myStack.traversal();

        // System.out.println("");
        // System.out.println("");

        // ///////////////Queue
        // // Making the queue
        // Queue myQueue = new Queue();

        // // Adding values to the end of the queue
        // myQueue.enqueue(1);
        // myQueue.enqueue(2);
        // myQueue.enqueue(3);
        // myQueue.enqueue(4);
        // myQueue.enqueue(5);

        // System.out.println("Queue Before;");
        // myQueue.traversal();

        // // Removing values from the top of the queue
        // myQueue.dequeue();
        // myQueue.dequeue();
        // myQueue.dequeue();

        // System.out.println("Queue After:");
        // myQueue.traversal();
    }
}
