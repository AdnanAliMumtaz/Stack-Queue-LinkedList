
public class App {
    public static void main(String[] args) throws Exception {
        
        ///////////////LinkedList
        // Making a linked list
        linkedList myLinkedList = new linkedList();

        // Adding elements at the front
        myLinkedList.insertAtFront(1);
        myLinkedList.insertAtFront(2);
        myLinkedList.insertAtFront(4);
        myLinkedList.insertAtFront(5);
        myLinkedList.insertAtFront(6);

        // Adding elements at the end
        myLinkedList.insertAtEnd(100);

        // Adding elements at the front again
        myLinkedList.insertAtFront(0);

        System.out.println("LinkedList Before:");
        myLinkedList.traversal();

        // Adding elements at specific positions
        myLinkedList.insertAtIndex(2, 3);

        // Removing elements from the linked list
        myLinkedList.deleteionFromFront();
        myLinkedList.deletionAtIndex(0);
        myLinkedList.deletetionFromRear();

        // Displaying all the linked list
        System.out.println("LinkedList After:");
        myLinkedList.traversal();

        System.out.println("");
        System.out.println("");







        
        
        /////////////STACK
        // Making stack
        Stack myStack = new Stack();

        // Adding values to the top of the stack
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        System.out.println("Stack Before:");
        myStack.traversal();

        // Removing values from the top of the stack
        myStack.pop();
        myStack.pop();
        myStack.pop();

        // Displaying the stack
        System.out.println("Stack After:");
        myStack.traversal();

        System.out.println("");
        System.out.println("");








        ///////////////Queue
        // Making the queue
        Queue myQueue = new Queue();

        // Adding values to the end of the queue
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);

        System.out.println("Queue Before;");
        myQueue.traversal();

        // Removing values from the top of the queue
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();

        System.out.println("Queue After:");
        myQueue.traversal();
    }
}
