package com.vkp.recursion;

public class NToOneRecursion {
    public static void main(String[] args) {
        printNto1(10);
    }

    public static void printNto1(int n){
        if(n<=0){  // base case to stop recursion
            return ;
        }
        System.out.println(n); // this will first print and then recursion will be called
        printNto1(n-1);
    }
}
