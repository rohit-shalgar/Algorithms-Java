package com.rohit.twoTwentyFour.sorting;

import java.util.Arrays;
import java.util.HashMap;

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

    public int[] threeNumberSort(int[] array, int[] order) {
        int first = order[0];
        int firstIdx = 0;
        int last = order[order.length-1];
        int lastIdx = array.length -1;

        for(int i= 0; i < array.length; i++){
            if(array[i] == first){
                swap(array,i,firstIdx);
                firstIdx++;
            }
        }

        for(int i= array.length -1; i >= 0; i--){
            if(array[i] == last){
                swap(array,i,lastIdx);
                lastIdx--;
            }
        }
        return array;
    }


    public int[] threeNumberSortOpt(int[] array, int[] order) {
        int first = order[0];
        int second = order[1];
        int firstIdx = 0;
        int secondIdx = 0;
        int lastIdx = array.length -1;

        while(secondIdx <= lastIdx){
            int value = array[secondIdx];
            if(value == first){
                swap(array,firstIdx,secondIdx);
                firstIdx++;
                secondIdx++;
            }
            else if(value == second){
                secondIdx++;
            }
            else{
                swap(array,secondIdx,lastIdx);
                lastIdx--;
            }
        }
        return array;
    }

    public static int[] mergeSort(int[] array) {
        if(array.length == 1)return array;
        int middle = array.length/2;
        int[] left = Arrays.copyOfRange(array,0,middle);
        int[] right = Arrays.copyOfRange(array,middle,array.length);
        return mergedSortedArrays(mergeSort(left),mergeSort(right));
    }

    public static int[] mergedSortedArrays(int[] left, int []right){
        int[] sortedArray = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                sortedArray[k++] = left[i++];
            }
            else{
                sortedArray[k++] = right[j++];
            }
        }
        while(i < left.length){
            sortedArray[k++] = left[i++];
        }
        while(j < right.length){
            sortedArray[k++] = right[j++];
        }
        return sortedArray;
    }
}
