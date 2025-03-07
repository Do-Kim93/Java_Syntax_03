package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean[] arr1 = new boolean[] {true, false, true};//1번 문제
        double[] arr2 = new double[] {3.14, 7.77, 11.11};//2번 문제
        int[] arr3 = new int[10];//3번 문제
        System.out.printf("%b,%b,%b\n",arr1[0],arr1[1],arr1[2]);//1번 문제
        System.out.printf("%.2f,%.2f,%.2f\n",arr2[0],arr2[1],arr2[2]);//2번 문제
        for(int i=0; i <= arr3.length-1; i++){//3번 문제
            arr3[i] = i+1;
            System.out.print(arr3[i]);
            if(i != 9){
                System.out.print(", ");
            }
        }
    }
}


