package org.example;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,2,2,3,4,5,6,6,7,8,9,9,1);
        nums.stream().distinct().forEach(System.out::println);
    }
}
