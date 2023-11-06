package Tasks9.MyLinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("String1");
        myLinkedList.add("String2");
        myLinkedList.add("String3");
        myLinkedList.add("String4");
        myLinkedList.add("String5");
        myLinkedList.add("String6");

        myLinkedList.remove(0);

        System.out.println("myLinkedList.size() = " + myLinkedList.size());

        System.out.println("myLinkedList.get(0) = " + myLinkedList.get(0));

        myLinkedList.clear();

        System.out.println("myLinkedList.size() = " + myLinkedList.size());

    }
}
