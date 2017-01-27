package javanine;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExample {

    public static void main(String[] args) {
        collections();
    }

    private static void collections() {
        // new ImmutableCollections.List2<>(e1, e2)
        List<String> list = List.of("Hello", "World");

        // new ImmutableCollections.Set2<>(e1, e2)
        Set<String> set = Set.of("Hello", "Underworld");

        // ImmutableCollections.MapN<>(k1, v1, k2, v2)
        Map<String, String> map = Map.of("greetings", "Hello", "place", "Underworld");
        Map.Entry<String, String> map2 = Map.entry("greetings", "Hello World");
        Map<String, String> entries = Map.ofEntries(map2, map2);
    }

}
