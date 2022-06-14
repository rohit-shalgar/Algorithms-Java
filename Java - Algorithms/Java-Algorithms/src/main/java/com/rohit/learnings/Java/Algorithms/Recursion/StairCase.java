/*
    height 4,max Steps = 2
    possible ways are - 1,1,1,1// 1,1,2 // 1,2,1 // 2,2 // 2,1,1
    find out all the possible ways to traverse a staircase of given height with maximum steps you can take.
 */


package com.rohit.learnings.Java.Algorithms.Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StairCase {

    private final int height;
    private final int maxSteps;
    private final Map<Integer, Integer> noOfStepsRequiredForEachHeightStore = new HashMap<>();


    public StairCase(int height, int maxSteps) {
        this.height = height;
        this.maxSteps = maxSteps;
    }

    public int noOfWaysToTop() {
        return noOfWaysToTheTopOfStaircaseCalculator(this.height, this.maxSteps);
    }

    private int noOfWaysToTheTopOfStaircaseCalculator(int height, int maxSteps) {
        if (height <= 1) {
            return 1;
        }
        int noOfWays = 0;
        for (int step = 1; step <= Math.min(height, maxSteps); step++) {
            noOfWays += noOfWaysToTheTopOfStaircaseCalculator((height - step), maxSteps);
        }
        return noOfWays;
    }

    public int noOfWaysToTopOptimized() {
        noOfStepsRequiredForEachHeightStore.put(0, 1);
        noOfStepsRequiredForEachHeightStore.put(1, 1);
        return noOfWaysToTopOptimizedCalculator(this.height, this.maxSteps, noOfStepsRequiredForEachHeightStore);
    }

    private int noOfWaysToTopOptimizedCalculator(int height, int maxSteps, Map<Integer, Integer> noOfStepsRequiredForEachHeightStore) {
        if (noOfStepsRequiredForEachHeightStore.containsKey(height)) {
            return getNoOfStepsRequiredToTraverseForAnyHeight(height);
        } else {
            int noOfWays = 0;
            //height may be less that steps sometimes, so we can step max up to the height.
            for (int step = 1; step <= Math.min(height, maxSteps); step++) {
                noOfWays += noOfWaysToTopOptimizedCalculator((height - step), maxSteps, noOfStepsRequiredForEachHeightStore);
            }
            noOfStepsRequiredForEachHeightStore.put(height, noOfWays);
        }
        return getNoOfStepsRequiredToTraverseForAnyHeight(height);
    }

    private int getNoOfStepsRequiredToTraverseForAnyHeight(int height) {
        return noOfStepsRequiredForEachHeightStore.get(height);
    }

    public int noOfWaysToTopDP(int height, int maxSteps){
        int[] noOfWays = new int[height+1];
        noOfWays[0] = 1;
        noOfWays[1] = 1;
        return calculateNumberOfWaysFromHeightTwo(height, maxSteps, noOfWays);
    }

    private int calculateNumberOfWaysFromHeightTwo(int height, int maxSteps, int[] noOfWays) {
        for(int startingHeight = 2; startingHeight <= height; startingHeight++){
            int step = 1;
            while(step <= maxSteps && step <= startingHeight){
                noOfWays[startingHeight] = noOfWays[startingHeight] + noOfWays[startingHeight - step];
                step += 1;
            }
        }
        return  noOfWays[height];
    }

    public int noOfWaysToStairCaseSlidingWindow(){
        int currentNumberOfWays = 0;
        ArrayList<Integer> calculatedWays = new ArrayList<>();
        calculatedWays.add(1);
        calculateNumberOfWaysForEachHeight(currentNumberOfWays, calculatedWays);
        return calculatedWays.get(height);
    }

    private void calculateNumberOfWaysForEachHeight(int currentNumberOfWays, ArrayList<Integer> calculatedWays) {
        for(int currentHeight=1; currentHeight<= height; currentHeight++){
            int startOfTheWindow = currentHeight - maxSteps - 1;
            int endOfTheWindow = currentHeight - 1;
            if( startOfTheWindow >= 0){
                currentNumberOfWays -= calculatedWays.get(startOfTheWindow);
            }
            currentNumberOfWays += calculatedWays.get(endOfTheWindow);
            calculatedWays.add(currentNumberOfWays);
        }
    }
}
