package com.problemsolving.src.code;

import java.util.Arrays;
import java.util.List;

/* Author Vishnu created this file
   on 10/14/2020
   inside the package - com.problemsolving.src.code 
*/

public class SubsequentNumberValidation {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        if(array.size() < sequence.size() ){
            return false;
        }
        int sequenceIndex = 0;
        for(Integer inputVal : array){
            if(inputVal == sequence.get(sequenceIndex)){
                sequenceIndex++;
                if(sequenceIndex == sequence.size()){
                    return true ;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {

        List<Integer> inputList = Arrays.asList(4,6,5,1,90);
        List<Integer> sequenceList = Arrays.asList(5,1);

        boolean result = isValidSubsequence(inputList,sequenceList);

        System.out.println(result);

    }
}
