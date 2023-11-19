package Tasks11.Task3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        String result = extractAndSortNumbers(array);
        System.out.println("resul = " + result);
    }

    public static String extractAndSortNumbers(String[] array) {
        return Arrays.stream(array).flatMap(str -> Arrays.stream(str.split(",\\s*")))
                .map(Integer::parseInt).sorted()
                .map(String::valueOf).collect(Collectors.joining(", "));
    }
}
