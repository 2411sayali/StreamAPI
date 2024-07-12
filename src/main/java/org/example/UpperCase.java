package org.example;

import java.util.Arrays;
import java.util.List;

public class UpperCase {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Cherry", "Banana", "Coconut", "Berry", "Apple", "Orange");
        fruits.stream().map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
