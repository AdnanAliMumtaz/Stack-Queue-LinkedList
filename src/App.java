
public class App {
    public static void main(String[] args) throws Exception {
        
        // Making stack
        Stack myStack = new Stack();

        // Adding values to the top of the stack
        myStack.push(5);
        myStack.push(4);
        myStack.push(3);
        myStack.push(2);
        myStack.push(1);

        System.out.println("Stack Before;");
        myStack.traversal();

        // Removing values from the top of the stack
        myStack.pop();
        myStack.pop();
        myStack.pop();

        // Displaying the stack
        System.out.println("Stack After:");
        myStack.traversal();
    }
}
