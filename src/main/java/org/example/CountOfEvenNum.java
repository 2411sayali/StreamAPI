package org.example;

import java.util.Arrays;
import java.util.List;

public class CountOfEvenNum {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1,2,3,4,5,6,8,9,10);
        long countOfEven = num.stream().filter(e->e%2==0).count();
        //long countOfEven = num.stream().filter(e->e%2==1).count();
        System.out.println(countOfEven);
    }
}
