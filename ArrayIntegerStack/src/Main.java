public class Main {

    public static void main(String[] args) {
        IntegerStackInterface myStack = new ArrayIntegerStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println("--- IntegerArrayStack ---");
        System.out.println("Stack: " + myStack.toString());
        System.out.println("Initial size: " + myStack.size());
        System.out.println("Top: " + myStack.top());
        System.out.println("First pop: " + myStack.pop());
        System.out.println("Stack: " + myStack.toString());
        System.out.println("Second pop: " + myStack.pop());
        System.out.println("Stack: " + myStack.toString());
        System.out.println("Third pop: " + myStack.pop());
        System.out.println("Stack: " + myStack);
        System.out.println("Is it empty? " + myStack.isEmpty());
        System.out.println("------------------\n");

    }

}
