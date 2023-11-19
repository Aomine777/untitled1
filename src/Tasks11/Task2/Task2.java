package Tasks11.Task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Aomine", "Bob", "Jack", "Alex");
        String result = namesIncorrectIndex(list);
        System.out.println(result);
    }

    public static String namesIncorrectIndex(List<String> list) {
        AtomicInteger at = new AtomicInteger(0);
        String collect = list.stream().map(String::toUpperCase)
                .sorted(Comparator.reverseOrder()).collect(Collectors.joining(", "));
        return collect;
    }
}