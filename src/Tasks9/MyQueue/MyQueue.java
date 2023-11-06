package Tasks9.MyQueue;


public class MyQueue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("The queue is empty.");
        }
        return front.data;
    }

    public T poll() {
        if (isEmpty()) {
            throw new IllegalStateException("The queue is empty.");
        }
        T value = front.data;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
