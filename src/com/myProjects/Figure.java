package com.myProjects;

import java.util.stream.IntStream;

public class Figure {
    
    public static final String LINE_BREAK = "\n";
    public static final String EMPTY_SPACE  = " ";

    public static String square(final int size) {
        StringBuilder square = new StringBuilder();
        IntStream.iterate(1, i -> i + 1).limit(size)
                .forEach(value -> {
                    IntStream.iterate(1, i -> i + 1).limit(size)
                            .forEach(value1 -> square.append("*"));
                    square.append(LINE_BREAK);
                });
        System.out.println(square.toString());
        return square.toString();
    }

    public static String triangle(final int size) {
        StringBuilder triangle = new StringBuilder();
        IntStream.iterate(1, i -> i + 1).limit(size)
                .forEach(value -> {
                    triangle.append(drawSpaces(size, value));
                    triangle.append(drawLine(value));
                    triangle.append(LINE_BREAK);
                });
        System.out.println(triangle.toString());
        return triangle.toString();
    }

    public static String diamond(final int size) {
        StringBuilder diamond = new StringBuilder();
        IntStream.iterate(1, i -> i + 1).limit(size)
                .forEach(value -> {
                    diamond.append(drawSpaces(size, value));
                    diamond.append(drawLine(value));
                    diamond.append(LINE_BREAK);
                });
        IntStream.iterate(size - 1, j -> j - 1).limit(size - 1)
                .forEach(value -> {
                    diamond.append(drawSpaces(size, value));
                    diamond.append(drawLine(value));
                    diamond.append(LINE_BREAK);
                });
        System.out.println(diamond.toString());
        return diamond.toString();
    }

    private static StringBuilder drawSpaces(int size, int index) {
        StringBuilder spaces = new StringBuilder();
        IntStream.iterate(1, i -> i + 1).limit(size - index)
                .forEach(value -> spaces.append(EMPTY_SPACE));
        return spaces;
    }

    private static StringBuilder drawLine(int index) {
        StringBuilder stars = new StringBuilder();
        IntStream.iterate(1, i -> i +1).limit((index * 2) - 1)
                .forEach(value -> stars.append("*"));
        return stars;
    }
}
