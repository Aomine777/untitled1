package Tasks9.MyArrayList;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("aaaa");
        myArrayList.add("ssss");
        myArrayList.add("dddd");

        myArrayList.remove(0);

        System.out.println("myArrayList.size() = " + myArrayList.size());

        System.out.println("myArrayList.get(3) = " + myArrayList.get(1));

        myArrayList.clear();

        System.out.println("myArrayList.size() = " + myArrayList.size());



    }

}
