package javanine;

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        Stream.builder().add("Hello").add("World").build()
                .forEach(System.out::println);

        Stream.of("Hello", "World")
                .forEach(System.out::println);

        System.out.println("==> TAKE WHILE");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .takeWhile(i -> i < 5)
                .forEach(System.out::println);

        System.out.println("==> DROP WHILE");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .dropWhile(i -> i < 5)
                .forEach(System.out::println);
    }

}
