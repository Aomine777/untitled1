package Tasks9.MyQueue;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue();

        myQueue.add("String1");
        myQueue.add("String2");
        myQueue.add("String3");
        myQueue.add("String4");
        myQueue.add("String5");
        myQueue.add("String6");

        System.out.println("myQueue.size() = " + myQueue.size());

        System.out.println("myQueue.peek() = " + myQueue.peek());
        System.out.println("myQueue.poll() = " + myQueue.poll());
        myQueue.clear();
        System.out.println("myQueue.size() = " + myQueue.size());
    }
}
