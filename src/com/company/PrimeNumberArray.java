package com.company;

import java.util.Arrays;

public class PrimeNumberArray {
    public static void main(String[] args) {
        int[] primeNums = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int i = 0; i < primeNums.length; i++){
            primeNums[i] = primeNums[i]+1;
        }
        System.out.println(Arrays.toString(primeNums));
    }
}
