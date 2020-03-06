package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n=10;
        int[] array = getRandomArray(n);
        float[] arr1 = getRandomArray1(n);
    }
    public static int[] getRandomArray(int n) {
        int[] array = new int[n];
        Random random = new Random();
        for(int i = 0; i<n; i++){
            array[i] = random.nextInt();
        }
        return array;
    }
    public static float[] getRandomArray1(int n) {
        float[] arr1 = new float[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr1[i] =  random.nextFloat();
        }
        return arr1;
    }
}
