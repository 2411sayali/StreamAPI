package org.example;

import java.util.Arrays;
import java.util.List;

public class CountStringStartWith {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Cherry", "Banana", "Coconut", "Berry", "Apple", "Orange");

        long count = fruits.stream()
                .filter(fruit->fruit.startsWith("A"))
                .count();
        System.out.println(count);
    }
}
