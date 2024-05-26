package com.rohit.twoTwentyFour.sorting;

public class Programs {
    public static int[] insertionSorted(int[] input){
        for(int i = 1; i < input.length; i++){
            int j = i;
            while(j > 0 && input[j] < input[j-1]){
                swap(input, j , j-1);
                j--;
            }
        }
        return input;
    }

    public static void swap(int[] input, int startIndex, int endIndex){
        int temp = input[startIndex];
        input[startIndex] = input[endIndex];
        input[endIndex] = temp;
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
        return array;
    }
}
