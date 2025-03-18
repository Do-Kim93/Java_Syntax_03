package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
//람다식
class Main {
    public static void main(String[] args) {
        for(int i = 1; i <=10; i++){
            System.out.println(i);
        }
        IntStream.range(1,11)
                .forEach(e->
                        System.out.println(e)
                );
        IntStream.range(1, 11)
                .forEach(System.out::println);

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i=0; i< arr.length; i++){
            arr[i] *= 2;
        }

        System.out.println(Arrays.toString(arr));

        arr = new int[]{1,2,3,4,5,6,7,8,9,10};

//        int[] rsArray = Arrays.stream(arr)
//                .map(e -> {
//                    return e * 2;
//                }).toArray();
        int[] rsArray = Arrays.stream(arr)
                .map(e -> e * 2).toArray();
        System.out.println();


    }
}
