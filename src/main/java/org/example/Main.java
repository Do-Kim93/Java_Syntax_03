package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//람다식
class Main {
    public static void main(String[] args) {
        // 일반
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for (int i= 0; i<arr.length; i++){
            arr[i] *= 2;
        }
        System.out.println(Arrays.toString(arr));
        //스트림
        arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] resultArr = Arrays.stream(arr)
                .map(e -> e*2)
                .toArray();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(resultArr));
        //일반
        int [] arr1 = {33, 2, 55, 4, 51, 6, 71, 18, 29, 10};
        // filter 시작
        int resultArrLen = 0;

        for (int n : arr) if (n % 2 == 0) resultArrLen++;

        int[] resultArr1 = new int[resultArrLen];

        int resultArrLastIndex = -1;

        for (int n : arr) {
            if (n % 2 != 0) continue;

            resultArr1[++resultArrLastIndex] = n;
        }
        // filter 끝

        // map 시작
        for (int i = 0; i < resultArr1.length; i++) {
            resultArr1[i] *= 2;
        }
        // map 끝

        System.out.println(Arrays.toString(resultArr1));
        arr = new int[]{33, 2, 55, 4, 51, 6, 71, 18, 29, 10};

        resultArr1 = Arrays.stream(arr)
                .filter(e -> e%2 ==0)
                .map(e->e*2)
                .toArray();
        System.out.println(Arrays.toString((resultArr1)));

        // 일반
        int[] arr2 = {33, 2, 55, 4, 51, 6, 71, 18, 29, 10};

        List<Integer> resultAl = new ArrayList<>();

        // filter 시작
        for (int n : arr2) if (n % 2 == 0) resultAl.add(n);
        // filter 끝

        // map 시작
        for (int i = 0; i < resultAl.size(); i++) {
            int newValue = resultAl.get(i) * 2;
            resultAl.set(i, newValue);
        }
        // map 끝

        System.out.println(resultAl);

        arr = new int[]{33, 2, 55, 4, 51, 6, 71, 18, 29, 10};

        resultAl = Arrays
                .stream(arr)
                .filter(e -> e%2 ==0)
                .map(e -> e*2)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(resultAl);


    }
}
