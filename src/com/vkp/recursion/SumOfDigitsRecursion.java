package com.vkp.recursion;

public class SumOfDigitsRecursion {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123456789)); //45
        System.out.println(sumOfDigits(123)); //6
    }

    public static int sumOfDigits(int n){
        if(n <= 0 ){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
}
