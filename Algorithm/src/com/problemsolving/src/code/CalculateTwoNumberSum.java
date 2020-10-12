package com.problemsolving.src.code;

import java.util.Arrays;

/* Author Vishnu
   created this file on 10/11/2020
   inside the package - com.problemsolving.src.code
*/

public class CalculateTwoNumberSum {

    public static int[] calculateSum(int[] inputArray, int targetSum) {

        Arrays.sort(inputArray);
        int leftPointer = 0;
        int rightPointer = inputArray.length - 1;
        int[] outputArray = new int[2];

        while (leftPointer <= rightPointer) {
            int currentSum = inputArray[leftPointer] + inputArray[rightPointer];
            if (currentSum == targetSum) {
                outputArray[0] = inputArray[leftPointer];
                outputArray[1] = inputArray[rightPointer];
                return outputArray;
            } else if (currentSum < targetSum) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return new int[0];

    }

    public static void main(String[] args) {

        int[] inputArray = {4, 6, 1, -3};
        int[] outputResultArray = calculateSum(inputArray, 3);
        for (int j : outputResultArray) {
            System.out.println(j);
        }

    }
}

