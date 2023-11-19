package Tasks11.Task5;

import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Task5 {
    public static void main(String[] args) {
        Stream<Integer> firstStream = Stream.of(1, 2, 3, 4);
        Stream<Integer> secondStream = Stream.of(5, 6, 7);
        Stream<Integer> zippedStream = zip(firstStream, secondStream);
        zippedStream.forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Spliterator<T> firstSpliterator = first.spliterator();
        Spliterator<T> secondSpliterator = second.spliterator();
        Spliterator<T> zippedSpliterator = new Spliterators.AbstractSpliterator<T>(
                Long.min(firstSpliterator.estimateSize(), secondSpliterator.estimateSize()), Spliterator.ORDERED) {
            @Override
            public boolean tryAdvance(java.util.function.Consumer<? super T> action) {
                boolean hadNextInFirst = firstSpliterator.tryAdvance(action);
                boolean hadNextInSecond = secondSpliterator.tryAdvance(action);
                return hadNextInFirst || hadNextInSecond;
            }
        };
        return StreamSupport.stream(zippedSpliterator, false);
    }
}