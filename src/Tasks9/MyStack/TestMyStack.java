package Tasks9.MyStack;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();

        myStack.push("String1");
        myStack.push("String2");
        myStack.push("String3");
        myStack.push("String4");
        myStack.push("String5");
        myStack.push("String6");

        myStack.remove(0);

        System.out.println("myStack.peek() = " + myStack.peek());

        System.out.println("myStack.pop() = " + myStack.pop());

        System.out.println("myStack.size() = " + myStack.size());

        myStack.clear();

        System.out.println("myStack.size() = " + myStack.size());

    }
}
