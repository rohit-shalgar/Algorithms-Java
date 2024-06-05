package com.rohit.twoTwentyFour.recurssion;

import java.util.HashMap;
import java.util.Map;

public class Programs {
    public static int stairCaseTraversal(int height, int maxSteps){
        return noOfWaysToTop(height,maxSteps);
    }

    private static int noOfWaysToTop(int height, int maxSteps) {
        if (height <= 1) {
            return 1;
        }
        int noOfWaysToTop = 0;
        for(int step = 1; step <= Math.min(height, maxSteps); step++) {
            noOfWaysToTop += noOfWaysToTop(height-step, maxSteps);
        }
        return noOfWaysToTop;
    }

    public int staircaseTraversal(int height, int maxSteps) {
        Map<Integer,Integer> memoize = new HashMap<>();
        memoize.put(0,1);
        memoize.put(1,1);
        return stairCaseTraversalHelper(height,maxSteps,memoize);
    }

    public int stairCaseTraversalHelper(int currentHeight,int maxSteps, Map<Integer,Integer> memoize){
        if(memoize.containsKey(currentHeight)){
            return memoize.get(currentHeight);
        }
        int noOfWaysToTop = 0;
        for(int i= 1; i <= Math.min(currentHeight,maxSteps);i++){
            noOfWaysToTop += stairCaseTraversalHelper(currentHeight - i,maxSteps,memoize);
        }
        memoize.put(currentHeight,noOfWaysToTop);
        return noOfWaysToTop;
    }
}
