package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxOfStream {
    public static void main(String[] args) {
        List<Integer> numb = Arrays.asList(1, 2, 3, 4, 5555, 6, 7, 8, 9, 10);

        int max = numb.stream()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println("MAX=" + max);
    }
}
