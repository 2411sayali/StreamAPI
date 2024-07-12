package org.example;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;


public class ConcatTheString {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Cherry", "Banana", "Coconut", "Berry", "Apple", "Orange");
        String concatenatedFruits = fruits.stream().collect(Collectors.joining("::"));
        System.out.println(concatenatedFruits);
    }
}
