package org.JavaFeatures;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Streams {
    // refer JavaStreamInterview repo
    public static void main(String[] args) {

        // 1. Stream creation
        // docs refer in notes
        Stream<Integer> stream = Stream.of(12, 34, 67);
        Stream.Builder<String> str = Stream.builder();
        str.accept("hi");
        str.add("helo");
        Stream<String> finalStream = str.build();
        finalStream.forEach(System.out::println);

        // 2. intermedia operation and terminate operation refer main methods in docs in note.
        Stream<Objects> st = Stream.empty();
        // refer docs in note.
    }
}
