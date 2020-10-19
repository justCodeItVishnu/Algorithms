package com.problemsolving.src.code;

/* Author Vishnu created this file
   on 10/19/2020
   inside the package - com.problemsolving.src.code 
*/

public class Fibonacci {

    public static int getfibonacciNumber(int inputNumber){

        if(inputNumber == 0){
            return 0;
        }

        if(inputNumber == 1){
            return 1;
        }

        int result = getfibonacciNumber(inputNumber-1) + getfibonacciNumber(inputNumber -2);
        return result;
    }

    public static void main(String[] args) {

        System.out.println(getfibonacciNumber(9));

    }
}
