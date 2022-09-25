package com.rohit.learnings.Java.Algorithms.arrays;

import java.util.Arrays;

public class ArrayOfProducts {
    public static int[] arrayOfProducts(int[] array) {
        int[] products = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int productsSum = 1;
            for (int j = 0; j < array.length; j++) {
                if (i != j) productsSum = productsSum * array[j];
            }
            products[i] = productsSum;
        }
        return products;
    }

    public static int[] arrayOfProductsOpt(int[] array) {
        int[] products = new int[array.length];
        int[] left = new int[array.length], right = new int[array.length];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        int leftProduct = array[0];
        for (int j = 1; j < array.length; j++) {
            left[j] = leftProduct;
            leftProduct = leftProduct * array[j];
        }
        int rightProduct = array[array.length - 1];
        for (int k = array.length - 2; k >= 0; k--) {
            right[k] = rightProduct;
            rightProduct = rightProduct * array[k];
        }
        for (int i = 0; i < array.length; i++) {
            products[i] = left[i] * right[i];
        }
        return products;
    }
}


