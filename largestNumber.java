package com.example.demo;

import java.util.Arrays;

public class largestNumber {

    public static void main(String[] args){

        int[] number= {1,4,10,34,22,7};

        Arrays.sort(number);
        //System.out.println(Arrays.toString(number));[1, 4, 7, 10, 22, 34]
        System.out.println(number[number.length-3]);
    }

}
