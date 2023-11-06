package Tasks9.MyHashMap;

public class TestMyHashMap {
    public static void main(String[] args) {
        MyHashMap<String,Integer> myHashMap = new MyHashMap();
        myHashMap.put("asd1",1);
        myHashMap.put("asd2",2);
        myHashMap.put("asd3",3);
        myHashMap.put("asd4",4);
        myHashMap.put("asd5",5);
        myHashMap.put("asd6",6);

        System.out.println("myHashMap.get(\"asd1\") = " + myHashMap.get("asd1"));

        myHashMap.remove("asd1");
        System.out.println("myHashMap.size() = " + myHashMap.size());
        myHashMap.clear();
        System.out.println("myHashMap.size() = " + myHashMap.size());

    }


}
