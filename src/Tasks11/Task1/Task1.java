package Tasks11.Task1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Aomine", "Bob", "Jack", "Alex");
        String result = namesIncorrectIndex(list);
        System.out.println(result);
    }

    public static String namesIncorrectIndex(List<String> list) {
        AtomicInteger at = new AtomicInteger(0);
        String collect = list.stream()
                .filter(s -> {
                    return at.incrementAndGet() % 2 != 0;
                }).map(s -> (at.get()) + ". " + s)
                .collect(Collectors.joining(", "));
        return collect;
    }
}
