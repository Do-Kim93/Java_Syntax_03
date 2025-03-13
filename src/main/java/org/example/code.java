package org.example;

import java.util.Arrays;
import java.util.Objects;

public class code {

    public static void main(String[] args) {

    }
}
class Solution {
    public String[] solution(String my_string, String letter) {
        String[] a = my_string.split("");
        String[] b = letter.split("");
        for(int i = 0; i <= a.length-1; i++){
            if(a[i].equals(b[0])){
                a[i]="";
            }
        }
        String as = new String(Arrays.toString(a));
        return a;
    }
}

