package com.rohit.twoTwentyFour.recurssion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    public int staircaseTraversalDynamic(int height, int maxSteps) {
        int[] noOfWaysToEachStep = new int[height + 1];
        noOfWaysToEachStep[0] = 1;
        noOfWaysToEachStep[1] = 1;
        for(int i = 2; i <= height; i ++){
            int currentWays = 0;
            for(int step = 1; step <= Math.min(i,maxSteps); step++){
                currentWays += noOfWaysToEachStep[i -step];
            }
            noOfWaysToEachStep[i] = currentWays;
        }
        return noOfWaysToEachStep[height];
    }

    public int staircaseTraversalSlidingWindow(int height, int maxSteps) {
        int currentNoOfWays = 0;
        List<Integer> waysToTop = new ArrayList<>();
        waysToTop.add(1);
        for(int currentHeight = 1; currentHeight <= height; currentHeight++){
            int startOfTheWindow = currentHeight - maxSteps - 1;
            int endOfTheWindow = currentHeight - 1;
            if(startOfTheWindow >= 0){
                currentNoOfWays -= waysToTop.get(startOfTheWindow);
            }
            currentNoOfWays += waysToTop.get(endOfTheWindow);
            waysToTop.add(currentNoOfWays);

        }
        return waysToTop.get(height);

    }


}
