package com.rohit.learnings.Java.Algorithms.Recursion;

import java.util.ArrayList;
import java.util.List;

/*
ProductSum -
given an input array - [5,2,[7,-1],3,4,[6,[2,3]],5]
sum will be calculated based on the degree of array inside
5+2+2*(7-1)+3+4+2*(6+3*(2+3))+5
here 2* - as [7,-1] is 2nd degree array and [6,[2,3]] represents 2nd and 3rd degree arrays

 */
public class ProductSum {

    public static int getProductSum(List<Object> array) {
        return productSumHelper(array, 1);
    }

    private static int productSumHelper(List<Object> array, int multiplier) {
        int sum = 0;
        for (Object element : array) {
            if (element instanceof ArrayList) {
                ArrayList<Object> internalArray = (ArrayList<Object>) element;
                sum = sum + productSumHelper(internalArray, multiplier + 1);
            } else {
                sum = sum + (int) element;
            }
        }
        return sum * multiplier;
    }

}
/*
This is a great example of using recursion as we have to calculate sum of the elements in the
array over and over.
 */