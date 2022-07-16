package com.vkp.recursion;

public class SumOfNNaturalNoRecursion {
    public static void main(String[] args) {
        System.out.println("Sum of N Natural No using Recursion: ");
        System.out.println(sumNNaturalNo(10));

    }
    public static int sumNNaturalNo(int n){
        if(n<=0){
            return 0;
        }
        return n + sumNNaturalNo(n-1);
    }
}
